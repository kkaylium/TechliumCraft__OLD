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
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

/**
 * Created by Kayla Marie on 8/4/14.
 */
public class BlockGenLeaves extends Block {

    public int colorType;

    public BlockGenLeaves(int colorChoice){
        super(Material.leaves);
        this.setCreativeTab(TechliumCraft.GGTab);
        if(colorChoice == 0){
            this.setBlockName(TCNames.glowGenLeavesName);
        }else{
            this.setBlockName(TCNames.darkGenLeavesName);
        }
        colorType = colorChoice;

        this.setStepSound(soundTypeGrass);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        if(colorType == 0){
            blockIcon = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "glowLeaves");
        }else{
            blockIcon = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "darkLeaves");
        }
    }

    @Override
    public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z){
        if(colorType == 0){
                Random r = new Random();
                int rand = r.nextInt(TCInfo.GLOW_COLORS.length - 1 - 1) + 1;
                return TCInfo.GLOW_COLORS[rand - 1];
        }else if(colorType == 1){
                Random r = new Random();
                int rand = r.nextInt(TCInfo.DARK_COLORS.length - 1 - 1) + 1;
                return TCInfo.DARK_COLORS[rand - 1];
        }else{
            return TCInfo.GLOW_COLORS[15];
        }
    }

    @Override
    public int getRenderBlockPass() {
        return 0;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        Item leaves = new ItemStack(TCInits.glowLeaves).getItem();
        return leaves;
    }

}
