package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import com.phdsteve.overfoods.init.ItemRegistry;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodHamburgerPatty extends ItemFood
{
	public FoodHamburgerPatty(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("HamburgerPatty");
		this.setTextureName("overfoods:HamburgerPatty");
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
}
