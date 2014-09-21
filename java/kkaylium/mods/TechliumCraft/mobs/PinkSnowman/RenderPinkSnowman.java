package kkaylium.mods.TechliumCraft.mobs.PinkSnowman;

import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.mobs.EntityPinkSnowman;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Kayla Marie on 8/29/14.
 */
public class RenderPinkSnowman extends RenderLiving {

    private static final ResourceLocation snowManTextures = new ResourceLocation(TCInfo.MOD_ID, "textures/mobs/pinkSnowman.png");

    private ModelPinkSnowman snowmanModel;
    private static final String __OBFID = "CL_00001025";

    public RenderPinkSnowman(ModelBase par2ModelBase, float par3) {
        super(par2ModelBase, par3);
        this.snowmanModel = (ModelPinkSnowman)super.mainModel;
        this.setRenderPassModel(this.snowmanModel);
    }
    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityPinkSnowman p_110775_1_)
    {
        return snowManTextures;
    }
    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityPinkSnowman)p_110775_1_);
    }

}
