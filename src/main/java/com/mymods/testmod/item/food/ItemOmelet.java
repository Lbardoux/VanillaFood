package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemOmelet extends ItemFoodWithBowl
{
	public ItemOmelet()
	{
		super(4, 0.6f, false);
		setUnlocalizedName("Omelet");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":omelet");
	}
}
