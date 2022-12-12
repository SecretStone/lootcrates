package de.Rolling_Stone.KeyMod.configs;

import net.minecraftforge.common.ForgeConfigSpec;

public class KeyModClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Configs for Case Mod");

        //config

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
