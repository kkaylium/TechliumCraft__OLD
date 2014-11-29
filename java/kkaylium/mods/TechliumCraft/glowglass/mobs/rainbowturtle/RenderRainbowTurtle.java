package kkaylium.mods.TechliumCraft.glowglass.mobs.rainbowturtle;

import kkaylium.mods.TechliumCraft.glowglass.mobs.EntityRainbowTurtle;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by kkaylium on 11/6/14.
 */
public class RenderRainbowTurtle extends RenderLiving {

    public static ResourceLocation texture = new ResourceLocation(TCInfo.MOD_ID, "textures/mobs/rainbowturtle.png");

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
