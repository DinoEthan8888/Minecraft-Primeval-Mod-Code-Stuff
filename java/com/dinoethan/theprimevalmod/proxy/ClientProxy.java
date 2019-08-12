package com.dinoethan.theprimevalmod.proxy;

import com.dinoethan.theprimevalmod.api.DefaultRenderedItem;
import com.dinoethan.theprimevalmod.api.IgnoreRenderProperty;
import com.dinoethan.theprimevalmod.api.RenderingHandler;
import com.dinoethan.theprimevalmod.api.SubtypeRenderedItem;
import com.dinoethan.theprimevalmod.blocks.fence.BlockFenceGateBase;
import com.dinoethan.theprimevalmod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy 
{
	@SideOnly(Side.CLIENT)
    public static final RenderingHandler RENDER_HANDLER = new RenderingHandler();
	
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	@Override
	public void registerModel(Item item, int metadata) 
	{
		ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

