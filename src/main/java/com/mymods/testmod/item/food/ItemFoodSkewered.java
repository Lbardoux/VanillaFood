package com.mymods.testmod.item.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodSkewered extends ItemFood
{
	public ItemFoodSkewered(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_)
	{
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
	}
	
	@Override
	public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_)
    {
        super.onEaten(p_77654_1_, p_77654_2_, p_77654_3_);
        p_77654_3_.inventory.addItemStackToInventory(new ItemStack(Items.stick, 1));
        return p_77654_1_;
    }

}
