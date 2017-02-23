package com.msaint.myfirstmod.items;

import com.msaint.myfirstmod.MyFirstMod;

import net.minecraft.item.ItemSpade;

public class ItemRedingotShovel extends ItemSpade {
	protected String name;

	public ItemRedingotShovel(ToolMaterial material,String unlocalizedName) {
		super(material);
		name = unlocalizedName;
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MyFirstMod.tabMyFirstMod);
	}
}
