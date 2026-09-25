package mcwregionsunexplored;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.mcwregionsunexplored.Client;
import fr.samlegamer.mcwregionsunexplored.McwRegionsUnexplored;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import java.awt.*;

@EventBusSubscriber(modid = McwRegionsUnexplored.MODID, value = Dist.CLIENT)
public class ClientNeoForge
{
	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		Client.COLOR.registryBlockColors(event);
		event.register((bs, world, pos, index) -> Client.aspenBlock(world, pos), Finder.findBlock(McwRegionsUnexplored.MODID, "silver_birch_hedge"));
	}

	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		Client.COLOR.registryItemColors(event);
		event.register((stack, tintIndex) -> Client.SILVER_ITEM_COLOR,
				Finder.findBlock(McwRegionsUnexplored.MODID, "silver_birch_hedge"));
	}
}