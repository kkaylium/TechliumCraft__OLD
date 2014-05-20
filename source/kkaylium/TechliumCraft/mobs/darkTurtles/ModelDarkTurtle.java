package kkaylium.TechliumCraft.mobs.darkTurtles;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kayla Marie on 5/16/14.
 */
public class ModelDarkTurtle extends ModelBase
{

    protected float field_78145_g = 5.0F;
    protected float field_78151_h = 3.0F;
    //fields
    ModelRenderer Base;
    ModelRenderer Leg;
    ModelRenderer Leg2;
    ModelRenderer Head;
    ModelRenderer FrontLeg;
    ModelRenderer FrontLeg2;
    ModelRenderer Shape1;

    public ModelDarkTurtle()
    {
        textureWidth = 84;
        textureHeight = 31;

        Base = new ModelRenderer(this, 0, 15);
        Base.addBox(-7F, 0F, -7F, 14, 2, 14);
        Base.setRotationPoint(0F, 20F, 0F);
        Base.setTextureSize(84, 31);
        Base.mirror = true;
        setRotation(Base, 0F, 0F, 0F);
        Leg = new ModelRenderer(this, 45, 6);
        Leg.addBox(0F, 0F, -2F, 3, 1, 3);
        Leg.setRotationPoint(4F, 22F, 6F);
        Leg.setTextureSize(84, 31);
        Leg.mirror = true;
        setRotation(Leg, 0F, -1.115358F, 0F);
        Leg2 = new ModelRenderer(this, 45, 6);
        Leg2.addBox(0F, 0F, -1F, 3, 1, 3);
        Leg2.setRotationPoint(-4F, 22F, 6F);
        Leg2.setTextureSize(84, 31);
        Leg2.mirror = true;
        setRotation(Leg2, 0F, -1.896109F, 0F);
        Head = new ModelRenderer(this, 56, 17);
        Head.addBox(-4F, -7F, -7F, 7, 7, 7);
        Head.setRotationPoint(0F, 20F, -6F);
        Head.setTextureSize(84, 31);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        FrontLeg = new ModelRenderer(this, 45, 1);
        FrontLeg.addBox(-5F, 0F, -2F, 5, 1, 3);
        FrontLeg.setRotationPoint(5F, 22F, -6F);
        FrontLeg.setTextureSize(84, 31);
        FrontLeg.mirror = true;
        setRotation(FrontLeg, 0F, -2.156359F, 0F);
        FrontLeg2 = new ModelRenderer(this, 45, 1);
        FrontLeg2.addBox(-5F, 0F, -1F, 5, 1, 3);
        FrontLeg2.setRotationPoint(-4F, 22F, -6F);
        FrontLeg2.setTextureSize(84, 31);
        FrontLeg2.mirror = true;
        setRotation(FrontLeg2, 0F, -1.115358F, 0F);
        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(-5F, 0F, -6F, 10, 3, 12);
        Shape1.setRotationPoint(0F, 17F, 1F);
        Shape1.setTextureSize(84, 31);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 1.570796F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        if (this.isChild)
        {
            float f6 = 2.0F;
            //            GL11.glPushMatrix();
            //            GL11.glTranslatef(0.0F, this.field_78145_g * f5, this.field_78151_h * f5);
            //
            //            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
            GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
            this.Head.render(f5);
            this.Base.render(f5);
            this.Shape1.render(f5);
            this.Leg.render(f5);
            this.Leg2.render(f5);
            this.FrontLeg.render(f5);
            this.FrontLeg2.render(f5);
            GL11.glPopMatrix();
        }
        else
        {
            this.Head.render(f5);
            this.Shape1.render(f5);
            this.Base.render(f5);
            this.Shape1.render(f5);
            this.Leg.render(f5);
            this.Leg2.render(f5);
            this.FrontLeg.render(f5);
            this.FrontLeg2.render(f5);
        }
        //        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        //        Base.render(f5);
        //        Leg.render(f5);
        //        Leg2.render(f5);
        //        Head.render(f5);
        //        FrontLeg.render(f5);
        //        FrontLeg2.render(f5);
        //        Shape1.render(f5);
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

        float f6 = (180F / (float) Math.PI);
        this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
        this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
        this.Base.rotateAngleX = ((float) Math.PI / 2F);
        this.FrontLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.FrontLeg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f2;
        this.Leg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f2;
        this.Leg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f2;
    }
}
