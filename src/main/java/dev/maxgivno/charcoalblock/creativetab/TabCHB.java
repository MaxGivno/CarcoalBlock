package dev.maxgivno.charcoalblock.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabCHB extends CreativeTabs {

    public TabCHB(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return net.minecraft.init.Items.rabbit;
    }
}
