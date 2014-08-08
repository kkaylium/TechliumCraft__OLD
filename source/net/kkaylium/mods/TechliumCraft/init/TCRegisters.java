package net.kkaylium.mods.TechliumCraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.kkaylium.mods.TechliumCraft.blocks.*;
import net.kkaylium.mods.TechliumCraft.items.*;
import net.kkaylium.mods.TechliumCraft.lib.TCNames;
import net.kkaylium.mods.TechliumCraft.tileentities.*;

/**
 * Created by Kayla Marie on 7/29/14.
 */
public class TCRegisters {

    public static void registerItems(){
        TCInits.glowCrystal_WHITE = new ItemGlowCrystal(0);
            GameRegistry.registerItem(TCInits.glowCrystal_WHITE, TCNames.glowCrystalName + "_white");
        TCInits.glowCrystal_BLACK = new ItemGlowCrystal(1);
            GameRegistry.registerItem(TCInits.glowCrystal_BLACK, TCNames.glowCrystalName + "_black");
        TCInits.glowCrystal_RED = new ItemGlowCrystal(2);
            GameRegistry.registerItem(TCInits.glowCrystal_RED, TCNames.glowCrystalName + "_red");
        TCInits.glowCrystal_ORANGE = new ItemGlowCrystal(3);
            GameRegistry.registerItem(TCInits.glowCrystal_ORANGE, TCNames.glowCrystalName + "_orange");
        TCInits.glowCrystal_YELLOW = new ItemGlowCrystal(4);
            GameRegistry.registerItem(TCInits.glowCrystal_YELLOW, TCNames.glowCrystalName + "_yellow");
        TCInits.glowCrystal_LIME = new ItemGlowCrystal(5);
            GameRegistry.registerItem(TCInits.glowCrystal_LIME, TCNames.glowCrystalName + "_lime");
        TCInits.glowCrystal_GREEN = new ItemGlowCrystal(6);
            GameRegistry.registerItem(TCInits.glowCrystal_GREEN, TCNames.glowCrystalName + "_green");
        TCInits.glowCrystal_SKY = new ItemGlowCrystal(7);
            GameRegistry.registerItem(TCInits.glowCrystal_SKY, TCNames.glowCrystalName + "_sky");
        TCInits.glowCrystal_BLUE = new ItemGlowCrystal(8);
            GameRegistry.registerItem(TCInits.glowCrystal_BLUE, TCNames.glowCrystalName + "_blue");
        TCInits.glowCrystal_LILAC = new ItemGlowCrystal(9);
            GameRegistry.registerItem(TCInits.glowCrystal_LILAC, TCNames.glowCrystalName + "_lilac");
        TCInits.glowCrystal_PURPLE = new ItemGlowCrystal(10);
            GameRegistry.registerItem(TCInits.glowCrystal_PURPLE, TCNames.glowCrystalName + "_purple");
        TCInits.glowCrystal_PINK = new ItemGlowCrystal(11);
            GameRegistry.registerItem(TCInits.glowCrystal_PINK, TCNames.glowCrystalName + "_pink");

        TCInits.darkCrystal_WHITE = new ItemDarkCrystal(0);
            GameRegistry.registerItem(TCInits.darkCrystal_WHITE, TCNames.darkCrystalName + "_white");
        TCInits.darkCrystal_BLACK = new ItemDarkCrystal(1);
            GameRegistry.registerItem(TCInits.darkCrystal_BLACK, TCNames.darkCrystalName + "_black");
        TCInits.darkCrystal_RED = new ItemDarkCrystal(2);
            GameRegistry.registerItem(TCInits.darkCrystal_RED, TCNames.darkCrystalName + "_red");
        TCInits.darkCrystal_ORANGE = new ItemDarkCrystal(3);
            GameRegistry.registerItem(TCInits.darkCrystal_ORANGE, TCNames.darkCrystalName + "_orange");
        TCInits.darkCrystal_YELLOW = new ItemDarkCrystal(4);
            GameRegistry.registerItem(TCInits.darkCrystal_YELLOW, TCNames.darkCrystalName + "_yellow");
        TCInits.darkCrystal_LIME = new ItemDarkCrystal(5);
            GameRegistry.registerItem(TCInits.darkCrystal_LIME, TCNames.darkCrystalName + "_lime");
        TCInits.darkCrystal_GREEN = new ItemDarkCrystal(6);
            GameRegistry.registerItem(TCInits.darkCrystal_GREEN, TCNames.darkCrystalName + "_green");
        TCInits.darkCrystal_SKY = new ItemDarkCrystal(7);
            GameRegistry.registerItem(TCInits.darkCrystal_SKY, TCNames.darkCrystalName + "_sky");
        TCInits.darkCrystal_BLUE = new ItemDarkCrystal(8);
            GameRegistry.registerItem(TCInits.darkCrystal_BLUE, TCNames.darkCrystalName + "_blue");
        TCInits.darkCrystal_LILAC = new ItemDarkCrystal(9);
            GameRegistry.registerItem(TCInits.darkCrystal_LILAC, TCNames.darkCrystalName + "_lilac");
        TCInits.darkCrystal_PURPLE = new ItemDarkCrystal(10);
            GameRegistry.registerItem(TCInits.darkCrystal_PURPLE, TCNames.darkCrystalName + "_purple");
        TCInits.darkCrystal_PINK = new ItemDarkCrystal(11);
            GameRegistry.registerItem(TCInits.darkCrystal_PINK, TCNames.darkCrystalName + "_pink");

        TCInits.darkCrystal_RAW = new ItemRawDarkCrystal();
            GameRegistry.registerItem(TCInits.darkCrystal_RAW, TCNames.rawDarkCrystalName);

        TCInits.glowStick = new ItemGlowStick();
            GameRegistry.registerItem(TCInits.glowStick, TCNames.glowStickName);
        TCInits.darkStick = new ItemDarkStick();
            GameRegistry.registerItem(TCInits.darkStick, TCNames.darkStickName);
    }

    public static void registerBlocks(){
        TCInits.glowOre_WHITE = new BlockGlowOre(0);
            GameRegistry.registerBlock(TCInits.glowOre_WHITE, TCNames.glowOreName + "_white");
        TCInits.glowOre_BLACK = new BlockGlowOre(1);
            GameRegistry.registerBlock(TCInits.glowOre_BLACK, TCNames.glowOreName + "_black");
        TCInits.glowOre_RED = new BlockGlowOre(2);
            GameRegistry.registerBlock(TCInits.glowOre_RED, TCNames.glowOreName + "_red");
        TCInits.glowOre_ORANGE = new BlockGlowOre(3);
            GameRegistry.registerBlock(TCInits.glowOre_ORANGE, TCNames.glowOreName + "_orange");
        TCInits.glowOre_YELLOW = new BlockGlowOre(4);
            GameRegistry.registerBlock(TCInits.glowOre_YELLOW, TCNames.glowOreName + "_yellow");
        TCInits.glowOre_LIME = new BlockGlowOre(5);
            GameRegistry.registerBlock(TCInits.glowOre_LIME, TCNames.glowOreName + "_lime");
        TCInits.glowOre_GREEN = new BlockGlowOre(6);
            GameRegistry.registerBlock(TCInits.glowOre_GREEN, TCNames.glowOreName + "_green");
        TCInits.glowOre_SKY = new BlockGlowOre(7);
            GameRegistry.registerBlock(TCInits.glowOre_SKY, TCNames.glowOreName + "_sky");
        TCInits.glowOre_BLUE = new BlockGlowOre(8);
            GameRegistry.registerBlock(TCInits.glowOre_BLUE, TCNames.glowOreName + "_blue");
        TCInits.glowOre_LILAC = new BlockGlowOre(9);
            GameRegistry.registerBlock(TCInits.glowOre_LILAC, TCNames.glowOreName + "_lilac");
        TCInits.glowOre_PURPLE = new BlockGlowOre(10);
            GameRegistry.registerBlock(TCInits.glowOre_PURPLE, TCNames.glowOreName + "_purple");
        TCInits.glowOre_PINK = new BlockGlowOre(11);
            GameRegistry.registerBlock(TCInits.glowOre_PINK, TCNames.glowOreName + "_pink");

        TCInits.darkOre_DARK = new BlockDarkOre();
            GameRegistry.registerBlock(TCInits.darkOre_DARK, TCNames.darkOreName);

        TCInits.glowBlock = new BlockGlowBlock();
            GameRegistry.registerBlock(TCInits.glowBlock, TCNames.glowBlockName);
        TCInits.darkBlock = new BlockDarkBlock();
            GameRegistry.registerBlock(TCInits.darkBlock, TCNames.darkBlockName);

        TCInits.glowGlass = new BlockGlowGlass("glowglass", false);
            GameRegistry.registerBlock(TCInits.glowGlass, TCNames.glowGlassName);
        TCInits.darkGlass = new BlockDarkGlass("darkglass", false);
            GameRegistry.registerBlock(TCInits.darkGlass, TCNames.darkGlassName);

        TCInits.glowDirt_WHITE = new BlockGlowDirt(0);
            GameRegistry.registerBlock(TCInits.glowDirt_WHITE, TCNames.glowDirtName + "_white");
        TCInits.glowDirt_BLACK = new BlockGlowDirt(1);
            GameRegistry.registerBlock(TCInits.glowDirt_BLACK, TCNames.glowDirtName + "_black");
        TCInits.glowDirt_RED = new BlockGlowDirt(2);
            GameRegistry.registerBlock(TCInits.glowDirt_RED, TCNames.glowDirtName + "_red");
        TCInits.glowDirt_ORANGE = new BlockGlowDirt(3);
            GameRegistry.registerBlock(TCInits.glowDirt_ORANGE, TCNames.glowDirtName + "_orange");
        TCInits.glowDirt_YELLOW = new BlockGlowDirt(4);
            GameRegistry.registerBlock(TCInits.glowDirt_YELLOW, TCNames.glowDirtName + "_yellow");
        TCInits.glowDirt_LIME = new BlockGlowDirt(5);
            GameRegistry.registerBlock(TCInits.glowDirt_LIME, TCNames.glowDirtName + "_lime");
        TCInits.glowDirt_GREEN = new BlockGlowDirt(6);
            GameRegistry.registerBlock(TCInits.glowDirt_GREEN, TCNames.glowDirtName + "_green");
        TCInits.glowDirt_SKY = new BlockGlowDirt(7);
            GameRegistry.registerBlock(TCInits.glowDirt_SKY, TCNames.glowDirtName + "_sky");
        TCInits.glowDirt_BLUE = new BlockGlowDirt(8);
            GameRegistry.registerBlock(TCInits.glowDirt_BLUE, TCNames.glowDirtName + "_blue");
        TCInits.glowDirt_LILAC = new BlockGlowDirt(9);
            GameRegistry.registerBlock(TCInits.glowDirt_LILAC, TCNames.glowDirtName + "_lilac");
        TCInits.glowDirt_PURPLE = new BlockGlowDirt(10);
            GameRegistry.registerBlock(TCInits.glowDirt_PURPLE, TCNames.glowDirtName + "_purple");
        TCInits.glowDirt_PINK = new BlockGlowDirt(11);
            GameRegistry.registerBlock(TCInits.glowDirt_PINK, TCNames.glowDirtName + "_pink");

        TCInits.glowLeaves = new BlockGlowLeaves();
            GameRegistry.registerBlock(TCInits.glowLeaves, TCNames.glowLeavesName);
        TCInits.darkLeaves = new BlockDarkLeaves();
            GameRegistry.registerBlock(TCInits.darkLeaves, TCNames.darkLeavesName);
        TCInits.glowGenLeaves = new BlockGenLeaves(0);
            GameRegistry.registerBlock(TCInits.glowGenLeaves, TCNames.glowGenLeavesName);
        TCInits.darkGenLeaves = new BlockGenLeaves(1);
            GameRegistry.registerBlock(TCInits.darkGenLeaves, TCNames.darkGenLeavesName);
        TCInits.glowLog = new BlockGlowLog();
            GameRegistry.registerBlock(TCInits.glowLog, TCNames.glowLogName);
        TCInits.darkLog = new BlockDarkLog();
            GameRegistry.registerBlock(TCInits.darkLog, TCNames.darkLogName);
        TCInits.glowPlank = new BlockGlowPlank();
            GameRegistry.registerBlock(TCInits.glowPlank, TCNames.glowPlankName);
        TCInits.darkPlank = new BlockDarkPlank();
            GameRegistry.registerBlock(TCInits.darkPlank, TCNames.darkPlankName);

        TCInits.glowFence = new BlockGlowFence();
            GameRegistry.registerBlock(TCInits.glowFence, TCNames.glowFenceName);
        TCInits.darkFence = new BlockDarkFence();
            GameRegistry.registerBlock(TCInits.darkFence, TCNames.darkFenceName);
    }

    public static void registerMachines(){

    }

    public static void registerTools(){

    }

    public static void registerArmor(){

    }

    public static void registerTileEntities(){
        GameRegistry.registerTileEntity(TEGlowColor.class, TCNames.teGlowColorId);
        GameRegistry.registerTileEntity(TEDarkColor.class, TCNames.teDarkColorId);
    }
}
