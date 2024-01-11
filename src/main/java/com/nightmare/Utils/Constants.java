package com.nightmare.Utils;

import java.util.List;

public final class Constants {

    public static final String VERSION = "1.0";
    public static final List<String> jdks = List.of("16", "17", "18", "19","20", "21");

    public static enum onJoin {

        prefix("prefix"),
        scoreboard("scoreboard"),
        scoreboard_enable("scoreboard.enable"),
        scoreboard_name("scoreboard.name"),	
        join_and_leave("join_and_leave"),
        join_and_leave_enable("join_and_leave.enable"),
        join_and_leave_join("join_and_leave.join"),
        join_and_leave_leave("join_and_leave.leave"),
        message_join("message_join"),
        message_join_title("message_join.title"),
        message_join_lines("message_join.lines"),
        config("config"),
        config_player("config.player"),	
        config_player_display_health("config.player.display_health");

        private final String value;

        private onJoin(String value) {

            this.value = value;

        }

        public final String getValue() {
            
            return value;

        }

    }

    public static enum onLeave {
        
        prefix("prefix"),
        scoreboard("scoreboard"),
        scoreboard_enable("scoreboard.enable"),
        scoreboard_name("scoreboard.name"),
        join_and_leave("join_and_leave"),
        join_and_leave_enable("join_and_leave.enable"),
        join_and_leave_join("join_and_leave.join"),
        join_and_leave_leave("join_and_leave.leave");

        private final String value;

        private onLeave(String value) {
            
            this.value = value;

        }

        public final String getValue() {
            
            return value;

        }

    }

    public static enum onServerPing {
        
        motd("motd"),
        motd_enable("motd.enable"),
        motd_lines("motd.lines");

        private final String value;

        private onServerPing(String value) {
            
            this.value = value;

        }

        public final String getValue() {
            
            return value;

        }

    }

    public static enum onSpawnEvent {
        
        config("config"),
        config_mobs("config.mobs"),
        config_mobs_zombie("config.mobs.zombie"),
        config_mobs_creeper("config.mobs.creeper"),
        config_mobs_spider("config.mobs.spider"),
        config_mobs_skeleton("config.mobs.skeleton"),
        config_mobs_enderman("config.mobs.enderman"),
        
        // Tier C Name
        config_mobs_zombie_name_c("config.mobs.zombie.name_c"),
        config_mobs_creeper_name_c("config.mobs.creeper.name_c"),
        config_mobs_spider_name_c("config.mobs.spider.name_c"),
        config_mobs_skeleton_name_c("config.mobs.skeleton.name_c"),
        config_mobs_enderman_name_c("config.mobs.enderman.name_c"),

        //Tier B Name

        config_mobs_zombie_name_b("config.mobs.zombie.name_b"),
        config_mobs_creeper_name_b("config.mobs.creeper.name_b"),
        config_mobs_spider_name_b("config.mobs.spider.name_b"),
        config_mobs_skeleton_name_b("config.mobs.skeleton.name_b"),
        config_mobs_enderman_name_b("config.mobs.enderman.name_b"),

        //Tier A Name

        config_mobs_zombie_name_a("config.mobs.zombie.name_a"),
        config_mobs_creeper_name_a("config.mobs.creeper.name_a"),
        config_mobs_spider_name_a("config.mobs.spider.name_a"),
        config_mobs_skeleton_name_a("config.mobs.skeleton.name_a"),
        config_mobs_enderman_name_a("config.mobs.enderman.name_a");
    
        private final String value;

        private onSpawnEvent(String value) {
            
            this.value = value;

        }

        public final String getValue() {
            
            return value;

        }
        
    }
    
}
