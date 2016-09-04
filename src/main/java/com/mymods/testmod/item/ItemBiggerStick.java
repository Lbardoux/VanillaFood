package com.mymods.testmod.item;

import java.util.List;

import com.mymods.testmod.MyFirstMod;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBiggerStick extends Item
{
	public ItemBiggerStick()
	{
		super();
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setUnlocalizedName("BiggerStick");
		setTextureName(MyFirstMod.MOD_ID + ":bigger_stick");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add("Burn for 400 ticks.");
	}

}
