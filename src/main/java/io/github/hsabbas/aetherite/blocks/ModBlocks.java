package io.github.hsabbas.aetherite.blocks;

import io.github.hsabbas.aetherite.AetheriteMod;
import io.github.hsabbas.aetherite.items.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AetheriteMod.MODID);

  private static final RegistryObject<Block> AETHERITE_ORE = registerBlockItem("aetherite_ore", () ->
    new Block(AbstractBlock.Properties.from(Blocks.ANCIENT_DEBRIS)));

  private static final RegistryObject<Block> AETHERITE_BLOCK = registerBlockItem("aetherite_block", () ->
    new Block(AbstractBlock.Properties.from(Blocks.NETHERITE_BLOCK)));

  private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
    return BLOCKS.register(name, block);
  }

  private static <T extends Block> RegistryObject<T> registerBlockItem(String name, Supplier<T> block){
    RegistryObject<T> registryObject = registerBlock(name, block);
    ModItems.ITEMS.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).isImmuneToFire()));
    return registryObject;
  }

  public static void register(){
    BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
  }
}
