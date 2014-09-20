package net.kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.kkaylium.mods.TechliumCraft.TechliumCraft;
import net.kkaylium.mods.TechliumCraft.init.TCInits;
import net.kkaylium.mods.TechliumCraft.init.gen.tree.GlowTreeGen;
import net.kkaylium.mods.TechliumCraft.lib.ModInfo;
import net.kkaylium.mods.TechliumCraft.lib.TCNames;
import net.kkaylium.mods.TechliumCraft.tileentities.TEGlowColor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by Kayla Marie on 8/10/14.
 */
public class BlockGlowCrystalStorage extends Block {

    private int colorMade;
    private IIcon[] textures = new IIcon[14];
    private String[] blockNames = {"white", "black", "red", "orange", "yellow", "lime", "green", "sky", "blue", "lilac", "purple", "pink", "rainbow"};

    public BlockGlowCrystalStorage(int color){
        super(Material.glass);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockName(TCNames.glowCrystalStorageName + "_" + blockNames[color]);
        this.setHardness(1.2F);
        this.setLightLevel(1.0F);
        colorMade = color;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        for(int i = 0; i < textures.length; i++){
            textures[i] = iconregister.registerIcon(ModInfo.MOD_ID + ":" + "glowCrystalStorage" + "_" + blockNames[colorMade]);
        }
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
        if (!world.isRemote) {
            if(colorMade = )
            if (player.inventory.getCurrentItem().getItem() == TCInits.glowCrystal_WHITE) {
                player.inventory.consumeInventoryItem(TCInits.glowCrystal_WHITE);
                return world.isRemote || new GlowTreeGen().generate(world, world.rand, x, y, z);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return textures[colorMade];
    }
}
