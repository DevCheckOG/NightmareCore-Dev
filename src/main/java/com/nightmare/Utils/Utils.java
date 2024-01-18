package com.nightmare.Utils;

import com.nightmare.Main;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.entity.SpawnCategory;
import org.bukkit.plugin.Plugin;

public final class Utils {

    private static final Plugin plugin = Main.getInstance();

    public static void initNightmare() {
    
        for (World world : plugin.getServer().getWorlds()) {
        
            world.setDifficulty(Difficulty.HARD);
            world.setSpawnLimit(SpawnCategory.MONSTER, 500);

        }

    }
    
}
