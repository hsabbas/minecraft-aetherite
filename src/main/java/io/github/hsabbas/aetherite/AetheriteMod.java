package io.github.hsabbas.aetherite;

import io.github.hsabbas.aetherite.blocks.ModBlocks;
import io.github.hsabbas.aetherite.items.ModArmor;
import io.github.hsabbas.aetherite.items.ModItems;
import net.minecraftforge.fml.common.Mod;

@Mod(AetheriteMod.MODID)
public class AetheriteMod {
  public static final String MODID = "aetherite";

  public AetheriteMod(){
    ModArmor.register();
    ModItems.register();
    ModBlocks.register();
  }
}
