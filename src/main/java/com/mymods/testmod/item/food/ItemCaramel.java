package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemCaramel extends ItemFood
{
	public ItemCaramel()
	{
		super(1, 0.5f, false);
		setAlwaysEdible();
		setUnlocalizedName("Caramel");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":caramel");
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 8;
    }
	
}
