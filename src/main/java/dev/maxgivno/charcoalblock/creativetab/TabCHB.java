package dev.maxgivno.charcoalblock.creativetab;

import dev.maxgivno.charcoalblock.item.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabCHB extends CreativeTabs {

    @Override
    public Item getTabIconItem() {
        return Items.ITEM_TRIDENT;
    }

    public TabCHB(String label) {
        super("tabCHB");
    }
}
