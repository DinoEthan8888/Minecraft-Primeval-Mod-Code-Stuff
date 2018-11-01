package dinoethan.primeval;

import cpw.mods.fml.common.registry.GameRegistry;
import dinoethan.primeval.items.Itemamber;
import net.minecraft.item.Item;

public class amber {
	
	public static Item amber;
	
	public static void initItems(){
		amber = new Itemamber(); GameRegistry.registerItem(amber, "amber-item");
	}

}
