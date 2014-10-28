package kkaylium.mods.TechliumCraft.glowglass;

import cpw.mods.fml.common.registry.GameRegistry;
import kkaylium.mods.TechliumCraft.glowglass.blocks.BlockGGlass;
import kkaylium.mods.TechliumCraft.glowglass.info.GGInfo;
import kkaylium.mods.TechliumCraft.glowglass.items.ItemGCrystal;
import kkaylium.mods.TechliumCraft.glowglass.tileentities.TileEntityGlow;
import kkaylium.mods.TechliumCraft.main.info.TCInts;
import net.minecraft.block.material.Material;

/**
 * Created by kkaylium on 10/26/14.
 */
public class GlowGlass {

    public static void initGGBlocks(){
        GGInits.GGlass = new BlockGGlass(TCInts.glow_glass_id, Material.glass).setUnlocalizedName(GGInfo.glow_glass_name);
            GameRegistry.registerBlock(GGInits.GGlass, GGInfo.glow_glass_name);

    }

    public static void initGGItems(){
        GGInits.GCrystal_RED = new ItemGCrystal(TCInts.glow_crystal_RED_id, 0).setUnlocalizedName(GGInfo.glow_crystal_name + "_red");
            GameRegistry.registerItem(GGInits.GCrystal_RED, GGInfo.glow_crystal_name + "_red");
        GGInits.GCrystal_ORANGE = new ItemGCrystal(TCInts.glow_crystal_ORANGE_id, 1).setUnlocalizedName(GGInfo.glow_crystal_name + "_orange");
            GameRegistry.registerItem(GGInits.GCrystal_ORANGE, GGInfo.glow_crystal_name + "_orange");
        GGInits.GCrystal_YELLOW = new ItemGCrystal(TCInts.glow_crystal_YELLOW_id, 2).setUnlocalizedName(GGInfo.glow_crystal_name + "_yellow");
            GameRegistry.registerItem(GGInits.GCrystal_YELLOW, GGInfo.glow_crystal_name + "_yellow");
        GGInits.GCrystal_GREEN = new ItemGCrystal(TCInts.glow_ore_BLUE_id, 3).setUnlocalizedName(GGInfo.glow_crystal_name + "_green");
            GameRegistry.registerItem(GGInits.GCrystal_GREEN, GGInfo.glow_crystal_name + "_green");
        GGInits.GCrystal_BLUE = new ItemGCrystal(TCInts.glow_ore_BLUE_id, 4).setUnlocalizedName(GGInfo.glow_crystal_name + "_blue");
            GameRegistry.registerItem(GGInits.GCrystal_BLUE, GGInfo.glow_crystal_name + "_blue");
        GGInits.GCrystal_PURPLE = new ItemGCrystal(TCInts.glow_ore_PURPLE_id, 5).setUnlocalizedName(GGInfo.glow_crystal_name + "_purple");
            GameRegistry.registerItem(GGInits.GCrystal_PURPLE, GGInfo.glow_crystal_name + "_purple");
        GGInits.GCrystal_BLACK = new ItemGCrystal(TCInts.glow_crystal_BLACK_id, 6).setUnlocalizedName(GGInfo.glow_crystal_name + "_black");
            GameRegistry.registerItem(GGInits.GCrystal_BLACK, GGInfo.glow_crystal_name + "_black");
        GGInits.GCrystal_BROWN = new ItemGCrystal(TCInts.glow_crystal_BROWN_id, 7).setUnlocalizedName(GGInfo.glow_crystal_name + "_brown");
            GameRegistry.registerItem(GGInits.GCrystal_BROWN, GGInfo.glow_crystal_name + "_brown");
        GGInits.GCrystal_WHITE = new ItemGCrystal(TCInts.glow_crystal_WHITE_id, 8).setUnlocalizedName(GGInfo.glow_crystal_name + "_white");
            GameRegistry.registerItem(GGInits.GCrystal_WHITE, GGInfo.glow_crystal_name + "_white");
    }

    public static void initGGTileEnities(){
        GameRegistry.registerTileEntity(TileEntityGlow.class, GGInfo.TE_GLOW_NAME);
    }
}
