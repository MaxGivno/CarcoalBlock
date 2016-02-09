package dev.maxgivno.charcoalblock.proxy;

import dev.maxgivno.charcoalblock.block.Blocks;
import dev.maxgivno.charcoalblock.init.ModItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        Blocks.registerRenders();
        ModItems.registerRenders();
    }
}
