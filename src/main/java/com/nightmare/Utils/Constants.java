package com.nightmare.Utils;

public final class Constants {

    public static final String VERSION = "1.0";

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
        config_mobs_name_c("config.mobs.c"),
        config_mobs_name_b("config.mobs.b"),
        config_mobs_name_a("config.mobs.a");
    
        private final String value;

        private onSpawnEvent(String value) {
            
            this.value = value;

        }

        public final String getValue() {
            
            return value;

        }
        
    }
    
}
