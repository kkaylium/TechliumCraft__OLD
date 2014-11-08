package kkaylium.mods.TechliumCraft.main.info;

import kkaylium.mods.TechliumCraft.glowglass.GGInits;
import net.minecraft.item.Item;

/**
 * Created by kkaylium on 10/26/14.
 */
public class TCInfo {

    public static final String MOD_ID = "techliumcraft";
    public static final String MOD_NAME = "TechliumCraft";
    public static final String MOD_VERSION = "0.0.1";

    public static final int GUI_TURTLE_ID = 13;

    public static int[][] glow_colors = {{0xC9C9C9},{0xE80000, 0xFF7700, 0xFFEE00, 0x07C400, 0x002FFF, 0x7C00C4, 0x212121, 0x734709, 0xFFFFFF},{0xFF0090, 0xFFAF6E, 0xFFF36E, 0x47FF3D, 0x00E1FF, 0xC954FF, 0x757575, 0xB08953},{0xA30000, 0xDB5800, 0xEDB200, 0x178C00, 0x001278, 0x470275, 0x210E00, 0xC5DDE3}};
    public static Item[] glow_crystals = {GGInits.GCrystal_RED, GGInits.GCrystal_ORANGE, GGInits.GCrystal_YELLOW, GGInits.GCrystal_GREEN, GGInits.GCrystal_BLUE, GGInits.GCrystal_PURPLE, GGInits.GCrystal_BLACK, GGInits.GCrystal_BROWN, GGInits.GCrystal_WHITE};
}
