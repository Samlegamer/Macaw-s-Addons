package fr.samlegamer.mcwbiomesoplenty;

import java.util.List;
import fr.addonslib.api.client.ObjectColor;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;

public class Client
{
	public static final ColorRegistry COLOR = new ColorRegistry(List.of(
			new ObjectColor(McwBOP.MODID, "pine"),
			new ObjectColor(McwBOP.MODID, "mahogany"),
			new ObjectColor(McwBOP.MODID, "willow"),
			new ObjectColor(McwBOP.MODID, "palm"),
			new ObjectColor(McwBOP.MODID, "flowering_oak")
	));

	public static int deadHedgeColor(BlockAndTintGetter world, BlockPos pos)
	{
		return (world != null && pos != null) ? BiomeColors.getAverageDryFoliageColor(world, pos) : -10732494;
	}
}