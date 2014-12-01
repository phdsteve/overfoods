package com.phdsteve.overfoods.creativetab;

import com.phdsteve.overfoods.item.ItemRegistry;
import com.phdsteve.overfoods.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab
{
	public static final CreativeTabs OVERFOODS_TAB = new CreativeTabs(Reference.CREATIVE_TAB_NAME)
	{
		@Override
		public Item getTabIconItem()
		{
			return ItemRegistry.RedSoloCup;
		}
	};
}
