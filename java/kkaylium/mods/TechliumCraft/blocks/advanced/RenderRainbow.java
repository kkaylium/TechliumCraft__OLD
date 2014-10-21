package kkaylium.mods.TechliumCraft.blocks.advanced;

import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.tileentities.TERainbow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kayla Marie on 10/20/14.
 */
public class RenderRainbow extends TileEntitySpecialRenderer{

    private ResourceLocation rainbowTex = new ResourceLocation(TCInfo.MOD_ID, "textures/blocks/rainbow.png");
    private ModelRainbow rainbow = new ModelRainbow();

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float tick) {
        if(te instanceof TERainbow){
            GL11.glPushMatrix();
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glTranslatef((float)x + 0.5F, (float)y + 1.19F, (float)z + 0.5F);
            Minecraft.getMinecraft().renderEngine.bindTexture(rainbowTex);
            GL11.glRotatef(180F, 90.0F, 0.0F, 90.0F);
            rainbow.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.05F);
            GL11.glPopMatrix();
        }
    }
}
