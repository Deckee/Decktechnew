package com.Deckee.DeckTech.blocks;

import com.Deckee.DeckTech.utility.DeckTechCreativeTab;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by adam on 1/18/2016.
 */
public class DeckTechBlock{

    public static Block DeckTechCoal;
    public static Block DeckTechChestMaker;






    public static  final void init()
    {
        GameRegistry.registerBlock(DeckTechCoal = new DeckTechCoal("deckTechCoal",Material.rock),"DeckTechCoal");
        GameRegistry.registerBlock(DeckTechChestMaker = new DeckTechChestMaker("DeckTechChestMaker", Material.wood),"DeckTechChestMaker");
    }
}
