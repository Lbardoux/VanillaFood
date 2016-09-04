package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

public class ItemPotatoStew extends ItemFoodWithBowl
{
	public ItemPotatoStew()
	{
		super(12, 0.3f, false);
		setUnlocalizedName("PotatoStew");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":potato_stew");
	}
}
