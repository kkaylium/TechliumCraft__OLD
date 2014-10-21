package kkaylium.mods.TechliumCraft.blocks.advanced;

import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import kkaylium.mods.TechliumCraft.tileentities.TERainbow;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Kayla Marie on 10/20/14.
 */
public class BlockRainbow extends BlockContainer {

    public BlockRainbow(){
        super(Material.leaves);
        this.setBlockName(TCNames.rainbowName);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockBounds(0.3f, 0.0f, 0.3f, 0.7f, 0.6f, 0.7f);
    }

    public void registerBlockIcons(IIconRegister icon) {
        this.blockIcon = icon.registerIcon("");
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TERainbow();
    }
}
