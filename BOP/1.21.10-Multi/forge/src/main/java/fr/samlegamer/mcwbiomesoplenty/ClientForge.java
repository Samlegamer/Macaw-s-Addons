package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.Finder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class ClientForge {

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event) {
		Client.COLOR.registryBlockColors(event);
		event.register((state, world, pos, tintIndex) ->
				Client.deadHedgeColor(world, pos), Finder.findBlock(McwBOP.MODID, "dead_hedge"));
	}
}