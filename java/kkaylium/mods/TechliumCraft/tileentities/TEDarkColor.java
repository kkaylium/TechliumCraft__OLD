package kkaylium.mods.TechliumCraft.tileentities;

import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Kayla Marie on 8/7/14.
 */
public class TEDarkColor extends TileEntity {

    private boolean dirty = false;
    public int color;

    public TEDarkColor(){
        color = TCInfo.DARK_COLORS.length - 1;
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
        if(crystal.equals(TCInfo.DARK_CRYSTALS[0].getItem())){
            color = 0;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[1].getItem())){
            color = 1;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[2].getItem())){
            color = 2;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[3].getItem())){
            color = 3;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[4].getItem())){
            color = 4;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[5].getItem())){
            color = 5;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[6].getItem())){
            color = 6;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[7].getItem())){
            color = 7;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[8].getItem())){
            color = 8;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[9].getItem())){
            color = 9;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[10].getItem())){
            color = 10;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[11].getItem())){
            color = 11;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[12].getItem())){
            color = 12;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[13].getItem())){
            color = 13;
        }else if(crystal.equals(TCInfo.DARK_CRYSTALS[14].getItem())){
            color = 14;
        }else{
            color = 15;
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
