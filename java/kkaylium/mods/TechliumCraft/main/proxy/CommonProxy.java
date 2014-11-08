package kkaylium.mods.TechliumCraft.main.proxy;

import cpw.mods.fml.common.registry.EntityRegistry;
import kkaylium.mods.TechliumCraft.glowglass.mobs.EntityRainbowSlime;
import kkaylium.mods.TechliumCraft.glowglass.mobs.EntityRainbowTurtle;

/**
 * Created by kkaylium on 10/26/14.
 */
public class CommonProxy {

    public void load() {
        initRenderers();
    }

    public void initRenderers() {}

    public void registerRenderInformation(){
       EntityRegistry.registerGlobalEntityID(EntityRainbowSlime.class, "RainbowSlime", EntityRegistry.findGlobalUniqueEntityId(), 0xffffff, 0x000000);
       EntityRegistry.registerGlobalEntityID(EntityRainbowTurtle.class, "RainbowTurtle", EntityRegistry.findGlobalUniqueEntityId(), 0xFFFFFF, 0xD13E87);
    }
}
