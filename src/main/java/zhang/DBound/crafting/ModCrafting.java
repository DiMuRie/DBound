package zhang.DBound.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zhang.DBound.DBoundItems;
import zhang.DBound.Items.aw;
import zhang.DBound.blocks.DBoundBlocks;

public final class ModCrafting {
	
	
	public static void initCrafting() {
	GameRegistry.addRecipe(new ItemStack(DBoundItems.aw), new Object[] {"###", " I ", " I ", '#', Blocks.iron_block, 'I', Blocks.diamond_ore});
	GameRegistry.addRecipe(new ItemStack(DBoundBlocks.big_stairs, 8), new Object[] {"###", " G ", "###", '#', Blocks.hardened_clay , 'G', Blocks.glowstone});
	GameRegistry.addRecipe(new ItemStack(DBoundBlocks.house_wall, 64), new Object[] {"###", " G ", "###", '#', Items.wooden_axe , 'G', Items.paper});
	GameRegistry.addRecipe(new ItemStack(DBoundBlocks.rainbow_wall, 64), new Object[] {"###", " G ", "###", '#', Items.stick , 'G', Items.paper});
	}
}
