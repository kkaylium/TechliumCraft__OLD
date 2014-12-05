package kkaylium.mods.TechliumCraft.advanced.tileentities;

import net.minecraft.tileentity.TileEntity;

/**
 * Created by Kayla Marie on 10/20/14.
 */
public class TERainbow extends TileEntity {

    private boolean dirty = false;
    private int timer;

    public TERainbow(){
        timer = 10;
    }

    public void updateEntity(){
        if(timer == 0){

            timer--;
        }
            worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }

    public void rotateRainbow(){

    }
}
