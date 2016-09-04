package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

public class ItemRawSkeweredPork extends ItemFoodSkewered
{
	public ItemRawSkeweredPork()
	{
		super(4, 0.3f, true);
		setUnlocalizedName("Raw_skewered_pig");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":raw_skewered_pork");
	}
}
