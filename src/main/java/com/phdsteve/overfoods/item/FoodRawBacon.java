package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import net.minecraft.item.Item;

public class FoodRawBacon extends Item
{
	public FoodRawBacon()
	{
		this.setUnlocalizedName("RawBacon");
        this.setTextureName("overfoods:RawBacon");
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
