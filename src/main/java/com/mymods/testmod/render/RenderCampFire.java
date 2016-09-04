package com.mymods.testmod.render;

import org.lwjgl.opengl.GL11;

import com.mymods.testmod.block.BlockCampFire;
import com.mymods.testmod.proxy.ClientProxy;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.world.IBlockAccess;

public class RenderCampFire implements ISimpleBlockRenderingHandler
{
	private static final float HEIGHT = 0.3f;
	private static final float STICK_HEIGHT = HEIGHT + 0.4f;
	private static final float GRID_HEIGHT = STICK_HEIGHT + 0.05f;

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		Tessellator tessel = Tessellator.instance;
		renderer.setRenderBounds(0.25f, 0.0f, -0.1f, 0.75f, HEIGHT, 0.25f);
		renderInInventory(tessel, renderer, Blocks.cobblestone, metadata);
		renderer.setRenderBounds(-0.1f, 0.0f, 0.25f, 0.25f, HEIGHT, 0.75f);
		renderInInventory(tessel, renderer, Blocks.cobblestone, metadata);
		renderer.setRenderBounds(0.75f, 0.0f, 0.25f, 1.1f, HEIGHT, 0.75f);
		renderInInventory(tessel, renderer, Blocks.cobblestone, metadata);
		renderer.setRenderBounds(0.25f, 0.0f, 0.75f, 0.75f, HEIGHT, 1.1f);
		renderInInventory(tessel, renderer, Blocks.cobblestone, metadata);
		renderer.setRenderBounds(0.45f, HEIGHT, 0.0f, 0.55f, STICK_HEIGHT, 0.1f);
		renderInInventory(tessel, renderer, Blocks.planks, metadata);
		renderer.setRenderBounds(0.45f, HEIGHT, 0.9f, 0.55f, STICK_HEIGHT, 1.0f);
		renderInInventory(tessel, renderer, Blocks.planks, metadata);
		renderer.setRenderBounds(0.9f, HEIGHT, 0.45f, 1.0f, STICK_HEIGHT, 0.55f);
		renderInInventory(tessel, renderer, Blocks.planks, metadata);
		renderer.setRenderBounds(0.0f, HEIGHT, 0.45f, 0.1f, STICK_HEIGHT, 0.55f);
		renderInInventory(tessel, renderer, Blocks.planks, metadata);
		renderer.setRenderBounds(0.0f, STICK_HEIGHT, 0.0f, 1.0f, GRID_HEIGHT, 1.0f);
		renderInInventory(tessel, renderer, block, metadata);
		renderer.setRenderBounds(0.25f, 0.0f, 0.25f, 0.75f, 0.25f, 0.75f);
		renderInInventory(tessel, renderer, block, metadata);
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer){
		//cobble parts
		renderer.setRenderBounds(0.25f, 0.0f, -0.1f, 0.75f, HEIGHT, 0.25f);
		renderer.renderStandardBlock(Blocks.cobblestone, x, y, z);
		renderer.setRenderBounds(-0.1f, 0.0f, 0.25f, 0.25f, HEIGHT, 0.75f);
		renderer.renderStandardBlock(Blocks.cobblestone, x, y, z);
		renderer.setRenderBounds(0.75f, 0.0f, 0.25f, 1.1f, HEIGHT, 0.75f);
		renderer.renderStandardBlock(Blocks.cobblestone, x, y, z);
		renderer.setRenderBounds(0.25f, 0.0f, 0.75f, 0.75f, HEIGHT, 1.1f);
		renderer.renderStandardBlock(Blocks.cobblestone, x, y, z);
		//stick parts
		renderer.setRenderBounds(0.45f, HEIGHT, 0.0f, 0.55f, STICK_HEIGHT, 0.1f);
		renderer.renderStandardBlock(Blocks.planks, x, y, z);
		renderer.setRenderBounds(0.45f, HEIGHT, 0.9f, 0.55f, STICK_HEIGHT, 1.0f);
		renderer.renderStandardBlock(Blocks.planks, x, y, z);
		renderer.setRenderBounds(0.9f, HEIGHT, 0.45f, 1.0f, STICK_HEIGHT, 0.55f);
		renderer.renderStandardBlock(Blocks.planks, x, y, z);
		renderer.setRenderBounds(0.0f, HEIGHT, 0.45f, 0.1f, STICK_HEIGHT, 0.55f);
		renderer.renderStandardBlock(Blocks.planks, x, y, z);
		//the upside grid
		renderer.setRenderBounds(0.0f, STICK_HEIGHT, 0.0f, 1.0f, GRID_HEIGHT, 1.0f);
		renderer.renderStandardBlock(block, x, y, z);
		// Fire place
		renderer.setRenderBounds(0.25f, 0.0f, 0.25f, 0.75f, 0.25f, 0.75f);
		renderer.renderStandardBlock(Blocks.log, x, y, z);
		BlockCampFire firePlace = (BlockCampFire)block;
		return true;
	}
	
	private void renderInInventory(Tessellator tessel, RenderBlocks renderer, Block block, int metadata)
	{
		// the same everywhere
		GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
		tessel.startDrawingQuads();
		tessel.setNormal(0.0f, -1.0f, 0.0f);
		renderer.renderFaceYNeg(block, 0.0d, 0.0d, 0.0d, block.getIcon(0, metadata));
		tessel.draw();
		tessel.startDrawingQuads();
		tessel.setNormal(0.0f, 1.0f, 0.0f);
		renderer.renderFaceYPos(block, 0.0d, 0.0d, 0.0d, block.getIcon(1, metadata));
		tessel.draw();
		tessel.startDrawingQuads();
		tessel.setNormal(0.0f, 0.0f, -1.0f);
		renderer.renderFaceZNeg(block, 0.0d, 0.0d, 0.0d, block.getIcon(2, metadata));
		tessel.draw();
		tessel.startDrawingQuads();
		tessel.setNormal(0.0f, 0.0f, 1.0f);
		renderer.renderFaceZPos(block, 0.0d, 0.0d, 0.0d, block.getIcon(3, metadata));
		tessel.draw();
		tessel.startDrawingQuads();
		tessel.setNormal(-1.0f, 0.0f, 0.0f);
		renderer.renderFaceXNeg(block, 0.0d, 0.0d, 0.0d, block.getIcon(4, metadata));
		tessel.draw();
		tessel.startDrawingQuads();
		tessel.setNormal(1.0f, 0.0f, 0.0f);
		renderer.renderFaceXPos(block, 0.0d, 0.0d, 0.0d, block.getIcon(5, metadata));
		tessel.draw();
		
		GL11.glTranslatef(0.5f, 0.5f, 0.5f);
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId){
		return true;
	}

	@Override
	public int getRenderId(){
		return ClientProxy.CAMPFIRE_ISBRH_RENDER_ID;
	}

}
