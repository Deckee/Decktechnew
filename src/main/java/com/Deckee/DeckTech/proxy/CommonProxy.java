package com.Deckee.DeckTech.proxy;

import com.Deckee.DeckTech.blocks.DeckTechBlock;
import com.Deckee.DeckTech.items.DeckTechItem;
import com.Deckee.DeckTech.utility.LogHelper;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by adam on 1/18/2016.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {

        DeckTechBlock.init();
        DeckTechItem.init();
        LogHelper.error("Loaded common");
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}

