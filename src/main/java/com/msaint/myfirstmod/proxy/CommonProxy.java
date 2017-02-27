package com.msaint.myfirstmod.proxy;

import com.msaint.myfirstmod.event.CommonEventHandler;
import com.msaint.myfirstmod.init.ModBlocks;
import com.msaint.myfirstmod.init.ModItems;
import com.msaint.myfirstmod.init.ModRecipes;
import com.msaint.myfirstmod.world.MyWorldGenerator;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("CommonProxy:preInit");
		ModBlocks.init();
		ModItems.init();
		GameRegistry.registerWorldGenerator(new MyWorldGenerator(),3);
	}

	public void init(FMLInitializationEvent event) {
		System.out.println("CommonProxy:init");
		ModRecipes.init();
		MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
	}

	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("CommonProxy:postInit");

	}

	public void registerItemModel(Item item, int temp, String name) {
		
	}

}
