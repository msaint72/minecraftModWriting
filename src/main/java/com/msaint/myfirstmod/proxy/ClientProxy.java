package com.msaint.myfirstmod.proxy;

import com.msaint.myfirstmod.MyFirstMod;
import com.msaint.myfirstmod.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}

	@Override
	public void registerItemModel(Item item, int temp, String name) {
		ModelResourceLocation model = new ModelResourceLocation(MyFirstMod.MODID + ":" + name, "inventory");
		ModelLoader.setCustomModelResourceLocation(item, temp, model);
	}

}
