package com.msaint.myfirstmod.blocks;

import com.msaint.myfirstmod.MyFirstMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockRedOre extends Block {
	protected String name;
	public BlockRedOre(String unlocalizedname) {
		super(Material.IRON);
		name=unlocalizedname;
		this.setUnlocalizedName(unlocalizedname);
		setCreativeTab(MyFirstMod.tabMyFirstMod);

		setHardness(5.0f);
		setResistance(10.0f);
		setSoundType(SoundType.METAL);
	}
}
