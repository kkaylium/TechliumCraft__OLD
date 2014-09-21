package kkaylium.mods.TechliumCraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.init.TCInits;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Kayla Marie on 9/9/14.
 */
public class ItemFireStarter extends Item {

    public ItemFireStarter(){
        super();
        this.setCreativeTab(TechliumCraft.TCTab);
        this.setUnlocalizedName(TCNames.tcFireStarterName);
        this.setMaxStackSize(1);
        this.setMaxDamage(128);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister ir){
        itemIcon = ir.registerIcon(TCInfo.MOD_ID + ":" + TCNames.tcFireStarterName);
    }

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int u, float f1, float f2, float f3){
        if(!world.isRemote){
            if(u == 0){
                --y;
            }
            if(u == 1){
                ++y;
            }
            if(u == 2){
                --z;
            }
            if(u == 3){
                ++z;
            }
            if(u == 4){
                --x;
            }
            if(u == 5){
                ++x;
            }

            if(!player.canPlayerEdit(x, y, z, u, itemStack)){
                return false;
            }else{
                if(world.isAirBlock(x, y, z)){
                    world.setBlock(x, y, z, TCInits.rainbowFire);
                }
                itemStack.damageItem(1, player);
                return true;
            }
        }else{
        return false;
        }
    }
}
