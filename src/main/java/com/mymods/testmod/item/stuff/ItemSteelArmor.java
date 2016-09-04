package com.mymods.testmod.item.stuff;

import com.mymods.testmod.MyFirstMod;
import com.mymods.testmod.init.MyItems;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemSteelArmor extends ItemArmor
{
	public ItemSteelArmor(int armorPiece)
	{
		super(MyItems.armorSTEEL, 2, armorPiece);
		setCreativeTab(MyFirstMod.tabVanillaFood);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == MyItems.steelLegging)
		{
			return MyFirstMod.MOD_ID + ":textures/models/armor/armorSteel_layer_2.png";
		}
		return MyFirstMod.MOD_ID + ":textures/models/armor/armorSteel_layer_1.png";
	}
}
