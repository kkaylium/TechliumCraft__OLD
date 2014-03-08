package kkaylium.TechliumCraft;

import kkaylium.TechliumCraft.creativetabs.GGTab;
import kkaylium.TechliumCraft.creativetabs.TCTab;
import kkaylium.TechliumCraft.inits.BlocksInit;
import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.lib.Strings;
import kkaylium.TechliumCraft.mobs.entities.EntityRainbowSlime;
import kkaylium.TechliumCraft.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

/**
 * 
 * @author kkaylium
 * @version 1.0.1a
 *
 */
@Mod(name = Strings.MOD_NAME, modid = Strings.MOD_ID, version = "1.0.0a")
public class TechliumCraft {
	
	@Instance("techliumcraft")
	public static TechliumCraft instance;
	
	@SidedProxy(clientSide = "kkaylium.TechliumCraft.proxy.ClientProxy", serverSide = "kkaylium.TechliumCraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs GGTab = new GGTab(CreativeTabs.getNextID(), "Glow Glass");
	public static CreativeTabs TCTab = new TCTab(CreativeTabs.getNextID(), "Techlium Craft");
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		//MinecraftForge.EVENT_BUS.register(new DropRainbowCrystals());
		
		//TCBasicRecipes.initBasicRecipes();
		
		//GameRegistry.registerWorldGenerator(new OverworldBiomeOreGen(), 3);
		//MinecraftForge.EVENT_BUS.register(new EventClass());
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		//BiomesInit.biomesInit();
		
		//GameRegistry.registerWorldGenerator(new OverworldTreeGenerator(), 5);
		//GameRegistry.registerWorldGenerator(new GlowLandOreGen(), 4);
		
		//DimensionManager.registerProviderType(Reference.GLOW_LAND_dimensionId, WorldProviderGlowLand.class, true);
		//DimensionManager.registerDimension(Reference.GLOW_LAND_dimensionId, Reference.GLOW_LAND_dimensionId);
		
		//OreDictionary.registerOre(BlocksInit.glowOres.getUnlocalizedName(), new ItemStack(ItemsInit.glowCrystals));
		
		BlocksInit.blocksInit();
		BlocksInit.registerTileEntities();
		ItemsInit.initItems();
		
//		proxy.registerRenderInformation();
//		EntityRegistry.registerModEntity(EntityRainbowSlime.class, "RainbowSlime", 2, this, 40, 3, true);
//        EntityRegistry.addSpawn(EntityRainbowSlime.class, 2, 1, 3, EnumCreatureType.monster, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.plains);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
