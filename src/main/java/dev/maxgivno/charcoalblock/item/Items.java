package dev.maxgivno.charcoalblock.item;

import dev.maxgivno.charcoalblock.creativetab.TabCHB;
import dev.maxgivno.charcoalblock.helpers.LogHelper;
import dev.maxgivno.charcoalblock.reference.ModInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public enum Items {
    ITEM_TRIDENT("trident", new ItemTrident(), TabCHB.TabCHB)
    ;

    private static boolean registered = false;
    private static boolean rendered = false;
    public final Item item;
    private final String internalName;
    private final CreativeTabs creativeTabs;

    Items(String internalName, Item item, CreativeTabs creativeTabs) {
        this.internalName = internalName;
        this.item = item;
        this.creativeTabs = creativeTabs;
    }

    public void registerItem() {
        GameRegistry.registerItem(item.setCreativeTab(creativeTabs).setUnlocalizedName(internalName), internalName);
        LogHelper.info("Registered Item: " + internalName);
    }

    public static void registerItems() {
        if (registered)
            return;
        for (Items b : Items.values())
            b.registerItem();
        registered = true;
    }

    public void registerRender()
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModInfo.RESOURCE_PREFIX + internalName, "inventory"));
        LogHelper.info("Rendered Block: " + internalName);
    }

    public static void registerRenders(){
        if (rendered)
            return;
        for (Items b : Items.values())
            b.registerRender();
        rendered = true;
    }
}
