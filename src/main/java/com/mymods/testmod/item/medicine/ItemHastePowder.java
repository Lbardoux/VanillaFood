package com.mymods.testmod.item.medicine;

import java.util.List;

import com.mymods.testmod.MyFirstMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemHastePowder extends ItemFoodHealingPowder
{
	public ItemHastePowder()
	{
		super();
		setPotionEffect(Potion.digSpeed.id, 60, 1, 100.0f);
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setUnlocalizedName("HastePowder");
		setTextureName(MyFirstMod.MOD_ID + ":blue_powder");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add("Provides haste effect.");
	}
}
