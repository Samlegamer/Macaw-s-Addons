package fr.samlegamer.mcwaurora;

import fr.addonslib.api.client.McwColors;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = McwAurora.MODID, value = Dist.CLIENT)
public class Client
{
	private static final ColorRegistry colors = new ColorRegistry(new McwColors(getHedges()));

	private static List<String> getHedges()
	{
		List<String> hedges = new ArrayList<>();
		for(String wood : McwAurora.WOOD_NOMANSLAND)
		{
			hedges.add(Finder.makeIdHedge(McwAurora.MODID, wood));
		}
		return hedges;
	}

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		colors.registryBlockColorsAverage(event);
	}
	
	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		colors.registryItemColors(event);
	}
}