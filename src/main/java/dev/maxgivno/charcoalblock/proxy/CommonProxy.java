package dev.maxgivno.charcoalblock.proxy;

import dev.maxgivno.charcoalblock.block.Blocks;
import dev.maxgivno.charcoalblock.util.FuelHandler;
import dev.maxgivno.charcoalblock.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class CommonProxy implements IProxy{
    @Override
    public void registerBlocks() {
        Blocks.registerAll();
        Items.registerAll();
    }

    @Override
    public void registerRecipes() {
        GameRegistry.addRecipe(new ItemStack(Blocks.BLOCK_CHARCOAL.block),
                "xxx",
                "xxx",
                "xxx",
                'x', new ItemStack(net.minecraft.init.Items.coal, 1, 1)
        );
    }

    @Override
    public void registerFuels() {
        GameRegistry.registerFuelHandler(new FuelHandler());
    }
}
