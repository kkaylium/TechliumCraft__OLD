package kkaylium.mods.TechliumCraft.init.gen;

import kkaylium.mods.TechliumCraft.gen.glowdimension.biomes.BiomeGlow;
import kkaylium.mods.TechliumCraft.init.TCInits;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Created by Kayla Marie on 8/8/14.
 */
public class TCBiomeInits {

    public static BiomeGenBase GlowBiome_WHITE = (new BiomeGlow(80, 0xF0F0F0, TCInits.glowDirt_WHITE)).setBiomeName("Glow Biome: White");
    public static BiomeGenBase GlowBiome_BLACK = (new BiomeGlow(81, 0x242424, TCInits.glowDirt_BLACK)).setBiomeName("Glow Biome: Black");
    public static BiomeGenBase GlowBiome_RED = (new BiomeGlow(82, 0xF50000, TCInits.glowDirt_RED)).setBiomeName("Glow Biome: Red");
    public static BiomeGenBase GlowBiome_ORANGE = (new BiomeGlow(83, 0xFF7300, TCInits.glowDirt_ORANGE)).setBiomeName("Glow Biome: Orange");
    public static BiomeGenBase GlowBiome_YELLOW = (new BiomeGlow(84, 0xFFED2B, TCInits.glowDirt_YELLOW)).setBiomeName("Glow Biome: Yellow");
    public static BiomeGenBase GlowBiome_LIME = (new BiomeGlow(85, 0x67FF2B, TCInits.glowDirt_LIME)).setBiomeName("Glow Biome: Lime");
    public static BiomeGenBase GlowBiome_GREEN = (new BiomeGlow(86, 0x2A9400, TCInits.glowDirt_GREEN)).setBiomeName("Glow Biome: Green");
    public static BiomeGenBase GlowBiome_SKY = (new BiomeGlow(87, 0x29FFF4, TCInits.glowDirt_SKY)).setBiomeName("Glow Biome: Sky");
    public static BiomeGenBase GlowBiome_BLUE = (new BiomeGlow(88, 0x0003B3, TCInits.glowDirt_BLUE)).setBiomeName("Glow Biome: Blue");
    public static BiomeGenBase GlowBiome_LILAC = (new BiomeGlow(89, 0xB86BFF, TCInits.glowDirt_LILAC)).setBiomeName("Glow Biome: Lilac");
    public static BiomeGenBase GlowBiome_PURPLE = (new BiomeGlow(90, 0x3D0066, TCInits.glowDirt_PURPLE)).setBiomeName("Glow Biome: Purple");
    public static BiomeGenBase GlowBiome_PINK = (new BiomeGlow(91, 0xDB0066, TCInits.glowDirt_PINK)).setBiomeName("Glow Biome: Pink");

    //public static BiomeGenBase[] biomesCopy;

    public static void initBiomes(){

//        try{
//            Field biomesField = BiomeGenBase.class.getDeclaredField("biomeList");
//            biomesField.setAccessible(true);
//            biomesCopy = ((BiomeGenBase[])biomesField.get(null)).clone();
//        }catch(Exception e){
//        }

    }
}
