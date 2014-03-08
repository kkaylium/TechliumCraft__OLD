package kkaylium.TechliumCraft.recipes;

import kkaylium.TechliumCraft.inits.BlocksInit;
import kkaylium.TechliumCraft.inits.ItemsInit;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class TCBasicRecipes {

	public static ItemStack glass = new ItemStack(Blocks.glass);
	public static ItemStack glowSticks = new ItemStack(ItemsInit.glowSticks);
	public static ItemStack glowPlanks = new ItemStack(BlocksInit.glowPlanks);
	public static ItemStack glowLog = new ItemStack(BlocksInit.glowLog);
	
	public static void initBasicRecipes() {
		
		//GameRegistry.addShapelessRecipe(new ItemStack(BlocksInit.glowPlanks, 4), "#", '#', glowLog);
		GameRegistry.addRecipe(new ItemStack(ItemsInit.glowSticks, 4), "#", "#",'#', glowPlanks);
		
	}

}
