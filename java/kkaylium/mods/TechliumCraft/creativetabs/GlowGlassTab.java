package kkaylium.mods.TechliumCraft.creativetabs;

import kkaylium.mods.TechliumCraft.init.TCInits;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Kayla Marie on 7/26/14.
 */
public class GlowGlassTab extends CreativeTabs {

    public GlowGlassTab(int par1, String par2){
        super(par1, par2);
    }
    @Override
    public Item getTabIconItem() {
        return TCInits.glowCrystal_PINK;
    }
}
