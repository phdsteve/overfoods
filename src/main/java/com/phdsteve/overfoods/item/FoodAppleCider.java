package com.phdsteve.overfoods.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.phdsteve.overfoods.creativetab.CreativeTab;

public class FoodAppleCider extends ItemFood
{
	public FoodAppleCider(int i, int j, boolean b)
	{
		super(j, b);
		this.setUnlocalizedName("AppleCider");
		this.setTextureName("overfoods:AppleCider");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
	
	ItemStack appleCiderStack = new ItemStack(ItemRegistry.AppleCider);
	
	public EnumAction getItemUseAction(ItemStack appleCiderStack)
	    {
	        return EnumAction.drink;
	    }
}
