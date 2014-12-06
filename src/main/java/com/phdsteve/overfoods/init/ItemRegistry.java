package com.phdsteve.overfoods.init;

import com.phdsteve.overfoods.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemRegistry
{
	// Tools
	public static Item Blender = new ItemBlender();
	public static Item CuttingBoard = new ItemCuttingBoard();
	public static Item DrinkingGlass = new ItemDrinkingGlass();
	public static Item Juicer = new ItemJuicer();
	public static Item RedSoloCup = new ItemRedSoloCup(0, false);

	// Food intermediates
	public static Item SlicedPotatoes = new FoodSlicedPotatoes(3, false);
	public static Item ChoppedBeef = new FoodChoppedBeef();
	public static Item Flour = new FoodFlour();
	public static Item RawBacon = new FoodRawBacon();

	// Foods
	public static Item JuiceApple = new FoodJuiceApple(2, false);
	public static Item JuiceCarrot = new FoodJuiceCarrot(2, false);
	public static Item JuiceMelon = new FoodJuiceMelon(2, false);
	public static Item RoastedPumpkinSeeds = new FoodRoastedPumpkinSeeds(2, false);
	public static Item SmoothieApple = new FoodSmoothieApple(3, false);
	public static Item SmoothieMelon = new FoodSmoothieMelon(3, false);
	public static Item JuiceGoldenApple = new FoodJuiceGoldenApple(4, false);
	public static Item JuiceGoldenCarrot = new FoodJuiceGoldenCarrot(4, false);
	public static Item FrenchFries = new FoodFrenchFries(4, false);
	public static Item AppleCider = new FoodAppleCider(4, false);
	public static Item PurpleDrank = new FoodPurpleDrank(4, false);
	public static Item HamburgerPatty = new FoodHamburgerPatty(3, false);
	public static Item BreadSlice = new FoodBreadSlice(1, false);
	public static Item Hamburger = new FoodHamburger(5, false);
	//TODO Add food item: Cheese (Fermented spider eye, magma cream, milk bucket, returns bucket)
	//TODO Add food item: Cheeseburger (hamburger + cheese)
	public static Item Bacon = new FoodBacon(2, false);
	//TODO Add food item: Bacon Cheeseburger (cheeseburger + bacon)
	//TODO Add food item: Cheese sandwich (sliced bread + cheese)
	//TODO Add food item: Grilled Cheese Sandwich (Cooked cheese sandwich)
	//TODO Add food item: Beef Stew (Steak in mushroom soup recipe)
	//TODO Add food item: Pork Stew (Porkchop in mushroom soup recipe)
	//TODO Add food item: Fish Stew (Cooked fish in mushroom soup recipe)
	//TODO Add food item: Chicken Stew (Chicken in mushroom soup recipe)
	//TODO Add food item: Porkchop Sandwich (bread slices + porkchop)
	//TODO Add food item: Chicken Sandwich (bread slices + chicken)
	//TODO Add food item: Fish Sandwich (bread slices + cooked fish)
	//TODO Add food item: Steak Sandwich (bread slices + steak)

	//TODO Add food item: Mini Blast Burger (Hamburger + fire charge, gives resistance)
	//TODO Add food item: Blast Burger (Hamburger + TNT, regen 30 sec, instant TNT blast that only damages mobs)
	//TODO Add food item: Slime Burger (slime ball + sliced bread, jump boost 15 sec)
	//TODO Add food item: Carrot Cake
	//TODO Add food item: Chocolate Cake
	//TODO Add food item: Milk
	//TODO Add food item: Chocolate Milk
	//TODO Add food item: Mystery Meatloaf (any 3 foods + rotten flesh, regen 30 sec, nausea 10 sec, always edible)
	//TODO Add food item: Mashed Potatoes (baked potato + blender, strength + slowness 10 sec)
	//TODO Add food item: Special Cookie (grass + cookie, jump boost + slowness 20 sec)
	//TODO Add food item: Energy Drink (5 cocoa + redstone + glowstone + blender + milk, high speed boost 30 sec, slowness 15 sec following)
	//TODO Add food item: Apple Pie (pumpkin pie recipe, sub apple)
	//TODO Add food item: Chocolate pie (pumpkin pie recipe, sub cocoa)
	//TODO Add food item: Mrs. Lovett's Meat Pie (pumpkin pie recipe, sub rotten flesh)
	//TODO Add food item: Milkshake (milk + snowball + blender)
	//TODO Add food item: Chocolate Milkshake (Milkshake + Cocoa + blender)
	//TODO Add food item: Pumpkin Milkshake (Milkshake + pumpkin + blender)

	//TODO Add something to do with rotten potatoes
	//TODO Add something to do with rotten flesh
	//TODO Craft blender with dye to color blender

	// Item registry
	public static void init()
	{
		// Tools
		GameRegistry.registerItem(Blender, "Blender");
		GameRegistry.registerItem(CuttingBoard, "CuttingBoard");
		GameRegistry.registerItem(DrinkingGlass, "DrinkingGlass");
		GameRegistry.registerItem(Juicer, "Juicer");
		GameRegistry.registerItem(RedSoloCup, "RedSoloCup");

		// Food intermediates
		GameRegistry.registerItem(SlicedPotatoes, "SlicedPotatoes");
		GameRegistry.registerItem(ChoppedBeef, "ChoppedBeef");
		GameRegistry.registerItem(Flour, "Flour");
		GameRegistry.registerItem(RawBacon, "RawBacon");

		// Foods
		GameRegistry.registerItem(JuiceApple, "JuiceApple");
		GameRegistry.registerItem(JuiceCarrot, "JuiceCarrot");
		GameRegistry.registerItem(JuiceMelon, "JuiceMelon");
		GameRegistry.registerItem(RoastedPumpkinSeeds, "RoastedPumpkinSeeds");
		GameRegistry.registerItem(SmoothieApple, "SmoothieApple");
		GameRegistry.registerItem(SmoothieMelon, "SmoothieMelon");
		GameRegistry.registerItem(JuiceGoldenApple, "JuiceGoldenApple");
		GameRegistry.registerItem(JuiceGoldenCarrot, "JuiceGoldenCarrot");
		GameRegistry.registerItem(FrenchFries, "FrenchFries");
		GameRegistry.registerItem(AppleCider, "AppleCider");
		GameRegistry.registerItem(PurpleDrank, "PurpleDrank");
		GameRegistry.registerItem(HamburgerPatty, "HamburgerPatty");
		GameRegistry.registerItem(BreadSlice, "BreadSlice");
		GameRegistry.registerItem(Hamburger, "Hamburger");
		//cheese
		//cheeseburger
		GameRegistry.registerItem(Bacon, "Bacon");
	}
}
