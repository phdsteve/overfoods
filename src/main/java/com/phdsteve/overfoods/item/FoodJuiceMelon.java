package com.phdsteve.overfoods.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.phdsteve.overfoods.creativetab.CreativeTab;

public class FoodJuiceMelon extends ItemFood
{
	public FoodJuiceMelon(int i, int j, boolean b)
	{
		super(j, b);
		this.setUnlocalizedName("JuiceMelon");
		this.setTextureName("overfoods:JuiceMelon");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}	
	
	ItemStack juiceMelonStack = new ItemStack(ItemRegistry.JuiceMelon);
	
	public EnumAction getItemUseAction(ItemStack juiceMelonStack)
	    {
	        return EnumAction.drink;
	    }
}
