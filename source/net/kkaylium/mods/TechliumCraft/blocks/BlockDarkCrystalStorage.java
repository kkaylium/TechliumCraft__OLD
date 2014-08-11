package net.kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.kkaylium.mods.TechliumCraft.TechliumCraft;
import net.kkaylium.mods.TechliumCraft.lib.ModInfo;
import net.kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.IBlockAccess;

/**
 * Created by Kayla Marie on 8/10/14.
 */
public class BlockDarkCrystalStorage extends Block {

    private int colorMade;
    private String[] blockNames = {"white", "black", "red", "orange", "yellow", "lime", "green", "sky", "blue", "lilac", "purple", "pink", "rainbow", "raw"};
    public int[] blockColor = new int[]{0xE3E3E3, 0x252526, 0x941313, 0xC96208, 0xDBC232, 0x00D60F, 0x065C1C, 0x31AEB5, 0x07128C, 0xA25ECC, 0x5A078C, 0xC94099, 0xEBF2FA};

    public BlockDarkCrystalStorage(int color){
        super(Material.glass);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockName(TCNames.darkCrystalStorageName + "_" + blockNames[color]);
        this.setHardness(1.2F);
        this.setLightLevel(1.0F);

        colorMade = color;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        if(colorMade == 12){
            blockIcon = iconregister.registerIcon(ModInfo.MOD_ID + ":" + "darkCrystalStorage_Rainbow");
        }else if(colorMade == 13){
            blockIcon = iconregister.registerIcon(ModInfo.MOD_ID + ":" + "darkCrystalStorage_Raw");
        }else{
            blockIcon = iconregister.registerIcon(ModInfo.MOD_ID + ":" + "darkCrystalStorage" + "_" + blockColor[colorMade]);
        }
    }
}
