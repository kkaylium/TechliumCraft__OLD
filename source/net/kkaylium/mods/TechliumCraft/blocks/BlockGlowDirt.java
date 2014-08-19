package net.kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.kkaylium.mods.TechliumCraft.TechliumCraft;
import net.kkaylium.mods.TechliumCraft.lib.ModInfo;
import net.kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

/**
 * Created by Kayla Marie on 8/8/14.
 */
public class BlockGlowDirt extends Block implements IGrowable {

    @SideOnly(Side.CLIENT)
    public IIcon[] topIcon = new IIcon[12];
    @SideOnly(Side.CLIENT)
    public IIcon[] sideIcon = new IIcon[12];
    @SideOnly(Side.CLIENT)
    public IIcon bottomIcon;

    private String[] blockColor = {"White", "Black", "Red", "Orange", "Yellow", "Lime", "Green", "Sky", "Blue", "Lilac", "Purple", "Pink"};
    private String[] blockName = {"white", "black", "red", "orange", "yellow", "lime", "green", "sky", "blue", "lilac", "purple", "pink"};

    public int colored;

    public BlockGlowDirt(int color) {
        super(Material.grass);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockName(TCNames.glowDirtName + "_" + blockName[color]);
        this.setTickRandomly(true);
        this.setHardness(0.3F);
        this.setStepSound(soundTypeGrass);

        colored = color;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        blockIcon = ir.registerIcon(ModInfo.MOD_ID + ":" + "glowDirt_bottom");
        bottomIcon = ir.registerIcon(ModInfo.MOD_ID + ":" + "glowDirt_bottom");
        for (int i = 0; i < blockColor.length; i++) {
            sideIcon[i] = ir.registerIcon(ModInfo.MOD_ID + ":" + "glowDirt" + blockColor[i] + "_side");
            topIcon[i] = ir.registerIcon(ModInfo.MOD_ID + ":" + "glowDirt" + blockColor[i] + "_top");
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 0) {
            return bottomIcon;
        } else if (side == 1) {
            return topIcon[colored];
        }
        return sideIcon[colored];
    }

    @Override
    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
        return Blocks.grass.canSustainPlant(world, x, y, z, direction, plantable);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float xActive, float yActive, float zActive) {
        if (world.isRemote) return false;
        if (player.getCurrentEquippedItem() != null) {
            if (player.getCurrentEquippedItem().getItem() instanceof ItemHoe) {
                world.setBlock(x, y, z, Blocks.farmland);
            }
        }
        return false;
    }

    @Override
    public boolean func_149851_a(World var1, int var2, int var3, int var4, boolean var5) {
        return true;
    }

    @Override
    public boolean func_149852_a(World var1, Random var2, int var3, int var4, int var5) {
        return true;
    }

    @Override
    public void func_149853_b(World var1, Random var2, int var3, int var4, int var5) {

    }
}
