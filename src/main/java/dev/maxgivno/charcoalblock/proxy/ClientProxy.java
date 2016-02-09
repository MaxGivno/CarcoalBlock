package dev.maxgivno.charcoalblock.proxy;

import dev.maxgivno.charcoalblock.block.Blocks;
import dev.maxgivno.charcoalblock.item.ItemCHB;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        Blocks.registerRenders();
    }
}
