package com.phdsteve.overfoods;

import com.phdsteve.overfoods.init.CraftingRecipes;
import com.phdsteve.overfoods.init.FurnaceRecipes;
import com.phdsteve.overfoods.init.ItemRegistry;
import com.phdsteve.overfoods.proxy.IProxy;
import com.phdsteve.overfoods.reference.Reference;
import com.phdsteve.overfoods.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class overfoods
{
    @Mod.Instance(Reference.MOD_ID)
    public static overfoods instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Initializing 0V3R_F00D5...");
        ItemRegistry.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        CraftingRecipes.init();
        FurnaceRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("0V3R_F00D5 initialization complete.");
    }
}
