package com.mymods.testmod.item.tool;

import java.util.ArrayList;
import java.util.Random;

import com.mymods.testmod.MyFirstMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWeb;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class ItemSteelShear extends ItemShears
{
	public ItemSteelShear()
	{
		super();
		setUnlocalizedName("SteelShears");
		setTextureName(MyFirstMod.MOD_ID + ":steel_shear");
		setCreativeTab(MyFirstMod.tabVanillaFood);
		setMaxDamage(512);
	}
	
	/**
	 * I must find a way to prevent the string drop from the cobweb
	 */
	@Override
    public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z, EntityPlayer player)
    {
        if (player.worldObj.isRemote)
        {
            return false;
        }
        Block block = player.worldObj.getBlock(x, y, z);
        if (block instanceof BlockWeb)
        {
        	Random rand = new Random();
        	ItemStack drop = new ItemStack(Blocks.web, 1);
        	float f = 0.7F;
            double d  = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            double d1 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            double d2 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            EntityItem entityitem = new EntityItem(player.worldObj, (double)x + d, (double)y + d1, (double)z + d2, drop);
            entityitem.delayBeforeCanPickup = 10;
            player.worldObj.spawnEntityInWorld(entityitem);
            itemstack.damageItem(1, player);
        	return false;
        }
        return super.onBlockStartBreak(itemstack, x, y, z, player);
    }
	
}
