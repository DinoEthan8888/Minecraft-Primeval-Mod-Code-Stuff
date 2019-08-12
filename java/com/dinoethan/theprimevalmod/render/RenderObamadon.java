package com.dinoethan.theprimevalmod.render;

import com.dinoethan.theprimevalmod.entities.EntityObamadon;
import com.dinoethan.theprimevalmod.render.entity.model.ModelObamadon;
import com.dinoethan.theprimevalmod.util.reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderObamadon extends RenderLiving<EntityObamadon>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(reference.MOD_ID + ":textures/entities/Obamadon/obamadon.png");
	
	public RenderObamadon(RenderManager manager) 
	{
		super(manager, new ModelObamadon(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityObamadon entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityObamadon entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}