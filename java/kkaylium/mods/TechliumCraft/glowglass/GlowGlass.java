package kkaylium.mods.TechliumCraft.glowglass;

import cpw.mods.fml.common.registry.GameRegistry;
import kkaylium.mods.TechliumCraft.glowglass.blocks.*;
import kkaylium.mods.TechliumCraft.glowglass.info.GGInfo;
import kkaylium.mods.TechliumCraft.glowglass.items.*;
import kkaylium.mods.TechliumCraft.glowglass.tileentities.TileEntityGlow;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item.ToolMaterial;
/**
 * Created by kkaylium on 10/26/14.
 */
public class GlowGlass {

    public static void initGGBlocks(){
        GGInits.GGlass = new BlockGGlass(Material.glass).setBlockName(GGInfo.glow_glass_name);
            GameRegistry.registerBlock(GGInits.GGlass, GGInfo.glow_glass_name);
        GGInits.GBlock = new BlockGBlock(Material.rock).setBlockName(GGInfo.glow_block_name);
            GameRegistry.registerBlock(GGInits.GBlock, GGInfo.glow_block_name);
        GGInits.GFence = new BlockGFence(Material.glass).setBlockName(GGInfo.glow_fence_name);
            GameRegistry.registerBlock(GGInits.GFence, GGInfo.glow_fence_name);
        GGInits.GOre = new BlockGOre(Material.rock).setBlockName(GGInfo.glow_ore_name);
            GameRegistry.registerBlock(GGInits.GOre, GGInfo.glow_ore_name);
        GGInits.GLeaves = new BlockGLeaves(Material.leaves).setBlockName(GGInfo.glow_leaves_name);
            GameRegistry.registerBlock(GGInits.GLeaves, GGInfo.glow_leaves_name);
        GGInits.GLog = new BlockGLog(Material.wood).setBlockName(GGInfo.glow_log_name);
            GameRegistry.registerBlock(GGInits.GLog, GGInfo.glow_log_name);
        GGInits.GPlank = new BlockGPlanks(Material.wood).setBlockName(GGInfo.glow_planks_name);
            GameRegistry.registerBlock(GGInits.GPlank, GGInfo.glow_planks_name);
    }

    public static void initGGItems(){
        GGInits.GCrystal_RED = new ItemGCrystal(0).setUnlocalizedName(GGInfo.glow_crystal_name + "_red");
            GameRegistry.registerItem(GGInits.GCrystal_RED, GGInfo.glow_crystal_name + "_red");
        GGInits.GCrystal_ORANGE = new ItemGCrystal(1).setUnlocalizedName(GGInfo.glow_crystal_name + "_orange");
            GameRegistry.registerItem(GGInits.GCrystal_ORANGE, GGInfo.glow_crystal_name + "_orange");
        GGInits.GCrystal_YELLOW = new ItemGCrystal(2).setUnlocalizedName(GGInfo.glow_crystal_name + "_yellow");
            GameRegistry.registerItem(GGInits.GCrystal_YELLOW, GGInfo.glow_crystal_name + "_yellow");
        GGInits.GCrystal_GREEN = new ItemGCrystal(3).setUnlocalizedName(GGInfo.glow_crystal_name + "_green");
            GameRegistry.registerItem(GGInits.GCrystal_GREEN, GGInfo.glow_crystal_name + "_green");
        GGInits.GCrystal_BLUE = new ItemGCrystal(4).setUnlocalizedName(GGInfo.glow_crystal_name + "_blue");
            GameRegistry.registerItem(GGInits.GCrystal_BLUE, GGInfo.glow_crystal_name + "_blue");
        GGInits.GCrystal_PURPLE = new ItemGCrystal(5).setUnlocalizedName(GGInfo.glow_crystal_name + "_purple");
            GameRegistry.registerItem(GGInits.GCrystal_PURPLE, GGInfo.glow_crystal_name + "_purple");
        GGInits.GCrystal_BLACK = new ItemGCrystal(6).setUnlocalizedName(GGInfo.glow_crystal_name + "_black");
            GameRegistry.registerItem(GGInits.GCrystal_BLACK, GGInfo.glow_crystal_name + "_black");
        GGInits.GCrystal_BROWN = new ItemGCrystal(7).setUnlocalizedName(GGInfo.glow_crystal_name + "_brown");
            GameRegistry.registerItem(GGInits.GCrystal_BROWN, GGInfo.glow_crystal_name + "_brown");
        GGInits.GCrystal_WHITE = new ItemGCrystal(8).setUnlocalizedName(GGInfo.glow_crystal_name + "_white");
            GameRegistry.registerItem(GGInits.GCrystal_WHITE, GGInfo.glow_crystal_name + "_white");

        GGInits.GRainbowCrystal = new ItemRainbowCrystal().setUnlocalizedName(GGInfo.glow_crystal_name + "_rainbow");
            GameRegistry.registerItem(GGInits.GRainbowCrystal, GGInfo.glow_crystal_name + "_rainbow");
        GGInits.GRawCrystal = new ItemRawCrystal().setUnlocalizedName(GGInfo.glow_crystal_name + "_raw");
            GameRegistry.registerItem(GGInits.GRawCrystal, GGInfo.glow_crystal_name + "_raw");

        GGInits.GStick = new ItemGStick().setUnlocalizedName(GGInfo.glow_stick_name);
            GameRegistry.registerItem(GGInits.GStick, GGInfo.glow_stick_name);

        GGInits.GTool_SWORD = new ItemGSword(ToolMaterial.EMERALD).setUnlocalizedName(GGInfo.glow_tool_name + "_sword");
            GameRegistry.registerItem(GGInits.GTool_SWORD, GGInfo.glow_tool_name + "_sword");
        GGInits.GTool_PICKAXE = new ItemGPickaxe(ToolMaterial.EMERALD).setUnlocalizedName(GGInfo.glow_tool_name + "_pickaxe");
            GameRegistry.registerItem(GGInits.GTool_PICKAXE, GGInfo.glow_tool_name + "_pickaxe");
        GGInits.GTool_AXE = new ItemGAxe(ToolMaterial.EMERALD).setUnlocalizedName(GGInfo.glow_tool_name + "_axe");
            GameRegistry.registerItem(GGInits.GTool_AXE, GGInfo.glow_tool_name + "_axe");
        GGInits.GTool_SHOVEL = new ItemGShovel(ToolMaterial.EMERALD).setUnlocalizedName(GGInfo.glow_tool_name + "_shovel");
            GameRegistry.registerItem(GGInits.GTool_SHOVEL, GGInfo.glow_tool_name + "_shovel");
        GGInits.GTool_HOE = new ItemGHoe(ToolMaterial.EMERALD).setUnlocalizedName(GGInfo.glow_tool_name + "_hoe");
            GameRegistry.registerItem(GGInits.GTool_HOE, GGInfo.glow_tool_name + "_hoe");
    }

    public static void initGGTileEnities(){
        GameRegistry.registerTileEntity(TileEntityGlow.class, GGInfo.TE_GLOW_NAME);
    }
}
