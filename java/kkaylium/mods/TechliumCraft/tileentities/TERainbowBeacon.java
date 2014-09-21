package kkaylium.mods.TechliumCraft.tileentities;

import kkaylium.mods.TechliumCraft.init.TCInits;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by kkaylium on 9/21/14.
 */
public class TERainbowBeacon extends TileEntity {

    public TERainbowBeacon() {

    }

    public void placePortalBlocks(World world, int x, int y, int z) {
        if (!world.isRemote) {
                if (world.getBlock(x, y + 1, z).equals(Blocks.air)&&world.getBlock(x, y + 2, z).equals(Blocks.air)&&world.getBlock(x, y + 3, z).equals(Blocks.air)) {
                    world.setBlock(x, y + 1, z, TCInits.beaconAir);
                    world.setBlock(x, y + 2, z, TCInits.beaconAir);
                    world.setBlock(x, y + 3, z, TCInits.beaconAir);
                    world.setBlock(x, y + 4, z, TCInits.glowPortal);
                    world.setBlock(x + 1, y + 4, z, TCInits.glowPortal);
                    world.setBlock(x - 1, y + 4, z, TCInits.glowPortal);
                    world.setBlock(x, y + 4, z + 1, TCInits.glowPortal);
                    world.setBlock(x, y + 4, z - 1, TCInits.glowPortal);
                } else {
                    return;
                }
        }
    }
}
