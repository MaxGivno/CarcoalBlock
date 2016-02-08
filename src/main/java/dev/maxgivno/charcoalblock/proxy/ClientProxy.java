package dev.maxgivno.charcoalblock.proxy;

import dev.maxgivno.charcoalblock.block.Blocks;
import dev.maxgivno.charcoalblock.item.Items;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        Blocks.registerRenders();
        Items.registerRenders();
    }
}
