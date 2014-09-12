package com.compwiz1548.elementaltemples.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;

public class ItemMapleLeaf extends ItemET
{
    public ItemMapleLeaf()
    {
        super();
        this.setUnlocalizedName("mapleLeaf");
    }

    //MAKES IT SHINY!!!!!!
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
}
