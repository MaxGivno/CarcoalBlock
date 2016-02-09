package dev.maxgivno.charcoalblock.item;

import dev.maxgivno.charcoalblock.helpers.LogHelper;
import dev.maxgivno.charcoalblock.reference.ModInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCHB extends Item{
    public ItemCHB(){
        super();
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", ModInfo.LOWERCASE_MOD_ID, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", ModInfo.LOWERCASE_MOD_ID, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @SideOnly(Side.CLIENT)
    public void registerRender()
    {
        Item item = Item.getByNameOrId(getUnlocalizedName());
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(getUnwrappedUnlocalizedName(super.getUnlocalizedName()), "inventory"));
        LogHelper.info("Rendered Block: " + getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }




}
