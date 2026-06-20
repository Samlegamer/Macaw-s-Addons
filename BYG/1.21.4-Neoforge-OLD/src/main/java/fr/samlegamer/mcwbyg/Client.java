package fr.samlegamer.mcwbyg;

import java.util.Arrays;
import fr.addonslib.api.client.McwColors;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = McwByg.MODID, value = Dist.CLIENT)
public class Client
{
	private static final ColorRegistry COLOR = new ColorRegistry(new McwColors(Arrays.asList(
			Finder.makeIdHedge(McwByg.MODID, "mahogany"),
			Finder.makeIdHedge(McwByg.MODID, "maple"))));

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR.registryBlockColorsAverage(event);
	}
}