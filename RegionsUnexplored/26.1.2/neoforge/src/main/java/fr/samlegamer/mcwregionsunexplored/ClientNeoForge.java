package fr.samlegamer.mcwregionsunexplored;

import fr.samlegamer.addonslib.Finder;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import java.awt.*;

@EventBusSubscriber(modid = McwRegionsUnexplored.MODID, value = Dist.CLIENT)
public class ClientNeoForge
{
	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.BlockTintSources event)
	{
		Client.COLOR.registryBlockColors(event);
		event.register(Client.aspenBlockColor(), Finder.findBlock(McwRegionsUnexplored.MODID, "silver_birch_hedge"));
	}
}