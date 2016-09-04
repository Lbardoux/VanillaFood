package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

public class ItemCookedSkeweredPork extends ItemFoodSkewered
{
	public ItemCookedSkeweredPork()
	{
		super(16, 1.6f, true);
		setUnlocalizedName("Cooked_skewered_pig");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":cooked_skewered_pork");
	}
}
