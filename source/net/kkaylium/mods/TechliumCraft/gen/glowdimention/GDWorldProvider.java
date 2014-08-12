package net.kkaylium.mods.TechliumCraft.gen.glowdimention;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.kkaylium.mods.TechliumCraft.TechliumCraft;
import net.kkaylium.mods.TechliumCraft.init.gen.TCBiomeInits;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

/**
 * Created by Kayla Marie on 8/12/14.
 */
public class GDWorldProvider extends WorldProvider {

    public static BiomeGenBase biomesToGen = TCBiomeInits.GlowBiome_PINK;

    /**
     * creates a new world chunk manager for WorldProvider
     */
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new GDWorldChunkManager(worldObj.getSeed(), terrainType);
        this.isHellWorld = false;
        this.hasNoSky = true;
        this.dimensionId = TechliumCraft.glowDimensionID;
    }

    @SideOnly(Side.CLIENT)
    public boolean isSkyColored()
    {
        return false;
    }

    public IChunkProvider createChunkGenerator()
    {
        return new GDChunkProvider(this.worldObj, this.worldObj.getSeed(), hasNoSky);
    }

    public boolean isSurfaceWorld()
    {
        return true;
    }

    /**
     * Will check if the x, z position specified is alright to be set as the map spawn point
     */
    public boolean canCoordinateBeSpawn(int par1, int par2)
    {
        return true;
    }

    public float calculateCelestialAngle(long par1, float par3)
    {
        int var4 = (int)(par1 % 24000L);
        float var5 = ((float)var4 + par3) / 24000.0F - 0.25F;

        if (var5 < 0.0F)
        {
            ++var5;
        }

        if (var5 > 1.0F)
        {
            --var5;
        }

        float var6 = var5;
        var5 = 1.0F - (float)((Math.cos((double)var5 * Math.PI) + 1.0D) / 2.0D);
        var5 = var6 + (var5 - var6) / 3.0F;
        return var5;
    }

    /**
     * Returns array with sunrise/sunset colors
     */
    @SideOnly(Side.CLIENT)
    public float[] calcSunriseSunsetColors(float par1, float par2)
    {
        return null;
    }


    /**
     * the y level at which clouds are rendered.
     */
    @SideOnly(Side.CLIENT)
    public float getCloudHeight()
    {
        return 8.0F;
    }

    /**
     * True if the player can respawn in this dimension (true = overworld, false = nether).
     */
    public boolean canRespawnHere()
    {
        return false;
    }

    /**
     * Returns true if the given X,Z coordinate should show environmental fog.
     */
    public boolean doesXZShowFog(int par1, int par2)
    {
        return true;
    }

    /**
     * Creates the light to brightness table
     */
    protected void generateLightBrightnessTable()
    {
        float var1;

        if (2>3) {
            var1 = 0.1F;
        }
        else {
            var1 = 2.1F;
        }

        for (int var2 = 0; var2 <= 15; ++var2)
        {
            float var3 = 1.0F - (float)var2 / 15.0F;
            this.lightBrightnessTable[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1 - 2;
        }
    }

    /**
     * Returns the dimension's name, e.g. "The End", "Nether", or "Overworld".
     */
    public String getDimensionName()
    {
        return "Rainbow Kingdom";
    }
}
