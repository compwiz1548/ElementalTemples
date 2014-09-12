package com.compwiz1548.elementaltemples.creativetab;

import com.compwiz1548.elementaltemples.init.ModItems;
import com.compwiz1548.elementaltemples.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabET
{
    public static final CreativeTabs ET_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }
    };
}
