package com.dinoethan.theprimevalmod.world.generators;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import com.dinoethan.theprimevalmod.blocks.trees.BlockLeavesBase;
import com.dinoethan.theprimevalmod.blocks.trees.BlockLogBase;
import com.dinoethan.theprimevalmod.blocks.trees.BlockSaplingBase;
import com.dinoethan.theprimevalmod.init.ModBlocks;

import java.util.Random;

public class WorldGenMonkeyPuzzleTree extends WorldGenAbstractTree {
    public WorldGenMonkeyPuzzleTree() {
        super(true);
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos position) {
        IBlockState log = ModBlocks.MONKEYPUZZLE_LOG.getDefaultState();
        IBlockState leaves = ModBlocks.MONKEYPUZZLE_LEAVES.getDefaultState();
        int height = rand.nextInt(10) + 10;
        int branchHeight = (int) (height / 1.3);
        for (int y = 0; y < height; y++) {
            BlockPos logPos = position.up(y);
            world.setBlockState(logPos, log);
            if (y > branchHeight) {
                for (EnumFacing facing : EnumFacing.HORIZONTALS) {
                    EnumFacing.Axis axis = facing.getAxis();
                    boolean zAxis = axis == EnumFacing.Axis.Z;
                    if (y % 2 == (facing.getAxisDirection() == EnumFacing.AxisDirection.POSITIVE ? 0 : 1)) {
                        BlockPos branch = logPos.offset(facing);
                        IBlockState facingLog = log.withProperty(BlockLogBase.LOG_AXIS, zAxis ? BlockLog.EnumAxis.Z : BlockLog.EnumAxis.X);
                        world.setBlockState(branch, facingLog);
                        this.generateClump(world, branch, 1.2, leaves);
                        if (y > branchHeight * 1.2) {
                            world.setBlockState(branch.up().offset(facing), facingLog);
                            this.generateClump(world, branch.up().offset(facing), 4, leaves);
                        }
                    }
                }
            }
        }
        if (rand.nextInt(10) == 0) {
            this.generateClump(world, position.up(height), 64, 6, leaves);
            this.generateClump(world, position.up(height), 8, 8, leaves);
        } else {
            this.generateClump(world, position.up(height), 32, 6, leaves);
            this.generateClump(world, position.up(height), 6, 6, leaves);
        }
        this.generateClump(world, position.up(height + 2), 16, 3.5, leaves);
        return true;
    }

    private void generateClump(World world, BlockPos pos, double size, IBlockState state) {
        int blockRadius = (int) Math.ceil(size);
        for (int x = -blockRadius; x < blockRadius; x++) {
            for (int y = -blockRadius; y < blockRadius; y++) {
                for (int z = -blockRadius; z < blockRadius; z++) {
                    if (Math.abs(x * x + y * y + z * z) <= size) {
                        BlockPos leafPos = pos.add(x, y, z);
                        if (world.isAirBlock(leafPos)) {
                            this.setBlockState(world, leafPos, state);
                        }
                    }
                }
            }
        }
    }

    private void generateClump(World world, BlockPos pos, double size, double sizeY, IBlockState state) {
        int blockRadius = (int) Math.ceil(size);
        for (int x = -blockRadius; x < blockRadius; x++) {
            for (int y = -blockRadius; y < blockRadius; y++) {
                for (int z = -blockRadius; z < blockRadius; z++) {
                    if (Math.abs(x * x + (y * y * (size / sizeY)) + z * z) <= size) {
                        BlockPos leafPos = pos.add(x, y, z);
                        if (world.isAirBlock(leafPos)) {
                            this.setBlockState(world, leafPos, state);
                        }
                    }
                }
            }
        }
    }

    private void setBlockState(World world, BlockPos pos, IBlockState state) {
        Block block = world.getBlockState(pos).getBlock();
        if (this.canGrowInto(block) || block instanceof BlockLeavesBase || block instanceof BlockSaplingBase || block instanceof BlockLogBase) {
            world.setBlockState(pos, state);
        }
    }
}
