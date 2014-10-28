package kkaylium.mods.TechliumCraft.glowglass.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.main.TechliumCraft;
import kkaylium.mods.TechliumCraft.main.info.TCInfo;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

/**
 * Created by kkaylium on 10/26/14.
 */
public class ItemGCrystal extends Item {

    private int color;
    private String[] colorNames = {"RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "PURPLE", "BLACK", "BLUE", "WHITE"};

    public ItemGCrystal(int id, int setColor){
        super(id);
        this.setCreativeTab(TechliumCraft.GGTab);
        color = setColor;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconregister) {
        itemIcon = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "glowcrystal_" + colorNames[color]);
    }

}
