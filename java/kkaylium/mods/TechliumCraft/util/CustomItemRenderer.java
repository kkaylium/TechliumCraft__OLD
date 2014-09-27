package kkaylium.mods.TechliumCraft.util;

import cpw.mods.fml.client.FMLClientHandler;
import kkaylium.mods.TechliumCraft.init.TCInits;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kayla Marie on 9/26/14.
 */
public class CustomItemRenderer implements IItemRenderer {

    IModelCustom glowPickaxe = AdvancedModelLoader.loadModel(new ResourceLocation(TCInfo.MOD_ID, "models/items/glowPickaxe.obj"));
    private ResourceLocation glowPickaxe_crystalTexture = new ResourceLocation(TCInfo.MOD_ID, "textures/items/tools/glowPickaxe_crystal.png");
    private ResourceLocation glowPickaxe_handleTexture = new ResourceLocation(TCInfo.MOD_ID, "textures/items/tools/glowPickaxe_handle.png");
    private ResourceLocation glowPickaxe_lBladeTexture = new ResourceLocation(TCInfo.MOD_ID, "textures/items/tools/glowPickaxe_lBlade.png");
    private ResourceLocation glowPickaxe_rBladeTexture = new ResourceLocation(TCInfo.MOD_ID, "textures/items/tools/glowPickaxe_rBlade.png");

    public CustomItemRenderer(){

    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch(type){
            case ENTITY: //item entity on the ground
                if(item.getItem().equals(TCInits.glowPickaxe)){
                    renderGlowPickaxe(0F, 0F, 0F, 1.0F, 25, 0, 0);
                }
                break;
            case EQUIPPED: //third person
                if(item.getItem().equals(TCInits.glowPickaxe)){
                    renderGlowPickaxe(1F, 0.2F, 1F, 0.8F, 180, 0, 0);
                }
                break;
            case EQUIPPED_FIRST_PERSON: //if you don't get this one.....
                if(item.getItem().equals(TCInits.glowPickaxe)){
                    renderGlowPickaxe(1F, 0.2F, 1F, 0.8F, 180, 180, 0);
                }
                break;
            case INVENTORY: //ANY inventory
                if(item.getItem().equals(TCInits.glowPickaxe)){
                    renderGlowPickaxe(-2.0F, -4.25F, 1F, 0.225F, 180, 100, 20);
                }
                break;
        }
    }

    private void renderGlowPickaxe(float x, float y, float z, float size, int rotationX, int rotationY, int rotationZ) {
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(glowPickaxe_handleTexture);
        GL11.glPushMatrix(); // start
        GL11.glScalef(size,size,size);
        GL11.glTranslatef(x, y, z); // size
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(rotationX, rotationY, rotationZ, 0);
        glowPickaxe.renderPart("Handle");
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(glowPickaxe_crystalTexture); GL11.glPushMatrix(); glowPickaxe.renderPart("Crystal"); GL11.glPopMatrix();
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(glowPickaxe_handleTexture); GL11.glPushMatrix(); glowPickaxe.renderPart("Handle"); GL11.glPopMatrix();
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(glowPickaxe_lBladeTexture); GL11.glPushMatrix(); glowPickaxe.renderPart("LBlade"); GL11.glPopMatrix();
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(glowPickaxe_rBladeTexture); GL11.glPushMatrix(); glowPickaxe.renderPart("RBlade"); GL11.glPopMatrix();
        GL11.glPopMatrix(); // end
    }
}
