package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodFrenchFries extends ItemFood
{
	public FoodFrenchFries(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("FrenchFries");
		this.setTextureName("overfoods:FrenchFries");
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
