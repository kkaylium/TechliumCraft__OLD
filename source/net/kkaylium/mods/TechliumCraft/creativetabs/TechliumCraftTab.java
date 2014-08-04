package net.kkaylium.mods.TechliumCraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Kayla Marie on 7/26/14.
 */
public class TechliumCraftTab extends CreativeTabs {

    public TechliumCraftTab(int par1, String par2){
        super(par1, par2);
    }

    @Override
    public Item getTabIconItem() {
        return Items.golden_apple;
    }
}
