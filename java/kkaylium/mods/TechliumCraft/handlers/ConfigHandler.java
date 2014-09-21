package kkaylium.mods.TechliumCraft.handlers;

import net.minecraftforge.common.config.Configuration;

/**
 * Created by Kayla Marie on 8/31/14.
 */
public class ConfigHandler {

    public static String general = "General";
    public static String biomes = "Biomes";
    public static String dimensions = "Dimensions";
    public static String oreconfigurations = "Ore Configuration";

    public static boolean whiteBiome;
    public static boolean blackBiome;
    public static boolean redBiome;
    public static boolean orangeBiome;
    public static boolean yellowBiome;
    public static boolean limeBiome;
    public static boolean greenBiome;
    public static boolean skyBiome;
    public static boolean blueBiome;
    public static boolean lilacBiome;
    public static boolean purpleBiome;
    public static boolean pinkBiome;

    public static int glowDimensionID;

    public static void configOptions(Configuration config) {
        config.load();
        config.addCustomCategoryComment(biomes, " - Enable/Disable different colors");
        whiteBiome = config.get(biomes, "Enable White Biome", true).getBoolean(whiteBiome);
        blackBiome = config.get(biomes, "Enable Black Biome", true).getBoolean(blackBiome);
        redBiome = config.get(biomes, "Enable Red Biome", true).getBoolean(redBiome);
        orangeBiome = config.get(biomes, "Enable Orange Biome", true).getBoolean(orangeBiome);
        yellowBiome = config.get(biomes, "Enable Yellow Biome", true).getBoolean(yellowBiome);
        limeBiome = config.get(biomes, "Enable Lime Biome", true).getBoolean(limeBiome);
        greenBiome = config.get(biomes, "Enable Green Biome", true).getBoolean(greenBiome);
        skyBiome = config.get(biomes, "Enable Sky Biome", true).getBoolean(skyBiome);
        blueBiome = config.get(biomes, "Enable Blue Biome", true).getBoolean(blueBiome);
        lilacBiome = config.get(biomes, "Enable Lilac Biome", true).getBoolean(lilacBiome);
        purpleBiome = config.get(biomes, "Enable Purple Biome", true).getBoolean(purpleBiome);
        pinkBiome = config.get(biomes, "Enable Pink Biome", true).getBoolean(pinkBiome);

        glowDimensionID = config.get(dimensions, "Rainbow Kingdom", -16).getInt(glowDimensionID);

        if (config.hasChanged()) config.save();
    }
}
