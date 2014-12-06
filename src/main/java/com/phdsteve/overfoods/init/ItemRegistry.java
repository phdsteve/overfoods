package com.phdsteve.overfoods.init;

import com.phdsteve.overfoods.item.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

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

	//TODO Add food item: Chopped beef (beef + cutting board)
	//TODO Add food item: Hamburger patty (cooked chopped beef)
	//TODO Add food item: Hamburger (bread slices + hamburger patty)
	//TODO Add food item: Mini Blast Burger (Hamburger + fire charge, gives resistance)
	//TODO Add food item: Blast Burger (Hamburger + TNT, regen 30 sec, instant TNT blast that only damages mobs)
	//TODO Add food item: Cheeseburger (hamburger + cheese)
	//TODO Add food item: Raw Bacon (raw porkchop + cutting board)
	//TODO Add food item: Bacon (cooked raw bacon)
	//TODO Add food item: Bacon Cheeseburger (cheeseburger + bacon)
	//TODO Add food item: Slime Burger (slime ball + sliced bread, jump boost 15 sec)
	//TODO Add food item: Carrot Cake
	//TODO Add food item: Chocolate Cake
	//TODO Add food item: Milk
	//TODO Add food item: Chocolate Milk
	//TODO Add food item: Cheese (Fermented spider eye, magma cream, milk bucket, returns bucket)
	//TODO Add food item: Cheese sandvich (sliced bread + cheese)
	//TODO Add food item: Grilled Cheese Sandwich (Cooked cheese sandwich)
	//TODO Add food item: Sliced Bread (bread + cutting board, yields 8 slices)
	//TODO Add food item: Flour (crafted wheat)
	//TODO Add food item: Bread (flour smelted)
	//TODO Add food item: Beef Stew (Steak in mushroom soup recipe)
	//TODO Add food item: Pork Stew (Porkchop in mushroom soup recipe)
	//TODO Add food item: Fish Stew (Cooked fish in mushroom soup recipe)
	//TODO Add food item: Chicken Stew (Chicken in mushroom soup recipe)
	//TODO Add food item: Porkchop Sandwich (bread slices + porkchop)
	//TODO Add food item: Chicken Sandwich (bread slices + chicken)
	//TODO Add food item: Fish Sandwich (bread slices + cooked fish)
	//TODO Add food item: Steak Sandwich (bread slices + steak)
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
	public static void iRegistry()
	{
		// Tools
		GameRegistry.registerItem(Blender,"Blender");
		GameRegistry.registerItem(CuttingBoard, "CuttingBoard");
		GameRegistry.registerItem(DrinkingGlass, "DrinkingGlass");
		GameRegistry.registerItem(Juicer, "Juicer");
		GameRegistry.registerItem(RedSoloCup, "RedSoloCup");
        
		// Food intermediates
		GameRegistry.registerItem(SlicedPotatoes, "SlicedPotatoes");
		
		// Foods
        GameRegistry.registerItem(JuiceApple, "JuiceApple");
        GameRegistry.registerItem(JuiceCarrot, "JuiceCarrot");
        GameRegistry.registerItem(JuiceMelon, "JuiceMelon");
        GameRegistry.registerItem(RoastedPumpkinSeeds, "RoastedPumpkinSeeds");
        GameRegistry.registerItem(SmoothieApple, "SmoothieApple");
        GameRegistry.registerItem(SmoothieMelon, "SmoothieMelon");
        GameRegistry.registerItem(JuiceGoldenApple,"JuiceGoldenApple");
        GameRegistry.registerItem(JuiceGoldenCarrot,"JuiceGoldenCarrot");
        GameRegistry.registerItem(FrenchFries, "FrenchFries");
        GameRegistry.registerItem(AppleCider, "AppleCider");
        GameRegistry.registerItem(PurpleDrank, "PurpleDrank");
	}

    // Crafting Registry
    public static void icRegistry()
    {
    	// Minecraft ItemStacks
    	ItemStack stoneStack = new ItemStack(Blocks.stone);
    	ItemStack stonePlateStack = new ItemStack (Blocks.stone_pressure_plate);
    	ItemStack glassStack = new ItemStack(Blocks.glass);
    	ItemStack glassPaneStack = new ItemStack(Blocks.glass_pane);
    	ItemStack ironIngotStack = new ItemStack(Items.iron_ingot);
    	ItemStack stickStack = new ItemStack(Items.stick);
    	ItemStack woodPlankStack = new ItemStack(Blocks.planks); // Dictionary for wood?
    	ItemStack redDyeStack = new ItemStack(Items.dye, 1, 1);
    	ItemStack potatoStack = new ItemStack(Items.potato);
    	ItemStack appleStack = new ItemStack(Items.apple);
    	ItemStack carrotStack = new ItemStack(Items.carrot);
    	ItemStack melonStack = new ItemStack(Items.melon);
    	ItemStack snowballStack = new ItemStack(Items.snowball);
    	ItemStack goldenAppleStack = new ItemStack(Items.golden_apple);
    	ItemStack goldenCarrotStack = new ItemStack(Items.golden_carrot);
    	ItemStack purpleDyeStack = new ItemStack(Items.dye, 5, 5);
    	
    	// Mod ItemStacks
    	ItemStack drinkingGlassStack = new ItemStack(ItemRegistry.DrinkingGlass);
    	ItemStack juicerStack = new ItemStack(ItemRegistry.Juicer);
    	ItemStack blenderStack = new ItemStack(ItemRegistry.Blender);
    	ItemStack appleJuiceStack = new ItemStack(ItemRegistry.JuiceApple);
    	ItemStack melonJuiceStack = new ItemStack(ItemRegistry.JuiceMelon);
    	
    	// Tools
    	GameRegistry.addRecipe(new ItemStack(ItemRegistry.Juicer), "s", "p", 's', stoneStack, 'p', stonePlateStack);
    	GameRegistry.addRecipe(new ItemStack(ItemRegistry.DrinkingGlass, 2), "p p", "p p", "ggg", 'g', glassStack , 'p', glassPaneStack);
    	GameRegistry.addRecipe(new ItemStack(ItemRegistry.CuttingBoard), "i  ", " s ", "  w", 'i', ironIngotStack, 's', stickStack, 'w', woodPlankStack);
    	//TODO Change blender recipe to Glass block, shears, Iron block in vertical stack
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.Blender), "s", "g", "i", 's', stickStack, 'g', glassStack, 'i', ironIngotStack);
//    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.RedSoloCup),  drinkingGlassStack, redDyeStack);

    	// Food intermediates
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.SlicedPotatoes), ItemRegistry.CuttingBoard, potatoStack);
    	
    	// Foods
    	GameRegistry.addRecipe(new ItemStack(ItemRegistry.JuiceApple), "a", "j", 'a', appleStack, 'j', juicerStack);
    	GameRegistry.addRecipe(new ItemStack(ItemRegistry.JuiceCarrot), "c", "j", 'c', carrotStack, 'j', juicerStack);
    	GameRegistry.addRecipe(new ItemStack(ItemRegistry.JuiceMelon), "m", "j", 'm', melonStack, 'j', juicerStack);
    	GameRegistry.addRecipe(new ItemStack(ItemRegistry.SmoothieApple), "s", "a", "b", 's', snowballStack, 'a', appleJuiceStack, 'b', blenderStack);
    	GameRegistry.addRecipe(new ItemStack(ItemRegistry.SmoothieMelon), "s", "m", "b", 's', snowballStack, 'm', melonJuiceStack, 'b', blenderStack);
    	GameRegistry.addRecipe(new ItemStack(ItemRegistry.JuiceGoldenApple), "g", "j", 'g', goldenAppleStack, 'j', juicerStack);
    	GameRegistry.addRecipe(new ItemStack(ItemRegistry.JuiceGoldenCarrot), "g", "j", 'g', goldenCarrotStack, 'j', juicerStack);
//    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.PurpleDrank), Items.water_bucket, drinkingGlassStack, purpleDyeStack);
    	
    }
    
    // Smelting Registry
   public static void isRegistry()
   {
	   // Tools
	   
	   // Food intermediates
	   
	   // Foods
	   GameRegistry.addSmelting(Items.pumpkin_seeds, new ItemStack(ItemRegistry.RoastedPumpkinSeeds), 0.1f);
	   GameRegistry.addSmelting(ItemRegistry.JuiceApple, new ItemStack(ItemRegistry.AppleCider), 0.1f);
	   GameRegistry.addSmelting(ItemRegistry.SlicedPotatoes, new ItemStack(ItemRegistry.FrenchFries), 0.1f);
   }
}
