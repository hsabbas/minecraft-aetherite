package io.github.hsabbas.aetherite.items;

import io.github.hsabbas.aetherite.AetheriteMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AetheriteMod.MODID);

  public static final RegistryObject<Item> AETHERITE_SCRAP = ITEMS.register("aetherite_scrap", () ->
    new Item(new Item.Properties().group(ItemGroup.MATERIALS).isImmuneToFire()));
  public static final RegistryObject<Item> AETHERITE_INGOT = ITEMS.register("aetherite_ingot", () ->
    new Item(new Item.Properties().group(ItemGroup.MATERIALS).isImmuneToFire()));

  public static void register(){
    ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
  }
}
