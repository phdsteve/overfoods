package com.phdsteve.overfoods.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class FurnaceRecipes
{
   public static void init()
   {
	   // Tools
	   
	   // Food intermediates
	   
	   // Foods
	   GameRegistry.addSmelting(Items.pumpkin_seeds, new ItemStack(ItemRegistry.RoastedPumpkinSeeds), 0.1f);
	   GameRegistry.addSmelting(ItemRegistry.JuiceApple, new ItemStack(ItemRegistry.AppleCider), 0.1f);
	   GameRegistry.addSmelting(ItemRegistry.SlicedPotatoes, new ItemStack(ItemRegistry.FrenchFries), 0.1f);
	   GameRegistry.addSmelting(ItemRegistry.ChoppedBeef, new ItemStack(ItemRegistry.HamburgerPatty), 0.1f);
	   GameRegistry.addSmelting(ItemRegistry.Flour, new ItemStack(Items.bread), 0.1f);
	   GameRegistry.addSmelting(ItemRegistry.RawBacon, new ItemStack(ItemRegistry.Bacon), 0.1f);
   }
}
