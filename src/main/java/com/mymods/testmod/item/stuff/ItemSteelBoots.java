package com.mymods.testmod.item.stuff;

import com.mymods.testmod.MyFirstMod;
import com.mymods.testmod.init.MyItems;

public class ItemSteelBoots extends ItemSteelArmor
{
	public ItemSteelBoots()
	{
		super(3);
		setUnlocalizedName("SteelBoots");
		setTextureName(MyFirstMod.MOD_ID + ":steel_boots");
	}
}
