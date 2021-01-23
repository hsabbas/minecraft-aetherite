package io.github.hsabbas.aetherite.world;

import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {
  public static void generateOres(final BiomeLoadingEvent event){
   event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ModFeatures.ORE_AETHERITE_SMALL);
   event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ModFeatures.ORE_AETHERITE_LARGE);
  }
}
