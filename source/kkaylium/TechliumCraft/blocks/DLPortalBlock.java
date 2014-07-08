package kkaylium.TechliumCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.block.BlockLeaves;

/**
 * Created by Kayla Marie on 6/1/14.
 */
public class DLPortalBlock extends Block {

    public DLPortalBlock(){
        super(Material.iron);
    }

    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9){
        player.travelToDimension(15);
        //player.travelToDimension(-1);
        System.out.println((player).dimension);
        return true;
    }
}
