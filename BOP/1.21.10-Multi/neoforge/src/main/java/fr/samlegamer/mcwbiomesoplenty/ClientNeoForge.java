package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.Finder;
import net.minecraft.client.renderer.BiomeColors;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = McwBOP.MODID, value = Dist.CLIENT)
public class ClientNeoForge
{
	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		Client.COLOR.registryBlockColors(event);
		event.register((state, world, pos, tintIndex) ->
				Client.deadHedgeColor(world, pos), Finder.findBlock(McwBOP.MODID, "dead_hedge"));
	}
}