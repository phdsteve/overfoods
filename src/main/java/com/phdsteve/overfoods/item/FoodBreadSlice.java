package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import net.minecraft.item.ItemFood;

public class FoodBreadSlice extends ItemFood
{
	public FoodBreadSlice(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("BreadSlice");
		this.setTextureName("overfoods:BreadSlice");
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
