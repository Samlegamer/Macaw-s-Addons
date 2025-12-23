package fr.samlegamer.mcwbiomesoplenty;

import java.util.Arrays;
import fr.addonslib.api.client.McwColors;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = McwBOP.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Client
{
	private static final ColorRegistry COLOR = new ColorRegistry(new McwColors(Arrays.asList(
			Finder.makeIdHedge(McwBOP.MODID, "pine"),
			Finder.makeIdHedge(McwBOP.MODID, "mahogany"),
			Finder.makeIdHedge(McwBOP.MODID, "willow"),
			Finder.makeIdHedge(McwBOP.MODID, "palm"),
			Finder.makeIdHedge(McwBOP.MODID, "flowering_oak")
	)));

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR.registryBlockColorsAverage(event);
	}

	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		COLOR.registryItemColors(event);
	}
}