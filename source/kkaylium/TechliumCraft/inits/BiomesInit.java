package kkaylium.TechliumCraft.inits;

//import kkaylium.TechliumCraft.gen.glowLand.biomes.BiomeGenGlowBiome;
//import kkaylium.TechliumCraft.lib.Reference;
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
    public static final BiomeGenBase forestTest = (new BiomeGenForest(40, 0)).setColor(999999).setBiomeName("Superlongtestingnameheresoyoucanseeifitworkslol").setDisableRain().setTemperatureRainfall(5.0F, 5.0F);

    public static void biomesInit(){
        BiomeManager.coolBiomes.add(new BiomeManager.BiomeEntry(forestTest, 10));
        BiomeManager.addSpawnBiome(forestTest);
        WorldChunkManager.allowedBiomes.add(forestTest);
        BiomeDictionary.registerBiomeType(forestTest, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.MAGICAL);

        BiomeManager.coolBiomes.add(new BiomeManager.BiomeEntry(DarkBiomeBLUE, 10));
        BiomeManager.addSpawnBiome(DarkBiomeBLUE);
        WorldChunkManager.allowedBiomes.add(DarkBiomeBLUE);
        if(WorldChunkManager.allowedBiomes.contains(DarkBiomeBLUE)){
            System.out.println("Find This NOW");
            WorldChunkManager.allowedBiomes.indexOf(DarkBiomeBLUE);
        }
    }
}
