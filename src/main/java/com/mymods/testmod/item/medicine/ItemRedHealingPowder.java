package com.mymods.testmod.item.medicine;

import com.mymods.testmod.MyFirstMod;

public class ItemRedHealingPowder extends ItemFoodHealingPowder
{
	public ItemRedHealingPowder()
	{
		super();
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setUnlocalizedName("RedHealingPowder");
		setTextureName(MyFirstMod.MOD_ID + ":red_healing_powder");
	}
	
	@Override
	public int getHealValue()
	{
		return 6;
	}	
}
