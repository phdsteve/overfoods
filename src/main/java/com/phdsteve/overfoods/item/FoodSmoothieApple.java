package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodSmoothieApple extends ItemFood
{
	public FoodSmoothieApple(int i, int j, boolean b)
	{
		super(j, b);
		this.setUnlocalizedName("SmoothieApple");
		this.setTextureName("overfoods:SmoothieApple");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
	
	ItemStack smoothieAppleStack = new ItemStack(ItemRegistry.SmoothieApple);
	
	public EnumAction getItemUseAction(ItemStack smoothieAppleStack)
	    {
	        return EnumAction.drink;
	    }
}
