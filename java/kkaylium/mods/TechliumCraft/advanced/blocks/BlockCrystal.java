package kkaylium.mods.TechliumCraft.advanced.blocks;

import kkaylium.mods.TechliumCraft.advanced.tileentities.TileEntityCrystal;
import kkaylium.mods.TechliumCraft.main.TechliumCraft;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by kkaylium on 10/29/14.
 */
public class BlockCrystal extends BlockContainer {

    public BlockCrystal(int id, Material material){
        super(id, material);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setLightValue(1.0F);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileEntityCrystal();
    }
}
