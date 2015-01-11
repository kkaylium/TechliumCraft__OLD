package kkaylium.mods.TechliumCraft.glowglass.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.gen.tree.GlowTreeGen;
import kkaylium.mods.TechliumCraft.glowglass.GGInits;
import kkaylium.mods.TechliumCraft.init.TCInits;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;

/**
 * Created by Kayla Marie on 12/18/2014.
 */
public class BlockGSapling extends BlockSapling {

    IIcon texture;

    public BlockGSapling(){
        super();
        this.setLightLevel(1.0F);
        this.setBlockTextureName(TCInfo.MOD_ID + ":glowsapling");
        this.setCreativeTab(TechliumCraft.GGTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        texture = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "glowsapling");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        return texture;
    }

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


    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9){
        if(!world.isRemote){
            Item inhand = player.inventory.getCurrentItem().getItem();
            if(inhand.equals(GGInits.GRainbowCrystal)){
                player.inventory.consumeInventoryItem(GGInits.GRainbowCrystal);
                return world.isRemote || new GlowTreeGen().generate(world, world.rand, x, y, z);
            }
            return true;
        }
        return false;
    }

    public boolean isValidPosition(World world, int x, int y, int z, int metadata) {

        Block block = world.getBlock(x, y - 1, z);

        return block == Blocks.grass || block == Blocks.dirt || block == Blocks.farmland || block.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this);

    }

    @Override
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_) {
        //noinspection unchecked
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
    }

    @Override
    public boolean canPlaceBlockOnSide(World world, int x, int y, int z, int side) {
        return isValidPosition(world, x, y, z, -1);
    }
}
