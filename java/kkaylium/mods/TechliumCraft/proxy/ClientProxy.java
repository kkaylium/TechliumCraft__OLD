package kkaylium.mods.TechliumCraft.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import kkaylium.mods.TechliumCraft.advanced.renderers.RenderRainbow;
import kkaylium.mods.TechliumCraft.glowglass.mobs.EntityRainbowSlime;
import kkaylium.mods.TechliumCraft.glowglass.mobs.EntityRainbowTurtle;
import kkaylium.mods.TechliumCraft.glowglass.mobs.rainbowslime.ModelRainbowSlime;
import kkaylium.mods.TechliumCraft.glowglass.mobs.rainbowslime.RenderRainbowSlime;
import kkaylium.mods.TechliumCraft.glowglass.mobs.rainbowturtle.ModelRainbowTurtle;
import kkaylium.mods.TechliumCraft.glowglass.mobs.rainbowturtle.RenderRainbowTurtle;
import kkaylium.mods.TechliumCraft.advanced.tileentities.TERainbow;

/**
 * Created by Kayla Marie on 7/26/14.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void initRenderers(){
        super.initRenderers();
        renderItems();
        renderBlocks();
    }

    public void registerRenderInformation()
    {
        super.registerRenderInformation();
        RenderingRegistry.registerEntityRenderingHandler(EntityRainbowSlime.class, new RenderRainbowSlime(new ModelRainbowSlime(16), new ModelRainbowSlime(0), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRainbowTurtle.class, new RenderRainbowTurtle(new ModelRainbowTurtle(), 0.5F));
    }

    public void renderItems(){

    }

    public void renderBlocks(){
        ClientRegistry.bindTileEntitySpecialRenderer(TERainbow.class, new RenderRainbow());
    }
}
