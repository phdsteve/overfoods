package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBlender extends Item
{
	public ItemBlender()
	{
		this.setUnlocalizedName("Blender");
        this.setTextureName("overfoods:Blender");
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
