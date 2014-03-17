package kkaylium.TechliumCraft.blocks;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.lib.Strings;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowPlanks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGlowPlanks extends BlockContainer{

	@SideOnly(Side.CLIENT)
    private IIcon[] textures = new IIcon[13];
    public String[] iconNames = new String[] { "GPWhite", "GPBlack", "GPRed", "GPOrange", "GPYellow", "GPLime", "GPGreen", "GPSky", "GPBlue", "GPLilac", "GPPurple", "GPPink", "GPSpecial", "glowPlanks"};

    public BlockGlowPlanks()
    {
        super(Material.wood);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setLightLevel(0.5F);
        this.setHardness(2.0F);
        this.setResistance(10.0F);
    }

    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if (!par1World.isRemote)
        {
            TileEntity t = par1World.getTileEntity(par2, par3, par4);
            if (t instanceof TileEntityGlowPlanks && ((TileEntityGlowPlanks)t).color == 14)
            {
                if (player.inventory.getCurrentItem() != null)
                {
                    if ((player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 1)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 2)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 3)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 4)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 5)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 6)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 7)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 8)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 9)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 10)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 11)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 12)) || player.inventory.getCurrentItem().isItemEqual(new ItemStack(ItemsInit.glowCrystals, 0, 13))))
                    {
                        ((TileEntityGlowPlanks) t).getCrystalUsed(player.inventory.getCurrentItem().getItemDamage());
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
        if (t instanceof TileEntityGlowPlanks)
        {
            if (((TileEntityGlowPlanks)t).color <= 13) return textures[((TileEntityGlowPlanks)t).color];
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
        blockIcon = iconregister.registerIcon(Strings.MOD_ID + ":glowPlanks");
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2)
    {
        return new TileEntityGlowPlanks();
    }
    
    @Override
    public void breakBlock(World par1World, int par2, int par3, int par4, Block par5, int par6){       
        TileEntity t = par1World.getTileEntity(par2, par3, par4);
        EntityItem entityCrystal = new EntityItem(par1World, (double)(par2), (double)(par3), (double)(par4), new ItemStack(ItemsInit.glowCrystals, 1, ((TileEntityGlowPlanks)t).color));
        if (t instanceof TileEntityGlowPlanks && ((TileEntityGlowPlanks)t).color != 14){
        	par1World.spawnEntityInWorld(entityCrystal);
        }
        par1World.removeTileEntity(par2, par3, par4);
    }

}
