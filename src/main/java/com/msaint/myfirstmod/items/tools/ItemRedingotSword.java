package com.msaint.myfirstmod.items.tools;

import com.msaint.myfirstmod.MyFirstMod;

import net.minecraft.item.ItemSword;

public class ItemRedingotSword extends ItemSword {
	protected String name;

	public ItemRedingotSword(ToolMaterial material,String unlocalizedName) {
		super(material);
		name = unlocalizedName;
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MyFirstMod.tabMyFirstMod);
	}
	
}
