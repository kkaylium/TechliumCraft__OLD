package net.kkaylium.mods.TechliumCraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.kkaylium.mods.TechliumCraft.TechliumCraft;
import net.kkaylium.mods.TechliumCraft.lib.ModInfo;
import net.kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

/**
 * Created by Kayla Marie on 7/28/14.
 */
public class ItemGlowCrystal extends Item{

    private String[] texturesName = new String[]{"White", "Black", "Red", "Orange", "Yellow", "Lime", "Green", "Sky", "Blue", "Lilac", "Purple", "Pink"};
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
        itemIcon = iconregister.registerIcon(ModInfo.MOD_ID + ":" + "GC" + texturesName[theColor]);
    }
}
