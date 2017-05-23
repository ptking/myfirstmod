package com.ptking.myfirstmod;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

	public static final String MODID = "myfirstmod";
	public static final String MODNAME = "ptking first mod";
	public static final String VERSION = "0.0.1";
	
	@Instance
	public static Main instance = new Main();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		System.out.println("Called method: PreInit");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e){
		System.out.println("Called method: Init");
	}
	
	@EventHandler
	public void postInit(FMLInitializationEvent e){
		System.out.println("Called method: PostInit");
	}
}
