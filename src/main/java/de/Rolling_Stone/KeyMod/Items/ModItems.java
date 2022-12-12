package de.Rolling_Stone.KeyMod.Items;

import de.Rolling_Stone.KeyMod.KeyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KeyMod.MOD_ID);

    public static final RegistryObject<Item> MELEE_KEY = ITEMS.register("melee_key",
            () -> new Item(new Item.Properties().stacksTo(16).tab(KeyMod.TAB)));

    public static final RegistryObject<Item> AMMO_KEY = ITEMS.register("ammo_key",
            () -> new Item(new Item.Properties().stacksTo(16).tab(KeyMod.TAB)));

    public static final RegistryObject<Item> ARMOR_KEY = ITEMS.register("armor_key",
            () -> new Item(new Item.Properties().stacksTo(16).tab(KeyMod.TAB)));

    public static final RegistryObject<Item> ARTEFACT_KEY = ITEMS.register("artefact_key",
            () -> new Item(new Item.Properties().stacksTo(16).tab(KeyMod.TAB)));

    public static final RegistryObject<Item> BOW_KEY = ITEMS.register("bow_key",
            () -> new Item(new Item.Properties().stacksTo(16).tab(KeyMod.TAB)));

    public static final RegistryObject<Item> ENCHANT_KEY = ITEMS.register("enchant_key",
            () -> new Item(new Item.Properties().stacksTo(16).tab(KeyMod.TAB)));

    public static final RegistryObject<Item> FOOD_KEY = ITEMS.register("food_key",
            () -> new Item(new Item.Properties().stacksTo(16).tab(KeyMod.TAB)));

    public static final RegistryObject<Item> GUN_KEY = ITEMS.register("gun_key",
            () -> new Item(new Item.Properties().stacksTo(16).tab(KeyMod.TAB)));

    public static final RegistryObject<Item> SHIELD_KEY = ITEMS.register("shield_key",
            () -> new Item(new Item.Properties().stacksTo(16).tab(KeyMod.TAB)));

    public static final RegistryObject<Item> TOOL_KEY = ITEMS.register("tool_key",
            () -> new Item(new Item.Properties().stacksTo(16).tab(KeyMod.TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
