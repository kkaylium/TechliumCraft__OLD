package kkaylium.mods.TechliumCraft.gen.glowdimension.biomes;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.gen.structures.StructureRainbow;
import kkaylium.mods.TechliumCraft.glowglass.mobs.EntityRainbowSlime;
import kkaylium.mods.TechliumCraft.glowglass.mobs.EntityRainbowTurtle;
import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

/**
 * Created by Kayla Marie on 8/8/14.
 */
public class BiomeGlow extends BiomeGenBase {

    private int setColor;

    public BiomeGlow(int id, int color, Block block) {
        super(id);
        setColor = color;
        //Surface And Next Few Blocks, Like Grass and Dirt
        topBlock = block;
        fillerBlock = Blocks.dirt;
        //Find Stone replacement variable...

        theBiomeDecorator.treesPerChunk = 4;
        theBiomeDecorator.flowersPerChunk = 10;
        theBiomeDecorator.grassPerChunk = 3;
        theBiomeDecorator.mushroomsPerChunk = 0;
        theBiomeDecorator.bigMushroomsPerChunk = 0;
        waterColorMultiplier = color;
        spawnableMonsterList.clear();
        spawnableCreatureList.clear();
        spawnableWaterCreatureList.clear();

        spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 3, 5, 5));
        spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 4, 5, 5));
        spawnableCreatureList.add(new SpawnListEntry(EntityMooshroom.class, 5, 5, 5));
        spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 6, 5, 5));
        spawnableCreatureList.add(new SpawnListEntry(EntityRainbowSlime.class, 7, 20, 20));
        spawnableCreatureList.add(new SpawnListEntry(EntityRainbowTurtle.class, 8, 20, 20));
    }

    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);

        if (par2Random.nextInt(42) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            StructureRainbow structureRainbow = new StructureRainbow();
//            GlowTreeGen glowTreeGen = new GlowTreeGen();
//            DarkTreeGen darkTreeGen = new DarkTreeGen();
            structureRainbow.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
//            glowTreeGen.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
//            darkTreeGen.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        }
        if (par2Random.nextInt(16) == 2)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            WorldGenDungeons worldgendungeons = new WorldGenDungeons();
            worldgendungeons.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getBiomeFoliageColor(int p_150571_1_, int p_150571_2_, int p_150571_3_) {
        return setColor;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getBiomeGrassColor(int p_150558_1_, int p_150558_2_, int p_150558_3_) {
        return setColor;
    }
}
