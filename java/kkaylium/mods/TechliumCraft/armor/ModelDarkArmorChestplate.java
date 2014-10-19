package kkaylium.mods.TechliumCraft.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by kkaylium on 10/6/14.
 */
public class ModelDarkArmorChestplate extends ModelBiped {
    //fields
    ModelRenderer hood;
    ModelRenderer capeMain;
    ModelRenderer hood2;
    ModelRenderer cape1;
    ModelRenderer cape2;
    ModelRenderer shoulderStrap;
    ModelRenderer shoulder;
    ModelRenderer belt;

    public ModelDarkArmorChestplate(float scale) {
        super(scale, 0.0F, 64, 64);
        textureWidth = 128;
        textureHeight = 64;

        hood = new ModelRenderer(this, 95, 0);
        hood.addBox(-5F, 0F, 0F, 10, 1, 6);
        hood.setRotationPoint(0F, -1F, -2F);
        hood.setTextureSize(128, 64);
        hood.mirror = true;
        setRotation(hood, 0F, 0F, 0F);
        capeMain = new ModelRenderer(this, 109, 11);
        capeMain.addBox(-4F, 0F, 0F, 8, 23, 1);
        capeMain.setRotationPoint(0F, 0F, 3F);
        capeMain.setTextureSize(128, 64);
        capeMain.mirror = true;
        setRotation(capeMain, 0.1115358F, 0F, 0F);
        hood2 = new ModelRenderer(this, 109, 8);
        hood2.addBox(-4F, 0F, 0F, 8, 1, 1);
        hood2.setRotationPoint(0F, -1F, 4F);
        hood2.setTextureSize(128, 64);
        hood2.mirror = true;
        setRotation(hood2, 0F, 0F, 0F);
        cape1 = new ModelRenderer(this, 104, 8);
        cape1.addBox(0F, 0F, 0F, 1, 22, 1);
        cape1.setRotationPoint(4F, 0F, 3F);
        cape1.setTextureSize(128, 64);
        cape1.mirror = true;
        setRotation(cape1, 0.0698132F, 0F, 0F);
        cape2 = new ModelRenderer(this, 104, 8);
        cape2.addBox(0F, 0F, 0F, 1, 22, 1);
        cape2.setRotationPoint(-5F, 0F, 3F);
        cape2.setTextureSize(128, 64);
        cape2.mirror = true;
        setRotation(cape2, 0.0698132F, 0F, -0.0174533F);
        shoulderStrap = new ModelRenderer(this, 99, 10);
        shoulderStrap.addBox(0F, 0F, 0F, 1, 14, 1);
        shoulderStrap.setRotationPoint(-4F, -0.3F, -2.4F);
        shoulderStrap.setTextureSize(128, 64);
        shoulderStrap.mirror = true;
        setRotation(shoulderStrap, 0F, 0F, -0.5205006F);
        shoulder = new ModelRenderer(this, 53, 0);
        shoulder.addBox(0F, 0F, -2.5F, 5, 3, 5);
        shoulder.setRotationPoint(-1F, -3F, 0F);
        shoulder.setTextureSize(128, 64);
        shoulder.mirror = true;
        setRotation(shoulder, 0F, 0F, 0F);
        belt = new ModelRenderer(this, 99, 36);
        belt.addBox(-4.5F, 0F, 0F, 9, 1, 5);
        belt.setRotationPoint(0F, 11F, -2.5F);
        belt.setTextureSize(128, 64);
        belt.mirror = true;
        setRotation(belt, 0F, 0F, 0F);

        this.bipedBody.addChild(capeMain);
        this.bipedBody.addChild(cape1);
        this.bipedBody.addChild(cape2);
        this.bipedBody.addChild(hood);
        this.bipedBody.addChild(hood2);
        this.bipedBody.addChild(shoulderStrap);
        this.bipedBody.addChild(belt);
        this.bipedLeftArm.addChild(shoulder);
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
