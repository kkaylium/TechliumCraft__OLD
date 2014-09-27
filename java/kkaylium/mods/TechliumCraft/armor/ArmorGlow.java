package kkaylium.mods.TechliumCraft.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.init.TCInits;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by kkaylium on 9/25/14.
 */
public class ArmorGlow extends ItemArmor{

    public static int piece;

    public ArmorGlow(ArmorMaterial material, int renderer, int armorPiece) {
        super(material, renderer, armorPiece);
        this.setCreativeTab(TechliumCraft.TCTab);
        this.setUnlocalizedName(TCNames.glowArmorName + armorPiece);
        this.piece = armorPiece;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase player, ItemStack stack, int slot) {
        ModelBiped model = new ModelGlowArmor(0.5F);

        switch(piece){
            case 0:
                getHelmModel(model);
                break;
            case 1:
                getChestplateModel(model);
                break;
            case 2:
                getLeggingsModel(model);
                break;
            case 3:
                getBootsModel(model);
                break;
        }
        //model.isSneak = player.isSneaking();
       // model.isRiding = player.isRiding();
       // model.isChild = player.isChild();

        return model;
    }

    private static void getHelmModel(ModelBiped model){
        model.bipedRightLeg.isHidden = true;
        model.bipedLeftLeg.isHidden = true;
        model.bipedBody.isHidden = true;
        model.bipedRightArm.isHidden = true;
        model.bipedLeftArm.isHidden = true;
    }

    private static void getChestplateModel(ModelBiped model){
        model.bipedHead.isHidden = true;
        model.bipedRightLeg.isHidden = true;
        model.bipedLeftLeg.isHidden = true;
        model.bipedRightArm.isHidden = true;
        model.bipedLeftArm.isHidden = true;
        ((ModelGlowArmor)model).LeggingFront1.isHidden = true;
        ((ModelGlowArmor)model).LeggingBack1.isHidden = true;
        ((ModelGlowArmor)model).LeggingLeft1.isHidden = true;
        ((ModelGlowArmor)model).LeggingRight1.isHidden = true;
    }

    private static void getLeggingsModel(ModelBiped model){
        model.bipedHead.isHidden = true;
        model.bipedRightArm.isHidden = true;
        model.bipedLeftArm.isHidden = true;
        model.bipedBody.isHidden = true;
        ((ModelGlowArmor)model).LeggingFront1.isHidden = false;
        ((ModelGlowArmor)model).LeggingBack1.isHidden = false;
        ((ModelGlowArmor)model).LeggingLeft1.isHidden = false;
        ((ModelGlowArmor)model).LeggingRight1.isHidden = false;
    }

    private static void getBootsModel(ModelBiped model){
        model.bipedHead.isHidden = true;
        model.bipedRightArm.isHidden = true;
        model.bipedLeftArm.isHidden = true;
        model.bipedBody.isHidden = true;
        ((ModelGlowArmor)model).LeggingFront1.isHidden = true;
        ((ModelGlowArmor)model).LeggingBack1.isHidden = true;
        ((ModelGlowArmor)model).LeggingLeft1.isHidden = true;
        ((ModelGlowArmor)model).LeggingLeft2.isHidden = true;
        ((ModelGlowArmor)model).LeggingRight1.isHidden = true;
        ((ModelGlowArmor)model).LeggingRight2.isHidden = true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack Stack, Entity entity, int Slot, String type) {
        return TCInfo.MOD_ID + ":textures/armor/glowArmor.png";
    }
}
