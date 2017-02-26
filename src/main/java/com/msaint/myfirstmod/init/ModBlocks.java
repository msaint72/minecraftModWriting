package com.msaint.myfirstmod.init;

import com.msaint.myfirstmod.MyFirstMod;
import com.msaint.myfirstmod.blocks.BlockCropTomato;
import com.msaint.myfirstmod.blocks.BlockRedOre;

import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	private static final String CROP_TOMATO_BLOCK = "crop_tomato_block";
	private static final String RED_ORE_BLOCK = "red_ore_block";
	public static BlockRedOre redOreBlock;
	public static BlockCropTomato blockCropTomato;
	public static void init() {
		redOreBlock=new BlockRedOre(RED_ORE_BLOCK);
		redOreBlock.setRegistryName(new ResourceLocation(MyFirstMod.MODID,RED_ORE_BLOCK));
		GameRegistry.register(redOreBlock);

		ItemBlock itemBlock=new ItemBlock(redOreBlock);
		GameRegistry.register(itemBlock,redOreBlock.getRegistryName());
		registerItemModel(itemBlock,RED_ORE_BLOCK);
		
		//BlockCropTomato
		blockCropTomato=new BlockCropTomato(CROP_TOMATO_BLOCK);
		blockCropTomato.setRegistryName(new ResourceLocation(MyFirstMod.MODID,CROP_TOMATO_BLOCK));
		GameRegistry.register(blockCropTomato);
		// 
	}
	private static void registerItemModel(ItemBlock itemBlock,String name) {
		MyFirstMod.proxy.registerItemModel(itemBlock, 0, name);
	}
}
