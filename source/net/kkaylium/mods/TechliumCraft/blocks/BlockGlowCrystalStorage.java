package net.kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.kkaylium.mods.TechliumCraft.TechliumCraft;
import net.kkaylium.mods.TechliumCraft.lib.ModInfo;
import net.kkaylium.mods.TechliumCraft.lib.TCNames;
import net.kkaylium.mods.TechliumCraft.tileentities.TEGlowColor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.IBlockAccess;

/**
 * Created by Kayla Marie on 8/10/14.
 */
public class BlockGlowCrystalStorage extends Block {

    private int colorMade;
    private String[] blockNames = {"white", "black", "red", "orange", "yellow", "lime", "green", "sky", "blue", "lilac", "purple", "pink", "rainbow"};
    public int[] blockColor = new int[]{0xFFFFFF, 0x363638, 0xB81A1A, 0xF0760C, 0xF2D94B, 0x21ED2F, 0x097A25, 0x4CECF5, 0x0010C4, 0xC977FC, 0x6F05B0, 0xFF57C4, 0xEBF2FA};

    public BlockGlowCrystalStorage(int color){
        super(Material.glass);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockName(TCNames.glowCrystalStorageName + "_" + blockNames[color]);
        this.setHardness(1.2F);
        this.setLightLevel(1.0F);
        colorMade = color;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        if(colorMade > 11){
            blockIcon = iconregister.registerIcon(ModInfo.MOD_ID + ":" + "glowCrystalStorage_Rainbow");
        }else{
        blockIcon = iconregister.registerIcon(ModInfo.MOD_ID + ":" + "glowCrystalStorage" + "_" + blockNames[colorMade]);
        }
    }
}
