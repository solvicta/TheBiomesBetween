package net.lunavicta.thebiomesbetween.datagen;

import net.lunavicta.thebiomesbetween.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.BLOODWOOD_LOG.get());
        this.dropSelf(ModBlocks.BLOODWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BLOODWOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BLOODWOOD_WOOD.get());
        this.dropSelf(ModBlocks.BLOODWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.BLOODWOOD_SAPLING.get());
        /* Leaves sapling drop chance */
        this.add(ModBlocks.BLOODWOOD_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.BLOODWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }
}
