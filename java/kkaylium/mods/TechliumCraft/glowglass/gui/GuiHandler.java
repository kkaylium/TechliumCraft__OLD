package kkaylium.mods.TechliumCraft.glowglass.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import kkaylium.mods.TechliumCraft.main.TechliumCraft;
import kkaylium.mods.TechliumCraft.main.info.TCInfo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by kkaylium on 11/7/2014.
 */
public class GuiHandler implements IGuiHandler {

    public GuiHandler(){
        //NetworkRegistry.instance().registerGuiHandler(TechliumCraft.instance, this);
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(ID){
            default: return null;
            case TCInfo.GUI_TURTLE_ID: return new ContainerTurtle(player);
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(ID){
            default: return null;
            case TCInfo.GUI_TURTLE_ID: return new GuiTurtle(player);
        }
    }
}
