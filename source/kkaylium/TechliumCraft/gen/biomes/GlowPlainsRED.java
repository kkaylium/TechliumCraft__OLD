package kkaylium.TechliumCraft.gen.biomes;

import kkaylium.TechliumCraft.blocks.BlockGlowDirt;
import kkaylium.TechliumCraft.inits.TCInits;
import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.BiomeEvent;

/**
 * Created by Kayla Marie on 7/7/14.
 */
public class GlowPlainsRED extends BiomeGenBase{

    public WorldGenMinable theWorldGenerator;

    public GlowPlainsRED(int par1){
        super(par1);

        ItemStack redDirt = new ItemStack(TCInits.glowDirt, 2);
        //Surface And Next Few Blocks, Like Grass and Dirt
        this.topBlock = TCInits.glowDirt;
        this.field_150604_aj = 1;
        this.fillerBlock = TCInits.glowStone;
        //Find Stone replacement variable...

        this.theBiomeDecorator.treesPerChunk = 0;
        this.theBiomeDecorator.flowersPerChunk = 5;
        this.theBiomeDecorator.grassPerChunk = 0;
        this.theBiomeDecorator.mushroomsPerChunk = 0;
        this.theBiomeDecorator.bigMushroomsPerChunk = 0;
        this.waterColorMultiplier = 15745542;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();

        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityBat.class, 8, 4, 8));
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityZombie.class, 2, 4, 8));
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityCow.class, 5, 5, 5));

        //Add Other things to spawn here as needed
        //this.theWorldGenerator = new WorldGenMinable(Blocks.lapis_block, 25);
    }

    public int getSkyColorByTemp(float par1){
        return 1;
    }

}
