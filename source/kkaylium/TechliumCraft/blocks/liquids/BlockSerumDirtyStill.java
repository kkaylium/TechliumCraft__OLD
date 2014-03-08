package kkaylium.TechliumCraft.blocks.liquids;

import kkaylium.TechliumCraft.lib.Strings;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSerumDirtyStill extends BlockStaticLiquid{

	private IIcon[] theIcon;

	public BlockSerumDirtyStill(Material par2Material) {
		super(par2Material);
		this.disableStats();
		this.setHardness(100.0F);
		this.setLightOpacity(3);
		this.setLightLevel(1.0F);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.theIcon = new IIcon[] {
                iconRegister.registerIcon(Strings.MOD_ID + ":SerumDirtyStill"),
                iconRegister.registerIcon(Strings.MOD_ID + ":SerumDirtyFlowing") };
    }

}
