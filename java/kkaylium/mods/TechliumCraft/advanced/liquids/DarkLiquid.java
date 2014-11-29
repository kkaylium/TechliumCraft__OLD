package kkaylium.mods.TechliumCraft.advanced.liquids;

import kkaylium.mods.TechliumCraft.advanced.AdvancedInits;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Created by kkaylium on 11/25/2014.
 */
public class DarkLiquid extends BlockFluidClassic {

    public DarkLiquid() {
        super(AdvancedInits.darkFluid, Material.water);
        this.setBlockUnbreakable();
        this.setBlockTextureName(TCInfo.MOD_ID + ":fluid_dark");
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity){
        if(entity instanceof EntityPlayer) {
            if(((EntityPlayer) entity).isPotionActive(Potion.nightVision.getId())){
                ((EntityPlayer) entity).removePotionEffect(Potion.nightVision.getId());
            }else if(((EntityPlayer) entity).isPotionActive(Potion.moveSpeed.getId())){
                ((EntityPlayer) entity).removePotionEffect(Potion.moveSpeed.getId());
            }
            ((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.blindness.getId(), 200, 3));
            ((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.confusion.getId(), 200, 3));
        }
    }

}
