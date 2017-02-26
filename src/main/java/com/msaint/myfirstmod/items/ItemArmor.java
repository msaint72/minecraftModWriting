package com.msaint.myfirstmod.items;

import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemArmor extends net.minecraft.item.ItemArmor {
	protected String name;
	public ItemArmor(ArmorMaterial material,EntityEquipmentSlot slot,String unlocalizedName) {
		super(material, 0, slot);
		this.name=name;
		this.setUnlocalizedName(unlocalizedName);
	}
}
