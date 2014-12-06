package com.phdsteve.overfoods.item;

import com.phdsteve.overfoods.creativetab.CreativeTab;
import com.phdsteve.overfoods.init.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRedSoloCup extends ItemFood
{

	public ItemRedSoloCup(int i, boolean b)
	{
		super(i, b);
		this.setUnlocalizedName("RedSoloCup");
	    this.setTextureName("overfoods:RedSoloCup");
	    this.setMaxStackSize(1);
	    this.setMaxDamage(0);
	    this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
	}
	
	ItemStack redSoloCupStack = new ItemStack(ItemRegistry.RedSoloCup);
	
	public EnumAction getItemUseAction(ItemStack redSoloCupStack)
	    {
	        return EnumAction.drink;
	    }
	
	ItemStack drinkingGlassStack = new ItemStack(ItemRegistry.DrinkingGlass);
	
	public ItemStack onEaten(ItemStack drinkingGlassStack, World par2World, EntityPlayer par3EntityPlayer)
    {
	    super.onFoodEaten(drinkingGlassStack, par2World, par3EntityPlayer);
	    return new ItemStack(ItemRegistry.DrinkingGlass);
    }
}
