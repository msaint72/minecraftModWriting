package com.msaint.myfirstmod.items;

import com.msaint.myfirstmod.MyFirstMod;

import net.minecraft.item.ItemHoe;

public class ItemRedingotHoe extends ItemHoe {
	protected String name;

	public ItemRedingotHoe(ToolMaterial material,String unlocalizedName) {
		super(material);
		name = unlocalizedName;
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MyFirstMod.tabMyFirstMod);
	}
}
