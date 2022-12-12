package de.Rolling_Stone.KeyMod;

import com.mojang.logging.LogUtils;
import de.Rolling_Stone.KeyMod.Blocks.ModBlocks;
import de.Rolling_Stone.KeyMod.Items.ModItems;
import de.Rolling_Stone.KeyMod.configs.KeyModClientConfigs;
import de.Rolling_Stone.KeyMod.configs.KeyModCommonConfigs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(KeyMod.MOD_ID)
public class KeyMod {
    public static final String MOD_ID = "keymod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public KeyMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, KeyModClientConfigs.SPEC, "keymod-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, KeyModCommonConfigs.SPEC, "keymod-common.toml");

    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.MELEE_KEY.get());
        }
    };


    private void commonSetup(final FMLCommonSetupEvent event) {
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}

