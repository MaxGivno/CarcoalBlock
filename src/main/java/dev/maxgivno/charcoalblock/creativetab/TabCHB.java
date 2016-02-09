package dev.maxgivno.charcoalblock.creativetab;

import dev.maxgivno.charcoalblock.init.ModItems;
import dev.maxgivno.charcoalblock.reference.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabCHB {

    public static final CreativeTabs TabCHB = new CreativeTabs(ModInfo.LOWERCASE_MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.trident;
        }
    };
}
