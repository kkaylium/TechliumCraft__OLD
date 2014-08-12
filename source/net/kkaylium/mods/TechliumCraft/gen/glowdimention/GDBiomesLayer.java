package net.kkaylium.mods.TechliumCraft.gen.glowdimention;

import net.kkaylium.mods.TechliumCraft.init.gen.TCBiomeInits;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

/**
 * Created by Kayla Marie on 8/12/14.
 */
public class GDBiomesLayer extends GenLayer {

    protected BiomeGenBase[] allowedBiomes = {TCBiomeInits.GlowBiome_WHITE, TCBiomeInits.GlowBiome_BLACK, TCBiomeInits.GlowBiome_RED, TCBiomeInits.GlowBiome_ORANGE, TCBiomeInits.GlowBiome_YELLOW, TCBiomeInits.GlowBiome_LIME, TCBiomeInits.GlowBiome_GREEN, TCBiomeInits.GlowBiome_SKY, TCBiomeInits.GlowBiome_BLUE, TCBiomeInits.GlowBiome_LILAC, TCBiomeInits.GlowBiome_PURPLE, TCBiomeInits.GlowBiome_PINK};

    public GDBiomesLayer(long seed, GenLayer genlayer) {
        super(seed);
        this.parent = genlayer;
    }

    public GDBiomesLayer(long seed) {
        super(seed);
    }

    @Override
    public int[] getInts(int x, int z, int width, int depth)
    {
        int[] dest = IntCache.getIntCache(width * depth);

        for (int dz=0; dz<depth; dz++)
        {
            for (int dx=0; dx<width; dx++)
            {
                this.initChunkSeed(dx+x, dz+z);
                dest[(dx+dz*width)] = this.allowedBiomes[nextInt(this.allowedBiomes.length)].biomeID;
            }
        }
        return dest;
    }
}
