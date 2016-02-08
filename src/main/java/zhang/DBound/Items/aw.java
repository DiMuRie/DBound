package zhang.DBound.Items;


import java.util.Set;

import com.google.common.collect.ImmutableSet;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zhang.DBound.DBoundItems;

public class aw extends ItemPickaxe {
	
	public aw(String unlocalizedName, ToolMaterial Randumium) {
		super(Randumium);
        setRegistryName("azrons_wrath");
        setUnlocalizedName("azrons_wrath");     
        GameRegistry.registerItem(this);
        setCreativeTab(CreativeTabs.tabTools);
        setMaxStackSize(1);
	}
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
	    return ImmutableSet.of("pickaxe", "spade", "axe");
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	par3EntityPlayer.capabilities.allowFlying = true;
		 return par1ItemStack;
	}
}
	
