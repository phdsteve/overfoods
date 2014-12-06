package com.phdsteve.overfoods.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingRecipes
{
	public static void init()
	{
		// Minecraft ItemStacks
		ItemStack stoneStack = new ItemStack(Blocks.stone);
		ItemStack stonePlateStack = new ItemStack(Blocks.stone_pressure_plate);
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
		ItemStack beefStack = new ItemStack(Items.beef);
		ItemStack shearsStack = new ItemStack(Items.shears);
		ItemStack ironBlockStack = new ItemStack(Blocks.iron_block);
		ItemStack wheatStack = new ItemStack(Items.wheat);
		ItemStack breadStack = new ItemStack(Items.bread);
		ItemStack porkchopStack = new ItemStack(Items.porkchop);

		// Mod ItemStacks
		ItemStack drinkingGlassStack = new ItemStack(ItemRegistry.DrinkingGlass);
		ItemStack juicerStack = new ItemStack(ItemRegistry.Juicer);
		ItemStack blenderStack = new ItemStack(ItemRegistry.Blender);
		ItemStack appleJuiceStack = new ItemStack(ItemRegistry.JuiceApple);
		ItemStack melonJuiceStack = new ItemStack(ItemRegistry.JuiceMelon);
		ItemStack breadSliceStack = new ItemStack(ItemRegistry.BreadSlice);
		ItemStack hamburgerPattyStack = new ItemStack(ItemRegistry.HamburgerPatty);

		// Tools
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.Juicer), "s", "p", 's', stoneStack, 'p', stonePlateStack);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.DrinkingGlass, 2), "p p", "p p", "ggg", 'g', glassStack, 'p', glassPaneStack);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.CuttingBoard), "i  ", " s ", "  w", 'i', ironIngotStack, 's', stickStack, 'w', woodPlankStack);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.Blender), "g", "s", "i", 'g', glassStack, 's', shearsStack, 'i', ironBlockStack);
//    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.RedSoloCup),  drinkingGlassStack, redDyeStack);

		// Food intermediates
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.SlicedPotatoes), ItemRegistry.CuttingBoard, potatoStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.ChoppedBeef, 2), ItemRegistry.CuttingBoard, beefStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.Flour), wheatStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.RawBacon), ItemRegistry.CuttingBoard, porkchopStack);

		// Foods
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.JuiceApple), "a", "j", 'a', appleStack, 'j', juicerStack);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.JuiceCarrot), "c", "j", 'c', carrotStack, 'j', juicerStack);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.JuiceMelon), "m", "j", 'm', melonStack, 'j', juicerStack);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.SmoothieApple), "s", "a", "b", 's', snowballStack, 'a', appleJuiceStack, 'b', blenderStack);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.SmoothieMelon), "s", "m", "b", 's', snowballStack, 'm', melonJuiceStack, 'b', blenderStack);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.JuiceGoldenApple), "g", "j", 'g', goldenAppleStack, 'j', juicerStack);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.JuiceGoldenCarrot), "g", "j", 'g', goldenCarrotStack, 'j', juicerStack);
//    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.PurpleDrank), Items.water_bucket, drinkingGlassStack, purpleDyeStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.BreadSlice, 8), ItemRegistry.CuttingBoard, breadStack);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.Hamburger), "b", "p", "b", 'b', breadSliceStack, 'p', hamburgerPattyStack);
	}
}