package com.mymods.testmod.item.tool;

import com.mymods.testmod.MyFirstMod;
import com.mymods.testmod.init.MyItems;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ItemToolSteelShovel extends ItemSpade
{
	public ItemToolSteelShovel()
	{
		super(MyItems.STEEL);
		setUnlocalizedName("SteelShovel");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":steel_shovel");
	}
}
