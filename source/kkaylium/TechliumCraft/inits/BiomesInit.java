package kkaylium.TechliumCraft.inits;

//import kkaylium.TechliumCraft.gen.glowLand.biomes.BiomeGenGlowBiome;
//import kkaylium.TechliumCraft.lib.Reference;
import kkaylium.TechliumCraft.gen.biomes.GlowPlainsRED;
import kkaylium.TechliumCraft.gen.dimention.darkLand.DLBiomeBlue;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager;

public class BiomesInit {
	
	public static BiomeGenBase DarkBiomeBLUE = (new DLBiomeBlue(41)).setBiomeName("Bluebluebluebliebliehnlekjelaj");
    public static BiomeGenBase glowPlainsRED = (new GlowPlainsRED(42)).setBiomeName("Glow Biome: Red");

    public static void biomesInit(){

        BiomeManager.warmBiomes.add(new BiomeManager.BiomeEntry(glowPlainsRED, 100));
        BiomeManager.addSpawnBiome(glowPlainsRED);
        WorldChunkManager.allowedBiomes.add(glowPlainsRED);
        BiomeDictionary.registerBiomeType(glowPlainsRED, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MAGICAL);

        BiomeManager.coolBiomes.add(new BiomeManager.BiomeEntry(DarkBiomeBLUE, 10));
        BiomeManager.addSpawnBiome(DarkBiomeBLUE);
        WorldChunkManager.allowedBiomes.add(DarkBiomeBLUE);
    }
}
