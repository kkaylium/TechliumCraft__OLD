package kkaylium.mods.TechliumCraft.glowglass.items;

import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.glowglass.info.GGInfo;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by kkaylium on 11/8/2014.
 */
public class ItemGStick extends Item {

    public ItemGStick() {
        super();
        this.setCreativeTab(TechliumCraft.GGTab);
    }

    @Override
    public void registerIcons(IIconRegister ir) {
        itemIcon = ir.registerIcon(TCInfo.MOD_ID + ":" + GGInfo.glow_stick_name);
    }
}
