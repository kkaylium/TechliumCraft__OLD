package kkaylium.mods.TechliumCraft.glowglass.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.main.TechliumCraft;
import kkaylium.mods.TechliumCraft.main.info.TCInfo;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

/**
 * Created by kkaylium on 11/6/14.
 */
public class ItemGAxe extends ItemAxe {

    public ItemGAxe(int par1, EnumToolMaterial enumToolMaterial) {
        super(par1, enumToolMaterial);
        this.setCreativeTab(TechliumCraft.GGTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconregister) {
        itemIcon = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "glowaxe");
    }
}
