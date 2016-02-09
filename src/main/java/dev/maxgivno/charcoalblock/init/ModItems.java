package dev.maxgivno.charcoalblock.init;

import dev.maxgivno.charcoalblock.helpers.LogHelper;
import dev.maxgivno.charcoalblock.item.ItemCHB;
import dev.maxgivno.charcoalblock.item.ItemTrident;
import dev.maxgivno.charcoalblock.reference.ModInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemCHB trident = new ItemTrident();

    public static void init() {
        GameRegistry.registerItem(trident, "trident");
        LogHelper.info("Registered Item: " + trident.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModInfo.RESOURCE_PREFIX + item.getUnlocalizedName().substring(5), "inventory"));
        LogHelper.info("Rendered Block: " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRenders() {
        registerRender(trident);
    }
}
