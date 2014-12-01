package com.phdsteve.overfoods.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.phdsteve.overfoods.creativetab.CreativeTab;

public class FoodJuiceGoldenApple extends ItemFood
{
	public FoodJuiceGoldenApple(int i, int j, boolean b)
	{
		super(j, b);
		this.setUnlocalizedName("JuiceGoldenApple");
		this.setTextureName("overfoods:JuiceGoldenApple");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
		// TODO Add potion effects: same as golden apple, longer effect
	}
	
	ItemStack juiceGoldenAppleStack = new ItemStack(ItemRegistry.JuiceGoldenApple);
	
	public EnumAction getItemUseAction(ItemStack juiceGoldenAppleStack)
	    {
	        return EnumAction.drink;
	    }
}
