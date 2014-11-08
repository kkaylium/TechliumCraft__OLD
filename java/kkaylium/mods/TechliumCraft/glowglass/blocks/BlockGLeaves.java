package kkaylium.mods.TechliumCraft.glowglass.blocks;

import kkaylium.mods.TechliumCraft.glowglass.info.GGInfo;
import kkaylium.mods.TechliumCraft.main.TechliumCraft;
import kkaylium.mods.TechliumCraft.main.info.TCInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

/**
 * Created by kkaylium on 11/5/14.
 */
public class BlockGLeaves extends Block {

    public BlockGLeaves(int id, Material material){
        super(id, material);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setLightValue(0.5F);
    }

    public void registerIcons(IconRegister ir){
        this.blockIcon = ir.registerIcon(TCInfo.MOD_ID + ":" + GGInfo.glow_leaves_name);
    }
}
