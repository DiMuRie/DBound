package zhang.DBound.proxy;

import zhang.DBound.DBoundItems;
import zhang.DBound.blocks.DBoundBlocks;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders()
	{
		DBoundItems.RegisterRenders();
		DBoundBlocks.registerRenders();
	}

}
