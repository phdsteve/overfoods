package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;

import com.phdsteve.overfoods.init.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodSmoothieMelon extends ItemFood
{
	public FoodSmoothieMelon(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("SmoothieMelon");
		this.setTextureName("overfoods:SmoothieMelon");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
	
	ItemStack smoothieMelonStack = new ItemStack(ItemRegistry.SmoothieMelon);
	
	public EnumAction getItemUseAction(ItemStack smoothieMelonStack)
	    {
	        return EnumAction.drink;
	    }
}
