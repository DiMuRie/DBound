package zhang.DBound.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zhang.DBound.Reference;
import zhang.DBound.blocks.house_wall;

public final class DBoundBlocks {
	
    public static zhang.DBound.blocks.foolsgold foolsgold;
    public static zhang.DBound.blocks.big_stairs big_stairs;
    public static zhang.DBound.blocks.house_wall house_wall;
    public static zhang.DBound.blocks.rainbow_wall rainbow_wall;

    public static void init() {
        foolsgold = new foolsgold(Material.iron);
        big_stairs=new big_stairs(Material.cloth);
        house_wall=new house_wall(Material.rock);
        rainbow_wall=new rainbow_wall(Material.rock);
    }
    public static void register()
    {
    	GameRegistry.registerBlock(foolsgold, foolsgold.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(big_stairs, big_stairs.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(house_wall, house_wall.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(rainbow_wall, rainbow_wall.getUnlocalizedName().substring(5));
    }
    public static void registerRenders()
    {
    	registerRender(foolsgold);
    	registerRender(big_stairs);
    	registerRender(house_wall);
    	registerRender(rainbow_wall);
    
    }
    
    public static void registerRender(Block block)
    {
    	Item item = Item.getItemFromBlock(block);
    	//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
    
    
}

