package kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import kkaylium.mods.TechliumCraft.tileentities.TEDarkColor;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Kayla Marie on 8/5/14.
 */
public class BlockDarkFence extends BlockFence implements ITileEntityProvider {

    public BlockDarkFence(){
        super(TCNames.darkFenceName, Material.glass);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockName(TCNames.darkFenceName);
        this.setHardness(1.6F);
        this.setStepSound(soundTypeGlass);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        blockIcon = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "darkFence");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
        if(!world.isRemote){
            TileEntity te = world.getTileEntity(x, y, z);
            ItemStack item = player.inventory.getCurrentItem();
            if(te instanceof TEDarkColor && ((TEDarkColor) te).color == TCInfo.DARK_COLORS.length - 1){
                if(item != null){
                    if(item.isItemEqual(TCInfo.DARK_CRYSTALS[0])||item.isItemEqual(TCInfo.DARK_CRYSTALS[1])||item.isItemEqual(TCInfo.DARK_CRYSTALS[2])||item.isItemEqual(TCInfo.DARK_CRYSTALS[3])||item.isItemEqual(TCInfo.DARK_CRYSTALS[4])||item.isItemEqual(TCInfo.DARK_CRYSTALS[5])||item.isItemEqual(TCInfo.DARK_CRYSTALS[6])||item.isItemEqual(TCInfo.DARK_CRYSTALS[7])||item.isItemEqual(TCInfo.DARK_CRYSTALS[8])||item.isItemEqual(TCInfo.DARK_CRYSTALS[9])||item.isItemEqual(TCInfo.DARK_CRYSTALS[10])||item.isItemEqual(TCInfo.DARK_CRYSTALS[11])||item.isItemEqual(TCInfo.DARK_CRYSTALS[12])||item.isItemEqual(TCInfo.DARK_CRYSTALS[13])||item.isItemEqual(TCInfo.DARK_CRYSTALS[14])){
                        ((TEDarkColor) te).setColor(item.getItem());
                        world.setBlockMetadataWithNotify(x, y, z, 1, 0);
                        this.setLightLevel(1.0F);
                        world.markBlockForUpdate(x, y, z);
                        if(!player.capabilities.isCreativeMode){
                            player.inventory.getCurrentItem().stackSize--;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }else{
            return false;
        }
    }

    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z) {
        int crystalColor;
        TEDarkColor te = (TEDarkColor) iBlockAccess.getTileEntity(x, y, z);
        crystalColor = te.color;
        return TCInfo.DARK_COLORS[crystalColor];
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block par5, int par6){
        TileEntity te = world.getTileEntity(x, y, z);
        EntityItem entityCrystal;
        if(te instanceof TEDarkColor && ((TEDarkColor) te).color != 12){
            entityCrystal = new EntityItem(world, (double)x, (double)y, (double)z, TCInfo.DARK_CRYSTALS[((TEDarkColor) te).color]);
            world.spawnEntityInWorld(entityCrystal);
        }
        world.removeTileEntity(x, y, z);
    }

    public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        boolean flag = this.canConnectFenceTo(par1World, par2, par3, par4 - 1);
        boolean flag1 = this.canConnectFenceTo(par1World, par2, par3, par4 + 1);
        boolean flag2 = this.canConnectFenceTo(par1World, par2 - 1, par3, par4);
        boolean flag3 = this.canConnectFenceTo(par1World, par2 + 1, par3, par4);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;

        if (flag)
        {
            f2 = 0.0F;
        }

        if (flag1)
        {
            f3 = 1.0F;
        }

        if (flag || flag1)
        {
            this.setBlockBounds(f, 0.0F, f2, f1, 1.5F, f3);
            super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        }

        f2 = 0.375F;
        f3 = 0.625F;

        if (flag2)
        {
            f = 0.0F;
        }

        if (flag3)
        {
            f1 = 1.0F;
        }

        if (flag2 || flag3 || !flag && !flag1)
        {
            this.setBlockBounds(f, 0.0F, f2, f1, 1.5F, f3);
            super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        }

        if (flag)
        {
            f2 = 0.0F;
        }

        if(flag1)
        {
            f3 = 1.0F;
        }

        this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
    }

    public void setBlockBoundsBasedOnState(IBlockAccess par1BlockAccess, int par2, int par3, int par4)
    {
        boolean flag = this.canConnectFenceTo(par1BlockAccess, par2, par3, par4 - 1);
        boolean flag1 = this.canConnectFenceTo(par1BlockAccess, par2, par3, par4 + 1);
        boolean flag2 = this.canConnectFenceTo(par1BlockAccess, par2 - 1, par3, par4);
        boolean flag3 = this.canConnectFenceTo(par1BlockAccess, par2 + 1, par3, par4);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;

        if (flag)
        {
            f2 = 0.0F;
        }

        if (flag1)
        {
            f3 = 1.0F;
        }

        if (flag2)
        {
            f = 0.0F;
        }

        if (flag3)
        {
            f1 = 1.0F;
        }

        this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }

    public boolean getBlocksMovement(IBlockAccess par1BlockAccess, int par2, int par3, int par4)
    {
        return false;
    }

    public int getRenderType()
    {
        return 11;
    }

    @Override
    public boolean canConnectFenceTo(IBlockAccess par1BlockAccess, int par2, int par3, int par4)
    {
        Block block = par1BlockAccess.getBlock(par2, par3, par4);
        return block != this && block != Blocks.fence_gate ? block.isOpaqueCube() && block.renderAsNormalBlock() : true;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TEDarkColor();
    }
}
