package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

public class ItemRawSkeweredBeef extends ItemFoodSkewered
{
	public ItemRawSkeweredBeef()
	{
		super(4, 0.3f, true);
		setUnlocalizedName("Raw_skewered_beef");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":raw_skewered_beef");
	}
}
