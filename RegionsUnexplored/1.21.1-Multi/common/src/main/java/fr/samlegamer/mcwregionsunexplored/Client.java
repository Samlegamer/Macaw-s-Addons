package fr.samlegamer.mcwregionsunexplored;

import java.awt.*;
import java.util.List;

import fr.addonslib.api.client.ObjectColor;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import static net.regions_unexplored.client.color.RuColors.getAspenColor;

public class Client
{
	public static final ColorRegistry COLOR = new ColorRegistry(List.of(
			new ObjectColor(McwRegionsUnexplored.MODID, "baobab"),
			new ObjectColor(McwRegionsUnexplored.MODID, "cypress"),
			new ObjectColor(McwRegionsUnexplored.MODID, "eucalyptus"),
			new ObjectColor(McwRegionsUnexplored.MODID, "joshua"),
			new ObjectColor(McwRegionsUnexplored.MODID, "maple"),
			new ObjectColor(McwRegionsUnexplored.MODID, "palm"),
			new ObjectColor(McwRegionsUnexplored.MODID, "pine"),
			new ObjectColor(McwRegionsUnexplored.MODID, "redwood"),
			new ObjectColor(McwRegionsUnexplored.MODID, "willow"),
			new ObjectColor(McwRegionsUnexplored.MODID, "socotra"),
			new ObjectColor(McwRegionsUnexplored.MODID, "kapok"),
			new ObjectColor(McwRegionsUnexplored.MODID, "magnolia"),
			new ObjectColor(McwRegionsUnexplored.MODID, "sky_wisteria", 8507385),
			new ObjectColor(McwRegionsUnexplored.MODID, "lavender_wisteria", 12817647),
			new ObjectColor(McwRegionsUnexplored.MODID, "salmon_wisteria", 16753581)
	));

	public static final int SILVER_ITEM_COLOR = Color.getHSBColor(0.15F, 0.8F, 1.0F).getRGB();

	public static int aspenBlock(BlockAndTintGetter world, BlockPos pos) {
		return world != null && pos != null ? getAspenColor(world, pos) : FoliageColor.getDefaultColor();
	}
}