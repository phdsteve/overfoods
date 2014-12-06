package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import net.minecraft.item.Item;

public class FoodFlour extends Item
{
	public FoodFlour()
	{
		this.setUnlocalizedName("Flour");
        this.setTextureName("overfoods:Flour");
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
