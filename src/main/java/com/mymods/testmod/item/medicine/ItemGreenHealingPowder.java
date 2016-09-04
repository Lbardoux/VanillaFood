package com.mymods.testmod.item.medicine;

import com.mymods.testmod.MyFirstMod;

public class ItemGreenHealingPowder extends ItemFoodHealingPowder
{
	public ItemGreenHealingPowder()
	{
		super();
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setUnlocalizedName("GreenHealingPowder");
		setTextureName(MyFirstMod.MOD_ID + ":green_healing_powder");
	}
	
	@Override
	public int getHealValue()
	{
		return 2;
	}
}
