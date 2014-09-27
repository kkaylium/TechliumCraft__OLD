package kkaylium.mods.TechliumCraft.items.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;

/**
 * Created by Kayla Marie on 9/9/14.
 */
public class ItemGlowSword extends ItemSword{


    public ItemGlowSword(ToolMaterial material) {
        super(material);
        this.setCreativeTab(TechliumCraft.TCTab);
        this.setUnlocalizedName(TCNames.glowSwordName);
        this.canRepair = true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister ir){
        itemIcon = ir.registerIcon(TCInfo.MOD_ID + ":tools/" + TCNames.glowSwordName + "_WHITE");
    }
}
