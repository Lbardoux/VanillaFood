package com.mymods.testmod.block;

import java.util.Set;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;

public class TileCampFire extends TileEntity implements IUpdatePlayerListBox
{
	//private Item isCooking = null;
	private ItemStack isCooking = null;
	private int isCookingMeta = 0;
	private int timeLeft = 0;
	//private Item result = null;
	private ItemStack result = null;
	
	private static final String ISCOOKING_FIELD = "cookable";
	private static final String TIMELEFT_FIELD = "timeleft";
	private static final String RESULT_FIELD = "output";
	private static final String META_FIELD = "output";
	private static final int COOKING_TIME_TICKS = 100;
	
	
	 @Override
	 public void readFromNBT(NBTTagCompound nbt)
	 {
		 super.readFromNBT(nbt);
		 int id = nbt.getInteger(ISCOOKING_FIELD);
		 this.isCookingMeta = nbt.getInteger(META_FIELD);
		 this.isCooking = (id == 0) ? null : new ItemStack(Item.getItemById(id), 1, this.isCookingMeta);
		 id = nbt.getInteger(RESULT_FIELD);
		 this.result = (id == 0) ? null : new ItemStack(Item.getItemById(id), 1, this.isCookingMeta);
		 this.timeLeft = nbt.getInteger(TIMELEFT_FIELD);
	 }
	 
	 @Override
	 public void writeToNBT(NBTTagCompound nbt)
	 {
		 super.writeToNBT(nbt);
		 nbt.setInteger(ISCOOKING_FIELD, (this.isCooking == null) ? 0 : Item.getIdFromItem(isCooking.getItem()));
		 nbt.setInteger(TIMELEFT_FIELD, this.timeLeft);
		 nbt.setInteger(RESULT_FIELD, (this.result == null) ? 0 : Item.getIdFromItem(this.result.getItem()));
		 nbt.setInteger(META_FIELD, this.isCookingMeta);
	 }
	 
	 public boolean nothingIsCooking()
	 {
		 return this.isCooking == null;
	 }

	 public boolean foodNotCooked()
	 {
		 return timeLeft < COOKING_TIME_TICKS;
	 }
	 
	 public void startCookingWith(Item food)
	 {
		 this.isCookingMeta = food.getMetadata(0);
		 this.isCooking = new ItemStack(food, 1, this.isCookingMeta);
		 this.result = FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(food));
	 }
	 
	 @Override
	 public boolean canUpdate()
	 {
		 return true;
	 }
	 
	 @Override
	 public void updateEntity()
	 {
		 if (!nothingIsCooking() && foodNotCooked())
		 {
			 ++this.timeLeft;
		 }
	 }
	 
	 public ItemStack onDestroy()
	 {
		 if (this.isCooking == null)
		 {
			 return null;
		 }
		 else if (foodNotCooked())
		 {
			 return getFoodOnIt();
		 }
		 else
		 {
			 return getFoodCooked();
		 }
	 }
	 
	 @Override
	 public void update()
	 {
		 
	 }
	 
	 public ItemStack getFoodOnIt()
	 {
		 return this.isCooking;
	 }
	 
	 public ItemStack getFoodCooked()
	 {
		 return this.result;
	 }
	 
	 public void getReadyForNextFood()
	 {
		 this.isCooking = null;
		 this.timeLeft = 0;
		 this.result = null;
		 this.isCookingMeta = 0;
	 }
	 
	 public boolean acceptInput(Item item)
	 {
		Set<ItemStack> set = FurnaceRecipes.smelting().getSmeltingList().keySet();
		boolean cookable = false;
		Item output = null;
		for(ItemStack stack : set)
		{
			if (stack.getItem() == item)
			{
				cookable = true;
				output = FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(item)).getItem();
				return output instanceof ItemFood && cookable;
			}
		}
		return false;
	 }
	 
}
