package kkaylium.mods.TechliumCraft.glowglass.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.glowglass.GGInits;
import kkaylium.mods.TechliumCraft.glowglass.info.GGInfo;
import kkaylium.mods.TechliumCraft.glowglass.tileentities.TileEntityGlow;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by kkaylium on 11/5/14.
 */
public class BlockGLog extends BlockContainer {

    @SideOnly(Side.CLIENT)
    private IIcon iconLogTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconLogBottom;

    public BlockGLog(Material material){
        super(material);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setLightLevel(0.5F);
    }

    public void registerBlockIcons(IIconRegister ir){
        this.blockIcon = ir.registerIcon(TCInfo.MOD_ID + ":" + GGInfo.glow_log_name);
        this.iconLogTop = ir.registerIcon(TCInfo.MOD_ID + ":" + GGInfo.glow_log_name + "_top");
        this.iconLogBottom = ir.registerIcon(TCInfo.MOD_ID + ":" + GGInfo.glow_log_name + "_top");
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9){
        if(!world.isRemote){
            TileEntity te = world.getTileEntity(x, y, z);
            Item item = player.inventory.getCurrentItem().getItem();
            if(te instanceof TileEntityGlow && ((TileEntityGlow) te).color == TCInfo.glow_colors[0][0]){
                if(item != null){
                    if(item.equals(GGInits.GCrystal_RED)||item.equals(GGInits.GCrystal_ORANGE)||item.equals(GGInits.GCrystal_YELLOW)||item.equals(GGInits.GCrystal_GREEN)||item.equals(GGInits.GCrystal_BLUE)||item.equals(GGInits.GCrystal_PURPLE)||item.equals(GGInits.GCrystal_BLACK)||item.equals(GGInits.GCrystal_BROWN)||item.equals(GGInits.GCrystal_WHITE)){
                        ((TileEntityGlow)te).setColor(0, item);
                        world.setBlockMetadataWithNotify(x, y, z, 1, 0);
                        this.setLightLevel(1.0F);
                        world.markBlockForUpdate(x, y, z);
                        if(!player.capabilities.isCreativeMode){
                            player.inventory.getCurrentItem().stackSize--;
                        }
                        return true;
                    }
                }
            }else if(te instanceof TileEntityGlow && ((TileEntityGlow) te).color != TCInfo.glow_colors[0][0]){
                if(((TileEntityGlow)te).color == TCInfo.glow_colors[1][0]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][1]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][2]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][3]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][4]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][5]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][6]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][7]||((TileEntityGlow)te).color == TCInfo.glow_colors[1][8]){
                    if(item.equals(GGInits.GCrystal_WHITE) && ((TileEntityGlow)te).color != TCInfo.glow_colors[1][8]){
                        ((TileEntityGlow)te).setColor(1, item);
                        world.setBlockMetadataWithNotify(x, y, z, 1, 0);
                        world.markBlockForUpdate(x, y, z);
                        return true;
                    }else if(item.equals(GGInits.GCrystal_BLACK) && ((TileEntityGlow)te).color != TCInfo.glow_colors[1][6]){
                        ((TileEntityGlow)te).setColor(2, item);
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
        TileEntityGlow te = (TileEntityGlow) iBlockAccess.getTileEntity(x, y, z);
        crystalColor = te.color;
        return crystalColor;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block par5, int par6){
        TileEntity te = world.getTileEntity(x, y, z);
        EntityItem entityCrystal;
        if(te instanceof TileEntityGlow && ((TileEntityGlow) te).color != TCInfo.glow_colors[0][0] && ((TileEntityGlow)te).crystalsToDrop != null){
            entityCrystal = new EntityItem(world, (double)x, (double)y, (double)z, new ItemStack(((TileEntityGlow)te).crystalsToDrop));
            world.spawnEntityInWorld(entityCrystal);
        }
        world.removeTileEntity(x, y, z);
    }

    public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9){
        int j1 = par9 & 3;
        byte b0 = 0;
        switch (par5){
            case 0:
            case 1:
                b0 = 0;
                break;
            case 2:
            case 3:
                b0 = 8;
                break;
            case 4:
            case 5:
                b0 = 4;
        }
        return j1 | b0;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random){
        return 1;
    }

    /** gets the icon **/
    public IIcon getIcon(int par1, int par2){
        return par1 == 1 ? this.iconLogTop : (par1 == 0 ? this.iconLogBottom : this.blockIcon);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntityGlow();
    }


}
