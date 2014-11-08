package kkaylium.mods.TechliumCraft.glowglass.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.glowglass.GGInits;
import kkaylium.mods.TechliumCraft.glowglass.info.GGInfo;
import kkaylium.mods.TechliumCraft.main.TechliumCraft;
import kkaylium.mods.TechliumCraft.main.info.TCInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import java.util.Random;

/**
 * Created by kkaylium on 11/4/14.
 */
public class BlockGOre extends Block {

    public BlockGOre(int id, Material material){
        super(id, material);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setLightValue(0.5F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconregister) {
        blockIcon = iconregister.registerIcon(TCInfo.MOD_ID + ":" + GGInfo.glow_ore_name);
    }

    public int quantityDropped(Random rand){
        int random = rand.nextInt(6 - 3)+ 1;
        return random;
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return GGInits.GRawCrystal.itemID;
    }
}
