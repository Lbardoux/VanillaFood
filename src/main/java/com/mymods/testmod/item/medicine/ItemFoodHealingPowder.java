package com.mymods.testmod.item.medicine;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodHealingPowder extends ItemFood
{
	public ItemFoodHealingPowder()
	{
		super(0, false);
		setAlwaysEdible();
	}
	
	@Override
	public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player)
    {
        super.onEaten(itemStack, world, player);
        player.inventory.addItemStackToInventory(new ItemStack(Items.paper, 1));
        player.heal((float)this.getHealValue());
        return itemStack;
    }
		
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		String plural = (this.getHealValue() > 2) ? "s" : "";
		list.add("Restores " + this.getHealValue()/2 + " heart" + plural + ".");
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack itemStack)
    {
        return 10;
    }
	
	public int getHealValue()
	{
		return 0;
	}

}
