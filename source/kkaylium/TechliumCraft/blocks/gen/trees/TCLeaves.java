package kkaylium.TechliumCraft.blocks.gen.trees;

import java.util.ArrayList;
import java.util.Random;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.TCInits;
import kkaylium.TechliumCraft.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TCLeaves extends BlockLeavesBase implements IShearable, ITileEntityProvider{
	
	public TCLeaves() {
		super(Material.leaves, false);
		this.setCreativeTab(TechliumCraft.GGTab);
		this.setStepSound(soundTypeGrass);
		this.setHardness(0.2F);
		this.setLightLevel(0.1F);
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public Block itemDropped(int par1, Random rand, int par3) {
		if (rand.nextInt(3) == 2) {
			return TCInits.glowSapling;
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

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(Strings.MOD_ID + ":glowLeaves");
	}
	   
	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, int x, int y, int z) {
		return true;
	}

	@Override
	public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, int x, int y, int z, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 3));
        return ret;
	}
}
