package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSlicedPotatoes extends Item
{
	public ItemSlicedPotatoes(int i)
	{
		this.setUnlocalizedName("SlicedPotatoes");
        this.setTextureName("overfoods:SlicedPotatoes");
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabs.tabAllSearch);
        this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
