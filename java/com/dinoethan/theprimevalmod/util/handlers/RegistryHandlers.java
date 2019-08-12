package com.dinoethan.theprimevalmod.util.handlers;

import com.dinoethan.theprimevalmod.main;
import com.dinoethan.theprimevalmod.entities.render.RenderHandler;
import com.dinoethan.theprimevalmod.init.ModBlocks;
import com.dinoethan.theprimevalmod.init.ModEntities;
import com.dinoethan.theprimevalmod.init.ModItems;
import com.dinoethan.theprimevalmod.util.IHasModel;
import com.dinoethan.theprimevalmod.util.ModConfiguration;
import com.dinoethan.theprimevalmod.world.ModWorldGen;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandlers 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item [0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		//FluidInit.registerFluids();
		
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);

		
		//BiomeInit.registerBiomes();
		//DimensionInit.registerDimensions();
		ModEntities.registerEntities();
		RenderHandler.registerEntityRenders();
		RenderHandler.registerCustomMeshesAndStates();
		ModConfiguration.registerConfig(event);
	}
	
	public static void initRegistries(FMLInitializationEvent event)
	{
		//NetworkRegistry.INSTANCE.registerGuiHandler(main.instance, new GuiHandler());
		SoundsHandler.registerSounds();		
	}
	
	public static void postInitRegistries(FMLPostInitializationEvent event)
	{
		//WorldType COPPER = new WorldTypeCopper();
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		//event.registerServerCommand(new CommandTeleportDimension());
	}
}

