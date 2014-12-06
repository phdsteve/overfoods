package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodSlicedPotatoes extends ItemFood
{
	public FoodSlicedPotatoes(int i, boolean b)
	{
        super(i, b);
		this.setUnlocalizedName("SlicedPotatoes");
        this.setTextureName("overfoods:SlicedPotatoes");
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
