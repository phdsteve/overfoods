package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodFrenchFries extends ItemFood
{
	public FoodFrenchFries(int i, int j, boolean b)
	{
		super(j, b);
		this.setUnlocalizedName("FrenchFries");
		this.setTextureName("overfoods:FrenchFries");
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
