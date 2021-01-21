package io.github.hsabbas.aetherite.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModArmor {
  public static final RegistryObject<Item> AETHERITE_HELMET = ModItems.ITEMS.register("aetherite_helmet", () ->
    new ArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.HEAD, (new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire())));

  public static final RegistryObject<Item> AETHERITE_CHESTPLATE = ModItems.ITEMS.register("aetherite_chestplate", () ->
    new ArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT).isImmuneToFire()));

  public static final RegistryObject<Item> AETHERITE_LEGGINGS = ModItems.ITEMS.register("aetherite_leggings", () ->
    new ArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT).isImmuneToFire()));

  public static final RegistryObject<Item> AETHERITE_BOOTS = ModItems.ITEMS.register("aetherite_boots", () ->
    new ArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT).isImmuneToFire()));

  public static void register(){}
}
