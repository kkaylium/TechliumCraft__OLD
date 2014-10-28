package kkaylium.mods.TechliumCraft.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import kkaylium.mods.TechliumCraft.glowglass.GGInits;
import kkaylium.mods.TechliumCraft.glowglass.GlowGlass;
import kkaylium.mods.TechliumCraft.main.info.TCInfo;
import kkaylium.mods.TechliumCraft.main.info.TCInts;
import kkaylium.mods.TechliumCraft.main.proxy.CommonProxy;
import kkaylium.mods.TechliumCraft.main.proxy.GGCreativeTab;
import kkaylium.mods.TechliumCraft.main.proxy.TCCreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;

/**
 * Created by kkaylium on 10/26/14.
 */
@Mod(name= TCInfo.MOD_NAME, modid=TCInfo.MOD_ID, version=TCInfo.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class TechliumCraft {

    @Instance(TCInfo.MOD_ID)
    public static TechliumCraft instance;

    @SidedProxy(clientSide = "kkaylium.mods.TechliumCraft.main.proxy.ClientProxy", serverSide = "kkaylium.mods.TechliumCraft.main.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs GGTab = new GGCreativeTab(CreativeTabs.getNextID(), "GlowGlass");
    public static CreativeTabs TCTab = new TCCreativeTab(CreativeTabs.getNextID(), "TechliumCraft");

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event){

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

        TCInts.glow_block_id = config.getBlock("Glow Block", 500).getInt();
        TCInts.glow_glass_id = config.getBlock("Glow Glass", 501).getInt();

        config.save();



        GlowGlass.initGGBlocks();
        GlowGlass.initGGItems();
        GlowGlass.initGGTileEnities();
    }

    @EventHandler
    public static void load(FMLInitializationEvent event){

    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event){

    }
}
