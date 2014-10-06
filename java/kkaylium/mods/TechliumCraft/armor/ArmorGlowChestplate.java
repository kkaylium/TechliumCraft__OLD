package kkaylium.mods.TechliumCraft.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Kayla Marie on 9/30/14.
 */
public class ArmorGlowChestplate extends ItemArmor {

    public ArmorGlowChestplate(ArmorMaterial material, int renderer, int armorPiece) {
        super(material, renderer, armorPiece);
        this.setCreativeTab(TechliumCraft.TCTab);
        this.setUnlocalizedName(TCNames.glowArmorName + "_helm");
        this.setTextureName(TCInfo.MOD_ID + ":armor/glowarmor");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase player, ItemStack stack, int slot) {
        ModelBiped model = new ModelGlowArmor(0.5F);

        model.bipedRightLeg.isHidden = true;
        model.bipedLeftLeg.isHidden = true;
        model.bipedRightArm.isHidden = true;
        model.bipedLeftArm.isHidden = true;
        model.bipedHeadwear.isHidden = true;
        ((ModelGlowArmor)model).LeggingFront1.isHidden = true;
        ((ModelGlowArmor)model).LeggingBack1.isHidden = true;
        ((ModelGlowArmor)model).LeggingLeft1.isHidden = true;
        ((ModelGlowArmor)model).LeggingRight1.isHidden = true;

        model.isSneak = player.isSneaking();
        model.isRiding = player.isRiding();
        model.isChild = player.isChild();

        return model;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack Stack, Entity entity, int Slot, String type) {
        return TCInfo.MOD_ID + ":textures/armor/glowArmor.png";
    }
}
