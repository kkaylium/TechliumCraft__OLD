package kkaylium.mods.TechliumCraft.mobs;

import kkaylium.mods.TechliumCraft.init.TCInits;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * Created by Kayla Marie on 8/29/14.
 */
public class EntityPinkSnowman extends EntitySnowman {

    public EntityPinkSnowman(World world) {
        super(world);
    }

    @Override
    protected Item getDropItem()
    {
        return TCInits.glowCrystal_PINK;
    }

    public void attackEntityWithRangedAttack(EntityLivingBase p_82196_1_, float p_82196_2_)
    {
        EntitySnowball entitysnowball = new EntitySnowball(this.worldObj, this);
        double d0 = p_82196_1_.posX - this.posX;
        double d1 = p_82196_1_.posY + (double)p_82196_1_.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = p_82196_1_.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + (double)f1, d2, 1.6F, 12.0F);
        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entitysnowball);
    }
}
