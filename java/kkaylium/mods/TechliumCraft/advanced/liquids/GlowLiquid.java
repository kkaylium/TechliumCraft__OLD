package kkaylium.mods.TechliumCraft.advanced.liquids;

import kkaylium.mods.TechliumCraft.advanced.AdvancedInits;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by kkaylium on 11/25/2014.
 */
public class GlowLiquid extends BlockFluidClassic {

    public GlowLiquid() {
        super(AdvancedInits.glowFluid, Material.water);
        this.setBlockUnbreakable();
        this.setBlockTextureName(TCInfo.MOD_ID + ":fluid_glow");
    }
}
