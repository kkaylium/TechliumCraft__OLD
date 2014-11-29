package kkaylium.mods.TechliumCraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import kkaylium.mods.TechliumCraft.advanced.Advanced;
import kkaylium.mods.TechliumCraft.advanced.AdvancedInits;
import kkaylium.mods.TechliumCraft.creativetabs.GlowGlassTab;
import kkaylium.mods.TechliumCraft.creativetabs.TechliumCraftTab;
import kkaylium.mods.TechliumCraft.gen.OverworldOreGen;
import kkaylium.mods.TechliumCraft.gen.glowdimension.GDWorldProvider;
import kkaylium.mods.TechliumCraft.glowglass.GlowGlass;
import kkaylium.mods.TechliumCraft.glowglass.generation.GOreGen;
import kkaylium.mods.TechliumCraft.glowglass.gui.GuiHandler;
import kkaylium.mods.TechliumCraft.glowglass.info.GGRecipes;
import kkaylium.mods.TechliumCraft.handlers.ConfigHandler;
import kkaylium.mods.TechliumCraft.init.gen.TCBiomeInits;
import kkaylium.mods.TechliumCraft.init.recipes.TCRecipes;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.glowglass.mobs.*;
import kkaylium.mods.TechliumCraft.proxy.CommonProxy;
import kkaylium.mods.TechliumCraft.util.ObfHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.config.Configuration;

import java.util.logging.Logger;

/**
 *
 * @author kkaylium
 * @version 1.0.1a
 *
 */
@Mod(name = TCInfo.MOD_NAME, modid = TCInfo.MOD_ID, version = "0.0.4a")
public class TechliumCraft {

    public static final Logger logger = Logger.getLogger("TechliumCraft");

    Configuration config;

    @Mod.Instance("techliumcraft")
    public static TechliumCraft instance;

    public static GuiHandler guiHandler = new GuiHandler();

    @SidedProxy(clientSide = "kkaylium.mods.TechliumCraft.proxy.ClientProxy", serverSide = "kkaylium.mods.TechliumCraft.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs GGTab = new GlowGlassTab(CreativeTabs.getNextID(), "Glow Glass");
    public static CreativeTabs TCTab = new TechliumCraftTab(CreativeTabs.getNextID(), "Techlium Craft");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        config = new Configuration(event.getSuggestedConfigurationFile());
        ConfigHandler.configOptions(config);
        Advanced.initFluids();
        GlowGlass.initGGBlocks();
        GlowGlass.initGGItems();
        GlowGlass.initGGTileEnities();
        Advanced.initBlocks();
        ObfHelper.init();
        proxy.load();
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(this, guiHandler);

        proxy.registerRenderInformation();
        EntityRegistry.registerModEntity(EntityRainbowSlime.class, "RainbowSlime", 2, this, 20, 3, true);
        EntityRegistry.addSpawn(EntityRainbowSlime.class, 5, 2, 3, EnumCreatureType.monster, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.plains);

        EntityRegistry.registerModEntity(EntityRainbowTurtle.class, "RainbowTurtle", 4, this, 20, 3, true);
        EntityRegistry.addSpawn(EntityRainbowTurtle.class, 5, 2, 3, EnumCreatureType.monster, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.plains);

        GameRegistry.registerWorldGenerator(new GOreGen(), 3);
        TCBiomeInits.initBiomes();

        GGRecipes.initGGRecipes();
        //TCRecipes.initRecipes();

        DimensionManager.registerProviderType(ConfigHandler.glowDimensionID, GDWorldProvider.class, true);
        DimensionManager.registerDimension(ConfigHandler.glowDimensionID, ConfigHandler.glowDimensionID);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
