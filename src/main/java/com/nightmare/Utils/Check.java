package com.nightmare.Utils;

import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public final class Check {

    public static final void eval(Plugin plugin, String event, YamlConfiguration config) throws IOException {
        
        if (event.equalsIgnoreCase("onJoin")) {

            try {

                if (config.getString("prefix") == null) throw new Exception("prefix not found in settings.yml.");

                else if (config.get("scoreboard") == null) throw new Exception("scoreboard not found in settings.yml.");

                else if (config.get("scoreboard.enable") == null) throw new Exception("scoreboard.enable not found in settings.yml.");

                else if (config.getString("scoreboard.name") == null) throw new Exception("scoreboard.name not found in settings.yml.");

                else if (config.get("join_and_leave") == null) throw new Exception("join_and_leave not found in settings.yml.");

                else if (config.get("join_and_leave.enable") == null) throw new Exception("join_and_leave.enable not found in settings.yml.");

                else if (config.getString("join_and_leave.join") == null) throw new Exception("join_and_leave.join not found in settings.yml.");

                else if (config.getString("join_and_leave.leave") == null) throw new Exception("join_and_leave.leave not found in settings.yml.");

                else if (config.get("message_join") == null) throw new Exception("message_join not found in settings.yml.");

                else if (config.getString("message_join.title") == null) throw new Exception("message_join.title not found in settings.yml.");

                else if (config.getStringList("message_join.lines") == null) throw new Exception("message_join.lines not found in settings.yml.");

                else if (config.get("config") == null) throw new Exception("config not found in settings.yml.");

                else if (config.get("config.player") == null) throw new Exception("config.player not found in settings.yml.");

                else if (config.get("config.player.display_health") == null) throw new Exception("config.player.display_health not found in settings.yml.");

            } catch (Exception e) {

                plugin.getServer().getPluginManager().disablePlugin(plugin);
                e.printStackTrace();

            }    

        } else if (event.equalsIgnoreCase("onLeave")) { 

            try {

                if (config.getString("prefix") == null) throw new Exception("prefix not found in settings.yml.");

                else if (config.get("scoreboard") == null) throw new Exception("scoreboard not found in settings.yml.");

                else if (config.get("scoreboard.enable") == null) throw new Exception("scoreboard.enable not found in settings.yml.");

                else if (config.getString("scoreboard.name") == null) throw new Exception("scoreboard.name not found in settings.yml.");

                else if (config.get("join_and_leave") == null) throw new Exception("join_and_leave not found in settings.yml.");

                else if (config.get("join_and_leave.enable") == null) throw new Exception("join_and_leave.enable not found in settings.yml.");

                else if (config.getString("join_and_leave.join") == null) throw new Exception("join_and_leave.join not found in settings.yml.");

                else if (config.getString("join_and_leave.leave") == null) throw new Exception("join_and_leave.leave not found in settings.yml.");

            } catch (Exception e) {

                plugin.getServer().getPluginManager().disablePlugin(plugin);
                e.printStackTrace();

            }  
        
        } else if (event.equalsIgnoreCase("onServerPing")) {

            try {

                if (config.getString("motd") == null) throw new Exception("motd not found in settings.yml.");

                else if (config.get("motd.enable") == null) throw new Exception("motd.enable not found in settings.yml.");

                else if (config.getStringList("motd.lines") == null) throw new Exception("motd.lines not found in settings.yml.");

            } catch (Exception e) {

                plugin.getServer().getPluginManager().disablePlugin(plugin);
                e.printStackTrace();

            }

        } else if (event.equalsIgnoreCase("onSpawnEvent")) {

            try {

                if (config.get("config") == null) throw new Exception("config not found in settings.yml.");

                else if (config.get("config.mobs") == null) throw new Exception("config.mobs not found in settings.yml.");

                else if (config.get("config.mobs.zombie") == null) throw new Exception("config.mobs.zombie not found in settings.yml.");

                else if (config.get("config.mobs.zombie.name_c") == null) throw new Exception("config.mobs.zombie.name_c not found in settings.yml.");

                else if (config.get("config.mobs.zombie.name_b") == null) throw new Exception("config.mobs.zombie.name_b not found in settings.yml.");

                else if (config.get("config.mobs.zombie.name_a") == null) throw new Exception("config.mobs.zombie.name_a not found in settings.yml.");

                else if (config.get("config.mobs.creeper") == null) throw new Exception("config.mobs.creeper not found in settings.yml.");

                else if (config.get("config.mobs.creeper.name_c") == null) throw new Exception("config.mobs.creeper.name_c not found in settings.yml.");

                else if (config.get("config.mobs.creeper.name_b") == null) throw new Exception("config.mobs.creeper.name_b not found in settings.yml.");

                else if (config.get("config.mobs.creeper.name_a") == null) throw new Exception("config.mobs.creeper.name_a not found in settings.yml.");

                else if (config.get("config.mobs.spider") == null) throw new Exception("config.mobs.spider not found in settings.yml.");

                else if (config.get("config.mobs.spider.name_c") == null) throw new Exception("config.mobs.spider.name_c not found in settings.yml.");

                else if (config.get("config.mobs.spider.name_b") == null) throw new Exception("config.mobs.spider.name_b not found in settings.yml.");

                else if (config.get("config.mobs.spider.name_a") == null) throw new Exception("config.mobs.spider.name_a not found in settings.yml.");

                else if (config.get("config.mobs.skeleton") == null) throw new Exception("config.mobs.skeleton not found in settings.yml.");

                else if (config.get("config.mobs.skeleton.name_c") == null) throw new Exception("config.mobs.skeleton.name_c not found in settings.yml.");

                else if (config.get("config.mobs.skeleton.name_b") == null) throw new Exception("config.mobs.skeleton.name_b not found in settings.yml.");

                else if (config.get("config.mobs.skeleton.name_a") == null) throw new Exception("config.mobs.skeleton.name_a not found in settings.yml.");

                else if (config.get("config.mobs.enderman") == null) throw new Exception("config.mobs.enderman not found in settings.yml.");

                else if (config.get("config.mobs.enderman.name_c") == null) throw new Exception("config.mobs.enderman.name_c not found in settings.yml.");

                else if (config.get("config.mobs.enderman.name_b") == null) throw new Exception("config.mobs.enderman.name_b not found in settings.yml.");

                else if (config.get("config.mobs.enderman.name_a") == null) throw new Exception("config.mobs.enderman.name_a not found in settings.yml.");

            } catch (Exception e) {

                plugin.getServer().getPluginManager().disablePlugin(plugin);
                e.printStackTrace();

            }

        }

    }
    
}
