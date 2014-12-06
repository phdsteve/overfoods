package com.phdsteve.overfoods.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.phdsteve.overfoods.creativetab.CreativeTab;

public class ItemJuicer extends Item
{
    public ItemJuicer()
    {
    	this.setUnlocalizedName("Juicer");
        this.setTextureName("overfoods:Juicer");
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTab.OVERFOODS_TAB);
        this.setContainerItem(Items.bucket);
    }
}
