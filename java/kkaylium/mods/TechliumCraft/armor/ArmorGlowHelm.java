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
 * Created by Kayla Marie on 9/25/14.
 */
public class ArmorGlowHelm extends ItemArmor {

    public ArmorGlowHelm(ArmorMaterial material, int renderer, int armorPiece) {
        super(material, renderer, armorPiece);
        this.setCreativeTab(TechliumCraft.TCTab);
        this.setUnlocalizedName(TCNames.glowArmorName + "_helm");
        this.setTextureName(TCInfo.MOD_ID + ":armor/glowarmor");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase player, ItemStack stack, int slot) {
        ModelBiped model = new ModelGlowChestplate(0.5F);

        model.bipedRightLeg.isHidden = true;
        model.bipedLeftLeg.isHidden = true;
        model.bipedBody.isHidden = true;
        model.bipedRightArm.isHidden = true;
        model.bipedLeftArm.isHidden = true;
        model.bipedHeadwear.isHidden = true;

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
