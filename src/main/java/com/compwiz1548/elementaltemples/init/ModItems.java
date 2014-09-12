package com.compwiz1548.elementaltemples.init;

import com.compwiz1548.elementaltemples.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    //public static final ItemET mapleLeaf = new ItemMapleLeaf();
    public static final ItemET skyRelic = new ItemSkyRelic();
    public static final ItemET hellRelic = new ItemHellRelic();
    public static final ItemET forestRelic = new ItemForestRelic();
    public static final ItemET mountainRelic = new ItemMountainRelic();
    public static final ItemET oceanRelic = new ItemOceanRelic();
    public static final ItemET desertRelic = new ItemDesertRelic();
    public static final ItemET enderRelic = new ItemEnderRelic();

    public static void init()
    {
        //GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(skyRelic, "skyRelic");
        GameRegistry.registerItem(hellRelic, "hellRelic");
        GameRegistry.registerItem(forestRelic, "forestRelic");
        GameRegistry.registerItem(mountainRelic, "mountainRelic");
        GameRegistry.registerItem(oceanRelic, "oceanRelic");
        GameRegistry.registerItem(desertRelic, "desertRelic");
        GameRegistry.registerItem(enderRelic, "enderRelic");
    }
}
