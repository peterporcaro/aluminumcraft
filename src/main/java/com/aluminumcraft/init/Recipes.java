package com.aluminumcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {
	public static void init() {
		GameRegistry.addRecipe(new ItemStack(Items.diamond_sword), " d ", " d ", " d ", 'd', new ItemStack(Blocks.dirt));
		GameRegistry.addRecipe(new ItemStack(Items.diamond_pickaxe), "ddd", " d ", " d ", 'd', new ItemStack(Blocks.dirt));
		GameRegistry.addRecipe(new ItemStack(Items.diamond_shovel), " dd", " d ", " d ", 'd', new ItemStack(Blocks.dirt));
		GameRegistry.addRecipe(new ItemStack(Items.diamond_axe), "dd ", "dd ", " d ", 'd', new ItemStack(Blocks.dirt));
	}
}
