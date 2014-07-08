package kkaylium.TechliumCraft.generation.biomes;

import kkaylium.TechliumCraft.mobs.entities.EntityRainbowSlime;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenForest;

/**
 * Created by Kayla Marie on 6/15/14.
 */
public abstract class TCBiomeBase extends BiomeGenBase {

    public TCBiomeBase(int i){
        super(i);

        //this.birchGen = new WorldGenForest(false, false);

        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableCaveCreatureList.clear();

        this.spawnableCreatureList.add(new SpawnListEntry(EntityRainbowSlime.class, 12, 4, 4));


    }
}
