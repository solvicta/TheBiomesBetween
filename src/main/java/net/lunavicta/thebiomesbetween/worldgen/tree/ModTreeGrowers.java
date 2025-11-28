package net.lunavicta.thebiomesbetween.worldgen.tree;

import net.lunavicta.thebiomesbetween.TheBiomesBetween;
import net.lunavicta.thebiomesbetween.worldgen.ModConfiguredFeatures;
import net.lunavicta.thebiomesbetween.TheBiomesBetween;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower BLOODWOOD = new TreeGrower(TheBiomesBetween.MOD_ID + ":bloodwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BLOODWOOD_KEY), Optional.empty());

}