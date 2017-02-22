package com.msaint.myfirstmod.init;

import com.msaint.myfirstmod.MyFirstMod;
import com.msaint.myfirstmod.blocks.BlockCropTomato;
import com.msaint.myfirstmod.blocks.BlockRedOre;

import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static BlockRedOre redOreBlock;
	public static BlockCropTomato blockCropTomato;
	public static void init() {
		redOreBlock=new BlockRedOre("red_ore_block");
		redOreBlock.setRegistryName(new ResourceLocation(MyFirstMod.MODID,"red_ore_block"));
		GameRegistry.register(redOreBlock);

		ItemBlock itemBlock=new ItemBlock(redOreBlock);
		GameRegistry.register(itemBlock,redOreBlock.getRegistryName());
		registerItemModel(itemBlock,"red_ore_block");
		
		//BlockCropTomato
		blockCropTomato=new BlockCropTomato("crop_tomato_block");
		blockCropTomato.setRegistryName(new ResourceLocation(MyFirstMod.MODID,"crop_tomato_block"));
		GameRegistry.register(blockCropTomato);
		// 
	}
	private static void registerItemModel(ItemBlock itemBlock,String name) {
		MyFirstMod.proxy.registerItemModel(itemBlock, 0, name);
	}
}
