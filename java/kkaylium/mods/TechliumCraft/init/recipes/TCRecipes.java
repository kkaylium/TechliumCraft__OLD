package kkaylium.mods.TechliumCraft.init.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import kkaylium.mods.TechliumCraft.init.TCInits;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Kayla Marie on 8/8/14.
 */
public class TCRecipes {

    public static Item[] glowcrystals = new Item[]{TCInits.glowCrystal_WHITE, TCInits.glowCrystal_BLACK, TCInits.glowCrystal_RED, TCInits.glowCrystal_ORANGE, TCInits.glowCrystal_YELLOW, TCInits.glowCrystal_LIME, TCInits.glowCrystal_GREEN, TCInits.glowCrystal_SKY, TCInits.glowCrystal_BLUE, TCInits.glowCrystal_LILAC, TCInits.glowCrystal_PURPLE, TCInits.glowCrystal_BABYPINK, TCInits.glowCrystal_PINK, TCInits.glowCrystal_CREAM, TCInits.glowCrystal_CHOCOLATE};
    public static Item[] darkcrystals = new Item[]{TCInits.darkCrystal_WHITE, TCInits.darkCrystal_BLACK, TCInits.darkCrystal_RED, TCInits.darkCrystal_ORANGE, TCInits.darkCrystal_YELLOW, TCInits.darkCrystal_LIME, TCInits.darkCrystal_GREEN, TCInits.darkCrystal_SKY, TCInits.darkCrystal_BLUE, TCInits.darkCrystal_LILAC, TCInits.darkCrystal_PURPLE, TCInits.darkCrystal_BABYPINK, TCInits.darkCrystal_PINK, TCInits.darkCrystal_CREAM, TCInits.darkCrystal_CHOCOLATE};
    public static Block[] glowstorage = new Block[]{TCInits.glowCrystalStorage_WHITE, TCInits.glowCrystalStorage_BLACK, TCInits.glowCrystalStorage_RED, TCInits.glowCrystalStorage_ORANGE, TCInits.glowCrystalStorage_YELLOW, TCInits.glowCrystalStorage_LIME, TCInits.glowCrystalStorage_GREEN, TCInits.glowCrystalStorage_SKY, TCInits.glowCrystalStorage_BLUE, TCInits.glowCrystalStorage_LILAC, TCInits.glowCrystalStorage_PURPLE, TCInits.glowCrystalStorage_BABYPINK, TCInits.glowCrystalStorage_PINK, TCInits.glowCrystalStorage_CREAM, TCInits.glowCrystalStorage_CHOCOLATE};
    public static Block[] darkstorage = new Block[]{TCInits.darkCrystalStorage_WHITE, TCInits.darkCrystalStorage_BLACK, TCInits.darkCrystalStorage_RED, TCInits.darkCrystalStorage_ORANGE, TCInits.darkCrystalStorage_YELLOW, TCInits.darkCrystalStorage_LIME, TCInits.darkCrystalStorage_GREEN, TCInits.darkCrystalStorage_SKY, TCInits.darkCrystalStorage_BLUE, TCInits.darkCrystalStorage_LILAC, TCInits.darkCrystalStorage_PURPLE, TCInits.darkCrystalStorage_BABYPINK, TCInits.darkCrystalStorage_PINK, TCInits.darkCrystalStorage_CREAM, TCInits.darkCrystalStorage_CHOCOLATE};

    public static void initRecipes(){

        for(int i = 0; i < glowcrystals.length; i++){
            GameRegistry.addShapelessRecipe(new ItemStack(darkcrystals[i], 1), TCInits.darkCrystal_RAW, glowcrystals[i]);
        }

        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.glowCrystal_RAINBOW, 4), TCInits.glowCrystal_WHITE, TCInits.glowCrystal_BLACK, TCInits.glowCrystal_RED, TCInits.glowCrystal_ORANGE, TCInits.glowCrystal_YELLOW, TCInits.glowCrystal_GREEN, TCInits.glowCrystal_BLUE, TCInits.glowCrystal_PURPLE, Items.glowstone_dust);
        GameRegistry.addShapelessRecipe(new ItemStack(TCInits.darkCrystal_RAINBOW, 4), TCInits.darkCrystal_WHITE, TCInits.darkCrystal_BLACK, TCInits.darkCrystal_RED, TCInits.darkCrystal_ORANGE, TCInits.darkCrystal_YELLOW, TCInits.darkCrystal_GREEN, TCInits.darkCrystal_BLUE, TCInits.darkCrystal_PURPLE, Items.glowstone_dust);

        for(int i = 0; i < glowcrystals.length; i++){
            GameRegistry.addRecipe(new ItemStack(glowstorage[i], 1), "###", "###", "###", '#', glowcrystals[i]);
        }
        for(int i = 0; i < darkcrystals.length; i++){
            GameRegistry.addRecipe(new ItemStack(darkstorage[i], 1), "###", "###", "###", '#', darkcrystals[i]);
        }
        
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_WHITE, 1), "###", "###", "###", '#', TCInits.glowCrystal_WHITE);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_BLACK, 1), "###", "###", "###", '#', TCInits.glowCrystal_BLACK);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_RED, 1), "###", "###", "###", '#', TCInits.glowCrystal_RED);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_ORANGE, 1), "###", "###", "###", '#', TCInits.glowCrystal_ORANGE);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_YELLOW, 1), "###", "###", "###", '#', TCInits.glowCrystal_YELLOW);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_LIME, 1), "###", "###", "###", '#', TCInits.glowCrystal_LIME);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_GREEN, 1), "###", "###", "###", '#', TCInits.glowCrystal_GREEN);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_SKY, 1), "###", "###", "###", '#', TCInits.glowCrystal_SKY);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_BLUE, 1), "###", "###", "###", '#', TCInits.glowCrystal_BLUE);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_LILAC, 1), "###", "###", "###", '#', TCInits.glowCrystal_LILAC);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_PURPLE, 1), "###", "###", "###", '#', TCInits.glowCrystal_PURPLE);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_BABYPINK, 1), "###",  "###", "###", '#', TCInits.glowCrystal_BABYPINK);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_PINK, 1), "###", "###", "###", '#', TCInits.glowCrystal_PINK);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_CREAM, 1), "###", "###", "###", '#', TCInits.glowCrystal_CREAM);
//        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_CHOCOLATE, 1), "###", "###", "###", '#', TCInits.glowCrystal_CHOCOLATE);
        GameRegistry.addRecipe(new ItemStack(TCInits.glowCrystalStorage_RAINBOW, 1), "###", "###", "###", '#', TCInits.glowCrystal_RAINBOW);

//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_WHITE, 1), "###", "###", "###", '#', TCInits.darkCrystal_WHITE);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_BLACK, 1), "###", "###", "###", '#', TCInits.darkCrystal_BLACK);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_RED, 1), "###", "###", "###", '#', TCInits.darkCrystal_RED);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_ORANGE, 1), "###", "###", "###", '#', TCInits.darkCrystal_ORANGE);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_YELLOW, 1), "###", "###", "###", '#', TCInits.darkCrystal_YELLOW);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_LIME, 1), "###", "###", "###", '#', TCInits.darkCrystal_LIME);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_GREEN, 1), "###", "###", "###", '#', TCInits.darkCrystal_GREEN);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_SKY, 1), "###", "###", "###", '#', TCInits.darkCrystal_SKY);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_BLUE, 1), "###", "###", "###", '#', TCInits.darkCrystal_BLUE);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_LILAC, 1), "###", "###", "###", '#', TCInits.darkCrystal_LILAC);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_PURPLE, 1), "###", "###", "###", '#', TCInits.darkCrystal_PURPLE);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_BABYPINK, 1), "###", "###", "###", '#', TCInits.darkCrystal_BABYPINK);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_PINK, 1), "###", "###", "###", '#', TCInits.darkCrystal_PINK);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_CREAM, 1), "###", "###", "###", '#', TCInits.darkCrystal_CREAM);
//        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_CHOCOLATE, 1), "###", "###", "###", '#', TCInits.darkCrystal_CHOCOLATE);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_RAINBOW, 1), "###", "###", "###", '#', TCInits.darkCrystal_RAINBOW);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkCrystalStorage_RAW, 1), "###", "###", "###", '#', TCInits.darkCrystal_RAW);

        GameRegistry.addRecipe(new ItemStack(TCInits.glowSapling, 8), "###", "#*#", "###", '#', Blocks.sapling, '*', TCInits.glowCrystal_WHITE);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkSapling, 8), "###", "#*#", "###", '#', Blocks.sapling, '*', TCInits.darkCrystal_WHITE);

        GameRegistry.addRecipe(new ItemStack(TCInits.glowPlank, 4), "#", '#', TCInits.glowLog);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkPlank, 4), "#", '#', TCInits.darkLog);

        GameRegistry.addShapedRecipe(new ItemStack(TCInits.glowStick, 8), "#", "#", '#', TCInits.glowPlank);
        GameRegistry.addShapedRecipe(new ItemStack(TCInits.darkStick, 8), "#", "#", '#', TCInits.darkPlank);

        GameRegistry.addRecipe(new ItemStack(TCInits.glowBlock, 8), "@#@", "#@#", "@#@", '@', TCInits.glowStick, '#', Blocks.stone);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkBlock, 8), "@#@", "#@#", "@#@", '@', TCInits.darkStick, '#', Blocks.stone);

        GameRegistry.addRecipe(new ItemStack(TCInits.glowGlass, 8), "@@@", "@#@", "@@@", '@', TCInits.glowStick, '#', Blocks.glass);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkGlass, 8), "@@@", "@#@", "@@@", '@', TCInits.darkStick, '#', Blocks.glass);

        GameRegistry.addRecipe(new ItemStack(TCInits.glowFence, 8), "@@@", "@@@", '@', TCInits.glowStick);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkFence, 8), "@@@", "@@@", '@', TCInits.darkStick);

    }
}
