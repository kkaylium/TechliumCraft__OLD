package net.kkaylium.mods.TechliumCraft.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by Allout, Modified by kkaylium
 */
public class ObfHelper
{
    public static boolean isObf = true;

    public static void init()
    {
        try
        {
            Class.forName("net.minecraft.world.biome.BiomeGenBase").getDeclaredField("biomeList");
            isObf = false;
        }
        catch (Exception e)
        {
            isObf = true;
        }
    }

    public static Field getField(Class<?> c, String deobfName, String obfName) throws NoSuchFieldException
    {
        return (isObf)?c.getDeclaredField(obfName):c.getDeclaredField(deobfName);
    }

    public static void setFinalStatic(Field f, Object newVal) throws Exception
    {
        f.setAccessible(true);

        Field modifiersField=Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(f, f.getModifiers() & ~Modifier.FINAL);

        f.set(null, newVal);
    }
}
