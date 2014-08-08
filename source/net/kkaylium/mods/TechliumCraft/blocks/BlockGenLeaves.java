package net.kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.kkaylium.mods.TechliumCraft.TechliumCraft;
import net.kkaylium.mods.TechliumCraft.init.TCInits;
import net.kkaylium.mods.TechliumCraft.lib.ModInfo;
import net.kkaylium.mods.TechliumCraft.lib.TCNames;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Kayla Marie on 8/4/14.
 */
public class BlockGenLeaves extends Block {

    public int[] blockColorGlow = new int[]{0xFFFFFF, 0x363638, 0xB81A1A, 0xF0760C, 0xF2D94B, 0x21ED2F, 0x097A25, 0x4CECF5, 0x0010C4, 0xC977FC, 0x6F05B0, 0xFF57C4, 0xEBF2FA};
    public int[] blockColorDark = new int[]{0xE3E3E3, 0x111112, 0x5C0505, 0x8F4504, 0xA38C07, 0x0F8C18, 0x022E0D, 0x127A80, 0x03083D, 0x6A2694, 0x390459, 0x80062F, 0xEBF2FA};
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
            blockIcon = iconregister.registerIcon(ModInfo.MOD_ID + ":" + "glowLeaves");
        }else{
            blockIcon = iconregister.registerIcon(ModInfo.MOD_ID + ":" + "darkLeaves");
        }
    }

    @Override
    public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z){
        if(colorType == 0){
                Random r = new Random();
                int rand = r.nextInt(12 - 1) + 1;
                return blockColorGlow[rand - 1];
        }else if(colorType == 1){
                Random r = new Random();
                int rand = r.nextInt(12 - 1) + 1;
                return blockColorDark[rand - 1];
        }else{
            return blockColorGlow[5];
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
