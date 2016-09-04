package com.mymods.testmod.item.tool;

import com.mymods.testmod.MyFirstMod;
import com.mymods.testmod.init.MyItems;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemToolSteelPickaxe extends ItemPickaxe
{
	public ItemToolSteelPickaxe()
	{
		super(MyItems.STEEL);
		setUnlocalizedName("SteelPickaxe");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":steel_pickaxe");
	}
}
