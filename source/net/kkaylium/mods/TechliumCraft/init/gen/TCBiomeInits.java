package net.kkaylium.mods.TechliumCraft.init.gen;

import net.kkaylium.mods.TechliumCraft.gen.biomes.BiomeGlow;
import net.kkaylium.mods.TechliumCraft.init.TCInits;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

/**
 * Created by Kayla Marie on 8/8/14.
 */
public class TCBiomeInits {

    public static BiomeGenBase GlowBiome_WHITE = (new BiomeGlow(80, 0xF0F0F0, TCInits.glowDirt_WHITE)).setBiomeName("Glow Biome: White");
    public static BiomeGenBase GlowBiome_BLACK = (new BiomeGlow(81, 0x242424, TCInits.glowDirt_BLACK)).setBiomeName("Glow Biome: Black");
    public static BiomeGenBase GlowBiome_RED = (new BiomeGlow(82, 0xF50000, TCInits.glowDirt_RED)).setBiomeName("Glow Biome: Red");
    public static BiomeGenBase GlowBiome_ORANGE = (new BiomeGlow(83, 0xFF7300, TCInits.glowDirt_ORANGE)).setBiomeName("Glow Biome: Orange");

    public static void initBiomes(){
        //Glow Biome: WHITE
        BiomeManager.warmBiomes.add(new BiomeManager.BiomeEntry(GlowBiome_WHITE, 50));
        BiomeManager.addSpawnBiome(GlowBiome_WHITE);
        WorldChunkManager.allowedBiomes.add(GlowBiome_WHITE);
        BiomeDictionary.registerBiomeType(GlowBiome_WHITE, BiomeDictionary.Type.PLAINS);
        //Glow Biome: BLACK
        BiomeManager.warmBiomes.add(new BiomeManager.BiomeEntry(GlowBiome_BLACK, 50));
        BiomeManager.addSpawnBiome(GlowBiome_BLACK);
        WorldChunkManager.allowedBiomes.add(GlowBiome_BLACK);
        BiomeDictionary.registerBiomeType(GlowBiome_BLACK, BiomeDictionary.Type.PLAINS);
        //Glow Biome: RED
        BiomeManager.warmBiomes.add(new BiomeManager.BiomeEntry(GlowBiome_RED, 50));
        BiomeManager.addSpawnBiome(GlowBiome_RED);
        WorldChunkManager.allowedBiomes.add(GlowBiome_RED);
        BiomeDictionary.registerBiomeType(GlowBiome_RED, BiomeDictionary.Type.PLAINS);
        //Glow Biome: ORANGE
        BiomeManager.warmBiomes.add(new BiomeManager.BiomeEntry(GlowBiome_ORANGE, 50));
        BiomeManager.addSpawnBiome(GlowBiome_ORANGE);
        WorldChunkManager.allowedBiomes.add(GlowBiome_ORANGE);
        BiomeDictionary.registerBiomeType(GlowBiome_ORANGE, BiomeDictionary.Type.PLAINS);
    }
}
