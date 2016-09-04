package com.mymods.testmod.item.medicine;

import java.util.List;

import com.mymods.testmod.MyFirstMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCurativePowder extends ItemFoodHealingPowder
{
	public ItemCurativePowder()
	{
		super();
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setUnlocalizedName("CurativePowder");
		setTextureName(MyFirstMod.MOD_ID + ":item_powder");
	}
	
	@Override
	public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player)
    {
        super.onEaten(itemStack, world, player);
        for(Object effect : player.getActivePotionEffects())
        {
        	PotionEffect p = (PotionEffect)effect;
        	player.removePotionEffect(p.getPotionID());
        }
        return itemStack;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add("Removes every enchantment.");
	}
       
	
}
