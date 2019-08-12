package com.dinoethan.theprimevalmod.entities.render;


import com.dinoethan.theprimevalmod.entities.EntityAvisaurus;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityAvisaurus.class, new IRenderFactory<EntityAvisaurus>()
		{
			@Override
			public Render<? super EntityAvisaurus> createRenderFor(RenderManager manager) 
			{
				return new RenderAvisaurus(manager);
			}
		});
	}
	
	public static void registerCustomMeshesAndStates()
	{
		//ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(ModBlock.MOLTEN_COPPER_BLOCK), new ItemMeshDefinition() 
		{	
			//@Override
			//public ModelResourceLocation getModelLocation(ItemStack stack) 
			//{
				//return new ModelResourceLocation("tutorial:molten_copper", "fluid");
			//}
		//});
		
		//ModelLoader.setCustomStateMapper(BlockInit.MOLTEN_COPPER_BLOCK, new StateMapperBase() 
		//{	
			//@Override
			//protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			//{
				//return new ModelResourceLocation("tutorial:molten_copper", "fluid");
			}
		//});
	}
}