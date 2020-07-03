/*
 * BluSunrize
 * Copyright (c) 2019
 *
 * This code is licensed under "Blu's License of Common Sense"
 * Details can be found in the license file in the root folder of this project
 */

package blusunrize.immersiveengineering.common.blocks.metal;

import blusunrize.immersiveengineering.api.IEProperties;
import blusunrize.immersiveengineering.common.blocks.generic.MiscConnectorBlock;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import java.util.function.Supplier;

public class FloodlightBlock extends MiscConnectorBlock
{

	public FloodlightBlock(String name, Supplier<TileEntityType<?>> tileType)
	{
		super(name, tileType, IEProperties.ACTIVE, IEProperties.FACING_ALL);
	}

	@Override
	public int getLightValue(BlockState state, IBlockReader world, BlockPos pos)
	{
return state.get(IEProperties.ACTIVE)?15: 0;
	}

}
