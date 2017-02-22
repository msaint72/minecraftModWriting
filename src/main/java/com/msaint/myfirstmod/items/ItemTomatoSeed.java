package com.msaint.myfirstmod.items;

import com.msaint.myfirstmod.MyFirstMod;
import com.msaint.myfirstmod.init.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ItemTomatoSeed extends ItemSeeds {
	protected String name;
	public ItemTomatoSeed(String unlocalizedName) {
		super(ModBlocks.blockCropTomato,Blocks.FARMLAND);
		name = unlocalizedName;
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MyFirstMod.tabMyFirstMod);
	}
}
