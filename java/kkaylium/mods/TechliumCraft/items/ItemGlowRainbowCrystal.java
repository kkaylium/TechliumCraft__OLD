package kkaylium.mods.TechliumCraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.entities.EntityRainbowCrystal;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Kayla Marie on 8/8/14.
 */
public class ItemGlowRainbowCrystal extends Item {

    public ItemGlowRainbowCrystal(){
        super();
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setUnlocalizedName(TCNames.glowRainbowCrystalName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconregister) {
        itemIcon = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "GCSpecial");
    }

    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        if (!p_77659_3_.capabilities.isCreativeMode)
        {
            --p_77659_1_.stackSize;
        }

        p_77659_2_.playSoundAtEntity(p_77659_3_, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!p_77659_2_.isRemote)
        {
            p_77659_2_.spawnEntityInWorld(new EntityRainbowCrystal(p_77659_2_, p_77659_3_));
        }

        return p_77659_1_;
    }
}
