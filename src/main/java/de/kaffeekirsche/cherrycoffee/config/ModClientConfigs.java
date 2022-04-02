package de.kaffeekirsche.cherrycoffee.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> PLACEHOLDER;

    static {
        BUILDER.push("Configs for MCCourseMod");

        PLACEHOLDER = BUILDER
                .comment("Placeholder Comment")
                .define("Placeholder Value", false);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
