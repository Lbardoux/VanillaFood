package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.item.ItemFood;

public class ItemRawEgg extends ItemFood
{
	public ItemRawEgg()
	{
		super(1, 0.0f, true);
		setUnlocalizedName("Raw_egg");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":raw_egg");
	}
}
