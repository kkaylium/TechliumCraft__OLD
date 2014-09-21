package kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.init.TCInits;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.block.BlockTNT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

/**
 * Created by Kayla Marie on 9/9/14.
 */
public class BlockGlowTNT extends BlockTNT {

    public BlockGlowTNT(){
        super();
        this.setCreativeTab(TechliumCraft.TCTab);
        this.setBlockName(TCNames.glowTNTName);
        this.setLightLevel(1.0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir){
        blockIcon = ir.registerIcon(TCInfo.MOD_ID + ":" + TCNames.glowTNTName);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int u, float f1, float f2, float f3){
        if(!world.isRemote){
            Item item = player.inventory.getCurrentItem().getItem();
            if(item != null){
                if(item.equals(TCInits.tcFireStarter)){
                    return true;
                }
            }
        }
        return false;
    }
}
