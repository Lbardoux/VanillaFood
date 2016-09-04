package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

public class ItemCookedSkeweredZombie extends ItemFoodSkewered
{
	public ItemCookedSkeweredZombie()
	{
		super(8, 0.4f, true);
		setUnlocalizedName("Cooked_skewered_zombie");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":cooked_skewered_zombie");
	}
}
