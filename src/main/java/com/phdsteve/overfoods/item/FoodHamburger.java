package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import net.minecraft.item.ItemFood;

public class FoodHamburger extends ItemFood
{
	public FoodHamburger(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("Hamburger");
		this.setTextureName("overfoods:Hamburger");
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
