package kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import kkaylium.mods.TechliumCraft.tileentities.TERainbowBeacon;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by kkaylium on 9/21/14.
 */
public class BlockRainbowBeacon extends BlockContainer {

    public BlockRainbowBeacon() {
        super(Material.glass);
        this.setCreativeTab(TechliumCraft.TCTab);
        this.setBlockName(TCNames.rainbowBeaconName);
        this.setHardness(20F);
        this.setResistance(10F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir){
        blockIcon = ir.registerIcon(TCInfo.MOD_ID + ":" + TCNames.rainbowBeaconName);
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        TileEntity te = world.getTileEntity(x, y, z);
        if(!world.isRemote){
            ((TERainbowBeacon)te).placePortalBlocks(world, x, y, z);
        }
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TERainbowBeacon();
    }
}
