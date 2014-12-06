package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.init.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.phdsteve.overfoods.creativetab.CreativeTab;

public class FoodAppleCider extends ItemFood
{
	public FoodAppleCider(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("AppleCider");
		this.setTextureName("overfoods:AppleCider");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
	
	ItemStack appleCiderStack = new ItemStack(ItemRegistry.AppleCider);
	
	public EnumAction getItemUseAction(ItemStack appleCiderStack)
	    {
	        return EnumAction.drink;
	    }
}
