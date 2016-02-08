package zhang.DBound.Items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class fantasysw extends ItemSword {
		
	public fantasysw(String unlocalizedName, ToolMaterial Fantysyum) {
		super(Fantysyum);
        setRegistryName("fantasysw");
        setUnlocalizedName("fantasysw");     
        GameRegistry.registerItem(this);
        setCreativeTab(CreativeTabs.tabCombat);
        setMaxStackSize(1);
	}
	
	public void addInformation(ItemStack par1ItemStack, List par2List)
	{
		 par2List.add("Item model by Arcaniax");
		 par2List.add("Coded by DiMuRie");
		 // etc ...
	}

}
