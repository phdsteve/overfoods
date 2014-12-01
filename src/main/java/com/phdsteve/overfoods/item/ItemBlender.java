package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBlender extends Item
{
	public ItemBlender(int i)
	{
		this.setUnlocalizedName("Blender");
        this.setTextureName("overfoods:Blender");
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabAllSearch);
        this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
