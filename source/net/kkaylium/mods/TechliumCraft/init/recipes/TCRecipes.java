package net.kkaylium.mods.TechliumCraft.init.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.kkaylium.mods.TechliumCraft.init.TCInits;
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

        GameRegistry.addRecipe(new ItemStack(TCInits.glowPlank, 4), "#", '#', TCInits.glowLog);
        GameRegistry.addRecipe(new ItemStack(TCInits.darkPlank, 4), "#", '#', TCInits.darkLog);

        GameRegistry.addShapedRecipe(new ItemStack(TCInits.glowStick, 8), "#", "#", '#', TCInits.glowPlank);
        GameRegistry.addShapedRecipe(new ItemStack(TCInits.darkStick, 8), "#", "#", '#', TCInits.darkPlank);

    }
}
