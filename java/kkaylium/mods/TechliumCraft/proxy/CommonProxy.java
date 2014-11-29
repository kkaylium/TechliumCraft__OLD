package kkaylium.mods.TechliumCraft.proxy;

import cpw.mods.fml.common.registry.EntityRegistry;
import kkaylium.mods.TechliumCraft.glowglass.mobs.*;

/**
 * Created by Kayla Marie on 7/26/14.
 */
public class CommonProxy {

    public void load() {
        initRenderers();
        initSounds();
    }

    public void initSounds() {}

    public void initRenderers() {}

    public void registerRenderInformation()
    {
        EntityRegistry.registerGlobalEntityID(EntityRainbowSlime.class, "RainbowSlime", EntityRegistry.findGlobalUniqueEntityId(), 0xffffff, 0x000000);
        EntityRegistry.registerGlobalEntityID(EntityRainbowTurtle.class, "RainbowTurtle", EntityRegistry.findGlobalUniqueEntityId(), 0xFFFFFF, 0xD13E87);
    }
}
