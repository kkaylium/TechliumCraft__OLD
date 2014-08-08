package net.kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.kkaylium.mods.TechliumCraft.TechliumCraft;
import net.kkaylium.mods.TechliumCraft.init.TCInits;
import net.kkaylium.mods.TechliumCraft.lib.ModInfo;
import net.kkaylium.mods.TechliumCraft.lib.TCNames;
import net.kkaylium.mods.TechliumCraft.tileentities.TEGlowColor;
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
public class BlockGlowFence extends BlockFence implements ITileEntityProvider{

    public int[] blockColor = new int[]{0xFFFFFF, 0x363638, 0xB81A1A, 0xF0760C, 0xF2D94B, 0x21ED2F, 0x097A25, 0x4CECF5, 0x0010C4, 0xC977FC, 0x6F05B0, 0xFF57C4, 0xEBF2FA};

    public BlockGlowFence(){
        super(TCNames.glowFenceName, Material.glass);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockName(TCNames.glowFenceName);
        this.setHardness(1.6F);
        this.setStepSound(soundTypeGlass);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        blockIcon = iconregister.registerIcon(ModInfo.MOD_ID + ":" + "glowFence");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
        if(!world.isRemote){
            TileEntity te = world.getTileEntity(x, y, z);
            ItemStack item = player.inventory.getCurrentItem();
            if(te instanceof TEGlowColor && ((TEGlowColor) te).color == 12){
                if(item != null){
                    if(item.isItemEqual(new ItemStack(TCInits.glowCrystal_WHITE)) || item.isItemEqual(new ItemStack(TCInits.glowCrystal_BLACK)) || item.isItemEqual(new ItemStack(TCInits.glowCrystal_RED)) || item.isItemEqual(new ItemStack(TCInits.glowCrystal_ORANGE)) || item.isItemEqual(new ItemStack(TCInits.glowCrystal_YELLOW)) || item.isItemEqual(new ItemStack(TCInits.glowCrystal_LIME)) || item.isItemEqual(new ItemStack(TCInits.glowCrystal_GREEN)) || item.isItemEqual(new ItemStack(TCInits.glowCrystal_SKY)) || item.isItemEqual(new ItemStack(TCInits.glowCrystal_BLUE)) || item.isItemEqual(new ItemStack(TCInits.glowCrystal_LILAC)) || item.isItemEqual(new ItemStack(TCInits.glowCrystal_PURPLE)) || item.isItemEqual(new ItemStack(TCInits.glowCrystal_PINK))){
                        ((TEGlowColor) te).setColor(item.getItem());
                        world.setBlockMetadataWithNotify(x, y, z, 1, 0);
                        this.setLightLevel(1.0F);
                        player.inventory.getCurrentItem().stackSize--;
                        world.markBlockForUpdate(x, y, z);
                        return true;
                    }
                }
            }
            return false;
        }else{
            return false;
        }
    }

    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z) {
        int crystalColor;
        TEGlowColor te = (TEGlowColor) iBlockAccess.getTileEntity(x, y, z);
        switch(te.color){
            case 0:
                crystalColor = te.color;
                break;
            case 1:
                crystalColor = te.color;
                break;
            case 2:
                crystalColor = te.color;
                break;
            case 3:
                crystalColor = te.color;
                break;
            case 4:
                crystalColor = te.color;
                break;
            case 5:
                crystalColor = te.color;
                break;
            case 6:
                crystalColor = te.color;
                break;
            case 7:
                crystalColor = te.color;
                break;
            case 8:
                crystalColor = te.color;
                break;
            case 9:
                crystalColor = te.color;
                break;
            case 10:
                crystalColor = te.color;
                break;
            case 11:
                crystalColor = te.color;
                break;
            case 12:
                crystalColor = te.color;
                break;
            default:
                crystalColor = te.color;
                break;
        }
        return blockColor[crystalColor];
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block par5, int par6){
        TileEntity te = world.getTileEntity(x, y, z);
        EntityItem entityCrystal;
        if(te instanceof TEGlowColor && ((TEGlowColor) te).color != 12){
            switch(((TEGlowColor) te).color){
                case 0:
                    entityCrystal = new EntityItem(world, (double)(x), (double)(y), (double)(z), new ItemStack(TCInits.glowCrystal_WHITE));
                    world.spawnEntityInWorld(entityCrystal);
                    break;
                case 1:
                    entityCrystal = new EntityItem(world, (double)(x), (double)(y), (double)(z), new ItemStack(TCInits.glowCrystal_BLACK));
                    world.spawnEntityInWorld(entityCrystal);
                    break;
                case 2:
                    entityCrystal = new EntityItem(world, (double)(x), (double)(y), (double)(z), new ItemStack(TCInits.glowCrystal_RED));
                    world.spawnEntityInWorld(entityCrystal);
                    break;
                case 3:
                    entityCrystal = new EntityItem(world, (double)(x), (double)(y), (double)(z), new ItemStack(TCInits.glowCrystal_ORANGE));
                    world.spawnEntityInWorld(entityCrystal);
                    break;
                case 4:
                    entityCrystal = new EntityItem(world, (double)(x), (double)(y), (double)(z), new ItemStack(TCInits.glowCrystal_YELLOW));
                    world.spawnEntityInWorld(entityCrystal);
                    break;
                case 5:
                    entityCrystal = new EntityItem(world, (double)(x), (double)(y), (double)(z), new ItemStack(TCInits.glowCrystal_LIME));
                    world.spawnEntityInWorld(entityCrystal);
                    break;
                case 6:
                    entityCrystal = new EntityItem(world, (double)(x), (double)(y), (double)(z), new ItemStack(TCInits.glowCrystal_GREEN));
                    world.spawnEntityInWorld(entityCrystal);
                    break;
                case 7:
                    entityCrystal = new EntityItem(world, (double)(x), (double)(y), (double)(z), new ItemStack(TCInits.glowCrystal_SKY));
                    world.spawnEntityInWorld(entityCrystal);
                    break;
                case 8:
                    entityCrystal = new EntityItem(world, (double)(x), (double)(y), (double)(z), new ItemStack(TCInits.glowCrystal_BLUE));
                    world.spawnEntityInWorld(entityCrystal);
                    break;
                case 9:
                    entityCrystal = new EntityItem(world, (double)(x), (double)(y), (double)(z), new ItemStack(TCInits.glowCrystal_LILAC));
                    world.spawnEntityInWorld(entityCrystal);
                    break;
                case 10:
                    entityCrystal = new EntityItem(world, (double)(x), (double)(y), (double)(z), new ItemStack(TCInits.glowCrystal_PURPLE));
                    world.spawnEntityInWorld(entityCrystal);
                    break;
                case 11:
                    entityCrystal = new EntityItem(world, (double)(x), (double)(y), (double)(z), new ItemStack(TCInits.glowCrystal_PINK));
                    world.spawnEntityInWorld(entityCrystal);
                    break;
                case 12:
                    break;
                default:
                    break;
            }
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
    public TileEntity createNewTileEntity(World world, int var2) {
        return new TEGlowColor();
    }
}
