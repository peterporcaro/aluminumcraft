package com.aluminumcraft.init;

import com.aluminumcraft.item.ItemAC;
import com.aluminumcraft.item.ItemAluminumIngot;

import cpw.mods.fml.common.registry.GameRegistry;


public class ModItems {
	public static final ItemAC AluminumIngot = new ItemAluminumIngot();
	
	public static void init(){
		GameRegistry.registerItem(AluminumIngot, "aluminum_ingot");
	}
}
