package kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.init.TCInits;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

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
        this.setStepSound(soundTypeStone);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        blockIcon = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "DO");
    }

    public int quantityDropped(Random rand)
    {
        int random = rand.nextInt(5 - 2) + 2;
        return random;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return TCInits.darkCrystal_RAW;
    }

}
