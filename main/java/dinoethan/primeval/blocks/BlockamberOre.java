package dinoethan.primeval.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockamberOre extends Block {

	public BlockamberOre(Material material) {
		super(material);
		this.setBlockName("amberOre");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(30F);
		this.setResistance(10F);
		this.setStepSound(soundTypeStone);
	}
		

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconReg) {
		blockIcon = iconReg.registerIcon("primeval" + ":" + "amberOre");
	}
}
