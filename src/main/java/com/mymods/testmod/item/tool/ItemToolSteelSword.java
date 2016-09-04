package com.mymods.testmod.item.tool;

import com.mymods.testmod.MyFirstMod;
import com.mymods.testmod.init.MyItems;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemToolSteelSword extends ItemSword
{
	public ItemToolSteelSword()
	{
		super(MyItems.STEEL);
		setUnlocalizedName("SteelSword");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":steel_sword");
	}
}
