package com.mymods.testmod.init;

import com.mymods.testmod.MyFirstMod;
import com.mymods.testmod.block.BlockCampFire;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class MyBlocks
{
	public static Block campFire;
	
	public static void init()
	{
		campFire = new BlockCampFire(Material.wood).setCreativeTab(MyFirstMod.tabVanillaFood).setBlockName("CampFire").setBlockTextureName(MyFirstMod.MOD_ID + ":wood_grid");
		
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(campFire, campFire.getUnlocalizedName().substring(5));
		GameRegistry.addRecipe(new ItemStack(campFire, 1), new Object[]{"|#|", "oio", 'i', Blocks.torch,
				                                                                      '#', MyItems.woodGrid,
				                                                                      '|', MyItems.biggerStick,
				                                                                      'o', Blocks.cobblestone});
	}
}
