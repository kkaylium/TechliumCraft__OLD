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
