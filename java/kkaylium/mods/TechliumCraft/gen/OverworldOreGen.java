package kkaylium.mods.TechliumCraft.gen;

import cpw.mods.fml.common.IWorldGenerator;
import kkaylium.mods.TechliumCraft.init.TCInits;
import kkaylium.mods.TechliumCraft.init.gen.TCBiomeInits;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

/**
 * Created by Kayla Marie on 8/6/14.
 */
public class OverworldOreGen implements IWorldGenerator {

    public int spawnRate = 3;

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId)
        {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateOverworld(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd();
                break;
            case -16:
                generateGlowLand(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    public void generateOverworld(World world, Random random, int chunkX, int chunkZ) {

        BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);

        if(BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.HILLS)){
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.glowOre_WHITE, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.glowOre_BLACK, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
        }else if(BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.BEACH) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DRY) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DEAD) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.HOT)){
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.glowOre_RED, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.glowOre_ORANGE, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.glowOre_YELLOW, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
        }else if(BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DENSE) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.JUNGLE) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FOREST) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.LUSH)){
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.glowOre_LIME, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.glowOre_GREEN, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
        }else if(BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.COLD) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SNOWY) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.OCEAN) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.RIVER)){
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.glowOre_SKY, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.glowOre_BLUE, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
        }else if(BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FOREST) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.PLAINS) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SAVANNA) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MAGICAL)){
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.glowOre_LILAC, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.glowOre_PURPLE, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.glowOre_PINK, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
        }
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.darkOre_DARK, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
    }

    public void generateGlowLand(World world, Random random, int chunkX, int chunkZ){
        BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);

        if(biome.isEqualTo(TCBiomeInits.GlowBiome_WHITE)){
            for(int i = 0; i < spawnRate; i++)
            {
                int oreX = chunkX + random.nextInt(16);
                int oreY = random.nextInt(40);
                int oreZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(TCInits.glowOre_WHITE, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
            }
        }else if(biome.isEqualTo(TCBiomeInits.GlowBiome_BLACK)){
            for(int i = 0; i < spawnRate; i++)
            {
                int oreX = chunkX + random.nextInt(16);
                int oreY = random.nextInt(40);
                int oreZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(TCInits.glowOre_BLACK, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
            }
        }else if(biome.isEqualTo(TCBiomeInits.GlowBiome_RED)){
            for(int i = 0; i < spawnRate; i++)
            {
                int oreX = chunkX + random.nextInt(16);
                int oreY = random.nextInt(40);
                int oreZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(TCInits.glowOre_RED, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
            }
        }else if(biome.isEqualTo(TCBiomeInits.GlowBiome_ORANGE)){
            for(int i = 0; i < spawnRate; i++)
            {
                int oreX = chunkX + random.nextInt(16);
                int oreY = random.nextInt(40);
                int oreZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(TCInits.glowOre_ORANGE, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
            }
        }else if(biome.isEqualTo(TCBiomeInits.GlowBiome_YELLOW)){
            for(int i = 0; i < spawnRate; i++)
            {
                int oreX = chunkX + random.nextInt(16);
                int oreY = random.nextInt(40);
                int oreZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(TCInits.glowOre_YELLOW, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
            }
        }else if(biome.isEqualTo(TCBiomeInits.GlowBiome_LIME)){
            for(int i = 0; i < spawnRate; i++)
            {
                int oreX = chunkX + random.nextInt(16);
                int oreY = random.nextInt(40);
                int oreZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(TCInits.glowOre_LIME, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
            }
        }else if(biome.isEqualTo(TCBiomeInits.GlowBiome_GREEN)){
            for(int i = 0; i < spawnRate; i++)
            {
                int oreX = chunkX + random.nextInt(16);
                int oreY = random.nextInt(40);
                int oreZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(TCInits.glowOre_GREEN, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
            }
        }else if(biome.isEqualTo(TCBiomeInits.GlowBiome_SKY)){
            for(int i = 0; i < spawnRate; i++)
            {
                int oreX = chunkX + random.nextInt(16);
                int oreY = random.nextInt(40);
                int oreZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(TCInits.glowOre_SKY, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
            }
        }else if(biome.isEqualTo(TCBiomeInits.GlowBiome_BLUE)){
            for(int i = 0; i < spawnRate; i++)
            {
                int oreX = chunkX + random.nextInt(16);
                int oreY = random.nextInt(40);
                int oreZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(TCInits.glowOre_BLUE, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
            }
        }else if(biome.isEqualTo(TCBiomeInits.GlowBiome_LILAC)){
            for(int i = 0; i < spawnRate; i++)
            {
                int oreX = chunkX + random.nextInt(16);
                int oreY = random.nextInt(40);
                int oreZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(TCInits.glowOre_LILAC, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
            }
        }else if(biome.isEqualTo(TCBiomeInits.GlowBiome_PURPLE)){
            for(int i = 0; i < spawnRate; i++)
            {
                int oreX = chunkX + random.nextInt(16);
                int oreY = random.nextInt(40);
                int oreZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(TCInits.glowOre_PURPLE, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
            }
        }else if(biome.isEqualTo(TCBiomeInits.GlowBiome_PINK)){
            for(int i = 0; i < spawnRate; i++)
            {
                int oreX = chunkX + random.nextInt(16);
                int oreY = random.nextInt(40);
                int oreZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(TCInits.glowOre_PINK, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
            }
        }
        for(int i = 0; i < spawnRate; i++)
        {
            int oreX = chunkX + random.nextInt(16);
            int oreY = random.nextInt(40);
            int oreZ = chunkZ + random.nextInt(16);
            (new WorldGenMinable(TCInits.darkOre_DARK, 0, 12, Blocks.stone)).generate(world, random, oreX, oreY, oreZ);
        }
    }

    public void generateNether(World world, Random random, int i, int j) {

    }

    private int generateEnd() {

        return 0;
    }
}
