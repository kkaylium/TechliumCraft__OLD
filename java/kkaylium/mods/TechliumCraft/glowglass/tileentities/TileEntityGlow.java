package kkaylium.mods.TechliumCraft.glowglass.tileentities;

import kkaylium.mods.TechliumCraft.glowglass.GGInits;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by kkaylium on 10/26/14.
 */
public class TileEntityGlow extends TileEntity {

    private boolean isDirty = false;
    public int color;
    public Item crystalsToDrop = null;

    public TileEntityGlow() {
        color = TCInfo.glow_colors[0][0];
    }

    public void updateEntity() {
        if (isDirty) {
            isDirty = false;
            worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
        }
    }

    public int setColor(int colored, Item crystal) {
        if (colored == 0) {
            if (crystal == GGInits.GCrystal_RED) {
                color = TCInfo.glow_colors[1][0];
                crystalsToDrop = GGInits.GCrystal_RED;
            } else if (crystal == GGInits.GCrystal_ORANGE) {
                color = TCInfo.glow_colors[1][1];
                crystalsToDrop = GGInits.GCrystal_ORANGE;
            } else if (crystal == GGInits.GCrystal_YELLOW) {
                color = TCInfo.glow_colors[1][2];
                crystalsToDrop = GGInits.GCrystal_YELLOW;
            } else if (crystal == GGInits.GCrystal_GREEN) {
                color = TCInfo.glow_colors[1][3];
                crystalsToDrop = GGInits.GCrystal_GREEN;
            } else if (crystal == GGInits.GCrystal_BLUE) {
                color = TCInfo.glow_colors[1][4];
                crystalsToDrop = GGInits.GCrystal_BLUE;
            } else if (crystal == GGInits.GCrystal_PURPLE) {
                color = TCInfo.glow_colors[1][5];
                crystalsToDrop = GGInits.GCrystal_PURPLE;
            } else if (crystal == GGInits.GCrystal_BLACK) {
                color = TCInfo.glow_colors[1][6];
                crystalsToDrop = GGInits.GCrystal_BLACK;
            } else if (crystal == GGInits.GCrystal_BROWN) {
                color = TCInfo.glow_colors[1][7];
                crystalsToDrop = GGInits.GCrystal_BROWN;
            } else if (crystal == GGInits.GCrystal_WHITE) {
                color = TCInfo.glow_colors[1][8];
                crystalsToDrop = GGInits.GCrystal_WHITE;
            } else {
                color = TCInfo.glow_colors[0][0];
            }
        } else if (colored == 1) {
            if (color == TCInfo.glow_colors[1][0]) {
                color = TCInfo.glow_colors[2][0];
            } else if (color == TCInfo.glow_colors[1][1]) {
                color = TCInfo.glow_colors[2][1];
            } else if (color == TCInfo.glow_colors[1][2]) {
                color = TCInfo.glow_colors[2][2];
            } else if (color == TCInfo.glow_colors[1][3]) {
                color = TCInfo.glow_colors[2][3];
            } else if (color == TCInfo.glow_colors[1][4]) {
                color = TCInfo.glow_colors[2][4];
            } else if (color == TCInfo.glow_colors[1][5]) {
                color = TCInfo.glow_colors[2][5];
            } else if (color == TCInfo.glow_colors[1][6]) {
                color = TCInfo.glow_colors[2][6];
            } else if (color == TCInfo.glow_colors[1][7]) {
                color = TCInfo.glow_colors[2][7];
            } else {
                color = TCInfo.glow_colors[0][0];
            }
        } else if (colored == 2) {
            if (color == TCInfo.glow_colors[1][0]) {
                color = TCInfo.glow_colors[3][0];
            } else if (color == TCInfo.glow_colors[1][1]) {
                color = TCInfo.glow_colors[3][1];
            } else if (color == TCInfo.glow_colors[1][2]) {
                color = TCInfo.glow_colors[3][2];
            } else if (color == TCInfo.glow_colors[1][3]) {
                color = TCInfo.glow_colors[3][3];
            } else if (color == TCInfo.glow_colors[1][4]) {
                color = TCInfo.glow_colors[3][4];
            } else if (color == TCInfo.glow_colors[1][5]) {
                color = TCInfo.glow_colors[3][5];
            } else if (color == TCInfo.glow_colors[1][7]) {
                color = TCInfo.glow_colors[3][6];
            } else if (color == TCInfo.glow_colors[1][8]) {
                color = TCInfo.glow_colors[3][7];
            } else {
                color = TCInfo.glow_colors[0][0];
            }
        } else {
            color = TCInfo.glow_colors[0][0];
        }
        isDirty = true;
        return color;
    }

    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        compound.setInteger("Color", color);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);

        color = compound.getInteger("Color");
    }

    @Override
    public S35PacketUpdateTileEntity getDescriptionPacket() {
        NBTTagCompound tag = new NBTTagCompound();
        writeToNBT(tag);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tag);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet) {
        readFromNBT(packet.func_148857_g());
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }

}
