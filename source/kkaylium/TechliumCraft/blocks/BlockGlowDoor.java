package kkaylium.TechliumCraft.blocks;

import java.util.Random;

import javax.swing.Icon;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.lib.Strings;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowDoor;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.IconFlipped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * 
 * @author kkaylium
 * @version 1.0.1a
 *
 */
public class BlockGlowDoor extends BlockDoor implements ITileEntityProvider{

	@SideOnly(Side.CLIENT)
	public IIcon[] topDoorIcons = new IIcon[13];
	public IIcon topDoorIcon;
	public IIcon[] flippedIcons = new IIcon[2];
	@SideOnly(Side.CLIENT)
    private IIcon[] textures = new IIcon[13];
    public String[] iconNames = new String[] {"GDWhite", "GDBlack", "GDRed", "GDOrange", "GDYellow", "GDLime", "GDGreen", "GDSky", "GDBlue", "GDLilac", "GDPurple", "GDPink", "GDSpecial", "GDBase"};

	public BlockGlowDoor() {
		super(Material.glass);
		this.setCreativeTab(TechliumCraft.GGTab);
		this.lightValue = 10;
		float f = 0.5F;
		float f1 = 1.0F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
	}
	
	public IIcon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
	{
	  if (par5 == 1 || par5 == 0)
	  {
	   return this.blockIcon;
	  }
	  int meta = getFullMetadata(par1IBlockAccess, par2, par3, par4);
	  boolean flag = (meta & 4) != 0;
	  int halfMeta = meta & 3;
	  boolean flipped = false;

	  if (flag)
	    {
	    if (halfMeta == 0 && par5 == 2) flipped = !flipped;
	    else if (halfMeta == 1 && par5 == 5) flipped = !flipped;
	    else if (halfMeta == 2 && par5 == 3) flipped = !flipped;
	    else if (halfMeta == 3 && par5 == 4) flipped = !flipped;
	    }
	    else
	    {
	    if (halfMeta == 0 && par5 == 5) flipped = !flipped;
	    else if (halfMeta == 1 && par5 == 3) flipped = !flipped;
	    else if (halfMeta == 2 && par5 == 4) flipped = !flipped;
	    else if (halfMeta == 3 && par5 == 2)flipped = !flipped;
	    if ((meta & 16) != 0)flipped = !flipped;
	    }
	  
	  TileEntity t = par1IBlockAccess.getTileEntity(par2, par3, par4);
      if (t instanceof TileEntityGlowDoor)
      {
          if (((TileEntityGlowDoor)t).color <= 13) return (meta & 8) != 0 ? topDoorIcons[((TileEntityGlowDoor)t).color] : textures[((TileEntityGlowDoor)t).color];
          else return this.blockIcon;
      }

	  if (flipped) return flippedIcons[(meta & 8) != 0 ? 1 : 0];
	  else return (meta & 8) != 0 ? this.topDoorIcon : this.blockIcon;
	}

	@Override
	public IIcon getIcon(int par1, int par2)
	{
	  return this.blockIcon;
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		for (int i = 0; i < textures.length; i++)
        {
            textures[i] = iconRegister.registerIcon(Strings.MOD_ID + ":" + iconNames[i] + "_upper");
            topDoorIcons[i] = iconRegister.registerIcon(Strings.MOD_ID + ":" + iconNames[i] + "_lower");
        }
	  this.blockIcon = iconRegister.registerIcon(Strings.MOD_ID + ":GDWhite" + "_lower");
	  this.topDoorIcon = iconRegister.registerIcon(Strings.MOD_ID + ":GDWhite" + "_upper");
	  this.flippedIcons[0] = new IconFlipped(blockIcon, true, false);
	  this.flippedIcons[1] = new IconFlipped(topDoorIcon, true, false);
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	{
		return new ItemStack(ItemsInit.glowDoorItem);
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
	public int getRenderBlockPass()
	{
		return 1;
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return ItemsInit.glowDoorItem;
	}

	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	    {

		int i1 = this.getFullMetadata(par1World, par2, par3, par4);
        int j1 = i1 & 7;
        j1 ^= 4;

        if ((i1 & 8) == 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, j1, 2);
            par1World.markBlockRangeForRenderUpdate(par2, par3, par4, par2, par3, par4);
        }
        else
        {
            par1World.setBlockMetadataWithNotify(par2, par3 - 1, par4, j1, 2);
            par1World.markBlockRangeForRenderUpdate(par2, par3 - 1, par4, par2, par3, par4);
        }

        par1World.playAuxSFXAtEntity(par5EntityPlayer, 1003, par2, par3, par4, 0);

        if (!par1World.isRemote)
        {
            TileEntity t = par1World.getTileEntity(par2, par3, par4);
            if (t instanceof TileEntityGlowDoor && ((TileEntityGlowDoor)t).color == 14)
            {
                if (par5EntityPlayer.inventory.getCurrentItem() != null)
                {
                    if (par5EntityPlayer.inventory.getCurrentItem() == new ItemStack(ItemsInit.glowCrystals))
                    {
                        ((TileEntityGlowDoor)t).getCrystalUsed(par5EntityPlayer.inventory.getCurrentItem().getItemDamage());
                        par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 3);
                        this.setLightLevel(1.0F);
                        par5EntityPlayer.inventory.getCurrentItem().stackSize--;
                        return true;
                    }
                }
            }
            return false;
        }
        else
        {
            return true;
        }
	    }

	  @SideOnly(Side.CLIENT)
	  @Override
	  public boolean shouldSideBeRendered(IBlockAccess iBlockAccess, int x, int y, int z, int s) 
	  {
	        if(s==0 && iBlockAccess.getBlockId(x, y-1, z) == blockID)
	        {
	            return false;
	        }
	        else if(s==1 && iBlockAccess.getBlockId(x, y+1, z) == blockID)
	        {
	            return false;
	        }

	        return super.shouldSideBeRendered(iBlockAccess, x,y,z,s);
	    }

	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntityGlowDoor();
	}
}
