package kkaylium.TechliumCraft.gen.dimention.darkLand;

import kkaylium.TechliumCraft.inits.TCInits;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Created by Kayla Marie on 6/1/14.
 */
public class DLBiomeBlue extends BiomeGenBase {

    public DLBiomeBlue(int par1) {
        super(par1);

        this.heightVariation = 2F;
        this.rootHeight = 0.5F;
        this.waterColorMultiplier = 0xFFFFFF;
        this.temperature = 0.5F;
        this.enableRain = false;
        this.topBlock = Blocks.diamond_block;
        this.fillerBlock = Blocks.coal_block;
        this.setBiomeName("Dark Biome: Blue");
    }
}
