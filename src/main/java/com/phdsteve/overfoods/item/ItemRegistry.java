package com.phdsteve.overfoods.item;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegistry
{
	// Tools (2001 - 2100)
	public static Item Blender = new ItemBlender(2001);
	public static Item CuttingBoard = new ItemCuttingBoard(2002);
	public static Item DrinkingGlass = new ItemDrinkingGlass(2003);
	public static Item Juicer = new ItemJuicer(2004);
	public static Item RedSoloCup = new ItemRedSoloCup(2005, 0, false);
	
	// Food intermediates (2101 - 2300)
    public static Item SlicedPotatoes = new ItemSlicedPotatoes(2101);
    
    // Foods (2301 and up)
 	public static Item JuiceApple = new FoodJuiceApple(2301, 2, false);
    public static Item JuiceCarrot = new FoodJuiceCarrot(2302, 2, false);
    public static Item JuiceMelon = new FoodJuiceMelon(2303, 2, false);
    public static Item RoastedPumpkinSeeds = new FoodRoastedPumpkinSeeds(2304, 2, false);
    public static Item SmoothieApple = new FoodSmoothieApple(2305, 3, false);
    public static Item SmoothieMelon = new FoodSmoothieMelon(2306, 3, false);
    public static Item JuiceGoldenApple = new FoodJuiceGoldenApple(2307, 4, false);
    public static Item JuiceGoldenCarrot = new FoodJuiceGoldenCarrot(2308, 4, false);
    public static Item FrenchFries = new FoodFrenchFries(2309, 4, false);
    public static Item AppleCider = new FoodAppleCider(2310, 4, false);
    public static Item PurpleDrank = new FoodPurpleDrank(2311, 4, false);
	
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
