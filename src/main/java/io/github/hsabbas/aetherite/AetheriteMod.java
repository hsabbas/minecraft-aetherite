package io.github.hsabbas.aetherite;

import io.github.hsabbas.aetherite.blocks.ModBlocks;
import io.github.hsabbas.aetherite.items.ModArmor;
import io.github.hsabbas.aetherite.items.ModItems;
import io.github.hsabbas.aetherite.world.OreGeneration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;

@Mod(AetheriteMod.MODID)
public class AetheriteMod {
  public static final String MODID = "aetherite";

  public AetheriteMod(){
    ModArmor.register();
    ModItems.register();
    ModBlocks.register();

    MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
  }

//  private void setup(final FMLCommonSetupEvent event){
//    DeferredWorkQueue.runLater(() ->{
//      OreGeneration.generateOres();
//    });
//  }
}
