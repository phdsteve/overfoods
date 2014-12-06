package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.init.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.phdsteve.overfoods.creativetab.CreativeTab;

public class FoodJuiceGoldenApple extends ItemFood
{
	public FoodJuiceGoldenApple(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("JuiceGoldenApple");
		this.setTextureName("overfoods:JuiceGoldenApple");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
		// TODO Add potion effects: same as golden apple, longer effect
	}
	
	ItemStack juiceGoldenAppleStack = new ItemStack(ItemRegistry.JuiceGoldenApple);
	
	public EnumAction getItemUseAction(ItemStack juiceGoldenAppleStack)
	    {
	        return EnumAction.drink;
	    }
}
