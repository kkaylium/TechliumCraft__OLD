package kkaylium.TechliumCraft.gen.dimention.darkLand;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.lib.Misc;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

/**
 * Created by Kayla Marie on 5/21/14.
 */
public class DLWorldProvider extends WorldProvider{

    public DLWorldProvider(){}

    @Override
    public String getDimensionName() {
        return "Dark Land";
    }

    public void registerWorldChunkManager(){
        this.worldChunkMgr = new DLWorldChunkManager(BiomeGenBase.plains, 0.2F);
        this.dimensionId = Misc.DarkLandID;
    }

    public IChunkProvider createChunkGenerator(){
        return new DLChunkProvider(worldObj, worldObj.getSeed(), true);
    }

}
