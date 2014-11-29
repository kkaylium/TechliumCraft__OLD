package kkaylium.mods.TechliumCraft.lib;

import kkaylium.mods.TechliumCraft.glowglass.GGInits;
import kkaylium.mods.TechliumCraft.init.TCInits;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Kayla Marie on 7/26/14.
 */
public class TCInfo {

    public static final String MOD_NAME = "TechliumCraft";
    public static final String MOD_ID = "techliumcraft";

    public static final int GUI_TURTLE_ID = 13;

    public static int[][] glow_colors = {{0xC9C9C9},{0xE80000, 0xFF7700, 0xFFEE00, 0x07C400, 0x002FFF, 0x7C00C4, 0x212121, 0x734709, 0xFFFFFF},{0xFF0090, 0xFFAF6E, 0xFFF36E, 0x47FF3D, 0x00E1FF, 0xC954FF, 0x757575, 0xB08953},{0xA30000, 0xDB5800, 0xEDB200, 0x178C00, 0x001278, 0x470275, 0x210E00, 0xC5DDE3}};
    public static Item[] glow_crystals = {GGInits.GCrystal_RED, GGInits.GCrystal_ORANGE, GGInits.GCrystal_YELLOW, GGInits.GCrystal_GREEN, GGInits.GCrystal_BLUE, GGInits.GCrystal_PURPLE, GGInits.GCrystal_BLACK, GGInits.GCrystal_BROWN, GGInits.GCrystal_WHITE};


    public static final String[] COLOR_NAMES = {"white", "black", "red", "orange", "yellow", "lime", "green", "sky", "blue", "lilac", "purple", "babypink", "pink", "cream", "chocolate", "raw", "rainbow"};
    public static final String[] COLOR_NAMES_CAPS = {"White", "Black", "Red", "Orange", "Yellow", "Lime", "Green", "Sky", "Blue", "Lilac", "Purple", "BabyPink", "Pink", "Cream", "Chocolate", "Raw"};

    public static final int[] GLOW_COLORS = new int[]{0xFFFFFF, 0x363638, 0xB81A1A, 0xF0760C, 0xF2D94B, 0x21ED2F, 0x097A25, 0x4CECF5, 0x0010C4, 0xC977FC, 0x6F05B0, 0xFF91B8, 0xFF57C4, 0xBA987D, 0x753F13, 0xEBF2FA};
    public static final int[] DARK_COLORS = new int[]{0xE3E3E3, 0x252526, 0x941313, 0xC96208, 0xDBC232, 0x00D60F, 0x065C1C, 0x31AEB5, 0x07128C, 0xA25ECC, 0x5A078C, 0xE077A6, 0xC9206C, 0x664E36, 0x361E06, 0xEBF2FA};

    public static final ItemStack[] GLOW_CRYSTALS = {new ItemStack(TCInits.glowCrystal_WHITE), new ItemStack(TCInits.glowCrystal_BLACK), new ItemStack(TCInits.glowCrystal_RED), new ItemStack(TCInits.glowCrystal_ORANGE), new ItemStack(TCInits.glowCrystal_YELLOW), new ItemStack(TCInits.glowCrystal_LIME), new ItemStack(TCInits.glowCrystal_GREEN), new ItemStack(TCInits.glowCrystal_SKY), new ItemStack(TCInits.glowCrystal_BLUE), new ItemStack(TCInits.glowCrystal_LILAC), new ItemStack(TCInits.glowCrystal_PURPLE), new ItemStack(TCInits.glowCrystal_BABYPINK), new ItemStack(TCInits.glowCrystal_PINK), new ItemStack(TCInits.glowCrystal_CREAM), new ItemStack(TCInits.glowCrystal_CHOCOLATE)};
    public static final ItemStack[] DARK_CRYSTALS = {new ItemStack(TCInits.darkCrystal_WHITE), new ItemStack(TCInits.darkCrystal_BLACK), new ItemStack(TCInits.darkCrystal_RED), new ItemStack(TCInits.darkCrystal_ORANGE), new ItemStack(TCInits.darkCrystal_YELLOW), new ItemStack(TCInits.darkCrystal_LIME), new ItemStack(TCInits.darkCrystal_GREEN), new ItemStack(TCInits.darkCrystal_SKY), new ItemStack(TCInits.darkCrystal_BLUE), new ItemStack(TCInits.darkCrystal_LILAC), new ItemStack(TCInits.darkCrystal_PURPLE), new ItemStack(TCInits.darkCrystal_BABYPINK), new ItemStack(TCInits.darkCrystal_PINK), new ItemStack(TCInits.darkCrystal_CREAM), new ItemStack(TCInits.darkCrystal_CHOCOLATE)};
}
