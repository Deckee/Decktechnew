package com.Deckee.DeckTech.utility;

import com.Deckee.DeckTech.blocks.DeckTechBlock;
import com.Deckee.DeckTech.blocks.DeckTechCoal;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

/**
 * Created by adam on 1/19/2016.
 */
public class DeckTechGen implements IWorldGenerator {



    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        int dimensionId = world.provider.dimensionId;
        if (dimensionId != 1&& dimensionId !=-1)
        if (random.nextInt(30) == 0) {
            int x = chunkX * 16 + random.nextInt(16);
            int z = chunkZ * 16 + random.nextInt(16);
            int y = 45;
            generateDeckTechCoal(world, x, y, z);
        }
        // world.setBlock(chunkX *16,30,chunkZ * 16, Blocks.diamond_ore,0,2);

    }

    private void generateDeckTechCoal(World world, int x, int y, int z)



    {
        for (int i = 0; i < 4; i++) {
            world.setBlock(x,y+i,z,Blocks.coal_ore );
        }
        for (int dx= 0; dx <4; dx++){
            for (int dy= 0; dy <4; dy++) {
            world.setBlock(x + 1+dx, y+dy , z + 1, DeckTechBlock.DeckTechCoal);
            }
        }
    }

}