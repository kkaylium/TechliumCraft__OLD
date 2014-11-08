package kkaylium.mods.TechliumCraft.glowglass.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.main.TechliumCraft;
import kkaylium.mods.TechliumCraft.main.info.TCInfo;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

/**
 * Created by kkaylium on 11/4/14.
 */
public class ItemRainbowCrystal extends Item {

    public ItemRainbowCrystal(int id){
        super(id);
        this.setCreativeTab(TechliumCraft.GGTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconregister) {
        itemIcon = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "glowcrystal_RAINBOW");
    }
}
