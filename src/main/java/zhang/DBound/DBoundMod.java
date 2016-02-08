package zhang.DBound;


import org.apache.logging.log4j.Logger;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zhang.DBound.blocks.DBoundBlocks;
import zhang.DBound.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, dependencies = "required-after:Forge@[11.15.1.1726,)", useMetadata = true)

public class DBoundMod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	    @Mod.Instance
	    public static DBoundMod instance;

	    public static Logger logger;

	    @Mod.EventHandler
	    public void preInit(FMLPreInitializationEvent event) {
	        DBoundItems.init();
	        DBoundBlocks.init();
	    	DBoundItems.register();
	    	DBoundBlocks.register();
	    }

	    @Mod.EventHandler
	    public void init(FMLInitializationEvent e) {
	    	proxy.registerRenders();
	    	zhang.DBound.crafting.ModCrafting.initCrafting();
	    	GameRegistry.registerWorldGenerator(new DBoundWorldGen(), 0);
	    	
	    }

	    @Mod.EventHandler
	    public void postInit(FMLPostInitializationEvent e) {
	    }
}
