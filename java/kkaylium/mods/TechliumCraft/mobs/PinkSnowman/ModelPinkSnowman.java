package kkaylium.mods.TechliumCraft.mobs.PinkSnowman;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPinkSnowman extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
  
  public ModelPinkSnowman()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Body = new ModelRenderer(this, 0, 40);
      Body.addBox(-7F, 0F, -7F, 14, 10, 14);
      Body.setRotationPoint(0F, 14F, 0F);
      Body.setTextureSize(128, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 21);
      Head.addBox(-5F, 0F, -5F, 10, 9, 10);
      Head.setRotationPoint(0F, 5F, 0F);
      Head.setTextureSize(128, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 0, 0);
      Arm1.addBox(0F, 0F, 0F, 10, 1, 1);
      Arm1.setRotationPoint(5F, 15F, 0F);
      Arm1.setTextureSize(128, 64);
      Arm1.mirror = true;
      setRotation(Arm1, 0F, 0.2602503F, 0.4089647F);
      Arm2 = new ModelRenderer(this, 0, 0);
      Arm2.addBox(-10F, 0F, 0F, 10, 1, 1);
      Arm2.setRotationPoint(-5F, 15F, 0F);
      Arm2.setTextureSize(128, 64);
      Arm2.mirror = true;
      setRotation(Arm2, 0F, -0.4089647F, -0.4089647F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Head.render(f5);
    Arm1.render(f5);
    Arm2.render(f5);
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
