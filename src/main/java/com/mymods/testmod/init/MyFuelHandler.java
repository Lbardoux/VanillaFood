package com.mymods.testmod.init;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class MyFuelHandler implements IFuelHandler
{
	@Override
	public int getBurnTime(ItemStack fuel)
	{
		int stickBurnTime = 100;
		int plankBurnTime = 300;
		if (fuel.getItem() == MyItems.biggerStick)
		{
			return 4*stickBurnTime;
		}
		if (fuel.getItem() == MyItems.woodGrid)
		{
			return 5*stickBurnTime + 4*plankBurnTime;
		}
		return 0;
	}
}
