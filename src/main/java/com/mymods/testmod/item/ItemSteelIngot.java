package com.mymods.testmod.item;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.item.Item;

public class ItemSteelIngot extends Item
{
	public ItemSteelIngot()
	{
		super();
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":steel_ingot");
		setUnlocalizedName("SteelIngot");
	}
}
