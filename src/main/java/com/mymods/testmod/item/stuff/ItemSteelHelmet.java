package com.mymods.testmod.item.stuff;

import com.mymods.testmod.MyFirstMod;
import com.mymods.testmod.init.MyItems;

public class ItemSteelHelmet extends ItemSteelArmor
{
	public ItemSteelHelmet()
	{
		super(0);
		setUnlocalizedName("SteelBoots");
		setTextureName(MyFirstMod.MOD_ID + ":steel_helmet");
	}

}
