package com.dinoethan.theprimevalmod.api;


import com.dinoethan.theprimevalmod.util.reference;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderingHandler {
    private static final Minecraft MINECRAFT = Minecraft.getMinecraft();

    @SuppressWarnings("deprecation")
    public void onPreInit() {

    }

    @SuppressWarnings("deprecation")
    public void onInit() {
       

    }

    public void onPostInit() {
    }

    public void registerItemRenderer(Item item, String path, String type) {
        this.registerItemRenderer(item, 0, path, type);
    }

    public void registerItemRenderer(Item item, int meta, String path, String type) {
        ModelResourceLocation resource = new ModelResourceLocation(reference.MOD_ID + ":" + path, type);
        ModelLoader.setCustomModelResourceLocation(item, meta, resource);
    }

    public void registerBlockRenderer(Block block, int meta, String path, String type) {
        this.registerItemRenderer(Item.getItemFromBlock(block), meta, path, type);
    }

    public void registerBlockRenderer(Block block, final String path, final String type) {
        this.registerBlockRenderer(block, 0, path, type);
    }
}