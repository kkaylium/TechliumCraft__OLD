package net.kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.kkaylium.mods.TechliumCraft.TechliumCraft;
import net.kkaylium.mods.TechliumCraft.lib.ModInfo;
import net.kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Kayla Marie on 7/30/14.
 */
public class BlockDarkOre extends Block {

    public BlockDarkOre(){
        super(Material.rock);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockName(TCNames.darkOreName);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        blockIcon = iconregister.registerIcon(ModInfo.MOD_ID + ":" + "DO");
    }
}
