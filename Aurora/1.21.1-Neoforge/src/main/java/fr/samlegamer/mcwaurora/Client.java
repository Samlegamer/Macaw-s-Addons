package fr.samlegamer.mcwaurora;

import fr.addonslib.api.client.ObjectColor;
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
	private static final ColorRegistry colors = new ColorRegistry(getHedges());

	private static List<ObjectColor> getHedges()
	{
		List<ObjectColor> hedges = new ArrayList<>();
		for(String wood : McwAurora.WOOD_NOMANSLAND)
		{
			hedges.add(new ObjectColor(McwAurora.MODID, wood));
		}
		return hedges;
	}

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		colors.registryBlockColors(event);
	}
	
	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		colors.registryItemColors(event);
	}
}