package kkaylium.mods.TechliumCraft.glowglass;

import cpw.mods.fml.common.registry.GameRegistry;
import kkaylium.mods.TechliumCraft.glowglass.blocks.*;
import kkaylium.mods.TechliumCraft.glowglass.info.GGInfo;
import kkaylium.mods.TechliumCraft.glowglass.items.*;
import kkaylium.mods.TechliumCraft.glowglass.tileentities.TileEntityGlow;
import kkaylium.mods.TechliumCraft.main.info.TCInts;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.EnumToolMaterial;

/**
 * Created by kkaylium on 10/26/14.
 */
public class GlowGlass {

    public static void initGGBlocks(){
        GGInits.GGlass = new BlockGGlass(TCInts.glow_glass_id, Material.glass).setUnlocalizedName(GGInfo.glow_glass_name);
            GameRegistry.registerBlock(GGInits.GGlass, GGInfo.glow_glass_name);
        GGInits.GBlock = new BlockGBlock(TCInts.glow_block_id, Material.rock).setUnlocalizedName(GGInfo.glow_block_name);
            GameRegistry.registerBlock(GGInits.GBlock, GGInfo.glow_block_name);
        GGInits.GFence = new BlockGFence(TCInts.glow_fence_id,Material.glass).setUnlocalizedName(GGInfo.glow_fence_name);
            GameRegistry.registerBlock(GGInits.GFence, GGInfo.glow_fence_name);
        GGInits.GOre = new BlockGOre(TCInts.glow_ore_id, Material.rock).setUnlocalizedName(GGInfo.glow_ore_name);
            GameRegistry.registerBlock(GGInits.GOre, GGInfo.glow_ore_name);
        GGInits.GLeaves = new BlockGLeaves(TCInts.glow_leaves_id, Material.leaves).setUnlocalizedName(GGInfo.glow_leaves_name);
            GameRegistry.registerBlock(GGInits.GLeaves, GGInfo.glow_leaves_name);
        GGInits.GLog = new BlockGLog(TCInts.glow_log_id, Material.wood).setUnlocalizedName(GGInfo.glow_log_name);
            GameRegistry.registerBlock(GGInits.GLog, GGInfo.glow_log_name);
        GGInits.GPlank = new BlockGPlanks(TCInts.glow_planks_id, Material.wood).setUnlocalizedName(GGInfo.glow_planks_name);
            GameRegistry.registerBlock(GGInits.GPlank, GGInfo.glow_planks_name);
    }

    public static void initGGItems(){
        GGInits.GCrystal_RED = new ItemGCrystal(TCInts.glow_crystal_RED_id, 0).setUnlocalizedName(GGInfo.glow_crystal_name + "_red");
            GameRegistry.registerItem(GGInits.GCrystal_RED, GGInfo.glow_crystal_name + "_red");
        GGInits.GCrystal_ORANGE = new ItemGCrystal(TCInts.glow_crystal_ORANGE_id, 1).setUnlocalizedName(GGInfo.glow_crystal_name + "_orange");
            GameRegistry.registerItem(GGInits.GCrystal_ORANGE, GGInfo.glow_crystal_name + "_orange");
        GGInits.GCrystal_YELLOW = new ItemGCrystal(TCInts.glow_crystal_YELLOW_id, 2).setUnlocalizedName(GGInfo.glow_crystal_name + "_yellow");
            GameRegistry.registerItem(GGInits.GCrystal_YELLOW, GGInfo.glow_crystal_name + "_yellow");
        GGInits.GCrystal_GREEN = new ItemGCrystal(TCInts.glow_crystal_GREEN_id, 3).setUnlocalizedName(GGInfo.glow_crystal_name + "_green");
            GameRegistry.registerItem(GGInits.GCrystal_GREEN, GGInfo.glow_crystal_name + "_green");
        GGInits.GCrystal_BLUE = new ItemGCrystal(TCInts.glow_crystal_BLUE_id, 4).setUnlocalizedName(GGInfo.glow_crystal_name + "_blue");
            GameRegistry.registerItem(GGInits.GCrystal_BLUE, GGInfo.glow_crystal_name + "_blue");
        GGInits.GCrystal_PURPLE = new ItemGCrystal(TCInts.glow_crystal_PURPLE_id, 5).setUnlocalizedName(GGInfo.glow_crystal_name + "_purple");
            GameRegistry.registerItem(GGInits.GCrystal_PURPLE, GGInfo.glow_crystal_name + "_purple");
        GGInits.GCrystal_BLACK = new ItemGCrystal(TCInts.glow_crystal_BLACK_id, 6).setUnlocalizedName(GGInfo.glow_crystal_name + "_black");
            GameRegistry.registerItem(GGInits.GCrystal_BLACK, GGInfo.glow_crystal_name + "_black");
        GGInits.GCrystal_BROWN = new ItemGCrystal(TCInts.glow_crystal_BROWN_id, 7).setUnlocalizedName(GGInfo.glow_crystal_name + "_brown");
            GameRegistry.registerItem(GGInits.GCrystal_BROWN, GGInfo.glow_crystal_name + "_brown");
        GGInits.GCrystal_WHITE = new ItemGCrystal(TCInts.glow_crystal_WHITE_id, 8).setUnlocalizedName(GGInfo.glow_crystal_name + "_white");
            GameRegistry.registerItem(GGInits.GCrystal_WHITE, GGInfo.glow_crystal_name + "_white");

        GGInits.GRainbowCrystal = new ItemRainbowCrystal(TCInts.glow_crystal_RAINBOW_id).setUnlocalizedName(GGInfo.glow_crystal_name + "_rainbow");
            GameRegistry.registerItem(GGInits.GRainbowCrystal, GGInfo.glow_crystal_name + "_rainbow");
        GGInits.GRawCrystal = new ItemRawCrystal(TCInts.glow_crystal_RAW_id).setUnlocalizedName(GGInfo.glow_crystal_name + "_raw");
            GameRegistry.registerItem(GGInits.GRawCrystal, GGInfo.glow_crystal_name + "_raw");

        GGInits.GTool_SWORD = new ItemGSword(TCInts.glow_tool_SWORD_id, EnumToolMaterial.EMERALD).setUnlocalizedName(GGInfo.glow_tool_name + "_sword");
            GameRegistry.registerItem(GGInits.GTool_SWORD, GGInfo.glow_tool_name + "_sword");
        GGInits.GTool_PICKAXE = new ItemGPickaxe(TCInts.glow_tool_PICKAXE_id, EnumToolMaterial.EMERALD).setUnlocalizedName(GGInfo.glow_tool_name + "_pickaxe");
            GameRegistry.registerItem(GGInits.GTool_PICKAXE, GGInfo.glow_tool_name + "_pickaxe");
        GGInits.GTool_AXE = new ItemGAxe(TCInts.glow_tool_AXE_id, EnumToolMaterial.EMERALD).setUnlocalizedName(GGInfo.glow_tool_name + "_axe");
            GameRegistry.registerItem(GGInits.GTool_AXE, GGInfo.glow_tool_name + "_axe");
        GGInits.GTool_SHOVEL = new ItemGShovel(TCInts.glow_tool_SHOVEL_id, EnumToolMaterial.EMERALD).setUnlocalizedName(GGInfo.glow_tool_name + "_shovel");
            GameRegistry.registerItem(GGInits.GTool_SHOVEL, GGInfo.glow_tool_name + "_shovel");
        GGInits.GTool_HOE = new ItemGHoe(TCInts.glow_tool_HOE_id, EnumToolMaterial.EMERALD).setUnlocalizedName(GGInfo.glow_tool_name + "_hoe");
            GameRegistry.registerItem(GGInits.GTool_HOE, GGInfo.glow_tool_name + "_hoe");
    }

    public static void initGGTileEnities(){
        GameRegistry.registerTileEntity(TileEntityGlow.class, GGInfo.TE_GLOW_NAME);
    }
}
