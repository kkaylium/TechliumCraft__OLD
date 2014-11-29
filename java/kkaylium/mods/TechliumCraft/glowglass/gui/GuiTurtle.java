package kkaylium.mods.TechliumCraft.glowglass.gui;

import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by kkaylium on 11/6/14.
 */
public class GuiTurtle extends GuiScreen {

    ResourceLocation texture = new ResourceLocation(TCInfo.MOD_ID, "textures/guis/turtlegui.png");
    public int xTextureSize = 176;
    public int yTextureSize = 88;

    public GuiTurtle(EntityPlayer player) {
        super();
    }

    @Override
    public void drawScreen(int x, int y, float f) {
        drawDefaultBackground();
        GL11.glColor4f(0.8F, 0.0f, 0.2F, 1.0F);

        Minecraft.getMinecraft().getTextureManager().getTexture(texture);

        int posX = (this.width - xTextureSize) / 2;
        int posY = (this.height - yTextureSize) / 2;

        drawTexturedModalRect(posX, posY, 0, 0, xTextureSize, yTextureSize);

        super.drawScreen(x, y, f);
    }

    @Override
    public boolean doesGuiPauseGame(){
        return false;
    }
}
