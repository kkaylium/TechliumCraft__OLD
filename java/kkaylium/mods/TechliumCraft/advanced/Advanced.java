package kkaylium.mods.TechliumCraft.advanced;

import cpw.mods.fml.common.registry.GameRegistry;
import kkaylium.mods.TechliumCraft.advanced.liquids.DarkLiquid;
import kkaylium.mods.TechliumCraft.advanced.liquids.FluidDark;
import kkaylium.mods.TechliumCraft.advanced.liquids.FluidGlow;
import kkaylium.mods.TechliumCraft.advanced.liquids.GlowLiquid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by kkaylium on 11/19/2014.
 */
public class Advanced {

    public static void initFluids(){
        AdvancedInits.glowFluid = new FluidGlow();
        FluidRegistry.registerFluid(AdvancedInits.glowFluid);

        AdvancedInits.darkFluid = new FluidDark();
        FluidRegistry.registerFluid(AdvancedInits.darkFluid);
    }

    public static void initBlocks(){
        AdvancedInits.glowFluidBlock = new GlowLiquid().setBlockName("fluidblock_glow");
        GameRegistry.registerBlock(AdvancedInits.glowFluidBlock, "fluidblock_glow");

        AdvancedInits.darkFluidBlock = new DarkLiquid().setBlockName("fluidblock_dark");
        GameRegistry.registerBlock(AdvancedInits.darkFluidBlock, "fluidblock_dark");
    }
}
