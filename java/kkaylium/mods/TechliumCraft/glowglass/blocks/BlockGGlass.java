package kkaylium.mods.TechliumCraft.glowglass.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.glowglass.GGInits;
import kkaylium.mods.TechliumCraft.glowglass.info.GGInfo;
import kkaylium.mods.TechliumCraft.glowglass.tileentities.TileEntityGlow;
import kkaylium.mods.TechliumCraft.main.TechliumCraft;
import kkaylium.mods.TechliumCraft.main.info.TCInfo;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by kkaylium on 10/26/14.
 */
public class BlockGGlass extends BlockContainer {

    public BlockGGlass(int id, Material material){
        super(id, material);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setHardness(0.5F);
        this.setLightValue(0.5F);
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9){
        if(world.isRemote){
            TileEntity te = world.getBlockTileEntity(x, y, z);
            Item item = player.inventory.getCurrentItem().getItem();
            if(te instanceof TileEntityGlow && ((TileEntityGlow) te).color == TCInfo.glow_colors[0][0]){
                if(item != null){
                    if(item.equals(GGInits.GCrystal_RED)||item.equals(GGInits.GCrystal_ORANGE)||item.equals(GGInits.GCrystal_YELLOW)||item.equals(GGInits.GCrystal_GREEN)||item.equals(GGInits.GCrystal_BLUE)||item.equals(GGInits.GCrystal_PURPLE)||item.equals(GGInits.GCrystal_BLACK)||item.equals(GGInits.GCrystal_BROWN)||item.equals(GGInits.GCrystal_WHITE)){
                        ((TileEntityGlow)te).setColor(0, item);
                        world.setBlockMetadataWithNotify(x, y, z, 1, 0);
                        this.setLightValue(1.0F);
                        world.markBlockForUpdate(x, y, z);
                        if(!player.capabilities.isCreativeMode){
                            player.inventory.getCurrentItem().stackSize--;
                        }
                        return true;
                    }
                }
            }else if(te instanceof TileEntityGlow && ((TileEntityGlow) te).color != TCInfo.glow_colors[0][0]){
                if(((TileEntityGlow)te).color == TCInfo.glow_colors[1][0]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][1]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][2]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][3]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][4]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][5]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][6]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][7]){
                    if(item.equals(GGInits.GCrystal_WHITE)){
                        ((TileEntityGlow)te).setColor(1, item);
                        world.setBlockMetadataWithNotify(x, y, z, 1, 0);
                        world.markBlockForUpdate(x, y, z);
                        return true;
                    }
                }
            }else{
                return false;
            }
            return false;
        }
        return false;
    }

    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z) {
        int crystalColor;
        TileEntityGlow te = (TileEntityGlow) iBlockAccess.getBlockTileEntity(x, y, z);
        crystalColor = te.color;
        return crystalColor;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, int par5, int par6){
        TileEntity te = world.getBlockTileEntity(x, y, z);
        EntityItem entityCrystal;
        if(te instanceof TileEntityGlow && ((TileEntityGlow) te).color != TCInfo.glow_colors[0][0]){
            entityCrystal = new EntityItem(world, (double)x, (double)y, (double)z, new ItemStack(((TileEntityGlow)te).crystalsToDrop));
            if(((TileEntityGlow)te).crystalsToDropSecondary != null){
                entityCrystal = new EntityItem(world, (double)x, (double)y, (double)z, new ItemStack(((TileEntityGlow)te).crystalsToDropSecondary));
            }
            world.spawnEntityInWorld(entityCrystal);
        }
        world.removeBlockTileEntity(x, y, z);
    }

    public void registerIcons(IconRegister ir){
        this.blockIcon = ir.registerIcon(TCInfo.MOD_ID + ":glass/" + GGInfo.glow_glass_name);
    }

//    @SideOnly(Side.CLIENT)
//    public Icon getIcon(int side, int meta){
//        return null;
//    }

    @Override
    public int getRenderBlockPass() {
        return 0;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    protected boolean canSilkHarvest() {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileEntityGlow();
    }
}
