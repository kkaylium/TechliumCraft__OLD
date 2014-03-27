package kkaylium.TechliumCraft.inits;

import kkaylium.TechliumCraft.blocks.BlockDarkBlock;
import kkaylium.TechliumCraft.blocks.BlockGlowBlock;
import kkaylium.TechliumCraft.blocks.BlockGlowDirt;
import kkaylium.TechliumCraft.blocks.BlockGlowDoor;
import kkaylium.TechliumCraft.blocks.BlockGlowFence;
import kkaylium.TechliumCraft.blocks.BlockGlowGlass;
import kkaylium.TechliumCraft.blocks.BlockGlowLeaves;
import kkaylium.TechliumCraft.blocks.BlockGlowLog;
import kkaylium.TechliumCraft.blocks.BlockGlowOre;
import kkaylium.TechliumCraft.blocks.BlockGlowPlanks;
import kkaylium.TechliumCraft.blocks.BlockGlowStone;
import kkaylium.TechliumCraft.blocks.ItemBlockGlowDirt;
import kkaylium.TechliumCraft.blocks.ItemBlockGlowOre;
import kkaylium.TechliumCraft.blocks.ItemBlockGlowStone;
import kkaylium.TechliumCraft.blocks.liquids.BlockSerumDirtyFlowing;
import kkaylium.TechliumCraft.blocks.liquids.BlockSerumDirtyStill;
import kkaylium.TechliumCraft.blocks.machines.BlockInfuserT1;
import kkaylium.TechliumCraft.lib.Strings;
import kkaylium.TechliumCraft.tileentities.TileEntityDarkBlock;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowBlock;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowFence;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowGlass;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowPlanks;
import kkaylium.TechliumCraft.tileentities.TileEntityInfuserT1;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * 
 * @author kkaylium
 * @version 1.0.1a
 *
 */
public class BlocksInit {

	public static Block glowOres;
	public static Block glowDirt;
	public static Block glowStone;
	public static Block glowLog;
	public static Block glowLeaves;
	public static Block glowSapling;
	public static Block glowPlanks;
	public static Block glowLandPortal;
	
	public static Block glowBlock;
	public static Block glowGlass;
	public static Block glowFence;
	public static Block glowGate;
	public static Block glowDoor;
	
	public static Block darkBlock;
	
	public static Block infuserT1;
	
	public static Block serumDirtyStill;
	public static BlockLiquid serumDirtyFlowing;
	
	public static Block liquidPipeSolid;
	public static Block liquidPipeTranparent;
	
	public static void blocksInit()
	{
		glowOres = new BlockGlowOre().setBlockName(Strings.GLOW_BLOCK_KEY);
			GameRegistry.registerBlock(glowOres, ItemBlockGlowOre.class, Strings.GLOW_ORE_KEY);
		glowDirt = new BlockGlowDirt().setBlockName(Strings.GLOW_DIRT_KEY);
			GameRegistry.registerBlock(glowDirt, ItemBlockGlowDirt.class, Strings.GLOW_DIRT_KEY);
		glowStone = new BlockGlowStone().setBlockName(Strings.GLOW_STONE_KEY);
			GameRegistry.registerBlock(glowStone, ItemBlockGlowStone.class, Strings.GLOW_STONE_KEY);
		glowLog = new BlockGlowLog().setBlockName(Strings.GLOW_LOG_KEY).setBlockTextureName(Strings.MOD_ID + ":" + Strings.GLOW_LOG_KEY);
			GameRegistry.registerBlock(glowLog, Strings.GLOW_LOG_KEY);
		glowLeaves = new BlockGlowLeaves().setBlockName(Strings.GLOW_LEAVES_KEY).setBlockTextureName(Strings.MOD_ID + ":" + Strings.GLOW_LEAVES_KEY);
			GameRegistry.registerBlock(glowLeaves, Strings.GLOW_LEAVES_KEY);
//		glowSapling = new BlockGlowSapling(BlockIds.GLOW_SAPLING_ID).setBlockName(Strings.GLOW_SAPLING_KEY).setBlockTextureName(Strings.MOD_ID + ":" + Strings.GLOW_SAPLING_KEY);
//			GameRegistry.registerBlock(glowSapling, Strings.GLOW_SAPLING_KEY);
		glowPlanks = new BlockGlowPlanks().setBlockName(Strings.GLOW_PLANKS_KEY).setBlockTextureName(Strings.MOD_ID + ":" + Strings.GLOW_PLANKS_KEY);
			GameRegistry.registerBlock(glowPlanks, Strings.GLOW_PLANKS_KEY);
		glowBlock = new BlockGlowBlock().setBlockName(Strings.GLOW_BLOCK_KEY);
			GameRegistry.registerBlock(glowBlock, Strings.GLOW_BLOCK_KEY);
		glowGlass = new BlockGlowGlass().setBlockName(Strings.GLOW_GLASS_KEY);
			GameRegistry.registerBlock(glowGlass, Strings.GLOW_GLASS_KEY);
		glowFence = new BlockGlowFence(Strings.GLOW_FENCE_KEY).setBlockName(Strings.GLOW_FENCE_KEY);
			GameRegistry.registerBlock(glowFence, Strings.GLOW_FENCE_KEY);
		glowDoor = new BlockGlowDoor().setBlockName(Strings.GLOW_DOOR_ITEM_KEY);
			GameRegistry.registerBlock(glowDoor, Strings.GLOW_DOOR_KEY);
			
		darkBlock = new BlockDarkBlock().setBlockName("hi");
			GameRegistry.registerBlock(darkBlock, "hi");
			
		infuserT1 = new BlockInfuserT1().setBlockName("infuserT1");
			GameRegistry.registerBlock(infuserT1, "infuserL1");
			
		serumDirtyStill = new BlockSerumDirtyStill(Material.water).setBlockName(Strings.SERUM_DIRTY_STILL_KEY).setBlockTextureName(Strings.MOD_ID + ":" + Strings.SERUM_DIRTY_STILL_KEY);
			GameRegistry.registerBlock(serumDirtyStill, Strings.SERUM_DIRTY_STILL_KEY);
		serumDirtyFlowing = (BlockLiquid) new BlockSerumDirtyFlowing(Material.water).setBlockName(Strings.SERUM_DIRTY_FLOWING_KEY).setBlockTextureName(Strings.MOD_ID + ":" + Strings.SERUM_DIRTY_FLOWING_KEY);
			GameRegistry.registerBlock(serumDirtyFlowing, Strings.SERUM_DIRTY_FLOWING_KEY);
	}
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityGlowBlock.class, Strings.TE_GLOW_BLOCK_KEY);
		GameRegistry.registerTileEntity(TileEntityGlowGlass.class, Strings.TE_GLOW_GLASS_KEY);
		GameRegistry.registerTileEntity(TileEntityGlowPlanks.class, Strings.TE_GLOW_PLANKS_KEY);
		GameRegistry.registerTileEntity(TileEntityGlowFence.class, Strings.TE_GLOW_FENCE_KEY);
		GameRegistry.registerTileEntity(TileEntityGlowFence.class, Strings.TE_GLOW_DOOR_KEY);
		GameRegistry.registerTileEntity(TileEntityInfuserT1.class, "TileEntityInfuserT1");
		
		GameRegistry.registerTileEntity(TileEntityDarkBlock.class, "TEDark");
	}

}
