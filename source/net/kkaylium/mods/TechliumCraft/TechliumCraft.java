package net.kkaylium.mods.TechliumCraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.kkaylium.mods.TechliumCraft.creativetabs.GlowGlassTab;
import net.kkaylium.mods.TechliumCraft.creativetabs.TechliumCraftTab;
import net.kkaylium.mods.TechliumCraft.gen.OverworldOreGen;
import net.kkaylium.mods.TechliumCraft.init.TCRegisters;
import net.kkaylium.mods.TechliumCraft.lib.ModInfo;
import net.kkaylium.mods.TechliumCraft.mobs.EntityDarkSlime;
import net.kkaylium.mods.TechliumCraft.mobs.EntityDarkTurtle;
import net.kkaylium.mods.TechliumCraft.mobs.EntityRainbowSlime;
import net.kkaylium.mods.TechliumCraft.mobs.EntityRainbowTurtle;
import net.kkaylium.mods.TechliumCraft.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.logging.Logger;

/**
 *
 * @author kkaylium
 * @version 1.0.1a
 *
 */
@Mod(name = ModInfo.MOD_NAME, modid = ModInfo.MOD_ID, version = "1.0.0a")
public class TechliumCraft {

    public static final Logger logger = Logger.getLogger("TechliumCraft");

    @Mod.Instance("techliumcraft")
    public static TechliumCraft instance;

    @SidedProxy(clientSide = "net.kkaylium.mods.TechliumCraft.proxy.ClientProxy", serverSide = "net.kkaylium.mods.TechliumCraft.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs GGTab = new GlowGlassTab(CreativeTabs.getNextID(), "Glow Glass");
    public static CreativeTabs TCTab = new TechliumCraftTab(CreativeTabs.getNextID(), "Techlium Craft");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        TCRegisters.registerItems();
        TCRegisters.registerBlocks();

        TCRegisters.registerTileEntities();
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        //TODO Fix biome type specific ore generation!
        GameRegistry.registerWorldGenerator(new OverworldOreGen(), 3);

        proxy.registerRenderInformation();
        EntityRegistry.registerModEntity(EntityRainbowSlime.class, "RainbowSlime", 2, this, 20, 3, true);
        EntityRegistry.addSpawn(EntityRainbowSlime.class, 5, 2, 3, EnumCreatureType.monster, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.plains);
        EntityRegistry.registerModEntity(EntityDarkSlime.class, "DarkSlime", 3, this, 20, 3, true);
        EntityRegistry.addSpawn(EntityDarkSlime.class, 5, 2, 3, EnumCreatureType.monster, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.desertHills);

        EntityRegistry.registerModEntity(EntityRainbowTurtle.class, "RainbowTurtle", 4, this, 20, 3, true);
        EntityRegistry.addSpawn(EntityRainbowTurtle.class, 5, 2, 3, EnumCreatureType.monster, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.plains);
        EntityRegistry.registerModEntity(EntityDarkTurtle.class, "DarkTurtle", 5, this, 20, 3, true);
        EntityRegistry.addSpawn(EntityDarkTurtle.class, 5, 2, 3, EnumCreatureType.monster, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.desertHills);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
