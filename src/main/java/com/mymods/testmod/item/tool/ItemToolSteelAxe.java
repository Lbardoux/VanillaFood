package com.mymods.testmod.item.tool;

import com.mymods.testmod.MyFirstMod;
import com.mymods.testmod.init.MyItems;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemToolSteelAxe extends ItemAxe
{
	public ItemToolSteelAxe()
	{
		super(MyItems.STEEL);
		setUnlocalizedName("SteelAxe");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":steel_axe");
	}
}
