package com.mymods.testmod.item;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.item.Item;

public class ItemSteelCompound extends Item
{
	public ItemSteelCompound()
	{
		super();
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setUnlocalizedName("SteelCompound");
		setTextureName(MyFirstMod.MOD_ID + ":raw_steel");
	}
}
