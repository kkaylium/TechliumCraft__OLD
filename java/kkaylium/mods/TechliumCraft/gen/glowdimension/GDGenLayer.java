package kkaylium.mods.TechliumCraft.gen.glowdimension;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;

/**
 * Created by Kayla Marie on 8/12/14.
 */
public class GDGenLayer extends GenLayer {

    public GDGenLayer(long seed) {
        super(seed);
    }

    @Override
    public int[] getInts(int p_75904_1_, int p_75904_2_, int p_75904_3_, int p_75904_4_) {
        return new int[0];
    }

    public static GenLayer[] makeTheWorld(long seed) {

        GenLayer biomes = new GDBiomesLayer(1L);

        // more GenLayerZoom = bigger biomes
        biomes = new GenLayerZoom(1000L, biomes);
        biomes = new GenLayerZoom(1001L, biomes);
        biomes = new GenLayerZoom(1002L, biomes);
        biomes = new GenLayerZoom(1003L, biomes);
        biomes = new GenLayerZoom(1004L, biomes);
        biomes = new GenLayerZoom(1005L, biomes);




        GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);

        biomes.initWorldGenSeed(seed);
        genlayervoronoizoom.initWorldGenSeed(seed);

        return new GenLayer[] {biomes, genlayervoronoizoom};
    }
}
