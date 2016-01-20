package com.Deckee.DeckTech.blocks;

import com.Deckee.DeckTech.DeckTech;
import com.Deckee.DeckTech.utility.DeckTechCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

/**
 * Created by adam on 1/19/2016.
 */
public class DeckTechChestMaker extends Block {

    protected DeckTechChestMaker(String DeckTechChestMaker, Material mat){
        super(mat);

        this.setBlockName("DeckTechChestMaker");
        this.setBlockTextureName(DeckTech.MODID + ":" + "DeckTechChestMaker");
        this.setHardness(5.0F);
        this.setResistance(6.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(DeckTechCreativeTab.DeckTech_tab);

    }
    public boolean onBlockActivated(World world, int x,int y,int z,EntityPlayer entityPlayer, int side,float hitX,float hitY,float hitZ)
    {
        if (world.isAirBlock(x,y+1,z)){
        world.setBlock(x,y+1,z, Blocks.chest);}
        return true;
    }}