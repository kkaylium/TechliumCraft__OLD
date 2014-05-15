package kkaylium.TechliumCraft.inits;

import kkaylium.TechliumCraft.items.ItemGlowCrystals;
import kkaylium.TechliumCraft.items.ItemGlowSticks;
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
public class ItemsInitOLD {

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
		glowSticks = new ItemGlowSticks().setUnlocalizedName(Strings.GLOW_STICKS_KEY).setTextureName(Strings.MOD_ID + ":" + Strings.GLOW_STICKS_KEY);
			GameRegistry.registerItem(glowSticks, Strings.GLOW_STICKS_KEY);
//		glowDoorItem = new ItemGlowDoor(ItemIds.GLOW_DOOR_ITEM_ID).setUnlocalizedName(Strings.GLOW_DOOR_ITEM_KEY).setTextureName(Strings.MOD_ID + ":" + Strings.GLOW_DOOR_ITEM_KEY);
		
		//glowArmorT1_HEAD = new ItemCrystalArmor();
	}
}
