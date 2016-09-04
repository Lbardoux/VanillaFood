package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

public class ItemCookedSkeweredBeef extends ItemFoodSkewered
{
	public ItemCookedSkeweredBeef()
	{
		super(16, 1.6f, true);
		setUnlocalizedName("Cooked_skewered_beef");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":cooked_skewered_beef");
	}
}
