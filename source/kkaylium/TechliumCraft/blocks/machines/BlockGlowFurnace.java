package kkaylium.TechliumCraft.blocks.machines;

import kkaylium.TechliumCraft.TechliumCraft;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGlowFurnace extends Block implements ITileEntityProvider{

	protected BlockGlowFurnace() {
		super(Material.rock);
		this.setCreativeTab(TechliumCraft.TCTab);
		this.setLightLevel(0.5F);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return null;
	}

}
