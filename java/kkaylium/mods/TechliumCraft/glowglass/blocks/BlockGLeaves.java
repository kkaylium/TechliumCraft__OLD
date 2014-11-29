package kkaylium.mods.TechliumCraft.glowglass.blocks;

import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.glowglass.info.GGInfo;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by kkaylium on 11/5/14.
 */
public class BlockGLeaves extends Block {

    public BlockGLeaves(Material material){
        super(material);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setLightLevel(0.5F);
    }

    public void registerBlockIcons(IIconRegister ir){
        this.blockIcon = ir.registerIcon(TCInfo.MOD_ID + ":" + GGInfo.glow_leaves_name);
    }
}
