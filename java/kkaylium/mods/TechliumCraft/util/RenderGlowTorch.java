package kkaylium.mods.TechliumCraft.util;

import cpw.mods.fml.client.FMLClientHandler;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kayla Marie on 9/26/14.
 */
public class RenderGlowTorch extends TileEntitySpecialRenderer {

    IModelCustom glowTorch = AdvancedModelLoader.loadModel(new ResourceLocation(TCInfo.MOD_ID, "models/blocks/glowTorch.obj"));
        private ResourceLocation glowTorch_base = new ResourceLocation(TCInfo.MOD_ID, "textures/blocks/glowTorch/glowTorch_base.png");
        private ResourceLocation glowTorchCrystal_WHITE = new ResourceLocation(TCInfo.MOD_ID, "textures/blocks/glowTorch/glowTorchCrystal_WHTTE.png");

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float size) {

        double dx=0, dy=0, dz=0;

        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);

        // Scale, Translate, Rotate
        GL11.glScalef(0.80F, 0.80F, 0.80F);
        GL11.glTranslatef((float) (x + dx + 0.5F), (float)(y + dy - 1.005F), (float)(z + dz + 0.5F));
        GL11.glRotatef(0.0F, 1.0F, 0.0F, 1.0F);

        // Bind texture
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(glowTorch_base);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(glowTorchCrystal_WHITE); GL11.glPushMatrix(); glowTorch.renderPart("Crystal"); GL11.glPopMatrix();

        // Render
        glowTorch.renderAll();

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }
}
