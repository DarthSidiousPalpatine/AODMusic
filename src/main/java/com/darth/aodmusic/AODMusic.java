package com.darth.aodmusic;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;

@Mod(modid = Ref.MOD_ID, name = Ref.MOD_NAME, version = Ref.MOD_VERSION)
public class AODMusic {
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Items, Blocks, Configs
		
		ItemReg.reg();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, Tile, Entity, Gui
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
