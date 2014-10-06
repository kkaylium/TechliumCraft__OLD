package kkaylium.mods.TechliumCraft.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by Kayla Marie on 9/26/14.
 */
public class ModelGlowHelm extends ModelBiped {

    ModelRenderer hoodRight1;
    ModelRenderer hoodRight2;
    ModelRenderer hoodRight3;
    ModelRenderer hoodRight4;
    ModelRenderer hoodLeft1;
    ModelRenderer hoodLeft2;
    ModelRenderer hoodLeft3;
    ModelRenderer hoodLeft4;
    ModelRenderer hoodTop1;
    ModelRenderer hoodBottom3;
    ModelRenderer hoodBottom2;
    ModelRenderer hoodBottom1;
    ModelRenderer hoodBack1;

    public ModelGlowHelm(float scale){

        super(scale, 0.0F, 64, 64);
        textureWidth = 256;
        textureHeight = 64;

        hoodRight1 = new ModelRenderer(this, 236, 11);
        hoodRight1.addBox(0F, -4F, -4.5F, 1, 8, 9);
        hoodRight1.setRotationPoint(-5F, -4F, -0.5F);
        hoodRight1.setTextureSize(256, 64);
        hoodRight1.mirror = true;
        setRotation(hoodRight1, 0F, 0F, 0F);
        hoodRight2 = new ModelRenderer(this, 242, 29);
        hoodRight2.addBox(0F, 0F, -3F, 1, 1, 6);
        hoodRight2.setRotationPoint(-6F, -1F, 0F);
        hoodRight2.setTextureSize(256, 64);
        hoodRight2.mirror = true;
        setRotation(hoodRight2, 0F, 0F, 0F);
        hoodRight3 = new ModelRenderer(this, 252, 48);
        hoodRight3.addBox(0F, 0F, 0F, 1, 1, 1);
        hoodRight3.setRotationPoint(-6F, 0F, -3F);
        hoodRight3.setTextureSize(256, 64);
        hoodRight3.mirror = true;
        setRotation(hoodRight3, 0F, 0F, 0F);
        hoodRight4 = new ModelRenderer(this, 252, 48);
        hoodRight4.addBox(0F, 0F, 0F, 1, 1, 1);
        hoodRight4.setRotationPoint(-6F, 0F, 2F);
        hoodRight4.setTextureSize(256, 64);
        hoodRight4.mirror = true;
        setRotation(hoodRight4, 0F, 0F, 0F);
        hoodLeft1 = new ModelRenderer(this, 236, 11);
        hoodLeft1.addBox(0F, -4F, -4.5F, 1, 8, 9);
        hoodLeft1.setRotationPoint(4F, -4F, -0.5F);
        hoodLeft1.setTextureSize(256, 64);
        hoodLeft1.mirror = true;
        setRotation(hoodLeft1, 0F, 0F, 0F);
        hoodLeft2 = new ModelRenderer(this, 242, 29);
        hoodLeft2.addBox(0F, 0F, -3F, 1, 1, 6);
        hoodLeft2.setRotationPoint(5F, -1F, 0F);
        hoodLeft2.setTextureSize(256, 64);
        hoodLeft2.mirror = true;
        setRotation(hoodLeft2, 0F, 0F, 0F);
        hoodLeft3 = new ModelRenderer(this, 252, 48);
        hoodLeft3.addBox(0F, 0F, 0F, 1, 1, 1);
        hoodLeft3.setRotationPoint(5F, 0F, -3F);
        hoodLeft3.setTextureSize(256, 64);
        hoodLeft3.mirror = true;
        setRotation(hoodLeft3, 0F, 0F, 0F);
        hoodLeft4 = new ModelRenderer(this, 252, 48);
        hoodLeft4.addBox(0F, 0F, 0F, 1, 1, 1);
        hoodLeft4.setRotationPoint(5F, 0F, 2F);
        hoodLeft4.setTextureSize(256, 64);
        hoodLeft4.mirror = true;
        setRotation(hoodLeft4, 0F, 0F, 0F);
        hoodTop1 = new ModelRenderer(this, 222, 0);
        hoodTop1.addBox(-4F, 0F, -4.5F, 8, 1, 9);
        hoodTop1.setRotationPoint(0F, -9F, -0.5F);
        hoodTop1.setTextureSize(256, 64);
        hoodTop1.mirror = true;
        setRotation(hoodTop1, 0F, 0F, 0F);
        hoodBottom3 = new ModelRenderer(this, 246, 51);
        hoodBottom3.addBox(-1F, 0F, -1.5F, 2, 1, 3);
        hoodBottom3.setRotationPoint(4F, 0F, -3.5F);
        hoodBottom3.setTextureSize(256, 64);
        hoodBottom3.mirror = true;
        setRotation(hoodBottom3, 0F, 0F, 0F);
        hoodBottom2 = new ModelRenderer(this, 246, 51);
        hoodBottom2.addBox(-1F, 0F, -1.5F, 2, 1, 3);
        hoodBottom2.setRotationPoint(-4F, 0F, -3.5F);
        hoodBottom2.setTextureSize(256, 64);
        hoodBottom2.mirror = true;
        setRotation(hoodBottom2, 0F, 0F, 0F);
        hoodBottom1 = new ModelRenderer(this, 232, 56);
        hoodBottom1.addBox(-5F, 0F, -1F, 10, 1, 2);
        hoodBottom1.setRotationPoint(0F, 0F, 3F);
        hoodBottom1.setTextureSize(256, 64);
        hoodBottom1.mirror = true;
        setRotation(hoodBottom1, 0F, 0F, 0F);
        hoodBack1 = new ModelRenderer(this, 238, 38);
        hoodBack1.addBox(-4F, -4F, 0F, 8, 8, 1);
        hoodBack1.setRotationPoint(0F, -4F, 4F);
        hoodBack1.setTextureSize(256, 64);
        hoodBack1.mirror = true;

        this.bipedHead.addChild(hoodTop1);
        this.bipedHead.addChild(hoodLeft1);
        this.bipedHead.addChild(hoodLeft2);
        this.bipedHead.addChild(hoodLeft3);
        this.bipedHead.addChild(hoodLeft4);
        this.bipedHead.addChild(hoodRight1);
        this.bipedHead.addChild(hoodRight2);
        this.bipedHead.addChild(hoodRight3);
        this.bipedHead.addChild(hoodRight4);
        this.bipedHead.addChild(hoodBack1);
        this.bipedHead.addChild(hoodBottom1);
        this.bipedHead.addChild(hoodBottom2);
        this.bipedHead.addChild(hoodBottom3);
        this.bipedHead.addChild(hoodBack1);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
