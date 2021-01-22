package io.github.hsabbas.aetherite.items;

import io.github.hsabbas.aetherite.material.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModArmor {
  public static final RegistryObject<Item> AETHERITE_HELMET = ModItems.ITEMS.register("aetherite_helmet", () ->
    new ArmorItem(ModArmorMaterial.AETHERITE, EquipmentSlotType.HEAD, (new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire())));

  public static final RegistryObject<Item> AETHERITE_CHESTPLATE = ModItems.ITEMS.register("aetherite_chestplate", () ->
    new ArmorItem(ModArmorMaterial.AETHERITE, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT).isImmuneToFire()));

  public static final RegistryObject<Item> AETHERITE_LEGGINGS = ModItems.ITEMS.register("aetherite_leggings", () ->
    new ArmorItem(ModArmorMaterial.AETHERITE, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT).isImmuneToFire()));

  public static final RegistryObject<Item> AETHERITE_BOOTS = ModItems.ITEMS.register("aetherite_boots", () ->
    new ArmorItem(ModArmorMaterial.AETHERITE, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT).isImmuneToFire()));

  public static void register(){
    //Load class fields
  }
}
