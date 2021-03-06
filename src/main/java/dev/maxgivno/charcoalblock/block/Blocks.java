package dev.maxgivno.charcoalblock.block;

import dev.maxgivno.charcoalblock.creativetab.TabCHB;
import dev.maxgivno.charcoalblock.helpers.LogHelper;
import dev.maxgivno.charcoalblock.reference.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.common.registry.GameRegistry;


public enum Blocks {
    BLOCK_CHARCOAL("charcoalblock", new BlockCharcoalBlock(), TabCHB.TabCHB, true)
    ;

    private static boolean registeredBlock = false;
    private static boolean registeredRenderer = false;
    public final Block block;
    private final String internalName;
    private final Class<? extends ItemBlock> itemBlockClass;
    private final CreativeTabs creativeTabs;
    private final boolean defaultRenderer;

    Blocks(String internalName, Block block) {
        this(internalName, block, ItemBlock.class, null, true);
    }

    Blocks(String internalName, Block block, CreativeTabs creativeTabs, boolean defaultRenderer) {
        this(internalName, block, ItemBlock.class, creativeTabs, defaultRenderer);
    }

    Blocks(String internalName, Block block, Class<? extends ItemBlock> itemBlockClass) {
        this(internalName, block, itemBlockClass, null, true);
    }

    Blocks(String internalName, Block block, Class<? extends ItemBlock> itemBlockClass, CreativeTabs creativeTabs, boolean useDefaultRenderer) {
        this.internalName = internalName;
        this.block = block;
        this.itemBlockClass = itemBlockClass;
        this.creativeTabs = creativeTabs;
        this.defaultRenderer = useDefaultRenderer;
    }

    public static void registerAll() {
        if (!registeredRenderer && registeredBlock) {
            for (Blocks b : Blocks.values()) {
                if (b.defaultRenderer) {
                    b.registerBlock();
                }
            }

            registeredRenderer = true;
        }

        if (!registeredBlock) {
            for (Blocks b : Blocks.values()) {
                b.registerBlock();
            }

            registeredBlock = true;
        }
    }

    public String getInternalName() {
        return internalName;
    }

    public String getStatName() {
        return StatCollector.translateToLocal(block.getUnlocalizedName().replace("tileentity.", "block."));
    }

    private void registerBlock() {
        GameRegistry.registerBlock(block.setCreativeTab(creativeTabs).setUnlocalizedName(internalName), itemBlockClass, internalName);
        LogHelper.info("Registered Block: " + internalName);
    }

    public void registerRenderer() {
        if (Platform.isClient()) {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            renderItem.getItemModelMesher().register(block.getItem(null, null), 0, new ModelResourceLocation(ModInfo.MOD_ID + ":" + internalName, "inventory"));

            LogHelper.info("Register Block Renderer: " + internalName);
        }

    }
}
