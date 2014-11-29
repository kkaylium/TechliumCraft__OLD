package kkaylium.mods.TechliumCraft.glowglass.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

/**
 * Created by kkaylium on 11/7/2014.
 */
public class ContainerTurtle extends Container {

    public ContainerTurtle(EntityPlayer player){

    }

    @Override
    public boolean canInteractWith(EntityPlayer entityplayer) {
        return true;
    }
}
