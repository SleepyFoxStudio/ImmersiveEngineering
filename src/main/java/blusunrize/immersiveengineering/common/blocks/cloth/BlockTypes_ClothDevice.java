package blusunrize.immersiveengineering.common.blocks.cloth;

import blusunrize.immersiveengineering.common.blocks.BlockIEBase;
import net.minecraft.util.IStringSerializable;

import java.util.Locale;

public enum BlockTypes_ClothDevice implements IStringSerializable, BlockIEBase.IBlockEnum
{
	CUSHION,
	BALLOON,
	STRIPCURTAIN;

	@Override
	public String getName()
	{
		return this.toString().toLowerCase(Locale.ENGLISH);
	}
	@Override
	public int getMeta()
	{
		return ordinal();
	}
	@Override
	public boolean listForCreative()
	{
		return true;
	}
}