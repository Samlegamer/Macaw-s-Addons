package fr.samlegamer.mcwbiomesoplenty;

import java.util.List;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = McwBOP.MODID, value = Dist.CLIENT)
public class Client
{
	private static final List<String> LEAVES_NO_COLORED = List.of("pine", "mahogany", "willow", "palm", "flowering_oak");
	private static final ColorRegistry COLOR = new ColorRegistry(McwBOP.MODID, LEAVES_NO_COLORED);

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR.colorsBlock(event);
		event.register((state, world, pos, tintIndex) ->
				(world != null && pos != null) ? BiomeColors.getAverageDryFoliageColor(world, pos) : -10732494, Finder.findBlock(McwBOP.MODID, "dead_hedge"));
	}
}