package net.kkaylium.mods.TechliumCraft.tileentities;

import net.kkaylium.mods.TechliumCraft.init.TCInits;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Kayla Marie on 7/30/14.
 */
public class TEGlowBlock extends TileEntity {

    private boolean dirty = false;
    public int color; //12 is uncolored

    public TEGlowBlock(){
        color = 12;
    }

    @Override
    public void updateEntity(){
        if (dirty)
        {
            dirty = false;
            worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
        }
    }

    public int setColor(Item crystal){
        if(crystal == TCInits.glowCrystal_WHITE){
            color = 0;
        }else if(crystal == TCInits.glowCrystal_BLACK){
            color = 1;
        }else if(crystal == TCInits.glowCrystal_RED){
            color = 2;
        }else if(crystal == TCInits.glowCrystal_ORANGE){
            color = 3;
        }else if(crystal == TCInits.glowCrystal_YELLOW){
            color = 4;
        }else if(crystal == TCInits.glowCrystal_LIME){
            color = 5;
        }else if(crystal == TCInits.glowCrystal_GREEN){
            color = 6;
        }else if(crystal == TCInits.glowCrystal_SKY){
            color = 7;
        }else if(crystal == TCInits.glowCrystal_BLUE){
            color = 8;
        }else if(crystal == TCInits.glowCrystal_LILAC){
            color = 9;
        }else if(crystal == TCInits.glowCrystal_PURPLE){
            color = 10;
        }else if(crystal == TCInits.glowCrystal_PINK){
            color = 11;
        }else{
            color = 12;
        }
        dirty = true;
        return color;
    }

    @Override
    public void writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);

        compound.setByte("Color", (byte) color);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);

        color = compound.getByte("Color");
    }

    /* Packets */
    @Override
    public S35PacketUpdateTileEntity getDescriptionPacket()
    {
        NBTTagCompound tag = new NBTTagCompound();
        writeToNBT(tag);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tag);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet)
    {
        readFromNBT(packet.func_148857_g());
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }
}
