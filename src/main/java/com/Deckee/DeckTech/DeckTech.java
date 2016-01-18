package com.deckee.DeckTech;
import com.Deckee.DeckTech.ModBlocks.DeckTechBlocks;
import com.Deckee.DeckTech.proxy.CommonProxy;
import com.deckee.DeckTech.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = DeckTech.MODID, name = DeckTech.MODNAME, version = DeckTech.VERSION)
public class DeckTech {


    @SidedProxy(clientSide="com.Deckee.DeckTech.proxy.ClientProxy", serverSide="com.Deckee.DeckTech.proxy.ServerProxy")
    public static CommonProxy proxy;


    public static final String MODID = "DeckTech";
    public static final String MODNAME = "DeckTech";
    public static final String VERSION = "1.0.2";

    @Instance
    public static DeckTech instance = new DeckTech();


    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        DeckTechBlocks.init();

    LogHelper.info("I prefer the hard truths of Zombies to the easy lies of Elves");



    }

    @EventHandler
    public void init(FMLInitializationEvent e) {




    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {


    }
}