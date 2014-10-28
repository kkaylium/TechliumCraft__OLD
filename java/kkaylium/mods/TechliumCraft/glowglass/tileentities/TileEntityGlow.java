package kkaylium.mods.TechliumCraft.glowglass.tileentities;

import kkaylium.mods.TechliumCraft.glowglass.GGInits;
import kkaylium.mods.TechliumCraft.main.info.TCInfo;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by kkaylium on 10/26/14.
 */
public class TileEntityGlow extends TileEntity {

    private boolean isDirty = false;
    public int color;
    public Item crystalsToDrop = null;

    public TileEntityGlow(){
        color = TCInfo.glow_colors[0][0];
    }

    public void updateEntity(){
        if(isDirty){
            isDirty = false;
            worldObj.markBlockForUpdate(xCoord,yCoord, zCoord);
        }
    }

    public int setColor(int colored, Item crystal){
        if(colored == 0){
            if(crystal == GGInits.GCrystal_RED){
                color = TCInfo.glow_colors[1][0];
            }else if(crystal == GGInits.GCrystal_ORANGE){
                color = TCInfo.glow_colors[1][1];
            }else if(crystal == GGInits.GCrystal_YELLOW){
                color = TCInfo.glow_colors[1][2];
            }else if(crystal == GGInits.GCrystal_GREEN){
                color = TCInfo.glow_colors[1][3];
            }else if(crystal == GGInits.GCrystal_BLUE){
                color = TCInfo.glow_colors[1][4];
            }else if(crystal == GGInits.GCrystal_PURPLE){
                color = TCInfo.glow_colors[1][5];
            }else if(crystal == GGInits.GCrystal_BLACK){
                color = TCInfo.glow_colors[1][6];
            }else if(crystal == GGInits.GCrystal_BROWN){
                color = TCInfo.glow_colors[1][7];
            }else if(crystal == GGInits.GCrystal_WHITE){
                color = TCInfo.glow_colors[1][8];
            }else{
                color = TCInfo.glow_colors[0][0];
            }
        }else if(colored == 1){
            if(color == TCInfo.glow_colors[1][0]){
                color = TCInfo.glow_colors[2][0];
            }else if(color == TCInfo.glow_colors[1][1]){
                color = TCInfo.glow_colors[2][1];
            }else if(color == TCInfo.glow_colors[1][2]){
                color = TCInfo.glow_colors[2][2];
            }else if(color == TCInfo.glow_colors[1][3]){
                color = TCInfo.glow_colors[2][3];
            }else if(color == TCInfo.glow_colors[1][4]){
                color = TCInfo.glow_colors[2][4];
            }else if(color == TCInfo.glow_colors[1][5]){
                color = TCInfo.glow_colors[2][5];
            }else if(color == TCInfo.glow_colors[1][6]){
                color = TCInfo.glow_colors[2][6];
            }else if(color == TCInfo.glow_colors[1][7]){
                color = TCInfo.glow_colors[2][7];
            }else{
                color = TCInfo.glow_colors[0][0];
            }
        }else{
            color = TCInfo.glow_colors[0][0];
        }
        isDirty = true;
        crystalsToDrop = crystal;
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

    @Override
    public Packet getDescriptionPacket()
    {
        NBTTagCompound tag = new NBTTagCompound();
        writeToNBT(tag);
        return new Packet132TileEntityData(xCoord, yCoord, zCoord, 1, tag);
    }

    @Override
    public void onDataPacket(INetworkManager net, Packet132TileEntityData packet)
    {
        readFromNBT(packet.data);
        worldObj.markBlockForRenderUpdate(xCoord, yCoord, zCoord);
    }

}
