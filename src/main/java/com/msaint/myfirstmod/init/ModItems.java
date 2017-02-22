package com.msaint.myfirstmod.init;

import com.msaint.myfirstmod.MyFirstMod;
import com.msaint.myfirstmod.items.ItemRedingot;
import com.msaint.myfirstmod.items.ItemTomato;
import com.msaint.myfirstmod.items.ItemTomatoSeed;
import com.msaint.myfirstmod.items.tools.ItemRedingotSword;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static Item redingotItem;
	public static ItemTomatoSeed tomatoSeedItem;
	public static Item tomatoItem;
	public static Item redingotSwordItem;
	public static final Item.ToolMaterial toolMaterial=EnumHelper.addToolMaterial("REDINGOT", 2, 1000, 6f,3f,10);

	public static void init() {
		redingotItem = new ItemRedingot("redingot_item");
		redingotItem.setRegistryName(new ResourceLocation(MyFirstMod.MODID, "redingot_item"));
		GameRegistry.register(redingotItem);
		registerItemModel(redingotItem,"redingot_item");
		
		//itemTomatoSeed
		tomatoSeedItem = new ItemTomatoSeed("tomato_seed_item");
		tomatoSeedItem.setRegistryName(new ResourceLocation(MyFirstMod.MODID,"tomato_seed_item"));
		GameRegistry.register(tomatoSeedItem);
		registerItemModel(tomatoSeedItem,"tomato_seed_item");
		
		//itemTomato
		tomatoItem=new ItemTomato("tomato_item");
		tomatoItem.setRegistryName(new ResourceLocation(MyFirstMod.MODID,"tomato_item"));
		GameRegistry.register(tomatoItem);
		registerItemModel(tomatoItem,"tomato_item");
		
		//itemRedingotSword
		redingotSwordItem=new ItemRedingotSword(toolMaterial,"redingot_sword_item");
		redingotSwordItem.setRegistryName(new ResourceLocation(MyFirstMod.MODID,"redingot_sword_item"));
		GameRegistry.register(redingotSwordItem);
		registerItemModel(redingotSwordItem,"redingot_sword_item");
		
	}

	public static void registerItemModel(Item item,String name) {
		MyFirstMod.proxy.registerItemModel(item, 0, name);
	}

}
