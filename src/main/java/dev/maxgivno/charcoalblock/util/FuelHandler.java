package dev.maxgivno.charcoalblock.util;

import dev.maxgivno.charcoalblock.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {
        if (fuel.isItemEqual(new ItemStack(Blocks.BLOCK_CHARCOAL.block))) {
            return 16000;
        }

        return 0;
    }
}
