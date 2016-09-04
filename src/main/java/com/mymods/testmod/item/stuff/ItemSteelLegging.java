package com.mymods.testmod.item.stuff;

import com.mymods.testmod.MyFirstMod;
import com.mymods.testmod.init.MyItems;

public class ItemSteelLegging extends ItemSteelArmor
{
	public ItemSteelLegging()
	{
		super(2);
		setUnlocalizedName("SteelLegging");
		setTextureName(MyFirstMod.MOD_ID + ":steel_legging");
	}
}
