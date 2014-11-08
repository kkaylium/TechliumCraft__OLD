package kkaylium.mods.TechliumCraft.glowglass.info;

import cpw.mods.fml.common.registry.GameRegistry;
import kkaylium.mods.TechliumCraft.glowglass.GGInits;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by kkaylium on 11/5/14.
 */
public class GGRecipes {

    private static ItemStack rawCrystal = new ItemStack(GGInits.GRawCrystal, 1);

    public static void initGGRecipes(){
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_RED, 3), rawCrystal, new ItemStack(Item.dyePowder, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_ORANGE, 3), rawCrystal, new ItemStack(Item.dyePowder, 14, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_YELLOW, 3), rawCrystal, new ItemStack(Item.dyePowder, 11, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_GREEN, 3), rawCrystal, new ItemStack(Item.dyePowder, 10, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_BLUE, 3), rawCrystal, new ItemStack(Item.dyePowder, 4, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_PURPLE, 3), rawCrystal, new ItemStack(Item.dyePowder, 5, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_BLACK, 3), rawCrystal, new ItemStack(Item.dyePowder, 0, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_BROWN, 3), rawCrystal, new ItemStack(Item.dyePowder, 3, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(GGInits.GCrystal_WHITE, 3), rawCrystal, new ItemStack(Item.dyePowder, 15, 1));
    }
}
