package kkaylium.mods.TechliumCraft.main.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import kkaylium.mods.TechliumCraft.glowglass.mobs.EntityRainbowSlime;
import kkaylium.mods.TechliumCraft.glowglass.mobs.EntityRainbowTurtle;
import kkaylium.mods.TechliumCraft.glowglass.mobs.rainbowslime.ModelRainbowSlime;
import kkaylium.mods.TechliumCraft.glowglass.mobs.rainbowslime.RenderRainbowSlime;
import kkaylium.mods.TechliumCraft.glowglass.mobs.rainbowturtle.ModelRainbowTurtle;
import kkaylium.mods.TechliumCraft.glowglass.mobs.rainbowturtle.RenderRainbowTurtle;

/**
 * Created by kkaylium on 10/26/14.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void initRenderers(){}

    public void registerRenderInformation(){
        super.registerRenderInformation();
        RenderingRegistry.registerEntityRenderingHandler(EntityRainbowSlime.class, new RenderRainbowSlime(new ModelRainbowSlime(16), new ModelRainbowSlime(0), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRainbowTurtle.class, new RenderRainbowTurtle(new ModelRainbowTurtle(), 0.5F));
    }
}
