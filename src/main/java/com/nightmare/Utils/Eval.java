package com.nightmare.Utils;

import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import com.nightmare.Main;
import com.nightmare.Utils.Constants.onJoin;
import com.nightmare.Utils.Constants.onLeave;
import com.nightmare.Utils.Constants.onServerPing;
import com.nightmare.Utils.Constants.onSpawnEvent;

public final class Eval {

    private static final Plugin plugin = Main.getInstance();

    public static void eval(String event, YamlConfiguration config) throws IOException {
        
        if (event.equalsIgnoreCase("onJoin")) {

            try {

                for (onJoin value : Constants.onJoin.values()) {

                    if (config.get(value.getValue()) == null) throw new Exception(value.getValue() + " not found in settings.yml.");

                }

            } catch (Exception e) {

                plugin.getServer().getPluginManager().disablePlugin(plugin);
                e.printStackTrace();

            }    

        } else if (event.equalsIgnoreCase("onLeave")) { 

            try {

                for (onLeave value : Constants.onLeave.values()) {

                    if (config.get(value.getValue()) == null) throw new Exception(value.getValue() + " not found in settings.yml.");

                }

            } catch (Exception e) {

                plugin.getServer().getPluginManager().disablePlugin(plugin);
                e.printStackTrace();

            }  
        
        } else if (event.equalsIgnoreCase("onServerPing")) {

            try {

                for (onServerPing value : Constants.onServerPing.values()) {

                    if (config.get(value.getValue()) == null) throw new Exception(value.getValue() + " not found in settings.yml.");

                }

            } catch (Exception e) {

                plugin.getServer().getPluginManager().disablePlugin(plugin);
                e.printStackTrace();

            }

        } else if (event.equalsIgnoreCase("onSpawnEvent")) {

            try {

                for (onSpawnEvent value : Constants.onSpawnEvent.values()) {

                    if (config.get(value.getValue()) == null) throw new Exception(value.getValue() + " not found in settings.yml.");

                }

            } catch (Exception e) {

                plugin.getServer().getPluginManager().disablePlugin(plugin);
                e.printStackTrace();

            }

        }

    }
    
}
