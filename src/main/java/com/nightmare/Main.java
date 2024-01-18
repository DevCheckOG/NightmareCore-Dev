package com.nightmare;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.nightmare.Mobs.Tasks;
import com.nightmare.Scoreboard.Score;
import com.nightmare.Tablist.Tab;
import com.nightmare.Utils.Utils;

import net.md_5.bungee.api.ChatColor;

public final class Main extends JavaPlugin {

  private static Main instance;
  private static YamlConfiguration settings;
  private static YamlConfiguration messages;

  public void onEnable() {

    Bukkit.getConsoleSender().sendMessage("");
    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lNighmare Core &7| &aON"));
    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&fCreated by &bDevCheckOG"));
    Bukkit.getConsoleSender().sendMessage("");

    instance = this;

    try {

      IO.GenerateDataFolder(instance);
      
      File setttings = new File(getDataFolder(), "settings.yml");
      File messages = new File(getDataFolder(), "messages.yml");

      if (!setttings.exists()) {

        IO.GenerateSettings(instance);

      }

      if (!messages.exists()) {
        
        IO.GenerateMessages(instance);

      }

      IO.SubmitSettings(instance);

      IO.SubmitMessages(instance);

    } catch (IOException e) {
      getServer().getPluginManager().disablePlugin(instance);
      e.printStackTrace();
    }

    //Archives of YML

    settings = YamlConfiguration.loadConfiguration(new File(getDataFolder(), "settings.yml"));
    messages = YamlConfiguration.loadConfiguration(new File(getDataFolder(), "messages.yml"));

    //Commands and Events

    getServer().getPluginManager().registerEvents(new Events(), instance);
    getCommand("nightmare").setExecutor(new Commands());

    File settings = new File(getDataFolder(), "settings.yml");

    if (!settings.exists()) {

      try {
        throw new Exception("settings.yml does not exist.");
      } catch (Exception e) {
        getServer().getPluginManager().disablePlugin(instance);
        e.printStackTrace();
      }
      
    }

    YamlConfiguration config = YamlConfiguration.loadConfiguration(settings);  

    if (config.get("scoreboard.enable") == null) {

      try {
        throw new Exception("scoreboard.enable not found in settings.yml.");
      } catch (Exception e) {
        getServer().getPluginManager().disablePlugin(instance);
        e.printStackTrace();
      }

    } else if (config.getBoolean("scoreboard.enable")) {

      Score score = new Score();
      score.initScorebaord();

    }

    if (config.get("tablist.enable") == null) {

      try {
        throw new Exception("tablist.enable not found in settings.yml.");
      } catch (Exception e) {
        getServer().getPluginManager().disablePlugin(instance);
        e.printStackTrace();
      }

    } else if (config.getBoolean("tablist.enable")) {

      Tab tab = new Tab();

      try {
        tab.initTablist();
      } catch (IOException e) {
        getServer().getPluginManager().disablePlugin(instance);
        e.printStackTrace();
      }

    }

    Utils.initNightmare();

    Tasks tasksMobs = new Tasks();

    tasksMobs.setEffectsMobs();

  }

  public void onDisable() {
    
    getServer().getScheduler().cancelTasks(instance);

  }

  public static Plugin getInstance() {

    return instance;

  }

  public static YamlConfiguration getSettings() {
    
    return settings;

  }

  public static YamlConfiguration getMessages() {
    
    return messages;

  }

  public static void setSettings() throws IOException {

    File file = new File(instance.getDataFolder(), "settings.yml");

    if (!file.exists())
      throw new IOException("settings.yml does not exist.");

    settings = YamlConfiguration.loadConfiguration(file);
    
  }

  public static void setMessages() throws IOException {
    
    File file = new File(instance.getDataFolder(), "messages.yml");

    if (!file.exists())
      throw new IOException("messages.yml does not exist.");

    messages = YamlConfiguration.loadConfiguration(file);  

  }

}