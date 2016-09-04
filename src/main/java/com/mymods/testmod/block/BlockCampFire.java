package com.mymods.testmod.block;

import java.util.Random;

import com.mymods.testmod.proxy.ClientProxy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class BlockCampFire extends BlockContainer
{
	public BlockCampFire(Material material)
	{
		super(material);
		setResistance(5.0f);
		lightValue = 14;
		blockHardness = 2;
		setStepSound(Block.soundTypeWood);
		setTickRandomly(true);
	}

	
	// ########################################################
	/// Rendering methods
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	public boolean isOpaqueCube(){// load every faces
		return false;
	}
	@SideOnly(Side.CLIENT)
	public int getRenderType()
	{
		return ClientProxy.CAMPFIRE_ISBRH_RENDER_ID;
	}
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess state, int x, int y, int z, int side)
	{
		return true;
	}
	// ########################################################
	

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random)
	{
		float fx = (float)x + 0.5f;
		float fz = (float)z + 0.5f;
		world.spawnParticle("flame", (double)fx-0.1d, (double)(y + 0.3f), (double)fz-0.1d, 0.0d, 0.0d, 0.0d);
		world.spawnParticle("flame", (double)fx+0.1d, (double)(y + 0.3f), (double)fz-0.1d, 0.0d, 0.0d, 0.0d);
		world.spawnParticle("flame", (double)fx-0.1d, (double)(y + 0.3f), (double)fz+0.1d, 0.0d, 0.0d, 0.0d);
		world.spawnParticle("flame", (double)fx+0.1d, (double)(y + 0.3f), (double)fz+0.1d, 0.0d, 0.0d, 0.0d);
		world.spawnParticle("smoke", (double)fx, (double)(y + 0.5f), (double)fz, 0.0d, 0.0d, 0.0d);
	}
	// ########################################################	
	
	@Override
	public void breakBlock(World world, int x, int y, int z, Block block, int maybeMeta)
    {
		TileCampFire t = (TileCampFire)world.getTileEntity(x, y, z);
		ItemStack itemDrop = t.onDestroy();
		if (itemDrop != null)
		{
			EntityItem drop = new EntityItem(world, (double)x + 0.5d, (double)y + 0.5d, (double)z + 0.5d, itemDrop);
			world.spawnEntityInWorld(drop);
		}
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
    	return Item.getItemFromBlock(this);
    }

    @Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int idk1, float idk2, float idk3, float idk4)
    {
		TileCampFire t = (TileCampFire)world.getTileEntity(x, y, z);
		if (t.nothingIsCooking())
		{
			ItemStack playerHand = player.inventory.mainInventory[player.inventory.currentItem];
			if (playerHand != null)
			{
				Item handled = playerHand.getItem();
				if (t.acceptInput(handled))
				{
					t.startCookingWith(handled);
					--player.inventory.mainInventory[player.inventory.currentItem].stackSize;
					t.markDirty();
				}
			}
		}
		else
		{
			player.inventory.addItemStackToInventory((t.foodNotCooked()) ? t.getFoodOnIt() : t.getFoodCooked());
			t.getReadyForNextFood();
			t.markDirty();
		}
        return true;
    }
	
	@Override
	public boolean hasTileEntity(int metadata)
	{
		return true;
	}


	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		try
		{
			return new TileCampFire();
	    }
		catch (Exception var3)
		{
		   throw new RuntimeException(var3);
		}
	}

}
