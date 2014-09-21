package kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Kayla Marie on 9/9/14.
 */
public class BlockGlowTorches extends Block {

    public BlockGlowTorches(){
        super(Material.wood);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockName(TCNames.glowTorchName);
        this.setLightLevel(1.0F);
        this.setBlockBounds(0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir){
        blockIcon = ir.registerIcon(TCInfo.MOD_ID + ":" + TCNames.glowTorchName);
    }
}
