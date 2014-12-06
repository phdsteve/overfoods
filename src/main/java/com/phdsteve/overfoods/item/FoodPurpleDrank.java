package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import com.phdsteve.overfoods.init.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodPurpleDrank extends ItemFood
{
	public FoodPurpleDrank(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("PurpleDrank");
		this.setTextureName("overfoods:PurpleDrank");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
		// TODO Add potion effect: 10 seconds speed ii, 5 seconds darkness
	}
	
	ItemStack purpleDrankStack = new ItemStack(ItemRegistry.PurpleDrank);
	
	public EnumAction getItemUseAction(ItemStack purpleDrankStack)
	    {
	        return EnumAction.drink;
	    }
	
	//TODO Return empty bucket on crafting
}
