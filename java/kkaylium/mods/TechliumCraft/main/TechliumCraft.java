package kkaylium.mods.TechliumCraft.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import kkaylium.mods.TechliumCraft.glowglass.GlowGlass;
import kkaylium.mods.TechliumCraft.glowglass.generation.GOreGen;
import kkaylium.mods.TechliumCraft.glowglass.gui.GuiHandler;
import kkaylium.mods.TechliumCraft.glowglass.info.GGRecipes;
import kkaylium.mods.TechliumCraft.glowglass.mobs.EntityRainbowSlime;
import kkaylium.mods.TechliumCraft.glowglass.mobs.EntityRainbowTurtle;
import kkaylium.mods.TechliumCraft.main.info.TCInfo;
import kkaylium.mods.TechliumCraft.main.info.TCInts;
import kkaylium.mods.TechliumCraft.main.proxy.CommonProxy;
import kkaylium.mods.TechliumCraft.main.proxy.GGCreativeTab;
import kkaylium.mods.TechliumCraft.main.proxy.TCCreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;

/**
 * Created by kkaylium on 10/26/14.
 */
@Mod(name= TCInfo.MOD_NAME, modid=TCInfo.MOD_ID, version=TCInfo.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class TechliumCraft {

    @Instance(TCInfo.MOD_ID)
    public static TechliumCraft instance = new TechliumCraft();

    public static GuiHandler guiHandler = new GuiHandler();

    @SidedProxy(clientSide = "kkaylium.mods.TechliumCraft.main.proxy.ClientProxy", serverSide = "kkaylium.mods.TechliumCraft.main.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs GGTab = new GGCreativeTab(CreativeTabs.getNextID(), "GlowGlass");
    public static CreativeTabs TCTab = new TCCreativeTab(CreativeTabs.getNextID(), "TechliumCraft");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        TCInts.glow_crystal_RED_id = config.getItem("Glow Crystal: Red", 1000).getInt();
        TCInts.glow_crystal_ORANGE_id = config.getItem("Glow Crystal: Orange", 1001).getInt();
        TCInts.glow_crystal_YELLOW_id = config.getItem("Glow Crystal: Yellow", 1002).getInt();
        TCInts.glow_crystal_GREEN_id = config.getItem("Glow Crystal: Green", 1003).getInt();
        TCInts.glow_crystal_BLUE_id = config.getItem("Glow Crystal: Blue", 1004).getInt();
        TCInts.glow_crystal_PURPLE_id = config.getItem("Glow Crystal: Purple", 1005).getInt();
        TCInts.glow_crystal_BLACK_id = config.getItem("Glow Crystal: Black", 1006).getInt();
        TCInts.glow_crystal_BROWN_id = config.getItem("Glow Crystal: Brown", 1007).getInt();
        TCInts.glow_crystal_WHITE_id = config.getItem("Glow Crystal: White", 1008).getInt();
        TCInts.glow_crystal_RAINBOW_id = config.getItem("Glow Crystal: Rainbow", 1009).getInt();
        TCInts.glow_crystal_RAW_id = config.getItem("Glow Crystal: Raw", 1010).getInt();

        TCInts.glow_tool_SWORD_id = config.getItem("Glow Tool: Sword", 1011).getInt();
        TCInts.glow_tool_PICKAXE_id = config.getItem("Glow Tool: Pickaxe", 1012).getInt();
        TCInts.glow_tool_AXE_id = config.getItem("Glow Tool: Axe", 1013).getInt();
        TCInts.glow_tool_SHOVEL_id = config.getItem("Glow Tool: Shovel", 1014).getInt();
        TCInts.glow_tool_HOE_id = config.getItem("Glow Tool: Hoe", 1015).getInt();

        TCInts.rainbow_tool_SWORD_id = config.getItem("Rainbow Tool: Sword", 1016).getInt();
        TCInts.rainbow_tool_PICKAXE_id = config.getItem("Rainbow Tool: Pickaxe", 1017).getInt();
        TCInts.rainbow_tool_AXE_id = config.getItem("Rainbow Tool: Axe", 1018).getInt();
        TCInts.rainbow_tool_SHOVEL_id = config.getItem("Rainbow Tool: Shovel", 1019).getInt();
        TCInts.rainbow_tool_HOE_id = config.getItem("Rainbow Tool: Hoe", 1020).getInt();

        TCInts.glow_block_id = config.getBlock("Glow Block", 500).getInt();
        TCInts.glow_glass_id = config.getBlock("Glow Glass", 501).getInt();
        TCInts.glow_fence_id = config.getBlock("Glow Fence", 502).getInt();
        TCInts.glow_ore_id = config.getBlock("Glow Ore", 503).getInt();
        TCInts.glow_leaves_id = config.getBlock("Glow Leaves", 504).getInt();
        TCInts.glow_log_id = config.getBlock("Glow Log", 505).getInt();
        TCInts.glow_planks_id = config.getBlock("Glow Planks", 506).getInt();

        config.save();
    }

    @EventHandler
    public void load(FMLInitializationEvent event){
        NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
        GlowGlass.initGGBlocks();
        GlowGlass.initGGItems();
        GlowGlass.initGGTileEnities();
        GGRecipes.initGGRecipes();
        GameRegistry.registerWorldGenerator(new GOreGen());

        proxy.registerRenderInformation();
        EntityRegistry.registerModEntity(EntityRainbowSlime.class, "RainbowSlime", 2, this, 20, 3, true);
        EntityRegistry.addSpawn(EntityRainbowSlime.class, 5, 2, 3, EnumCreatureType.monster, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.plains);

        EntityRegistry.registerModEntity(EntityRainbowTurtle.class, "RainbowTurtle", 4, this, 20, 3, true);
        EntityRegistry.addSpawn(EntityRainbowTurtle.class, 5, 2, 3, EnumCreatureType.monster, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.plains);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
