package dinoethan.primeval;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class amberPickaxe extends ItemPickaxe{
	

	private IIcon itemIcon;

	public amberPickaxe(int id, Item.ToolMaterial mat){
	    super(mat);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister reg){
    	this.itemIcon = reg.registerIcon("amber:amberPickaxe");}
 

 }
