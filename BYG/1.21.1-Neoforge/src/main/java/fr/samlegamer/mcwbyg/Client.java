package fr.samlegamer.mcwbyg;

import java.util.List;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = McwByg.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Client
{
	private static final List<String> LEAVES_NO_COLORED = List.of("mahogany", "maple");
	private static final ColorRegistry COLOR = new ColorRegistry(McwByg.MODID, LEAVES_NO_COLORED);

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR.colorsBlock(event);
	}
	
	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		COLOR.colorsItem(event);
	}
}