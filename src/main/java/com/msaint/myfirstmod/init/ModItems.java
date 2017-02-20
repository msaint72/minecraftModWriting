package com.msaint.myfirstmod.init;

import com.msaint.myfirstmod.MyFirstMod;
import com.msaint.myfirstmod.items.ItemRedingot;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	public static Item redingotItem;

	public static void init() {
		redingotItem = new ItemRedingot("redingot_item");
		redingotItem.setRegistryName(new ResourceLocation(MyFirstMod.MODID, "redingot_item"));
		GameRegistry.register(redingotItem);
		registerItemModel("redingot_item");
	}

	public static void registerItemModel(String name) {
		MyFirstMod.proxy.registerItemModel(redingotItem, 0, name);
	}

}
