package com.msaint.myfirstmod.items;

import com.msaint.myfirstmod.MyFirstMod;

import net.minecraft.item.ItemPickaxe;

public class ItemRedingotPicaxe extends ItemPickaxe {
	protected String name;

	public ItemRedingotPicaxe(ToolMaterial material,String unlocalizedName) {
		super(material);
		name = unlocalizedName;
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MyFirstMod.tabMyFirstMod);
	}
}
