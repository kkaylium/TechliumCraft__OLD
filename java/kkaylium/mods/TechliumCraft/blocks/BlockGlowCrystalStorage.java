package kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by Kayla Marie on 8/10/14.
 */
public class BlockGlowCrystalStorage extends Block {

    private int colorMade;
    private IIcon[] textures = new IIcon[17];

    public BlockGlowCrystalStorage(int color){
        super(Material.glass);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockName(TCNames.glowCrystalStorageName + "_" + TCInfo.COLOR_NAMES[color]);
        this.setHardness(1.2F);
        this.setLightLevel(1.0F);
        colorMade = color;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        for(int i = 0; i < textures.length; i++){
            textures[i] = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "glowCrystalStorage" + "_" + TCInfo.COLOR_NAMES[colorMade]);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return textures[colorMade];
    }
}
