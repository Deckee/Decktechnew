package com.Deckee.DeckTech.utility;

import com.Deckee.DeckTech.DeckTech;
import com.Deckee.DeckTech.blocks.DeckTechBlock;
import com.Deckee.DeckTech.items.DeckTechItem;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by adam on 1/18/2016.
 */
public class DeckTechCreativeTab {
    public static final CreativeTabs DeckTech_tab = new CreativeTabs(DeckTech.MODID) {
        @Override
        public Item getTabIconItem() {
            return DeckTechItem.tabIcon;
        }


    };
}
