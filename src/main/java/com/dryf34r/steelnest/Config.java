package com.dryf34r.steelnest;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue DEBUG_LOGGING = BUILDER
            .comment("Enable extra debug logging")
            .define("debugLogging", false);

    static final ModConfigSpec SPEC = BUILDER.build();
}
