<<<<<<< Updated upstream
package com.deckee.DeckTech;
import com.Deckee.DeckTech.ModBlocks.DeckTechBlocks;
=======
package com.Deckee.DeckTech;

import com.Deckee.DeckTech.blocks.DeckTechBlock;
import com.Deckee.DeckTech.items.DeckTechItem;
>>>>>>> Stashed changes
import com.Deckee.DeckTech.proxy.CommonProxy;
import com.Deckee.DeckTech.utility.DeckTechCreativeTab;
import com.Deckee.DeckTech.utility.DeckTechGen;
import com.Deckee.DeckTech.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = DeckTech.MODID, name = DeckTech.MODNAME, version = DeckTech.VERSION)
public class DeckTech {


    public static final String MODID = "Decktech";
    public static final String MODNAME = "DeckTech";
    public static final String VERSION = "1.0.2";
    @SidedProxy(clientSide = "com.Deckee.DeckTech.proxy.ClientProxy", serverSide = "com.Deckee.DeckTech.proxy.ServerProxy")
    public static CommonProxy proxy;
    @Instance
    public static DeckTech instance = new DeckTech();


    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
<<<<<<< Updated upstream
        DeckTechBlocks.init();

    LogHelper.info("I prefer the hard truths of Zombies to the easy lies of Elves");


=======
        GameRegistry.registerWorldGenerator(new DeckTechGen(),0);

        proxy.preInit(e);
        LogHelper.info("I prefer the hard truths of Zombies to the easy lies of Elves");
        DeckTechBlock.init();
        DeckTechItem.init();
>>>>>>> Stashed changes

    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);

    }
}