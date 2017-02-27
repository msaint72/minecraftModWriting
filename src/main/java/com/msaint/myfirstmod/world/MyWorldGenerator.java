package com.msaint.myfirstmod.world;

import java.util.Random;

import com.msaint.myfirstmod.init.ModBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class MyWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
	    case 0: //Overworld
	    	generateOverWorld(random,chunkX,chunkZ,world,chunkProvider,0,64,20);
	        break;
	    case -1: //Nether

	        break;
	    case 1: //End

	        break;
	    }
	}

	private void generateOverWorld(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkProvider,
			int minY, int maxY, int chancesToSpawn) {
		WorldGenMinable generator=new WorldGenMinable(ModBlocks.redOreBlock.getDefaultState(), 8);
	    int YDiff = maxY - minY + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunkX * 16 + random.nextInt(16);
	        int y = minY + random.nextInt(YDiff);
	        int z = chunkZ * 16 + random.nextInt(16);
	        generator.generate(world, random, new BlockPos(x, y, z));
	    }
	}
}
