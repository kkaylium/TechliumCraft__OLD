package kkaylium.mods.TechliumCraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by Kayla Marie on 7/28/14.
 */
public class ItemGlowCrystal extends Item{

    public int theColor;

    public ItemGlowCrystal(int color){
        super();
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setUnlocalizedName(TCNames.glowCrystalName + color);
        theColor = color;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconregister) {
        itemIcon = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "GC" + TCInfo.COLOR_NAMES_CAPS[theColor]);
    }
}
