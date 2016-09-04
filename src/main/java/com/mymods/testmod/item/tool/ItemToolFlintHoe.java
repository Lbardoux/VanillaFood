package com.mymods.testmod.item.tool;

import java.util.List;

import com.mymods.testmod.MyFirstMod;
import com.mymods.testmod.init.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemToolFlintHoe extends ItemHoe
{
	public ItemToolFlintHoe()
	{
		super(MyItems.FLINT);
		setUnlocalizedName("FlintHoe");
		setTextureName(MyFirstMod.MOD_ID + ":flint_hoe");
		setCreativeTab(MyFirstMod.tabVanillaFood);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add("It looks more solid than stone");
	}
}
