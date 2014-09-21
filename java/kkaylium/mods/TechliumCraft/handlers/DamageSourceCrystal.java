package kkaylium.mods.TechliumCraft.handlers;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

/**
 * Created by Kayla Marie on 8/31/14.
 */
public class DamageSourceCrystal extends DamageSource {

    public DamageSourceCrystal(String string) {
        super(string);

    }

    public DamageSource causeThrownCrystal(Entity e1, Entity e2){
        return new EntityDamageSourceIndirect("rainbowcrystal", e1, e2).setProjectile();
    }

}
