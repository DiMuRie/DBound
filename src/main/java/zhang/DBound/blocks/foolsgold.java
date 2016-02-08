package zhang.DBound.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class foolsgold extends Block {

	public foolsgold(Material material) {
		super(material);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setUnlocalizedName("foolsgold");
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeMetal);
    }
}
	


   


