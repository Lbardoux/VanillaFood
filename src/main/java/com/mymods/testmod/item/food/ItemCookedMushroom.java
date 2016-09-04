package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.item.ItemFood;

public class ItemCookedMushroom extends ItemFood
{
	public ItemCookedMushroom()
	{
		super(2, 0.0f, false);
		setUnlocalizedName("CookedMushroom");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":cooked_mushroom");
	}
}
