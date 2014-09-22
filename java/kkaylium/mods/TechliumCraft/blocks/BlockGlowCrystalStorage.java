package kkaylium.mods.TechliumCraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.mods.TechliumCraft.TechliumCraft;
import kkaylium.mods.TechliumCraft.gen.structures.StructureRainbow;
import kkaylium.mods.TechliumCraft.init.TCInits;
import kkaylium.mods.TechliumCraft.lib.TCInfo;
import kkaylium.mods.TechliumCraft.lib.TCNames;
import net.java.games.input.Component;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import org.lwjgl.Sys;
import scala.swing.event.KeyPressed;

import java.util.Random;

/**
 * Created by Kayla Marie on 8/10/14.
 */
public class BlockGlowCrystalStorage extends Block {

    private int colorMade;
    private IIcon[] textures = new IIcon[17];

    public BlockGlowCrystalStorage(int color){
        super(Material.glass);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setBlockName(TCNames.glowCrystalStorageName + "_" + TCInfo.COLOR_NAMES[color]);
        this.setHardness(1.2F);
        this.setLightLevel(1.0F);
        colorMade = color;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
        if(!world.isRemote){
            Random rand = new Random();
            if(colorMade == TCInfo.COLOR_NAMES.length - 1){
                System.out.println("Hello, you have the right block");
                if(player.inventory.getCurrentItem() != null){
                if(player.inventory.getCurrentItem().isItemEqual(new ItemStack(TCInits.glowCrystal_RAINBOW))){
                    System.out.println("So, it's just not generating... *sigh*");
                    new StructureRainbow().generate(world, rand, x, y, z);
                    return true;
                }else{

                }
                }
            }
            return false;
        }else{
            return false;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        for(int i = 0; i < textures.length; i++){
            textures[i] = iconregister.registerIcon(TCInfo.MOD_ID + ":" + "glowCrystalStorage" + "_" + TCInfo.COLOR_NAMES[colorMade]);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return textures[colorMade];
    }
}
