package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import com.phdsteve.overfoods.init.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodJuiceCarrot extends ItemFood
{
	public FoodJuiceCarrot(int i, int j, boolean b)
	{
		super(j, b);
		this.setUnlocalizedName("JuiceCarrot");
		this.setTextureName("overfoods:JuiceCarrot");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
	
	ItemStack juceCarrotStack = new ItemStack(ItemRegistry.JuiceCarrot);
	
	public EnumAction getItemUseAction(ItemStack juiceCarrotStack)
	    {
	        return EnumAction.drink;
	    }
}
