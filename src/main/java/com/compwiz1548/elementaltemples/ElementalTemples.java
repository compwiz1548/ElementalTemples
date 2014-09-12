package com.compwiz1548.elementaltemples;

import com.compwiz1548.elementaltemples.handler.ConfigurationHandler;
import com.compwiz1548.elementaltemples.init.ModBlocks;
import com.compwiz1548.elementaltemples.init.ModItems;
import com.compwiz1548.elementaltemples.proxy.IProxy;
import com.compwiz1548.elementaltemples.reference.Reference;
import com.compwiz1548.elementaltemples.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ElementalTemples
{
    @Mod.Instance(Reference.MOD_ID)
    public static ElementalTemples instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Load network handling, mod config, items/blocks
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();
        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Register GUI, tile entities, crafting recipes, general event handling
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //anything you want to run after all the other mods have finished their initialization
        LogHelper.info("Post Initialization Complete!");
    }
}
