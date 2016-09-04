package com.mymods.testmod.item;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.item.Item;

public class ItemFlintPowder extends Item
{
	public ItemFlintPowder()
	{
		super();
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setUnlocalizedName("FlintPowder");
		setTextureName(MyFirstMod.MOD_ID + ":flint_powder");
	}
}
