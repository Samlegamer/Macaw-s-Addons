package fr.samlegamer.mcwbiomesoplenty;

import java.util.Arrays;
import java.util.List;

import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = McwBOP.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
	private static final List<String> LEAVES_NO_COLORED = Arrays.asList("mahogany", "willow", "palm", "flowering_oak");
	private static final ColorRegistry COLOR = new ColorRegistry(McwBOP.MODID, LEAVES_NO_COLORED);

	@SubscribeEvent
	public static void colorsBlock(ColorHandlerEvent.Block event)
	{
		COLOR.colorsBlock(event);
	}
	
	@SubscribeEvent
	public static void colorsItem(ColorHandlerEvent.Item event)
	{
		COLOR.colorsItem(event);
	}
}