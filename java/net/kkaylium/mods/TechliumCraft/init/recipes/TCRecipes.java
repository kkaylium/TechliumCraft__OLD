package net.kkaylium.mods.TechliumCraft.init.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.kkaylium.mods.TechliumCraft.init.TCInits;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Kayla Marie on 8/8/14.
 */
public class TCRecipes {

    public static void initRecipes(){

        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_WHITE, 1), TCInits.darkCrystal_RAW, TCInits.glowCrystal_WHITE);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_BLACK, 1), TCInits.darkCrystal_RAW, TCInits.glowCrystal_BLACK);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_RED, 1), TCInits.darkCrystal_RAW, TCInits.glowCrystal_RED);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_ORANGE, 1), TCInits.darkCrystal_RAW, TCInits.glowCrystal_ORANGE);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_YELLOW, 1), TCInits.darkCrystal_RAW, TCInits.glowCrystal_YELLOW);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_LIME, 1), TCInits.darkCrystal_RAW, TCInits.glowCrystal_LIME);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_GREEN, 1), TCInits.darkCrystal_RAW, TCInits.glowCrystal_GREEN);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_SKY, 1), TCInits.darkCrystal_RAW, TCInits.glowCrystal_SKY);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_BLUE, 1), TCInits.darkCrystal_RAW, TCInits.glowCrystal_BLUE);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_LILAC, 1), TCInits.darkCrystal_RAW, TCInits.glowCrystal_LILAC);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_PURPLE, 1), TCInits.darkCrystal_RAW, TCInits.glowCrystal_PURPLE);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_PINK, 1), TCInits.darkCrystal_RAW, TCInits.glowCrystal_PINK);

        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.glowCrystal_RAINBOW, 4), TCInits.glowCrystal_WHITE, TCInits.glowCrystal_BLACK, TCInits.glowCrystal_RED, TCInits.glowCrystal_ORANGE, TCInits.glowCrystal_YELLOW, TCInits.glowCrystal_GREEN, TCInits.glowCrystal_BLUE, TCInits.glowCrystal_PURPLE, Items.glowstone_dust);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_RAINBOW, 4), TCInits.darkCrystal_WHITE, TCInits.darkCrystal_BLACK, TCInits.darkCrystal_RED, TCInits.darkCrystal_ORANGE, TCInits.darkCrystal_YELLOW, TCInits.darkCrystal_GREEN, TCInits.darkCrystal_BLUE, TCInits.darkCrystal_PURPLE, Items.glowstone_dust);

        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_WHITE, 1), "###", "###", "###", '#', TCInits.glowCrystal_WHITE);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_BLACK, 1), "###", "###", "###", '#', TCInits.glowCrystal_BLACK);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_RED, 1), "###", "###", "###", '#', TCInits.glowCrystal_RED);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_ORANGE, 1), "###", "###", "###", '#', TCInits.glowCrystal_ORANGE);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_YELLOW, 1), "###", "###", "###", '#', TCInits.glowCrystal_YELLOW);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_LIME, 1), "###", "###", "###", '#', TCInits.glowCrystal_LIME);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_GREEN, 1), "###", "###", "###", '#', TCInits.glowCrystal_GREEN);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_SKY, 1), "###", "###", "###", '#', TCInits.glowCrystal_SKY);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_BLUE, 1), "###", "###", "###", '#', TCInits.glowCrystal_BLUE);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_LILAC, 1), "###", "###", "###", '#', TCInits.glowCrystal_LILAC);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_PURPLE, 1), "###", "###", "###", '#', TCInits.glowCrystal_PURPLE);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_PINK, 1), "###", "###", "###", '#', TCInits.glowCrystal_PINK);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_RAINBOW, 1), "###", "###", "###", '#', TCInits.glowCrystal_RAINBOW);

        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_WHITE, 1), "###", "###", "###", '#', TCInits.darkCrystal_WHITE);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_BLACK, 1), "###", "###", "###", '#', TCInits.darkCrystal_BLACK);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_RED, 1), "###", "###", "###", '#', TCInits.darkCrystal_RED);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_ORANGE, 1), "###", "###", "###", '#', TCInits.darkCrystal_ORANGE);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_YELLOW, 1), "###", "###", "###", '#', TCInits.darkCrystal_YELLOW);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_LIME, 1), "###", "###", "###", '#', TCInits.darkCrystal_LIME);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_GREEN, 1), "###", "###", "###", '#', TCInits.darkCrystal_GREEN);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_SKY, 1), "###", "###", "###", '#', TCInits.darkCrystal_SKY);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_BLUE, 1), "###", "###", "###", '#', TCInits.darkCrystal_BLUE);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_LILAC, 1), "###", "###", "###", '#', TCInits.darkCrystal_LILAC);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_PURPLE, 1), "###", "###", "###", '#', TCInits.darkCrystal_PURPLE);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_PINK, 1), "###", "###", "###", '#', TCInits.darkCrystal_PINK);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_RAINBOW, 1), "###", "###", "###", '#', TCInits.darkCrystal_RAINBOW);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_RAW, 1), "###", "###", "###", '#', TCInits.darkCrystal_RAW);

        GameRegistry.addRecipe(new ItemStack(TCInits.glowSapling, 8), "###", "#*#", "###", '#', Blocks.sapling, '*', TCInits.glowCrystal_WHITE);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkSapling, 8), "###", "#*#", "###", '#', Blocks.sapling, '*', TCInits.darkCrystal_WHITE);

        GameRegistry.addRecipe(new ItemStack(TCInits.glowPlank, 4), "#", '#', TCInits.glowLog);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkPlank, 4), "#", '#', TCInits.darkLog);

        GameRegistry.addShapedRecipe(new ItemStack(TCInits.glowStick, 8), "#", "#", '#', TCInits.glowPlank);
        GameRegistry.addShapedRecipe(new ItemStack(TCInits.darkStick, 8), "#", "#", '#', TCInits.darkPlank);

        GameRegistry.addRecipe(new ItemStack(TCInits.glowBlock, 16), "@#@", "#@#", "@#@", '@', TCInits.glowStick, '#', Blocks.stone);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkBlock, 16), "@#@", "#@#", "@#@", '@', TCInits.darkStick, '#', Blocks.stone);

        GameRegistry.addRecipe(new ItemStack(TCInits.glowGlass, 16), "@@@", "@#@", "@@@", '@', TCInits.glowStick, '#', Blocks.glass);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkGlass, 16), "@@@", "@#@", "@@@", '@', TCInits.darkStick, '#', Blocks.glass);

        GameRegistry.addRecipe(new ItemStack(TCInits.glowFence, 8), "@@@", "@@@", '@', TCInits.glowStick);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkFence, 8), "@@@", "@@@", '@', TCInits.darkStick);

    }
}
