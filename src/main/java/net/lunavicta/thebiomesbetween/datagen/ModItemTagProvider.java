package net.lunavicta.thebiomesbetween.datagen;

import net.lunavicta.thebiomesbetween.TheBiomesBetween;
import net.lunavicta.thebiomesbetween.block.ModBlocks;
import net.lunavicta.thebiomesbetween.item.custom.ModItems;
import net.lunavicta.thebiomesbetween.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, TheBiomesBetween.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(Items.STICK);

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.BLOODWOOD_LOG.get().asItem())
                .add(ModBlocks.BLOODWOOD_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BLOODWOOD_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BLOODWOOD_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.BLOODWOOD_PLANKS.asItem());
    }

}
