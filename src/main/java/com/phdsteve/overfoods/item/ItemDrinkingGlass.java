package com.phdsteve.overfoods.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.phdsteve.overfoods.creativetab.CreativeTab;

public class ItemDrinkingGlass extends Item
{
    public ItemDrinkingGlass(int i)
    {
    	this.setUnlocalizedName("DrinkingGlass");
        this.setTextureName("overfoods:DrinkingGlass");
        this.setMaxStackSize(8);
        this.setCreativeTab(CreativeTabs.tabAllSearch);
        this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
