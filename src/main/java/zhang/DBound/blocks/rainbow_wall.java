package zhang.DBound.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class rainbow_wall extends BlockPane {
	
	
	public rainbow_wall(Material material) {
		super(material, false);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setUnlocalizedName("rainbow_wall");
        this.setHardness(0.5F);
        this.setResistance(60.0F);
        this.setStepSound(soundTypeMetal);
	  }

}




