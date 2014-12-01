package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodSmoothieMelon extends ItemFood
{
	public FoodSmoothieMelon(int i, int j, boolean b)
	{
		super(j, b);
		this.setUnlocalizedName("SmoothieMelon");
		this.setTextureName("overfoods:SmoothieMelon");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
	
	ItemStack smoothieMelonStack = new ItemStack(ItemRegistry.SmoothieMelon);
	
	public EnumAction getItemUseAction(ItemStack smoothieMelonStack)
	    {
	        return EnumAction.drink;
	    }
}
