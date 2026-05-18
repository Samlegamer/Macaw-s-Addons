package fr.samlegamer.mcwbyg;

import java.util.Arrays;
import fr.addonslib.api.client.ObjectColor;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = McwByg.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
	private static final ColorRegistry COLOR = new ColorRegistry(Arrays.asList(
			new ObjectColor(McwByg.MODID, "mahogany"),
			new ObjectColor(McwByg.MODID, "maple")));

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