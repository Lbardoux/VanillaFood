package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.init.Items;

public class ItemCarrotStew extends ItemFoodWithBowl
{
	public ItemCarrotStew()
	{
		super(8, 0.3f, false);
		setUnlocalizedName("CarrotStew");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":carrot_stew");
	}
}
