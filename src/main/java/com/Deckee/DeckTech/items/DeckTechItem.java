package com.Deckee.DeckTech.items;

import com.Deckee.DeckTech.utility.DeckTechCreativeTab;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by adam on 1/18/2016.
 */
public class DeckTechItem
{

    public static Item tabIcon;
    public static Item CarbonCoal;



    public static  final void init()
    {
        CarbonCoal = new Item().setUnlocalizedName("CCoal").setCreativeTab(DeckTechCreativeTab.DeckTech_tab).setTextureName("decktech" + ":CCoal");
        tabIcon = new Item().setUnlocalizedName("tabIcon").setCreativeTab(DeckTechCreativeTab.DeckTech_tab).setTextureName("decktech" + ":decktechItem");

        GameRegistry.registerItem(tabIcon, "tabIcon");
        GameRegistry.registerItem(CarbonCoal,"CarbonCoal");
    }
}
