package com.mymods.testmod.item.tool;

import com.mymods.testmod.MyFirstMod;
import com.mymods.testmod.init.MyItems;

import net.minecraft.item.ItemHoe;

public class ItemToolSteelHoe extends ItemHoe
{
	public ItemToolSteelHoe()
	{
		super(MyItems.STEEL);
		setUnlocalizedName("SteelHoe");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		//setTextureName(MyFirstMod.MOD_ID + ":steel_pickaxe");
		setTextureName(MyFirstMod.MOD_ID + ":steel_hoe2");
	}
}
