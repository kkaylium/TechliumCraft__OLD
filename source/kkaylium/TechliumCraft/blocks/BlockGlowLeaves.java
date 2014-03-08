package kkaylium.TechliumCraft.blocks;

import java.util.Random;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.BlocksInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGlowLeaves extends BlockContainer{
	
	public BlockGlowLeaves() {
            super(Material.leaves);
            this.setCreativeTab(TechliumCraft.GGTab);
            this.setStepSound(soundTypeGrass);
            this.setHardness(0.2F);
            this.setLightLevel(0.1F);
    }

    public boolean isOpaqueCube() {
            return false;
    }
    
    public Block itemDropped(int par1, Random rand, int par3) {
    		if(rand.nextInt(3) == 2)
    		{
    			return BlocksInit.glowSapling;
    		}
            return null;
    }
    
    public int quantityDropped(Random par1Random) {
            return 1;
    }
    
	@Override
	public TileEntity createNewTileEntity(World world, int par2) {
		return null;
	}
}
