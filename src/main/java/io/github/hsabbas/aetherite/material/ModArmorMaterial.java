package io.github.hsabbas.aetherite.material;

import io.github.hsabbas.aetherite.AetheriteMod;
import io.github.hsabbas.aetherite.items.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
  AETHERITE(AetheriteMod.MODID + ":aetherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
    return Ingredient.fromItems(ModItems.AETHERITE_INGOT.get());
  });

  private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
  private final String name;
  private final int maxDamageFactor;
  private final int[] damageReductionAmountArray;
  private final int enchantability;
  private final SoundEvent soundEvent;
  private final float toughness;
  private final float knockbackResistance;
  private final LazyValue<Ingredient> repairMaterial;

  ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
    this.name = name;
    this.maxDamageFactor = maxDamageFactor;
    this.damageReductionAmountArray = damageReductionAmountArray;
    this.enchantability = enchantability;
    this.soundEvent = soundEvent;
    this.toughness = toughness;
    this.knockbackResistance = knockbackResistance;
    this.repairMaterial = new LazyValue<>(repairMaterial);
  }

  @Override
  public int getDurability(EquipmentSlotType slotIn) {
    return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
  }

  @Override
  public int getDamageReductionAmount(EquipmentSlotType slotIn) {
    return this.damageReductionAmountArray[slotIn.getIndex()];
  }

  @Override
  public int getEnchantability() {
    return this.enchantability;
  }

  @Override
  public SoundEvent getSoundEvent() {
    return this.soundEvent;
  }

  @Override
  public Ingredient getRepairMaterial() {
    return this.repairMaterial.getValue();
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public float getToughness() {
    return this.toughness;
  }

  @Override
  public float getKnockbackResistance() {
    return this.knockbackResistance;
  }
}
