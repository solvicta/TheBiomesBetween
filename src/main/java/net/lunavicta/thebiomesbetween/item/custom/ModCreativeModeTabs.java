package net.lunavicta.thebiomesbetween.item.custom;

import net.lunavicta.thebiomesbetween.TheBiomesBetween;
import net.lunavicta.thebiomesbetween.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheBiomesBetween.MOD_ID);

    public static final Supplier<CreativeModeTab> TBB_ITEMS_TAB = CREATIVE_MODE_TAB.register("tbb_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLOODWOOD_LOG.get()))
                    .title(Component.translatable("creativetab.tutorialmod.bismuth_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BLOODWOOD_LOG.get());

                    }).build());

    public static final Supplier<CreativeModeTab> TBB_BLOCK_TAB = CREATIVE_MODE_TAB.register("tbb_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLOODWOOD_WOOD))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TheBiomesBetween.MOD_ID, "tbb_items_tab"))
                    .title(Component.translatable("creativetab.tutorialmod.bismuth_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BLOODWOOD_LOG.get());
                        output.accept(ModBlocks.BLOODWOOD_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_BLOODWOOD_LOG.get());
                        output.accept(ModBlocks.STRIPPED_BLOODWOOD_WOOD.get());

                        output.accept(ModBlocks.BLOODWOOD_PLANKS.get());
                        output.accept(ModBlocks.BLOODWOOD_SAPLING.get());

                        output.accept(ModBlocks.BLOODWOOD_LEAVES.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
