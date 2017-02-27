package com.msaint.myfirstmod.event;

import com.msaint.myfirstmod.blocks.BlockRedOre;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonEventHandler {
	@SubscribeEvent
	public void onBlockBreak(BreakEvent event) {
		TextComponentTranslation message = new TextComponentTranslation("block.break.message", new Object[0]);
		message.getStyle().setColor(TextFormatting.RED);

        event.getPlayer().sendMessage(message);
	}
	
	@SubscribeEvent
	public void onBlockPlaced(PlaceEvent event) {
		if(event.getPlacedBlock().getBlock() instanceof BlockRedOre){
			World world=event.getWorld();
			world.addWeatherEffect(new EntityLightningBolt(world, event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), true));
		}
	}
}
