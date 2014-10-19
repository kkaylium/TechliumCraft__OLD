package kkaylium.mods.TechliumCraft.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by kkaylium on 10/6/14.
 */
public class ArmorDarkChestplate extends ItemArmor {

    public ArmorDarkChestplate(ArmorMaterial material, int renderer, int piece){
        super(material, renderer, piece);
        this.setCreativeTab(TechliumCraft.TCTab);
        this.setUnlocalizedName("darkarmor_chestplate");
        this.setTextureName(TCInfo.MOD_ID + ":armor/darkChestplate");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase player, ItemStack stack, int slot) {
        ModelBiped model = new ModelDarkArmorChestplate(0.5F);

        model.bipedHeadwear.isHidden = true;
        model.bipedHead.isHidden = true;
        model.bipedLeftLeg.isHidden = true;
        model.bipedRightLeg.isHidden = true;

        model.isSneak = player.isSneaking();
        model.isRiding = player.isRiding();
        model.isChild = player.isChild();

        return model;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack Stack, Entity entity, int Slot, String type) {
        return TCInfo.MOD_ID + ":textures/armor/darkArmorChestplate.png";
    }
}
