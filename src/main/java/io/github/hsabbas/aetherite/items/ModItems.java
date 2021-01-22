package io.github.hsabbas.aetherite.items;

import io.github.hsabbas.aetherite.AetheriteMod;
import io.github.hsabbas.aetherite.material.ModItemTier;
import net.minecraft.item.*;
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

  public static final RegistryObject<Item> AETHERITE_SWORD = ITEMS.register("aetherite_sword", () ->
    new SwordItem(ModItemTier.AETHERITE, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT).isImmuneToFire()));
  public static final RegistryObject<Item> AETHERITE_SHOVEL = ITEMS.register("aetherite_shovel", () ->
    new ShovelItem(ModItemTier.AETHERITE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS).isImmuneToFire()));
  public static final RegistryObject<Item> AETHERITE_PICKAXE = ITEMS.register("aetherite_pickaxe", () ->
    new PickaxeItem(ModItemTier.AETHERITE, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS).isImmuneToFire()));
  public static final RegistryObject<Item> AETHERITE_AXE = ITEMS.register("aetherite_axe", () ->
    new AxeItem(ModItemTier.AETHERITE, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS).isImmuneToFire()));
  public static final RegistryObject<Item> AETHERITE_HOE = ITEMS.register("aetherite_hoe", () ->
    new HoeItem(ModItemTier.AETHERITE, -4, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS).isImmuneToFire()));

  public static void register(){
    ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
  }
}
