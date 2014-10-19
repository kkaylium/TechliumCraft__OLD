package kkaylium.mods.TechliumCraft.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by kkaylium on 10/5/14.
 */
public class ModelDarkArmorHelm extends ModelBiped {
    ModelRenderer crownBand;
    ModelRenderer crystal;
    ModelRenderer backCrystal;

    public ModelDarkArmorHelm(float scale) {
        super(scale, 0.0F, 64, 64);
        textureWidth = 128;
        textureHeight = 64;

        crownBand = new ModelRenderer(this, 91, 0);
        crownBand.addBox(-4.5F, 0F, -4.5F, 9, 1, 9);
        crownBand.setRotationPoint(0F, -7F, 0F);
        crownBand.setTextureSize(128, 64);
        crownBand.mirror = true;
        setRotation(crownBand, 0F, 0F, 0F);
        crystal = new ModelRenderer(this, 84, 0);
        crystal.addBox(-1F, -1F, 0F, 2, 2, 1);
        crystal.setRotationPoint(0F, -6.5F, -5F);
        crystal.setTextureSize(128, 64);
        crystal.mirror = true;
        setRotation(crystal, 0F, 0F, 0.7853982F);
        backCrystal = new ModelRenderer(this, 82, 4);
        backCrystal.addBox(-1.5F, -1.5F, 0F, 3, 3, 1);
        backCrystal.setRotationPoint(0F, -7F, -4.25F);
        backCrystal.setTextureSize(128, 64);
        backCrystal.mirror = true;
        setRotation(backCrystal, 0F, 0F, -0.7982041F);

        this.bipedHead.addChild(crownBand);
        this.bipedHead.addChild(crystal);
        this.bipedHead.addChild(backCrystal);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
