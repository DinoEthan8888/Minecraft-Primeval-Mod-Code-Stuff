package com.dinoethan.theprimevalmod.render.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Obamadon - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelObamadon extends ModelBase {
    public ModelRenderer UpperBody;
    public ModelRenderer Neck;
    public ModelRenderer Head;
    public ModelRenderer LowerJaw;
    public ModelRenderer UpperTail;
    public ModelRenderer LowerTail;
    public ModelRenderer Leg1;
    public ModelRenderer Leg2;
    public ModelRenderer Leg3;
    public ModelRenderer Leg4;

    public ModelObamadon() {
        this.textureWidth = 100;
        this.textureHeight = 50;
        this.Leg1 = new ModelRenderer(this, 0, 0);
        this.Leg1.setRotationPoint(-0.8F, 22.0F, -1.5F);
        this.Leg1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 0);
        this.Neck.setRotationPoint(-1.5F, 22.3F, -5.6F);
        this.Neck.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Neck, -0.4553564018453205F, 0.0F, 0.0F);
        this.Leg2 = new ModelRenderer(this, 0, 0);
        this.Leg2.setRotationPoint(-0.8F, 22.0F, -5.7F);
        this.Leg2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Leg2, -0.004886921905584123F, 0.0F, 0.0F);
        this.Leg4 = new ModelRenderer(this, 0, 0);
        this.Leg4.setRotationPoint(-2.8F, 22.0F, -5.7F);
        this.Leg4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Leg3 = new ModelRenderer(this, 0, 0);
        this.Leg3.setRotationPoint(-2.8F, 22.0F, -1.5F);
        this.Leg3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.LowerTail = new ModelRenderer(this, 0, 0);
        this.LowerTail.setRotationPoint(-2.0F, 22.5F, 4.0F);
        this.LowerTail.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(LowerTail, -0.11327186845443199F, 0.0F, 0.0F);
        this.UpperBody = new ModelRenderer(this, 0, 0);
        this.UpperBody.setRotationPoint(-2.5F, 21.5F, 0.0F);
        this.UpperBody.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(UpperBody, 0.0F, 1.5707963267948966F, 0.0F);
        this.LowerJaw = new ModelRenderer(this, 0, 0);
        this.LowerJaw.setRotationPoint(-2.34F, 21.8F, -8.58F);
        this.LowerJaw.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(LowerJaw, 0.04345869837465881F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-2.34F, 21.05F, -8.68F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Head, 0.04345869837465881F, 0.0F, 0.0F);
        this.UpperTail = new ModelRenderer(this, 0, 0);
        this.UpperTail.setRotationPoint(-2.25F, 21.75F, 0.0F);
        this.UpperTail.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(UpperTail, -0.11623892818282235F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Leg1.offsetX, this.Leg1.offsetY, this.Leg1.offsetZ);
        GlStateManager.translate(this.Leg1.rotationPointX * f5, this.Leg1.rotationPointY * f5, this.Leg1.rotationPointZ * f5);
        GlStateManager.scale(0.6D, 1.0D, 0.9D);
        GlStateManager.translate(-this.Leg1.offsetX, -this.Leg1.offsetY, -this.Leg1.offsetZ);
        GlStateManager.translate(-this.Leg1.rotationPointX * f5, -this.Leg1.rotationPointY * f5, -this.Leg1.rotationPointZ * f5);
        this.Leg1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Neck.offsetX, this.Neck.offsetY, this.Neck.offsetZ);
        GlStateManager.translate(this.Neck.rotationPointX * f5, this.Neck.rotationPointY * f5, this.Neck.rotationPointZ * f5);
        GlStateManager.scale(1.5D, 1.5D, 1.6D);
        GlStateManager.translate(-this.Neck.offsetX, -this.Neck.offsetY, -this.Neck.offsetZ);
        GlStateManager.translate(-this.Neck.rotationPointX * f5, -this.Neck.rotationPointY * f5, -this.Neck.rotationPointZ * f5);
        this.Neck.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Leg2.offsetX, this.Leg2.offsetY, this.Leg2.offsetZ);
        GlStateManager.translate(this.Leg2.rotationPointX * f5, this.Leg2.rotationPointY * f5, this.Leg2.rotationPointZ * f5);
        GlStateManager.scale(0.6D, 1.0D, 0.9D);
        GlStateManager.translate(-this.Leg2.offsetX, -this.Leg2.offsetY, -this.Leg2.offsetZ);
        GlStateManager.translate(-this.Leg2.rotationPointX * f5, -this.Leg2.rotationPointY * f5, -this.Leg2.rotationPointZ * f5);
        this.Leg2.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Leg4.offsetX, this.Leg4.offsetY, this.Leg4.offsetZ);
        GlStateManager.translate(this.Leg4.rotationPointX * f5, this.Leg4.rotationPointY * f5, this.Leg4.rotationPointZ * f5);
        GlStateManager.scale(0.6D, 1.0D, 0.9D);
        GlStateManager.translate(-this.Leg4.offsetX, -this.Leg4.offsetY, -this.Leg4.offsetZ);
        GlStateManager.translate(-this.Leg4.rotationPointX * f5, -this.Leg4.rotationPointY * f5, -this.Leg4.rotationPointZ * f5);
        this.Leg4.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Leg3.offsetX, this.Leg3.offsetY, this.Leg3.offsetZ);
        GlStateManager.translate(this.Leg3.rotationPointX * f5, this.Leg3.rotationPointY * f5, this.Leg3.rotationPointZ * f5);
        GlStateManager.scale(0.6D, 1.0D, 0.9D);
        GlStateManager.translate(-this.Leg3.offsetX, -this.Leg3.offsetY, -this.Leg3.offsetZ);
        GlStateManager.translate(-this.Leg3.rotationPointX * f5, -this.Leg3.rotationPointY * f5, -this.Leg3.rotationPointZ * f5);
        this.Leg3.render(f5);
        GlStateManager.popMatrix();
        this.LowerTail.render(f5);
        this.UpperBody.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.LowerJaw.offsetX, this.LowerJaw.offsetY, this.LowerJaw.offsetZ);
        GlStateManager.translate(this.LowerJaw.rotationPointX * f5, this.LowerJaw.rotationPointY * f5, this.LowerJaw.rotationPointZ * f5);
        GlStateManager.scale(1.66D, 0.6D, 1.0D);
        GlStateManager.translate(-this.LowerJaw.offsetX, -this.LowerJaw.offsetY, -this.LowerJaw.offsetZ);
        GlStateManager.translate(-this.LowerJaw.rotationPointX * f5, -this.LowerJaw.rotationPointY * f5, -this.LowerJaw.rotationPointZ * f5);
        this.LowerJaw.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Head.offsetX, this.Head.offsetY, this.Head.offsetZ);
        GlStateManager.translate(this.Head.rotationPointX * f5, this.Head.rotationPointY * f5, this.Head.rotationPointZ * f5);
        GlStateManager.scale(1.66D, 1.0D, 1.0D);
        GlStateManager.translate(-this.Head.offsetX, -this.Head.offsetY, -this.Head.offsetZ);
        GlStateManager.translate(-this.Head.rotationPointX * f5, -this.Head.rotationPointY * f5, -this.Head.rotationPointZ * f5);
        this.Head.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.UpperTail.offsetX, this.UpperTail.offsetY, this.UpperTail.offsetZ);
        GlStateManager.translate(this.UpperTail.rotationPointX * f5, this.UpperTail.rotationPointY * f5, this.UpperTail.rotationPointZ * f5);
        GlStateManager.scale(1.5D, 1.5D, 1.5D);
        GlStateManager.translate(-this.UpperTail.offsetX, -this.UpperTail.offsetY, -this.UpperTail.offsetZ);
        GlStateManager.translate(-this.UpperTail.rotationPointX * f5, -this.UpperTail.rotationPointY * f5, -this.UpperTail.rotationPointZ * f5);
        this.UpperTail.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
