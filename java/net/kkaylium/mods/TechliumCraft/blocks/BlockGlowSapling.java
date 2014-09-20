package net.kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.kkaylium.mods.TechliumCraft.TechliumCraft;
import net.kkaylium.mods.TechliumCraft.init.TCInits;
import net.kkaylium.mods.TechliumCraft.init.gen.tree.GlowTreeGen;
import net.kkaylium.mods.TechliumCraft.lib.ModInfo;
import net.kkaylium.mods.TechliumCraft.lib.TCNames;
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
import java.util.Random;

/**
 * Created by Kayla Marie on 8/13/14.
 */
public class BlockGlowSapling extends BlockSapling {

    private IIcon texture;

    public BlockGlowSapling() {
        super();
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockName(TCNames.glowSaplingName);
        this.setLightLevel(0.5F);
        float f = 0.4F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setHardness(0.0F);
        this.setStepSound(Block.soundTypeGrass);
        this.setBlockTextureName(ModInfo.MOD_ID + ":glowSapling");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        texture = iconregister.registerIcon(ModInfo.MOD_ID + ":" + "glowSapling");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        return texture;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
        if (!world.isRemote) {
            if (player.inventory.getCurrentItem().getItem() == TCInits.glowCrystal_WHITE) {
                player.inventory.consumeInventoryItem(TCInits.glowCrystal_WHITE);
                return world.isRemote || new GlowTreeGen().generate(world, world.rand, x, y, z);
            }
            return true;
        } else {
            return false;
        }
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

    @Override
    public void func_149878_d(World world, int x, int y, int z, Random rand) {
//        super.func_149878_d(world, x, y, z, rand);

    }
}
