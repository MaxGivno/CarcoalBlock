package dev.maxgivno.charcoalblock.proxy;

import dev.maxgivno.charcoalblock.block.Blocks;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        Blocks.registerRenders();
    }
}
