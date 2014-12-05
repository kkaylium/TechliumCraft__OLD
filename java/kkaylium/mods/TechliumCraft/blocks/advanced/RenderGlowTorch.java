package kkaylium.mods.TechliumCraft.blocks.advanced;

import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.tileentities.TEGlowTorch;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kayla Marie on 9/26/14.
 */
public class RenderGlowTorch extends TileEntitySpecialRenderer {

    private ModelGlowTorch glowTorch = new ModelGlowTorch();
    private ResourceLocation glowTorchTex = new ResourceLocation(TCInfo.MOD_ID, "textures/blocks/glowTorch.png");

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float size) {
        if(te instanceof TEGlowTorch){
            GL11.glPushMatrix();
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glTranslatef((float)x + 0.5F, (float)y + 1.19F, (float)z + 0.5F);
            Minecraft.getMinecraft().renderEngine.bindTexture(glowTorchTex);
            GL11.glRotatef(180F, 90.0F, 0.0F, 90.0F);
            glowTorch.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.05F);
            GL11.glPopMatrix();
        }
    }
}
