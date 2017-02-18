package com.msaint.myfirstmod.proxy;

import com.msaint.myfirstmod.init.Items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("CommonProxy:preInit");
		Items.init();
	}

	public void init(FMLInitializationEvent event) {
		System.out.println("CommonProxy:init");
	}

	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("CommonProxy:postInit");

	}

	public void registerItemModel(Item item, int temp, String name) {
		
	}

}
