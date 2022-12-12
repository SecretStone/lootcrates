package de.Rolling_Stone.KeyMod.Blocks;

import de.Rolling_Stone.KeyMod.Blocks.custom.*;
import de.Rolling_Stone.KeyMod.Items.ModItems;
import de.Rolling_Stone.KeyMod.KeyMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, KeyMod.MOD_ID);

    public static final RegistryObject<Block> TEST_BLOCK = registerBlock("test_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), KeyMod.TAB);

    public static final RegistryObject<Block> CRATE_AMMO = registerBlock("ammo_crate",
            () -> new CrateAmmo(BlockBehaviour.Properties.of(Material.GLASS).strength(999)), KeyMod.TAB);

    public static final RegistryObject<Block> CRATE_ARMOR = registerBlock("armor_crate",
            () -> new CrateArmor(BlockBehaviour.Properties.of(Material.GLASS).strength(999)), KeyMod.TAB);

    public static final RegistryObject<Block> CRATE_ARTEFACT = registerBlock("artefact_crate",
            () -> new CrateArtefact(BlockBehaviour.Properties.of(Material.GLASS).strength(999)), KeyMod.TAB);

    public static final RegistryObject<Block> CRATE_BOW = registerBlock("bow_crate",
            () -> new CrateBow(BlockBehaviour.Properties.of(Material.GLASS).strength(999)), KeyMod.TAB);

    public static final RegistryObject<Block> CRATE_ENCHANT = registerBlock("enchant_crate",
            () -> new CrateEnchant(BlockBehaviour.Properties.of(Material.GLASS).strength(999)), KeyMod.TAB);

    public static final RegistryObject<Block> CRATE_FOOD = registerBlock("food_crate",
            () -> new CrateFood(BlockBehaviour.Properties.of(Material.GLASS).strength(999)), KeyMod.TAB);

    public static final RegistryObject<Block> CRATE_MELEE = registerBlock("melee_crate",
            () -> new CrateMelee(BlockBehaviour.Properties.of(Material.GLASS).strength(999)), KeyMod.TAB);

    public static final RegistryObject<Block> CRATE_SHIELD = registerBlock("shield_crate",
            () -> new CrateShield(BlockBehaviour.Properties.of(Material.GLASS).strength(999)), KeyMod.TAB);

    public static final RegistryObject<Block> CRATE_GUN = registerBlock("gun_crate",
            () -> new CrateGun(BlockBehaviour.Properties.of(Material.GLASS).strength(999)), KeyMod.TAB);

    public static final RegistryObject<Block> CRATE_TOOL = registerBlock("tool_crate",
            () -> new CrateTool(BlockBehaviour.Properties.of(Material.GLASS).strength(999)), KeyMod.TAB);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
