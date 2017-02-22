package com.msaint.myfirstmod.items;

import com.msaint.myfirstmod.MyFirstMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemTomato extends ItemFood {
	protected String name;

	public ItemTomato(String unlocalizedName) {
		super(4,0.5f,false);

		name = unlocalizedName;
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MyFirstMod.tabMyFirstMod);
	}
}
