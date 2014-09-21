package kkaylium.mods.TechliumCraft.mobs.RainbowTurtle;

import kkaylium.mods.TechliumCraft.mobs.EntityRainbowTurtle;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Kayla Marie on 8/7/14.
 */
public class RenderRainbowTurtle extends RenderLiving {

    public static ResourceLocation texture = new ResourceLocation("techliumcraft:textures/mobs/rainbowTurtle.png");

    public RenderRainbowTurtle(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation getEntityTexture(EntityRainbowTurtle par1Entity)
    {
        return texture;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityRainbowTurtle) par1Entity);
    }
}
