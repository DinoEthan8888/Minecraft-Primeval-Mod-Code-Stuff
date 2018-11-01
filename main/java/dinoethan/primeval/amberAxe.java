package dinoethan.primeval;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.util.IIcon;

public class amberAxe extends ItemAxe{
	

	private IIcon itemIcon;

	public amberAxe(int id, Item.ToolMaterial mat){
	    super(mat);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister reg){
    	this.itemIcon = reg.registerIcon("amber:amberAxe");}

}
