package com.nightmare.Utils;

import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.entity.SpawnCategory;
import org.bukkit.plugin.Plugin;

public final class Utils {

    public static final void initNightmare(Plugin plugin) {
    
        for (World world : plugin.getServer().getWorlds()) {
        
            world.setDifficulty(Difficulty.HARD);

            world.setSpawnLimit(SpawnCategory.MONSTER, 500);

        }

    }
    
}
