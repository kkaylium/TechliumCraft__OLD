package kkaylium.TechliumCraft.blocks.gen.trees;

import java.util.Random;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.TCInits;
import kkaylium.TechliumCraft.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TCSaplingBlock extends BlockSapling{
	
	public IIcon[] icons;
    public String[] textureNames = new String[] {"glow", "dark"};

    public TCSaplingBlock()
    {
        super();
        float f = 0.4F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setHardness(0.0F);
        this.setStepSound(Block.soundTypeGrass);
        this.setCreativeTab(TechliumCraft.GGTab);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister)
    {
        this.icons = new IIcon[textureNames.length];

        for (int i = 0; i < this.icons.length; ++i)
        {
            this.icons[i] = iconRegister.registerIcon(Strings.MOD_ID + ":" + textureNames[i] + "_sapling");
        }
    }
    
    @Override
    public boolean canPlaceBlockAt (World world, int x, int y, int z)
    {
        Block block = world.getBlock(x, y, z);
        if (block == null || block.isReplaceable(world, x, y, z))
        {
            Block lowerID = world.getBlock(x, y - 1, z);
            //return canThisPlantGrowOnThisBlockID(lowerID);
            if (!canThisPlantGrowOnThisBlock(lowerID))
            {
                Block upperID = world.getBlock(x, y + 1, z);
                return canThisPlantGrowOnThisBlock(upperID);
            }
            else
                return true;
        }
        return false;
    }
    
    public boolean canThisPlantGrowOnThisBlock (Block id)
    {
        return id == Blocks.grass || id == Blocks.dirt || id == Blocks.soul_sand || id == Blocks.netherrack || id == TCInits.glowDirt;
    }
    
    @Override
    public boolean canBlockStay (World world, int x, int y, int z)
    {
        int meta = world.getBlockMetadata(x, y, z) % 8;
        switch (meta)
        {
        case 0:
            Block soil = world.getBlock(x, y - 1, z);
            return (world.getFullBlockLightValue(x, y, z) >= 8 || world.canBlockSeeTheSky(x, y, z)) && (soil != null && soil.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this));
        case 1:
            Block netherSoil = world.getBlock(x, y - 1, z);
            return netherSoil != null && (netherSoil == Blocks.netherrack || netherSoil.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this));
        case 2:
            Block nSoil = world.getBlock(x, y + 1, z);
            return nSoil != null && (nSoil == Blocks.netherrack || nSoil == Blocks.soul_sand || nSoil == TCInits.glowDirt);
        default:
            return true;
        }
    }


    @Override
    public EnumPlantType getPlantType (IBlockAccess world, int x, int y, int z)
    {
        int meta = world.getBlockMetadata(x, y, z) % 8;
        if (meta <= 3)
            return EnumPlantType.Plains;
        else
            return EnumPlantType.Nether;
    }
    
    @Override
    public void updateTick (World world, int x, int y, int z, Random random)
    {
        if (world.isRemote)
        {
            return;
        }
        super.updateTick(world, x, y, z, random);
        int md = world.getBlockMetadata(x, y, z);
        if (md % 8 == 0)
        {
            if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(120) == 0)
            {
                if ((md & 8) == 0)
                    world.setBlockMetadataWithNotify(x, y, z, md | 8, 4);

                else
                {
                    int numSaplings = 0;
                    for (int xPos = -3; xPos <= 3; xPos++)
                    {
                        for (int zPos = -3; zPos <= 3; zPos++)
                        {
                            int ecks = x + xPos, zee = z + zPos;
                            if (world.getBlock(x + xPos, y, z + zPos) == this && world.getBlockMetadata(x + xPos, y, z + zPos) % 8 == 0)
                            {
                                numSaplings++;
                            }
                        }
                    }

                    if (numSaplings >= 40)
                    {
                        for (int xPos = -4; xPos <= 4; xPos++)
                        {
                            for (int zPos = -4; zPos <= 4; zPos++)
                            {
                                int ecks = x + xPos, zee = z + zPos;
                                if (world.getBlock(ecks, y, zee) == this && world.getBlockMetadata(ecks, y, zee) % 8 == 0)
                                {
                                    world.setBlock(ecks, y, zee, Blocks.air, 0, 4);
                                }
                            }
                        }
                        func_149879_c(world, x, y, z, random);
                    }
                }
            }
        }
        else if (md % 8 <= 3)
        {
            if (random.nextInt(10) == 0 && world.getBlockLightValue(x, y + 1, z) >= 9)//&& random.nextInt(120) == 0)
            {
                if ((md & 8) == 0)
                    world.setBlockMetadataWithNotify(x, y, z, md | 8, 4);

                else
                    func_149879_c(world, x, y, z, random);
            }
        }
        else if (random.nextInt(10) == 0)
        {
            if ((md & 8) == 0)
                world.setBlockMetadataWithNotify(x, y, z, md | 8, 4);

            else
                func_149879_c(world, x, y, z, random);
        }
    }
    
}
