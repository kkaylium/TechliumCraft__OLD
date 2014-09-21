package kkaylium.mods.TechliumCraft.proxy;

import cpw.mods.fml.common.registry.EntityRegistry;
import kkaylium.mods.TechliumCraft.mobs.*;

/**
 * Created by Kayla Marie on 7/26/14.
 */
public class CommonProxy {
    public void registerRenderInformation()
    {
        EntityRegistry.registerGlobalEntityID(EntityRainbowSlime.class, "RainbowSlime", EntityRegistry.findGlobalUniqueEntityId(), 0xffffff, 0x000000);
        EntityRegistry.registerGlobalEntityID(EntityDarkSlime.class, "DarkSlime", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(EntityRainbowTurtle.class, "RainbowTurtle", EntityRegistry.findGlobalUniqueEntityId(), 0xFFFFFF, 0xD13E87);
        EntityRegistry.registerGlobalEntityID(EntityDarkTurtle.class, "DarkTurtle", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xD13E87);
        EntityRegistry.registerGlobalEntityID(EntityPinkSnowman.class, "Pink Snowman", EntityRegistry.findGlobalUniqueEntityId(), 0xFFFFFF, 0xEEFFEE);
    }
}
