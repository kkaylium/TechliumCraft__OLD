package kkaylium.mods.TechliumCraft.blocks.advanced;

import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import kkaylium.mods.TechliumCraft.tileentities.TERainbow;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kayla Marie on 10/20/14.
 */
public class BlockRainbow extends BlockContainer {

    public BlockRainbow(){
        super(Material.leaves);
        this.setBlockName(TCNames.rainbowName);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockBounds(0.3f, 0.0f, 0.3f, 0.7f, 0.6f, 0.7f);
    }

    public void registerBlockIcons(IIconRegister icon) {
        this.blockIcon = icon.registerIcon("");
    }

//    public int onBlockPlaced(World world, int x, int y, int z, int unkn, float xf, float yf, float zf, int unkn2)
//    {
//        TERainbow te = (TERainbow)world.getTileEntity(x, y, z);
//        if(te.direction == 0 || te.direction == 2) GL11.glRotatef(te.direction * (-90), 0.0F, te.direction * (-90), 1f);
//        if(te.direction == 1 || te.direction == 3) GL11.glRotatef(te.direction * (90), 0.0F, te.direction * (-90), 1f);
//        return unkn2;
//    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TERainbow();
    }
}
