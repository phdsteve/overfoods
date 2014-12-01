package com.phdsteve.overfoods.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.phdsteve.overfoods.creativetab.CreativeTab;

public class FoodJuiceGoldenCarrot extends ItemFood
{
	public FoodJuiceGoldenCarrot(int i, int j, boolean b)
	{
		super(j, b);
		this.setUnlocalizedName("JuiceGoldenCarrot");
		this.setTextureName("overfoods:JuiceGoldenCarrot");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
		// TODO Add potion effects: same as golden apple
	}
	
	ItemStack juiceGoldenCarrotStack = new ItemStack(ItemRegistry.JuiceGoldenCarrot);
	
	public EnumAction getItemUseAction(ItemStack juiceGoldenCarrotStack)
	    {
	        return EnumAction.drink;
	    }
}
