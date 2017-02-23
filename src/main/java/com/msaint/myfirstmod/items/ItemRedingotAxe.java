package com.msaint.myfirstmod.items;

import com.msaint.myfirstmod.MyFirstMod;

import net.minecraft.item.ItemAxe;

public class ItemRedingotAxe extends ItemAxe {
	protected String name;

	public ItemRedingotAxe(ToolMaterial material,String unlocalizedName) {
		super(material,8f,3f);
		name = unlocalizedName;
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MyFirstMod.tabMyFirstMod);
	}
}
