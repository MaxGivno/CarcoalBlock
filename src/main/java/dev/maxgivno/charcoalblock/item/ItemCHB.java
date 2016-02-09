package dev.maxgivno.charcoalblock.item;

import dev.maxgivno.charcoalblock.creativetab.TabCHB;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCHB extends Item{
    public ItemCHB(){
        super();
        this.maxStackSize = 1;
        this.setCreativeTab(TabCHB.TabCHB);
        this.setNoRepair();
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
        return super.onItemRightClick(itemStackIn, worldIn, playerIn);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


}
