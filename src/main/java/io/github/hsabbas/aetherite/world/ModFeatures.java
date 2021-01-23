package io.github.hsabbas.aetherite.world;

import io.github.hsabbas.aetherite.blocks.ModBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

public class ModFeatures {
  public static final ConfiguredFeature<?, ?> ORE_AETHERITE_SMALL = Feature.NO_SURFACE_ORE
    .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.AETHERITE_ORE.get().getDefaultState(), 2))
      .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(8, 0, 128))).square();

  public static final ConfiguredFeature<?, ?> ORE_AETHERITE_LARGE = Feature.NO_SURFACE_ORE
    .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.AETHERITE_ORE.get().getDefaultState(), 3))
      .withPlacement(Placement.DEPTH_AVERAGE.configure(new DepthAverageConfig(16, 8))).square();

  private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
    return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
  }
}
