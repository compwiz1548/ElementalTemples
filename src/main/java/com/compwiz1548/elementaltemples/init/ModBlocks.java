package com.compwiz1548.elementaltemples.init;

import com.compwiz1548.elementaltemples.block.BlockET;
import com.compwiz1548.elementaltemples.block.BlockFlag;
import com.compwiz1548.elementaltemples.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockET flag = new BlockFlag();

    public static void init()
    {
        //GameRegistry.registerBlock(flag, "flag");
    }
}
