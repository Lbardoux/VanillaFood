package com.mymods.testmod.item;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBreakingHammer extends Item
{
	public ItemBreakingHammer()
	{
		super();
		setUnlocalizedName("BreakingHammer");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":breaking_hammer");
	}
	
	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack)
	{
		return false;
	}
}
