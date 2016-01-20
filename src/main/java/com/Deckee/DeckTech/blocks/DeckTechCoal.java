package com.Deckee.DeckTech.blocks;

import com.Deckee.DeckTech.DeckTech;
import com.Deckee.DeckTech.utility.DeckTechCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by adam on 1/18/2016.
 */
public class DeckTechCoal extends Block{

    protected DeckTechCoal(String DeckTechCoal, Material mat){
         super(mat);

        this.setBlockName("DeckTechCoal");
        this.setBlockTextureName(DeckTech.MODID + ":" + "DeckTechCoal");
        this.setHardness(5.0F);
        this.setResistance(6.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(DeckTechCreativeTab.DeckTech_tab);

    }

}
