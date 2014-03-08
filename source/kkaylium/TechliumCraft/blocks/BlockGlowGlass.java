package kkaylium.TechliumCraft.blocks;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.lib.Strings;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowGlass;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGlowGlass extends BlockContainer{

	@SideOnly(Side.CLIENT)
	private IIcon[] textures = new IIcon[13];
	public String[] iconNames = new String[] { "GGWhite", "GGBlack", "GGRed", "GGOrange", "GGYellow", "GGLime", "GGGreen", "GGSky", "GGBlue", "GGLilac", "GGPurple", "GGPink", "GGSpecial", "GGBase" };

	public BlockGlowGlass() {
		super(Material.glass);
		this.setCreativeTab(TechliumCraft.GGTab);
        this.setLightLevel(0.5F);
        this.setHardness(0.6F);
        this.setResistance(10.0F);
	}
	
	@Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if (!par1World.isRemote)
        {
            TileEntity t = par1World.getTileEntity(par2, par3, par4);
            if (t instanceof TileEntityGlowGlass && ((TileEntityGlowGlass)t).color == 14)
            {
                if (player.inventory.getCurrentItem() != null)
                {
                    if (player.inventory.getCurrentItem() == new ItemStack(ItemsInit.glowCrystals))
                    {
                        ((TileEntityGlowGlass) t).getCrystalUsed(player.inventory.getCurrentItem().getItemDamage());
                        par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 3);
                        this.setLightLevel(1.0F);
                        player.inventory.getCurrentItem().stackSize--;
                        return true;
                    }
                }
            }
            return false;
        }
        else
        {
            return false;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        TileEntity t = par1IBlockAccess.getTileEntity(par2, par3, par4);
        if (t instanceof TileEntityGlowGlass)
        {
            if (((TileEntityGlowGlass)t).color <= 13) return textures[((TileEntityGlowGlass)t).color];
            else return this.blockIcon;
        }
        else
        {
            return this.blockIcon;
        }
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister)
    {
        for (int i = 0; i < textures.length; i++)
        {
            textures[i] = iconregister.registerIcon(Strings.MOD_ID + ":" + iconNames[i]);
        }
        blockIcon = iconregister.registerIcon(Strings.MOD_ID + ":GGBase");
    }
    
    @Override
    public void breakBlock(World par1World, int par2, int par3, int par4, Block par5, int par6){       
        TileEntity t = par1World.getTileEntity(par2, par3, par4);
        EntityItem entityCrystal = new EntityItem(par1World, (double)(par2), (double)(par3), (double)(par4), new ItemStack(ItemsInit.glowCrystals, 1, ((TileEntityGlowGlass)t).color));
        if (t instanceof TileEntityGlowGlass && ((TileEntityGlowGlass)t).color != 14){
        	par1World.spawnEntityInWorld(entityCrystal);
        }
        par1World.removeTileEntity(par2, par3, par4);
    }
	
	@SideOnly(Side.CLIENT)
    @Override
    public int getRenderBlockPass()
    {
        return 1;
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

    protected boolean canSilkHarvest()
    {
        return true;
    }
    
  //  @SuppressWarnings("unused")
    @Override
	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        //Block b1 = BlocksInit.glowGlass;
    	Block b1 = par1IBlockAccess.getBlock(par2, par3, par4);
        if (b1 == this || b1 == Blocks.glass)
        {
            return false;
        }
        return super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
        //return !true && b1 == BlocksInit.glowGlass ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }

	@Override
	public TileEntity createNewTileEntity(World world, int par2) {
		return new TileEntityGlowGlass();
	}

}
