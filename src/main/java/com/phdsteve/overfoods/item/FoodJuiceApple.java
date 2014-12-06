package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.init.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.phdsteve.overfoods.creativetab.CreativeTab;

public class FoodJuiceApple extends ItemFood
{
	public FoodJuiceApple(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("JuiceApple");
		this.setTextureName("overfoods:JuiceApple");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
	
	ItemStack juiceAppleStack = new ItemStack(ItemRegistry.JuiceApple);
	
	public EnumAction getItemUseAction(ItemStack juiceAppleStack)
	    {
	        return EnumAction.drink;
	    }
}
