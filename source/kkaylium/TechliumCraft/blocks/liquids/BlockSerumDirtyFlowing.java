package kkaylium.TechliumCraft.blocks.liquids;

import kkaylium.TechliumCraft.lib.Strings;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSerumDirtyFlowing extends BlockFalling{

	public BlockSerumDirtyFlowing(Material par2Material) {
		super(par2Material);
		this.setHardness(100.0F);
		this.setLightOpacity(3);
		this.setLightLevel(1.0F);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        IIcon[] theIcon = new IIcon[] {
                iconRegister.registerIcon(Strings.MOD_ID + ":SerumDirtyStill"),
                iconRegister.registerIcon(Strings.MOD_ID + ":SerumDirtyFlowing") };
    }
}
