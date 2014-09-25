package kkaylium.mods.TechliumCraft.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.init.TCInits;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by kkaylium on 9/25/14.
 */
public class ArmorGlow extends ItemArmor{

    public ArmorGlow(ArmorMaterial material, int renderer, int armorPiece) {
        super(material, renderer, armorPiece);
        this.setCreativeTab(TechliumCraft.TCTab);
        this.setUnlocalizedName(TCNames.glowArmorName + armorPiece);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type){
        if(itemStack.getItem().equals(TCInits.glowArmor_HELM) || itemStack.getItem().equals(TCInits.glowArmor_CHESTPLATE) || itemStack.getItem().equals(TCInits.glowArmor_LEGGINGS) || itemStack.getItem().equals(TCInits.glowArmor_BOOTS)){
            return "";
        }else if(itemStack.getItem().equals(TCInits.glowArmor_LEGGINGS)){
            return "";
        }else{
            return null;
        }
    }
}
