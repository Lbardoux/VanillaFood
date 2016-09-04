package com.mymods.testmod.item;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.item.Item;

public class ItemIronPowder extends Item
{
	public ItemIronPowder()
	{
		super();
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setUnlocalizedName("IronPowder");
		setTextureName(MyFirstMod.MOD_ID + ":iron_powder");
	}
}
