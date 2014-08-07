package net.kkaylium.mods.TechliumCraft.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.kkaylium.mods.TechliumCraft.mobs.DarkSlime.ModelDarkSlime;
import net.kkaylium.mods.TechliumCraft.mobs.DarkSlime.RenderDarkSlime;
import net.kkaylium.mods.TechliumCraft.mobs.DarkTurtle.ModelDarkTurtle;
import net.kkaylium.mods.TechliumCraft.mobs.DarkTurtle.RenderDarkTurtle;
import net.kkaylium.mods.TechliumCraft.mobs.EntityDarkSlime;
import net.kkaylium.mods.TechliumCraft.mobs.EntityDarkTurtle;
import net.kkaylium.mods.TechliumCraft.mobs.EntityRainbowSlime;
import net.kkaylium.mods.TechliumCraft.mobs.EntityRainbowTurtle;
import net.kkaylium.mods.TechliumCraft.mobs.RainbowSlime.ModelRainbowSlime;
import net.kkaylium.mods.TechliumCraft.mobs.RainbowSlime.RenderRainbowSlime;
import net.kkaylium.mods.TechliumCraft.mobs.RainbowTurtle.ModelRainbowTurtle;
import net.kkaylium.mods.TechliumCraft.mobs.RainbowTurtle.RenderRainbowTurtle;

/**
 * Created by Kayla Marie on 7/26/14.
 */
public class ClientProxy extends CommonProxy {
    public void registerRenderInformation()
    {
        super.registerRenderInformation();
        RenderingRegistry.registerEntityRenderingHandler(EntityRainbowSlime.class, new RenderRainbowSlime(new ModelRainbowSlime(16), new ModelRainbowSlime(0), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDarkSlime.class, new RenderDarkSlime(new ModelDarkSlime(16), new ModelDarkSlime(0), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRainbowTurtle.class, new RenderRainbowTurtle(new ModelRainbowTurtle(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDarkTurtle.class, new RenderDarkTurtle(new ModelDarkTurtle(), 0.5F));
    }
}
