package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCuttingBoard extends Item
{
	public ItemCuttingBoard()
	{
		this.setUnlocalizedName("CuttingBoard");
        this.setTextureName("overfoods:CuttingBoard");
        this.setMaxStackSize(8);
        this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
