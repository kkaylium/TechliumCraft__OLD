package kkaylium.mods.TechliumCraft.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by kkaylium on 10/5/14.
 */
public class ArmorDarkHelm extends ItemArmor {

    public ArmorDarkHelm(ArmorMaterial material, int renderer, int piece){
        super(material, renderer, piece);
        this.setCreativeTab(TechliumCraft.TCTab);
        this.setTextureName(TCInfo.MOD_ID + ":armor/darkHelm");
    }


    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase player, ItemStack stack, int slot) {
        ModelBiped model = new ModelDarkArmorHelm(0.5F);

        model.bipedHeadwear.isHidden = true;
        model.bipedBody.isHidden = true;
        model.bipedRightArm.isHidden = true;
        model.bipedLeftArm.isHidden = true;
        model.bipedRightLeg.isHidden = true;
        model.bipedLeftLeg.isHidden = true;

        model.isSneak = player.isSneaking();
        model.isRiding = player.isRiding();
        model.isChild = player.isChild();

        return model;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack Stack, Entity entity, int Slot, String type) {
        return TCInfo.MOD_ID + ":textures/armor/darkArmorHelm.png";
    }
}
