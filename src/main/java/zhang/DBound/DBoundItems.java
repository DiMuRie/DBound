package zhang.DBound;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DBoundItems {
	
	public static ToolMaterial Randumium = EnumHelper.addToolMaterial("aw", 3, 1233, 26.0F, 18.0F, 160);//h level,durability,miningspeed,atk dmg,enchantinility
	public static ToolMaterial Fantysyum = EnumHelper.addToolMaterial("fantysyum", 3, 1984, 20.0F, 23.59F, 300);
	
	public static zhang.DBound.Items.aw aw;
	public static zhang.DBound.Items.fantasysw fantasysw;

    public static void init() {
        aw = new zhang.DBound.Items.aw(null, Randumium);
        fantasysw = new zhang.DBound.Items.fantasysw(null, Fantysyum);
    }

	public static void register()
	{
	GameRegistry.registerItem(aw);
	GameRegistry.registerItem(fantasysw);
	}
	
	public static void RegisterRenders()
	{
		registerRender(aw);
		registerRender(fantasysw);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}