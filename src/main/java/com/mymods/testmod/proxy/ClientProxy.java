package com.mymods.testmod.proxy;

import com.mymods.testmod.render.RenderCampFire;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	public static int CAMPFIRE_ISBRH_RENDER_ID;
	
	@Override
	public void registerHandler()
	{
		CAMPFIRE_ISBRH_RENDER_ID = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(new RenderCampFire());
	}
}
