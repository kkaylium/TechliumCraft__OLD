package kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import kkaylium.mods.TechliumCraft.tileentities.TEGlowTorch;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Kayla Marie on 9/9/14.
 */
public class BlockGlowTorches extends BlockContainer {

    public BlockGlowTorches(){
        super(Material.wood);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockName(TCNames.glowTorchName);
        this.setLightLevel(1.0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir){
        blockIcon = ir.registerIcon(TCInfo.MOD_ID + ":" + TCNames.glowTorchName);
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TEGlowTorch();
    }
}
