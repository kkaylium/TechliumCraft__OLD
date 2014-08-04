package net.kkaylium.mods.TechliumCraft.gen;

import cpw.mods.fml.common.IWorldGenerator;
import net.kkaylium.mods.TechliumCraft.init.TCInits;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Kayla Marie on 7/30/14.
 */
public class TCOverworldOreGen implements IWorldGenerator {

    public class OreInfo{
        public int maxHeight;
        public int minHeight;
        public int maxVein;
        public int minVein;
        public int veinsPerChunk;
        public Block oreType;
        public BiomeDictionary.Type[] spawnBiomeTypes;

        public OreInfo(int MaxHeight, int MinHeight, int MaxVein, int MinVein, int VeinsPerChunk, Block OreType, BiomeDictionary.Type... SpawnBiomeTypes){
            maxHeight = MaxHeight;
            minHeight = MinHeight;
            maxVein = MaxVein;
            minVein = MinVein;
            veinsPerChunk = VeinsPerChunk;
            oreType = OreType;
            spawnBiomeTypes = SpawnBiomeTypes;
        }
    }

    private LinkedList<OreInfo> oreList;

    public TCOverworldOreGen(){
        oreList = new LinkedList<OreInfo>();
        OreInfo info;

        info = new OreInfo(40, 13, 8, 4, 10, TCInits.glowOre_WHITE, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.HILLS);
            oreList.add(info);
        info = new OreInfo(40, 13, 8, 4, 10, TCInits.glowOre_BLACK, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.HILLS);
            oreList.add(info);
        info = new OreInfo(40, 13, 8, 4, 10, TCInits.glowOre_RED, BiomeDictionary.Type.HOT, BiomeDictionary.Type.BEACH, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.SAVANNA, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.WASTELAND);
            oreList.add(info);
        info = new OreInfo(40, 13, 8, 4, 10, TCInits.glowOre_ORANGE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.BEACH, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.SAVANNA, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.WASTELAND);
            oreList.add(info);
        info = new OreInfo(40, 13, 8, 4, 10, TCInits.glowOre_YELLOW, BiomeDictionary.Type.HOT, BiomeDictionary.Type.BEACH, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.SAVANNA, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.WASTELAND);
            oreList.add(info);
        info = new OreInfo(40, 13, 8, 4, 10, TCInits.glowOre_LIME, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.LUSH, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.FOREST);
            oreList.add(info);
        info = new OreInfo(40, 13, 8, 4, 10, TCInits.glowOre_GREEN, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.LUSH);
            oreList.add(info);
        info = new OreInfo(40, 13, 8, 4, 10, TCInits.glowOre_SKY, BiomeDictionary.Type.BEACH, BiomeDictionary.Type.COLD, BiomeDictionary.Type.OCEAN, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.WATER, BiomeDictionary.Type.RIVER);
            oreList.add(info);
        info = new OreInfo(40, 13, 8, 4, 10, TCInits.glowOre_BLUE, BiomeDictionary.Type.BEACH, BiomeDictionary.Type.COLD, BiomeDictionary.Type.OCEAN, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.WATER, BiomeDictionary.Type.RIVER);
            oreList.add(info);
        info = new OreInfo(40, 13, 8, 4, 10, TCInits.glowOre_LILAC, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.HILLS, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MAGICAL);
            oreList.add(info);
        info = new OreInfo(40, 13, 8, 4, 10, TCInits.glowOre_PURPLE, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.HILLS, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MAGICAL);
            oreList.add(info);
        info = new OreInfo(40, 13, 8, 4, 10, TCInits.glowOre_PINK, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.HILLS, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MAGICAL);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        int x,y,z;
        int numOre;
        int numVein;
        int tcount = 0;
        BiomeGenBase[] biome;
        if (world.provider.dimensionId != 0) {//Only generate in the main world.
            return;
        }
        for(OreInfo info: oreList) {
            tcount++;
            numVein = random.nextInt(info.veinsPerChunk);
            if(numVein == 0 && info.veinsPerChunk != 0){
                numVein = 1;
            }

            for(int count = 0; count < numVein; count++) {
                x = random.nextInt(16);
                z = random.nextInt(16);
                y = random.nextInt(info.maxHeight - info.minHeight);
                x = x + (16 * chunkX);
                z = z + (16 * chunkZ);
                y = y + info.minHeight;
                numOre = MathHelper.clamp_int(random.nextInt(info.maxVein), info.minVein, info.maxVein);

                if(info.spawnBiomeTypes == null){
                    generateOre(world, random, x, y, z, info.oreType, numOre);
                }else{
                    for(int i = 0; i < info.spawnBiomeTypes.length; i++)
                    {
                        biome = BiomeDictionary.getBiomesForType(info.spawnBiomeTypes[i]);
                        if(info.spawnBiomeTypes != null && world.getBiomeGenForCoords(x, z) == biome[i]){
                            generateOre(world, random, x, y, z, info.oreType, numOre);
                        }
                    }
                }
            }
        }
    }

    private void generateOre(World world, Random random, int x, int y, int z, Block blockID, int ntg) {
        int lx, ly, lz;
        lx = x;
        ly = y;
        lz = z;
        Block id;
        id = world.getBlock(x, y, z);
        if (id != Blocks.stone) {
            return;
        }
        for (int i = 0; i < ntg; i++) {
            id = world.getBlock(lx, ly, lz);

            world.setBlock(lx, ly, lz, blockID);
            switch (random.nextInt(3)) {
                case 0:
                    lx = lx + (random.nextInt(4) - 2);
                    break;
                case 1:
                    ly = ly + (random.nextInt(4) - 2);
                    break;
                case 2:
                    lz = lz + (random.nextInt(4) - 2);
                    break;
            }
        }
    }
}
