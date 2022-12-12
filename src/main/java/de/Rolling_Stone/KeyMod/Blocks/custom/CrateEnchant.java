package de.Rolling_Stone.KeyMod.Blocks.custom;

import de.Rolling_Stone.KeyMod.Items.ModItems;
import de.Rolling_Stone.KeyMod.configs.KeyModCommonConfigs;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CrateEnchant extends Block {
    public CrateEnchant(Properties properties) {
        super(properties);
    }


    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand hand, BlockHitResult result) {

        Item Key = ModItems.ENCHANT_KEY.get();
        List<String> list = KeyModCommonConfigs.ENCHANT_ITEMS.get();
        List<Item> items = ForgeRegistries.ITEMS.getValues().stream().filter(item -> list.contains(item.getDescriptionId())).collect(Collectors.toList());

        Random luck = new Random();
        luck.nextInt(items.size());

        if (!level.isClientSide) {
            if (player.getItemInHand(hand).getItem().equals(Key)) {
                player.getItemInHand(hand).shrink(1);
                player.getInventory().add(new ItemStack(items.get(luck.nextInt(items.size()))));
            } else if (!player.getItemInHand(hand).isEmpty()){
                player.sendSystemMessage(Component.literal("You need an Enchant Crate Key to open this Crate"));
            }
        }
        return super.use(blockState, level, blockPos, player, hand, result);
    }
}
