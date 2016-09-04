package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.item.ItemFood;

public class ItemPumpkinJuice extends ItemJuice
{
	public ItemPumpkinJuice()
	{
		super(3, 0.4f, false);
		setUnlocalizedName("PumpkinJuice");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":pumpkin_juice");
	}
}
