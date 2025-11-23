package fr.samlegamer.mcwbyg;

import java.util.Arrays;
import java.util.List;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class Client
{
	private static final List<String> LEAVES_NO_COLORED = Arrays.asList("mahogany", "maple");
	private static final ColorRegistry COLOR = new ColorRegistry(McwByg.MODID, LEAVES_NO_COLORED);

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR.colorsBlock(event);
	}
}