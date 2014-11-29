package kkaylium.mods.TechliumCraft.glowglass.info;

import cpw.mods.fml.common.registry.GameRegistry;
import kkaylium.mods.TechliumCraft.glowglass.GGInits;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by kkaylium on 11/5/14.
 */
public class GGRecipes {

    private static ItemStack rawCrystal = new ItemStack(GGInits.GRawCrystal, 1);

    public static void initGGRecipes(){
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_RED, 3), rawCrystal, new ItemStack(Items.dye, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_ORANGE, 3), rawCrystal, new ItemStack(Items.dye, 1, 14));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_YELLOW, 3), rawCrystal, new ItemStack(Items.dye, 1, 11));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_GREEN, 3), rawCrystal, new ItemStack(Items.dye, 1, 10));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_BLUE, 3), rawCrystal, new ItemStack(Items.dye, 1, 4));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_PURPLE, 3), rawCrystal, new ItemStack(Items.dye, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_BLACK, 3), rawCrystal, new ItemStack(Items.dye, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_BROWN, 3), rawCrystal, new ItemStack(Items.dye, 1, 3));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_WHITE, 3), rawCrystal, new ItemStack(Items.dye, 1, 15));

        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GRainbowCrystal, 1), new ItemStack(Items.diamond), new ItemStack(GGInits.GCrystal_RED), new ItemStack(GGInits.GCrystal_ORANGE), new ItemStack(GGInits.GCrystal_YELLOW), new ItemStack(GGInits.GCrystal_GREEN), new ItemStack(GGInits.GCrystal_BLUE), new ItemStack(GGInits.GCrystal_PURPLE), new ItemStack(GGInits.GCrystal_WHITE), new ItemStack(GGInits.GCrystal_BLACK));

        GameRegistry.addRecipe(new ItemStack(GGInits.GTool_SWORD, 1), " * ", " * ", " ! ", '*', GGInits.GRainbowCrystal, '!', Items.stick);
        GameRegistry.addRecipe(new ItemStack(GGInits.GTool_PICKAXE, 1), "***", " ! ", " ! ", '*', GGInits.GRainbowCrystal, '!', Items.stick);
        GameRegistry.addRecipe(new ItemStack(GGInits.GTool_AXE, 1), "** ", "*! ", " ! ", '*', GGInits.GRainbowCrystal, '!', Items.stick);
        GameRegistry.addRecipe(new ItemStack(GGInits.GTool_SHOVEL, 1), " * ", " ! ", " ! ", '*', GGInits.GRainbowCrystal, '!', Items.stick);
        GameRegistry.addRecipe(new ItemStack(GGInits.GTool_HOE, 1), "** ", " ! ", " ! ", '*', GGInits.GRainbowCrystal, '!', Items.stick);

        GameRegistry.addRecipe(new ItemStack(GGInits.GBlock, 9), "@#@", "#@#", "@#@", '@', GGInits.GPlank, '#', Blocks.cobblestone);
        GameRegistry.addRecipe(new ItemStack(GGInits.GBlock, 9), "#@#", "@#@", "#@#", '@', GGInits.GPlank, '#', Blocks.cobblestone);
        GameRegistry.addRecipe(new ItemStack(GGInits.GGlass, 9), "###", "#@#", "###", '@', GGInits.GPlank, '#', Blocks.glass);

    }
}
