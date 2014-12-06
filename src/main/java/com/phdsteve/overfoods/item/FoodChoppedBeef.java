package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import net.minecraft.item.Item;

public class FoodChoppedBeef extends Item
{
	public FoodChoppedBeef()
	{
		this.setUnlocalizedName("ChoppedBeef");
        this.setTextureName("overfoods:ChoppedBeef");
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
