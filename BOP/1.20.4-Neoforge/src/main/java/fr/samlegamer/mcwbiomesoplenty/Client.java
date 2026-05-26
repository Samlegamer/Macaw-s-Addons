package fr.samlegamer.mcwbiomesoplenty;

import java.util.List;
import fr.addonslib.api.client.ObjectColor;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.common.Mod.EventBusSubscriber.Bus;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@Mod.EventBusSubscriber(modid = McwBOP.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
	private static final ColorRegistry COLOR = new ColorRegistry(List.of(
			new ObjectColor(McwBOP.MODID, "pine"),
			new ObjectColor(McwBOP.MODID, "mahogany"),
			new ObjectColor(McwBOP.MODID, "willow"),
			new ObjectColor(McwBOP.MODID, "palm"),
			new ObjectColor(McwBOP.MODID, "flowering_oak")
	));

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR.registryBlockColors(event);
	}

	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		COLOR.registryItemColors(event);
	}
}