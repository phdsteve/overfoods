package com.phdsteve.overfoods.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

import com.phdsteve.overfoods.creativetab.CreativeTab;

public class FoodRoastedPumpkinSeeds extends ItemFood
{
	public FoodRoastedPumpkinSeeds(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("RoastedPumpkinSeeds");
		this.setTextureName("overfoods:RoastedPumpkinSeeds");
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
