package com.msaint.myfirstmod.init;

import com.msaint.myfirstmod.MyFirstMod;
import com.msaint.myfirstmod.items.ItemArmor;
import com.msaint.myfirstmod.items.ItemRedingot;
import com.msaint.myfirstmod.items.ItemRedingotAxe;
import com.msaint.myfirstmod.items.ItemRedingotHoe;
import com.msaint.myfirstmod.items.ItemRedingotPicaxe;
import com.msaint.myfirstmod.items.ItemRedingotShovel;
import com.msaint.myfirstmod.items.ItemTomato;
import com.msaint.myfirstmod.items.ItemTomatoSeed;
import com.msaint.myfirstmod.items.tools.ItemRedingotSword;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	private static final String REDINGOT_HOE_ITEM = "redingot_hoe_item";
	private static final String REDINGOT_SHOVEL_ITEM = "redingot_shovel_item";
	private static final String REDINGOT_AXE_ITEM = "redingot_axe_item";
	private static final String REDINGOT_PICAXE_ITEM = "redingot_picaxe_item";
	private static final String REDINGOT_SWORD_ITEM = "redingot_sword_item";
	private static final String TOMATO_ITEM = "tomato_item";
	private static final String TOMATO_SEED_ITEM = "tomato_seed_item";
	private static final String REDINGOT_ITEM = "redingot_item";
	public static Item redingotItem;
	public static ItemTomatoSeed tomatoSeedItem;
	public static Item tomatoItem;
	public static Item redingotSwordItem;
	public static Item redingotPicaxeItem;
	public static Item redingotAxeItem;
	public static Item redingotShovelItem;
	public static Item redingotHoeItem;

	public static ItemArmor redingotHelmet;
	public static ItemArmor redingotChestplate;
	public static ItemArmor redingotLeggings;
	public static ItemArmor redingotBoots;

	public static final Item.ToolMaterial toolMaterial = EnumHelper.addToolMaterial("REDINGOT", 2, 1000, 6f, 3f, 10);
	public static final ItemArmor.ArmorMaterial redingotArmorMaterial = EnumHelper.addArmorMaterial("REDINGOT",
			MyFirstMod.MODID + ":redingot", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static void init() {
		redingotItem = register(new ItemRedingot(REDINGOT_ITEM));

		// itemTomatoSeed
		tomatoSeedItem = (ItemTomatoSeed) register(new ItemTomatoSeed(TOMATO_SEED_ITEM));

		// itemTomato
		tomatoItem = register(new ItemTomato(TOMATO_ITEM));

		// itemRedingotSword
		redingotSwordItem = register(new ItemRedingotSword(toolMaterial, REDINGOT_SWORD_ITEM));

		// itemRedingotPicaxe
		redingotPicaxeItem = register(new ItemRedingotPicaxe(toolMaterial, REDINGOT_PICAXE_ITEM));

		// itemRedingotAxe
		redingotAxeItem = register(new ItemRedingotAxe(toolMaterial, REDINGOT_AXE_ITEM));

		// itemRedingotShovel
		redingotShovelItem = register(new ItemRedingotShovel(toolMaterial, REDINGOT_SHOVEL_ITEM));

		// itemRedingotHoe
		redingotHoeItem = register(new ItemRedingotHoe(toolMaterial, REDINGOT_HOE_ITEM));

		// armor
		redingotHelmet = (ItemArmor) register(
				new ItemArmor(redingotArmorMaterial, EntityEquipmentSlot.HEAD, "redingot_helmet_item"));
		redingotChestplate = (ItemArmor) register(
				new ItemArmor(redingotArmorMaterial, EntityEquipmentSlot.CHEST, "redingot_chestplate_item"));
		redingotLeggings = (ItemArmor) register(
				new ItemArmor(redingotArmorMaterial, EntityEquipmentSlot.LEGS, "redingot_leggings_item"));
		redingotBoots = (ItemArmor) register(
				new ItemArmor(redingotArmorMaterial, EntityEquipmentSlot.FEET, "redingot_boots_item"));
	}

	private static Item register(Item item) {
		item.setRegistryName(new ResourceLocation(MyFirstMod.MODID, item.getUnlocalizedName().substring(5)));
		GameRegistry.register(item);
		registerItemModel(item, item.getUnlocalizedName().substring(5));
		return item;
	}

	public static void registerItemModel(Item item, String name) {
		MyFirstMod.proxy.registerItemModel(item, 0, name);
	}

}
