package com.mymods.testmod;

import com.mymods.testmod.block.TileCampFire;
import com.mymods.testmod.init.MyBlocks;
import com.mymods.testmod.init.MyItems;
import com.mymods.testmod.proxy.CommonProxy;
import com.mymods.testmod.render.RenderTileCampFire;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/*
 * TODO :
 * Issue with salmon (ID on general) --> myItemStack.getMetaData each way
 * Force refresh when loading game
 * texture to enhance
 * manage anvil stuff for armors and tools
 * test further the campfire
 * hopper for the campfire
 */


@Mod(modid = MyFirstMod.MOD_ID, version = MyFirstMod.VERSION, name = MyFirstMod.MOD_NAME)
public class MyFirstMod
{
	public static final String MOD_ID       = "firstmod";
	public static final String VERSION      = "1.0";
	public static final String MOD_NAME     = "My first minecraft mod";
	public static final String CLIENT_PROXY = "com.mymods.testmod.proxy.ClientProxy";
	public static final String SERVER_PROXY = "com.mymods.testmod.proxy.CommonProxy";
	public static CreativeTabs tabVanillaFood = new CreativeTabs("tabVanillaFood")
	{
		@SideOnly(Side.CLIENT)
		@Override
		public Item getTabIconItem() {
			return MyItems.cookedSkeweredBeef;
		}
	};
	
	@SidedProxy(clientSide = MyFirstMod.CLIENT_PROXY, serverSide = MyFirstMod.SERVER_PROXY)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		MyBlocks.init();
		MyItems.init();
		GameRegistry.registerTileEntity(TileCampFire.class, "campfire.tileEntity");
		ClientRegistry.bindTileEntitySpecialRenderer(TileCampFire.class, (TileEntitySpecialRenderer)new RenderTileCampFire());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerHandler();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		MyBlocks.register();
		MyItems.register();
	}
}
