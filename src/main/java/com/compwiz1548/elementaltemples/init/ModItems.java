package com.compwiz1548.elementaltemples.init;

import com.compwiz1548.elementaltemples.item.ItemET;
import com.compwiz1548.elementaltemples.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemET mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
