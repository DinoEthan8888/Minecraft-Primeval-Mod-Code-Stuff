package dinoethan.primeval;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import dinoethan.primeval.lib.Reference;

@Mod(name = Reference.MOD_NAME, modid = "primeval", version = Reference.MOD_VER)
public class ThePrimevalMod {
	
	
	public static Logger log = FMLLog.getLogger();
	int amberOreID = 500;
	int amberID = 501;
	int amberSwordID = 503;
	public static Item amberSword;
	int amberPickaxeID = 504;
    public static Item amberPickaxe;
    int amberAxeID = 505;
	public static Item amberAxe;
	int amberShovelID = 506;
	public static Item amberSpade;
	int amberHoeID = 507;
	public static Item amberHoe;
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		amberOre.initBlocks();
		amber.initItems();
		log.info("Mod PreInit");	
		amberSword = new amberSword(amberSwordID, Item.ToolMaterial.EMERALD).setUnlocalizedName("amberSword").setCreativeTab(CreativeTabs.tabCombat);
		amberPickaxe = new amberSword(amberPickaxeID, Item.ToolMaterial.EMERALD).setUnlocalizedName("amberPickaxe").setCreativeTab(CreativeTabs.tabTools);
		amberAxe = new amberSword(amberAxeID, Item.ToolMaterial.EMERALD).setUnlocalizedName("amberAxe").setCreativeTab(CreativeTabs.tabTools);
		amberSpade = new amberSword(amberShovelID, Item.ToolMaterial.EMERALD).setUnlocalizedName("amberShovel").setCreativeTab(CreativeTabs.tabTools);
		amberHoe = new amberSword(amberHoeID, Item.ToolMaterial.EMERALD).setUnlocalizedName("amberHoe").setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(amberSword, "amberSword");
		GameRegistry.registerItem(amberPickaxe, "amberPickaxe");
		GameRegistry.registerItem(amberAxe, "amberAxe");
		GameRegistry.registerItem(amberSpade, "amberShovel");
		GameRegistry.registerItem(amberHoe, "amberHoe");
		
    }

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		log.info("Mod Init");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		log.info("Mod PostInit");	
	}
	
}	