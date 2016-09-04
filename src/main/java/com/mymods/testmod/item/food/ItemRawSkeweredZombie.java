package com.mymods.testmod.item.food;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemRawSkeweredZombie extends ItemFoodSkewered
{
	public ItemRawSkeweredZombie()
	{
		super(2, 0.0f, true);
		setUnlocalizedName("Raw_skewered_zombie");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setTextureName(MyFirstMod.MOD_ID + ":raw_skewered_zombie");
		
		// 20 -> 20*tick(20), 75 --> 75% de chance
		// 0 -> enchant power 1 + 0
		setPotionEffect(Potion.hunger.id, 20, 0, 75.0f);
	}
}
