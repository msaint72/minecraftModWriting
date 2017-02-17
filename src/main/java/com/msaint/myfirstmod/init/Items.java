package com.msaint.myfirstmod.init;

import com.msaint.myfirstmod.items.ItemRedingot;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items {
	public static Item redingotItem;
	
	public static void init() {
		redingotItem=new ItemRedingot("redingot_item");
		redingotItem.setRegistryName("redingot_item");
		GameRegistry.register(redingotItem);
	}
	
}
