package kkaylium.TechliumCraft.inits;

import kkaylium.TechliumCraft.items.ItemGlowCrystals;
import kkaylium.TechliumCraft.lib.Strings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * 
 * @author kkaylium
 * @version 1.0.1a
 *
 */
public class ItemsInit {

	public static Item glowCrystals;
	public static Item glowSticks;
	public static Item glowDoorItem;
	public static ItemArmor glowArmorT1_HEAD;
	public static ItemArmor glowArmorT1_CHESTPLATE;
	public static ItemArmor glowArmorT1_LEGGINGS;
	public static ItemArmor glowArmorT1_BOOTS;
	
	public static void initItems() {
		glowCrystals = new ItemGlowCrystals().setUnlocalizedName(Strings.GLOW_CRYSTALS_KEY);
			GameRegistry.registerItem(glowCrystals, Strings.GLOW_CRYSTALS_KEY);
//		glowSticks = new ItemGlowSticks(ItemIds.GLOW_STICK_ID).setUnlocalizedName(Strings.GLOW_STICKS_KEY).setTextureName(Strings.MOD_ID + ":" + Strings.GLOW_STICKS_KEY);
//			GameRegistry.registerItem(glowSticks, Strings.GLOW_STICKS_KEY);
//		glowDoorItem = new ItemGlowDoor(ItemIds.GLOW_DOOR_ITEM_ID).setUnlocalizedName(Strings.GLOW_DOOR_ITEM_KEY).setTextureName(Strings.MOD_ID + ":" + Strings.GLOW_DOOR_ITEM_KEY);
		
		//glowArmorT1_HEAD = new ItemCrystalArmor();
	}
//	public static void itemNames(){
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 0), Strings.GLOW_CRYSTALS_NAME + " : White");
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 1), Strings.GLOW_CRYSTALS_NAME + " : Black");
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 2), Strings.GLOW_CRYSTALS_NAME + " : Red");
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 3), Strings.GLOW_CRYSTALS_NAME + " : Orange");
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 4), Strings.GLOW_CRYSTALS_NAME + " : Yellow");
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 5), Strings.GLOW_CRYSTALS_NAME + " : Lime");
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 6), Strings.GLOW_CRYSTALS_NAME + " : Green");
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 7), Strings.GLOW_CRYSTALS_NAME + " : Sky");
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 8), Strings.GLOW_CRYSTALS_NAME + " : Blue");
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 9), Strings.GLOW_CRYSTALS_NAME + " : Lilac");
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 10), Strings.GLOW_CRYSTALS_NAME + " : Purple");
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 11), Strings.GLOW_CRYSTALS_NAME + " : Pink");
//		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 12), Strings.GLOW_CRYSTALS_NAME + " : Special");
//		
//		LanguageRegistry.addName(glowSticks, Strings.GLOW_STICKS_NAME);
//		LanguageRegistry.addName(glowDoorItem, "Glow Door");
//	}
}
