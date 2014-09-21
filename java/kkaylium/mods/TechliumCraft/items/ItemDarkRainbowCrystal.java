package kkaylium.mods.TechliumCraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by Kayla Marie on 8/8/14.
 */
public class ItemDarkRainbowCrystal extends Item {

    public ItemDarkRainbowCrystal(){
        super();
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setUnlocalizedName(TCNames.darkRainbowCrystalName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconregister) {
        itemIcon = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "DCSpecial");
    }
}
