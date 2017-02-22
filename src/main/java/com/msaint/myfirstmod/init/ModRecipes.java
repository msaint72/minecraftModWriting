package com.msaint.myfirstmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		//shapeless recipe
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.redingotItem),Blocks.DIRT);
		
		//shaped recipe
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.redOreBlock), " I ","IRI"," I ",'I',Blocks.IRON_ORE,'R',ModItems.redingotItem);
		
		//smelting recipe
		GameRegistry.addSmelting(ModBlocks.redOreBlock, new ItemStack(ModItems.redingotItem), 0.7f);
	}
}
