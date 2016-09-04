package com.mymods.testmod.render;

import org.lwjgl.opengl.GL11;

import com.mymods.testmod.block.TileCampFire;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;

public class RenderTileCampFire extends TileEntitySpecialRenderer
{

	@Override
	public void renderTileEntityAt(TileEntity t, double x, double y, double z, float partialTick)
	{
		TileCampFire tile = (TileCampFire)t;
		if (!tile.nothingIsCooking())
		{
			ItemStack stack = (tile.foodNotCooked()) ? tile.getFoodOnIt() : tile.getFoodCooked();
			EntityItem entItem = new EntityItem(t.getWorldObj(), x, y, z, stack);
			GL11.glPushMatrix();
			entItem.hoverStart = 0.0F;
			RenderItem.renderInFrame = true;
			GL11.glTranslatef((float)x+0.5f, (float)y + 0.76F, (float)z+0.3f);
			GL11.glRotatef(180, 0, 1, 1);
			RenderManager.instance.renderEntityWithPosYaw(entItem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
			RenderItem.renderInFrame = false;
			GL11.glPopMatrix();
		}
	}

}
