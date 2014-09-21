package kkaylium.mods.TechliumCraft.mobs.DarkTurtle;

import kkaylium.mods.TechliumCraft.mobs.EntityDarkTurtle;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Kayla Marie on 8/7/14.
 */
public class RenderDarkTurtle extends RenderLiving {

    public static ResourceLocation texture = new ResourceLocation("techliumcraft:textures/mobs/darkTurtle.png");

    public RenderDarkTurtle(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation getEntityTexture(EntityDarkTurtle par1Entity)
    {
        return texture;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityDarkTurtle) par1Entity);
    }
}
