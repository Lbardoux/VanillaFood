package com.mymods.testmod.init;

import com.mymods.testmod.item.ItemBiggerStick;
import com.mymods.testmod.item.ItemBreakingHammer;
import com.mymods.testmod.item.ItemFlintPowder;
import com.mymods.testmod.item.ItemIronPowder;
import com.mymods.testmod.item.ItemSteelCompound;
import com.mymods.testmod.item.ItemSteelIngot;
import com.mymods.testmod.item.ItemWoodenGrid;
import com.mymods.testmod.item.food.ItemCaramel;
import com.mymods.testmod.item.food.ItemCarrotStew;
import com.mymods.testmod.item.food.ItemCookedEgg;
import com.mymods.testmod.item.food.ItemCookedMushroom;
import com.mymods.testmod.item.food.ItemCookedSkeweredBeef;
import com.mymods.testmod.item.food.ItemCookedSkeweredPork;
import com.mymods.testmod.item.food.ItemCookedSkeweredZombie;
import com.mymods.testmod.item.food.ItemOmelet;
import com.mymods.testmod.item.food.ItemPotatoStew;
import com.mymods.testmod.item.food.ItemPumpkinJuice;
import com.mymods.testmod.item.food.ItemRawEgg;
import com.mymods.testmod.item.food.ItemRawSkeweredBeef;
import com.mymods.testmod.item.food.ItemRawSkeweredPork;
import com.mymods.testmod.item.food.ItemRawSkeweredZombie;
import com.mymods.testmod.item.medicine.ItemCurativePowder;
import com.mymods.testmod.item.medicine.ItemGreenHealingPowder;
import com.mymods.testmod.item.medicine.ItemHastePowder;
import com.mymods.testmod.item.medicine.ItemRedHealingPowder;
import com.mymods.testmod.item.medicine.ItemYellowHealingPowder;
import com.mymods.testmod.item.stuff.ItemSteelBoots;
import com.mymods.testmod.item.stuff.ItemSteelChestPlate;
import com.mymods.testmod.item.stuff.ItemSteelHelmet;
import com.mymods.testmod.item.stuff.ItemSteelLegging;
import com.mymods.testmod.item.tool.ItemSteelShear;
import com.mymods.testmod.item.tool.ItemToolFlintAxe;
import com.mymods.testmod.item.tool.ItemToolFlintHoe;
import com.mymods.testmod.item.tool.ItemToolFlintPickaxe;
import com.mymods.testmod.item.tool.ItemToolFlintShovel;
import com.mymods.testmod.item.tool.ItemToolFlintSword;
import com.mymods.testmod.item.tool.ItemToolSteelAxe;
import com.mymods.testmod.item.tool.ItemToolSteelHoe;
import com.mymods.testmod.item.tool.ItemToolSteelPickaxe;
import com.mymods.testmod.item.tool.ItemToolSteelShovel;
import com.mymods.testmod.item.tool.ItemToolSteelSword;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class MyItems
{
	public static ToolMaterial FLINT = EnumHelper.addToolMaterial("FLINT", 1, 256, 4.0f, 1.0f, 5);
	public static ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 2, 512, 6.0f, 3.0f, 14);
	public static ArmorMaterial armorSTEEL = EnumHelper.addArmorMaterial("armorSTEEL", 24, new int[]{3, 7, 6, 2}, 9);
	
	public static Item rawEgg;
	public static Item cookedEgg;
	public static Item caramel;
	public static Item rawSkeweredBeef;
	public static Item rawSkeweredChicken;
	public static Item rawSkeweredPig;
	public static Item rawSkeweredZombie;
	public static Item cookedSkeweredBeef;
	public static Item cookedSkeweredChicken;
	public static Item cookedSkeweredPig;
	public static Item cookedSkeweredZombie;
	public static Item omelet;
	public static Item cookedMushroom;
	public static Item carrotStew;
	public static Item potatoStew;
	public static Item pumpkinJuice;
	
	public static Item woodGrid;
	public static Item biggerStick;
	
	public static Item redPowder;
	public static Item yellowPowder;
	public static Item greenPowder;
	public static Item whitePowder;
	public static Item bluePowder;
	
	public static Item flintSword;
	public static Item flintAxe;
	public static Item flintShovel;
	public static Item flintPickaxe;
	public static Item flintHoe;
	public static Item steelShear;
	public static Item steelAxe;
	public static Item steelShovel;
	public static Item steelHoe;
	public static Item steelPickaxe;
	public static Item steelSword;
	
	public static Item steelLegging;
	public static Item steelChestplate;
	public static Item steelHelmet;
	public static Item steelBoots;
	
	public static Item ironPowder;
	public static Item breakingHammer;
	public static Item flintPowder;
	public static Item steelCompound;
	public static Item steelIngot;
	
	
	public static void init()
	{
		rawEgg               = new ItemRawEgg();
		cookedEgg            = new ItemCookedEgg();
		caramel              = new ItemCaramel();
		rawSkeweredBeef      = new ItemRawSkeweredBeef();
		rawSkeweredPig       = new ItemRawSkeweredPork();
		rawSkeweredZombie    = new ItemRawSkeweredZombie();
		cookedSkeweredBeef   = new ItemCookedSkeweredBeef();
		cookedSkeweredPig    = new ItemCookedSkeweredPork();
		cookedSkeweredZombie = new ItemCookedSkeweredZombie();
		omelet               = new ItemOmelet();
		cookedMushroom       = new ItemCookedMushroom();
		carrotStew           = new ItemCarrotStew();
		potatoStew           = new ItemPotatoStew();
		pumpkinJuice         = new ItemPumpkinJuice();
		woodGrid             = new ItemWoodenGrid();
		biggerStick          = new ItemBiggerStick();
		redPowder            = new ItemRedHealingPowder();
		yellowPowder         = new ItemYellowHealingPowder();
		greenPowder          = new ItemGreenHealingPowder();
		whitePowder          = new ItemCurativePowder();
		bluePowder           = new ItemHastePowder();
		flintSword           = new ItemToolFlintSword();
		flintShovel          = new ItemToolFlintShovel();
		flintAxe             = new ItemToolFlintAxe();
		flintPickaxe         = new ItemToolFlintPickaxe();
		flintHoe             = new ItemToolFlintHoe();
		ironPowder           = new ItemIronPowder();
		flintPowder          = new ItemFlintPowder();
		steelCompound        = new ItemSteelCompound();
		steelIngot           = new ItemSteelIngot();
		steelShear           = new ItemSteelShear();
		steelSword           = new ItemToolSteelSword();
		steelShovel          = new ItemToolSteelShovel();
		steelHoe             = new ItemToolSteelHoe();
		steelAxe             = new ItemToolSteelAxe();
		steelPickaxe         = new ItemToolSteelPickaxe();
		steelLegging         = new ItemSteelLegging();
		steelHelmet          = new ItemSteelHelmet();
		steelChestplate      = new ItemSteelChestPlate();
		steelBoots           = new ItemSteelBoots();
		breakingHammer       = new ItemBreakingHammer();
		
		Items.mushroom_stew.setMaxStackSize(16);
	}
	
	public static void register()
	{
		registerItems();
		registerRecipes();
		registerCrafts();
		GameRegistry.registerFuelHandler(new MyFuelHandler());
	}
	
	public static void registerItems()
	{
		GameRegistry.registerItem(rawEgg,               "Raw_egg");
		GameRegistry.registerItem(cookedEgg,            "Cooked_egg");
		GameRegistry.registerItem(caramel,              "Caramel");
		GameRegistry.registerItem(rawSkeweredBeef,      "Raw_skewered_beef");
		GameRegistry.registerItem(rawSkeweredPig,       "Raw_skewered_pig");
		GameRegistry.registerItem(rawSkeweredZombie,    "Raw_skewered_zombie");
		GameRegistry.registerItem(cookedSkeweredBeef,   "Cooked_skewered_beef");
		GameRegistry.registerItem(cookedSkeweredPig,    "Cooked_skewered_pig");
		GameRegistry.registerItem(cookedSkeweredZombie, "Cooked_skewered_zombie");
		GameRegistry.registerItem(omelet,               "Omelet");
		GameRegistry.registerItem(cookedMushroom,       "CookedMushroom");
		GameRegistry.registerItem(carrotStew,           "CarrotStew");
		GameRegistry.registerItem(potatoStew,           "PotatoStew");
		GameRegistry.registerItem(pumpkinJuice,         "PumpkinJuice");
		GameRegistry.registerItem(woodGrid,             "WoodGrid");
		GameRegistry.registerItem(biggerStick,          "BiggerStick");
		GameRegistry.registerItem(redPowder,            "RedHealingPowder");
		GameRegistry.registerItem(yellowPowder,         "YellowHealingPowder");
		GameRegistry.registerItem(greenPowder,          "GreenHealingPowder");
		GameRegistry.registerItem(whitePowder,          "CurativePowder");
		GameRegistry.registerItem(bluePowder,           "HastePowder");
		GameRegistry.registerItem(flintSword,           "FlintSword");
		GameRegistry.registerItem(flintShovel,          "FlintShovel");
		GameRegistry.registerItem(flintAxe,             "FlintAxe");
		GameRegistry.registerItem(flintPickaxe,         "FlintPickaxe");
		GameRegistry.registerItem(flintHoe,             "FlintHoe");
		GameRegistry.registerItem(ironPowder,           "IronPowder");
		GameRegistry.registerItem(flintPowder,          "FlintPowder");
		GameRegistry.registerItem(steelCompound,        "SteelCompound");
		GameRegistry.registerItem(steelIngot,           "SteelIngot");
		GameRegistry.registerItem(steelShear,           "SteelShears");
		GameRegistry.registerItem(steelHoe,             "SteelHoe");
		GameRegistry.registerItem(steelShovel,          "SteelShovel");
		GameRegistry.registerItem(steelSword,           "SteelSword");
		GameRegistry.registerItem(steelAxe,             "SteelAxe");
		GameRegistry.registerItem(steelPickaxe,         "SteelPickaxe");
		
		GameRegistry.registerItem(steelBoots,           "SteelBoots");
		GameRegistry.registerItem(steelLegging,         "SteelLegging");
		GameRegistry.registerItem(steelHelmet,          "SteelHelmet");
		GameRegistry.registerItem(steelChestplate,      "SteelChestplate");
		GameRegistry.registerItem(breakingHammer,       "BreakingHammer");
		
	}
	
	public static void registerRecipes()
	{
		GameRegistry.addSmelting(rawEgg, new ItemStack(MyItems.cookedEgg, 1), 0.1f);
		GameRegistry.addSmelting(Items.sugar, new ItemStack(MyItems.caramel, 1), 0.1f);
		GameRegistry.addSmelting(rawSkeweredBeef, new ItemStack(cookedSkeweredBeef, 1), 0.25f);
		GameRegistry.addSmelting(rawSkeweredPig, new ItemStack(cookedSkeweredPig, 1), 0.25f);
		GameRegistry.addSmelting(rawSkeweredZombie, new ItemStack(cookedSkeweredZombie, 1), 0.25f);
		GameRegistry.addSmelting(Blocks.brown_mushroom, new ItemStack(cookedMushroom, 1), 0.1f);
		GameRegistry.addSmelting(Blocks.red_mushroom, new ItemStack(cookedMushroom, 1), 0.1f);
		
		GameRegistry.addSmelting(steelCompound, new ItemStack(steelIngot, 1), 0.2f);
	
	}
	
	public static void registerCrafts()
	{
		GameRegistry.addRecipe(new ItemStack(Items.cookie, 8), new Object[]{"Y#Y", '#', MyItems.caramel, 'Y', Items.wheat});
		GameRegistry.addShapelessRecipe(new ItemStack(rawEgg, 1), new Object[]{Items.egg});
		GameRegistry.addRecipe(new ItemStack(rawSkeweredBeef, 1), new Object[]{"  M", " M ", "/  ", 'M', Items.beef, '/', Items.stick});
		GameRegistry.addRecipe(new ItemStack(rawSkeweredPig, 1), new Object[]{"  M", " M ", "/  ", 'M', Items.porkchop, '/', Items.stick});
		GameRegistry.addRecipe(new ItemStack(rawSkeweredZombie, 1), new Object[]{"  M", " M ", "/  ", 'M', Items.rotten_flesh, '/', Items.stick});
		GameRegistry.addShapelessRecipe(new ItemStack(omelet, 1), new Object[]{cookedEgg, cookedEgg, Items.bowl});
		GameRegistry.addShapelessRecipe(new ItemStack(carrotStew, 1), new Object[]{Items.carrot, Items.carrot, Items.bowl});
		GameRegistry.addShapelessRecipe(new ItemStack(potatoStew, 1), new Object[]{Items.potato, Items.potato, Items.bowl});
		GameRegistry.addShapelessRecipe(new ItemStack(pumpkinJuice, 1), new Object[]{Blocks.pumpkin, Items.potionitem});
		
		GameRegistry.addRecipe(new ItemStack(biggerStick, 1), new Object[]{"//", "//", '/', Items.stick});
		GameRegistry.addRecipe(new ItemStack(woodGrid, 1), new Object[]{"#/#", "///", "#/#", '#', Blocks.planks, '/', Items.stick});
		
		GameRegistry.addShapelessRecipe(new ItemStack(redPowder, 1), new Object[]{yellowPowder, new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(yellowPowder, 1), new Object[]{greenPowder, new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addShapelessRecipe(new ItemStack(whitePowder, 1), new Object[]{greenPowder, new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addShapelessRecipe(new ItemStack(whitePowder, 1), new Object[]{greenPowder, new ItemStack(Items.dye, 1, 7)});
		GameRegistry.addShapelessRecipe(new ItemStack(bluePowder, 1), new Object[]{greenPowder, new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(bluePowder, 1), new Object[]{greenPowder, new ItemStack(Items.dye, 1, 6)});
		GameRegistry.addShapelessRecipe(new ItemStack(bluePowder, 1), new Object[]{greenPowder, new ItemStack(Items.dye, 1, 12)});
		GameRegistry.addShapelessRecipe(new ItemStack(greenPowder, 1), new Object[]{Items.wheat_seeds, Items.wheat_seeds, Items.sugar, Items.paper});
		GameRegistry.addShapelessRecipe(new ItemStack(greenPowder, 1), new Object[]{new ItemStack(Blocks.tallgrass, 1, 1), Items.sugar, Items.paper});
		GameRegistry.addShapelessRecipe(new ItemStack(greenPowder, 1), new Object[]{new ItemStack(Blocks.tallgrass, 1, 2), Items.sugar, Items.paper});
		
		GameRegistry.addRecipe(new ItemStack(flintShovel, 1), new Object[]{" O ", " I ", " I ", 'O', Items.flint, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(flintAxe, 1), new Object[]{"OO ", "OI ", " I ", 'O', Items.flint, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(flintAxe, 1), new Object[]{" OO", " IO", " I ", 'O', Items.flint, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(flintPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'O', Items.flint, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(flintSword, 1), new Object[]{" O ", " O ", " I ", 'O', Items.flint, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(flintHoe, 1), new Object[]{"OO ", " I ", " I ", 'O', Items.flint, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(flintHoe, 1), new Object[]{" OO", " I ", " I ", 'O', Items.flint, 'I', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(steelShovel, 1), new Object[]{" O ", " I ", " I ", 'O', steelIngot, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelAxe, 1), new Object[]{"OO ", "OI ", " I ", 'O', steelIngot, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelAxe, 1), new Object[]{" OO", " IO", " I ", 'O', steelIngot, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'O', steelIngot, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelSword, 1), new Object[]{" O ", " O ", " I ", 'O', steelIngot, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelHoe, 1), new Object[]{"OO ", " I ", " I ", 'O', steelIngot, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelHoe, 1), new Object[]{" OO", " I ", " I ", 'O', steelIngot, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(breakingHammer, 1), new Object[]{" = ", " | ", '|', Items.stick, '=', Items.iron_ingot});
		
		GameRegistry.addShapelessRecipe(new ItemStack(steelCompound, 1), new Object[]{Items.gunpowder, ironPowder, flintPowder});
		
		GameRegistry.addRecipe(new ItemStack(steelBoots, 1), new Object[]{"= =", "= =", '=', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelHelmet, 1), new Object[]{"===", "= =", '=', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelLegging, 1), new Object[]{"===", "= =", "= =", '=', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelChestplate, 1), new Object[]{"= =", "===", "===", '=', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelShear, 1), new Object[]{"= ", " =", '=', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelShear, 1), new Object[]{" =", "= ", '=', steelIngot});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ironPowder, 1), new Object[]{new ItemStack(breakingHammer.setContainerItem(breakingHammer)), Items.iron_ingot});
		GameRegistry.addShapelessRecipe(new ItemStack(flintPowder, 1), new Object[]{new ItemStack(breakingHammer.setContainerItem(breakingHammer)), Items.flint});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.flint, 1), new Object[]{new ItemStack(breakingHammer.setContainerItem(breakingHammer)), Blocks.gravel, Blocks.gravel});
	}
	
}
