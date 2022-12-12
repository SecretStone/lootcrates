package de.Rolling_Stone.KeyMod.configs;

import de.Rolling_Stone.KeyMod.Items.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class KeyModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<List<String>> AMMO_ITEMS;
    public static final ForgeConfigSpec.ConfigValue<List<String>> ARMOR_ITEMS;
    public static final ForgeConfigSpec.ConfigValue<List<String>> ARTEFACT_ITEMS;
    public static final ForgeConfigSpec.ConfigValue<List<String>> BOW_ITEMS;
    public static final ForgeConfigSpec.ConfigValue<List<String>> ENCHANT_ITEMS;
    public static final ForgeConfigSpec.ConfigValue<List<String>> FOOD_ITEMS;
    public static final ForgeConfigSpec.ConfigValue<List<String>> GUN_ITEMS;
    public static final ForgeConfigSpec.ConfigValue<List<String>> MELEE_ITEMS;
    public static final ForgeConfigSpec.ConfigValue<List<String>> SHIELD_ITEMS;
    public static final ForgeConfigSpec.ConfigValue<List<String>> TOOL_ITEMS;

    public static List<String> defaul = new ArrayList<>();

    static {
        defaul.add("block.minecraft.barrier");
        BUILDER.push("Crates Config");

        AMMO_ITEMS = BUILDER.comment("Items you can get in the Ammo Crate").define("ammo_items:",defaul);
        ARMOR_ITEMS = BUILDER.comment("Items you can get in the Armor Crate").define("armor_items:",defaul);
        ARTEFACT_ITEMS = BUILDER.comment("Items you can get in the Artefact Crate").define("artefact_items:",defaul);
        BOW_ITEMS = BUILDER.comment("Items you can get in the Bow Crate").define("bow_items:",defaul);
        ENCHANT_ITEMS = BUILDER.comment("Items you can get in the Enchant Crate").define("enchant_items:",defaul);
        FOOD_ITEMS = BUILDER.comment("Items you can get in the Food Crate").define("food_items:",defaul);
        GUN_ITEMS = BUILDER.comment("Items you can get in the Gun Crate").define("gun_items:",defaul);
        MELEE_ITEMS = BUILDER.comment("Items you can get in the Melee Crate").define("melee_items:",defaul);
        SHIELD_ITEMS = BUILDER.comment("Items you can get in the Shield Crate").define("shield_items:",defaul);
        TOOL_ITEMS = BUILDER.comment("Items you can get in the Pickaxe Crate").define("pickaxe_items:",defaul);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }


}
