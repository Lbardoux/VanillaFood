package com.mymods.testmod.item.stuff;

import com.mymods.testmod.MyFirstMod;
import com.mymods.testmod.init.MyItems;


public class ItemSteelChestPlate extends ItemSteelArmor
{
	public ItemSteelChestPlate()
	{
		super(1);
		setUnlocalizedName("SteelChestplate");
		setTextureName(MyFirstMod.MOD_ID + ":steel_chestplate");
	}
}
