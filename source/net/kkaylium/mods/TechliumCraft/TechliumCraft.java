package net.kkaylium.mods.TechliumCraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.kkaylium.mods.TechliumCraft.creativetabs.GlowGlassTab;
import net.kkaylium.mods.TechliumCraft.creativetabs.TechliumCraftTab;
import net.kkaylium.mods.TechliumCraft.gen.TCOverworldOreGen;
import net.kkaylium.mods.TechliumCraft.init.TCRegisters;
import net.kkaylium.mods.TechliumCraft.lib.ModInfo;
import net.kkaylium.mods.TechliumCraft.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;

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
        //GameRegistry.registerWorldGenerator(new TCOverworldOreGen(), 3);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
