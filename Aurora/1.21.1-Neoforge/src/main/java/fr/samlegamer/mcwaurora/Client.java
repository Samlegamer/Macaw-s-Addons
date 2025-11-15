package fr.samlegamer.mcwaurora;

import fr.samlegamer.addonslib.client.ColorRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = McwAurora.MODID, value = Dist.CLIENT)
public class Client
{
	private static final ColorRegistry colors = new ColorRegistry(McwAurora.MODID, McwAurora.WOOD_NOMANSLAND);

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		colors.colorsBlock(event);
	}
	
	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		colors.colorsItem(event);
	}
}