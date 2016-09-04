package com.mymods.testmod.item.medicine;

import com.mymods.testmod.MyFirstMod;

public class ItemYellowHealingPowder extends ItemFoodHealingPowder
{
	public ItemYellowHealingPowder()
	{
		super();
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setUnlocalizedName("YellowHealingPowder");
		setTextureName(MyFirstMod.MOD_ID + ":yellow_healing_powder");
	}
	
	@Override
	public int getHealValue()
	{
		return 4;
	}
}
