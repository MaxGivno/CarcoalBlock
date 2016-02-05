package dev.maxgivno.charcoalblock.proxy;

import dev.maxgivno.charcoalblock.block.Blocks;
import dev.maxgivno.charcoalblock.util.FuelHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class CommonProxy implements IProxy{
    @Override
    public void registerBlocks() {
        Blocks.registerAll();
    }

    @Override
    public void registerRecipes() {
        GameRegistry.addRecipe(new ItemStack(Blocks.BLOCK_CHARCOAL.block),
                "xxx",
                "xxx",
                "xxx",
                'x', new ItemStack(Items.coal, 1, 1)
        );
    }

    @Override
    public void registerFuels() {
        GameRegistry.registerFuelHandler(new FuelHandler());
    }
}
