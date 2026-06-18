package fr.samlegamer.mcwbiomesoplenty;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = McwBOP.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientForge {

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event) {
		Client.COLOR.registryBlockColors(event);
	}
}