package de.kaffeekirsche.cherrycoffee.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> PLACEHOLDER;

    static {
        BUILDER.push("Config for ");

        PLACEHOLDER = BUILDER
                .comment("Placeholder Comment")
                .define("Placeholder Value", 7);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
