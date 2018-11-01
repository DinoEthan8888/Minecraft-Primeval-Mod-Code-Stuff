package dinoethan.primeval;

import cpw.mods.fml.common.registry.GameRegistry;
import dinoethan.primeval.blocks.BlockamberOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class amberOre {
	
	public static Block amberOre;
	public static void initBlocks(){
		amberOre = new BlockamberOre(Material.rock); 
		GameRegistry.registerBlock(amberOre, "amberOre");
	}
}
