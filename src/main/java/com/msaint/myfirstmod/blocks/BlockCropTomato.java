package com.msaint.myfirstmod.blocks;

import com.msaint.myfirstmod.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropTomato extends BlockCrops {
	protected String name;
	public BlockCropTomato(String unlocalizedname) {
		name=unlocalizedname;
		this.setUnlocalizedName(unlocalizedname);
	}
	@Override
	protected Item getSeed() {
		return ModItems.tomatoSeedItem;
	}
	@Override
	protected Item getCrop() {
		return ModItems.tomatoItem;
	}
	
	

}
