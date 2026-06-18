package fr.samlegamer.mcwbyg;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = McwByg.MODID, value = Dist.CLIENT)
public class ClientNeoForge
{
	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		Client.COLOR.registryBlockColors(event);
	}
}