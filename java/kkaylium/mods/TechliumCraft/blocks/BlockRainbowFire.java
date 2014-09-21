package kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

/**
 * Created by Kayla Marie on 9/9/14.
 */
public class BlockRainbowFire extends Block {

    public BlockRainbowFire(){
        super(Material.fire);
        this.setTickRandomly(true);
        this.setBlockName(TCNames.rainbowFireName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir){
        blockIcon = ir.registerIcon(TCInfo.MOD_ID + ":" + TCNames.rainbowFireName);
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public int getRenderType(){
        return 3;
    }

    @Override
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }

    @Override
    public int tickRate(World p_149738_1_)
    {
        return 30;
    }

    private void tryCatchFire(World world, int x, int y, int z, int u, Random rand, int u2, ForgeDirection face){
        int j1 = world.getBlock(x, y, z).getFlammability(world, x, y, z, face);
        if(rand.nextInt(u) < j1){
            if(rand.nextInt(u2 + 10) < 5 && !world.canLightningStrikeAt(x, y, z)){
                int k1 = u2 + rand.nextInt(5) / 4;
                if(k1 > 15){
                    k1 = 15;
                }
            }
        }
    }
}
