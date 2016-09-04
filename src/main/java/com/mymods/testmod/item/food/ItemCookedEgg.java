package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.item.ItemFood;


public class ItemCookedEgg extends ItemFood
{
	public ItemCookedEgg()
	{
		super(2, 0.3f, true);
		setUnlocalizedName("Cooked_egg");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":cooked_egg");
	}


}
