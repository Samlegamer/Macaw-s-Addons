package fr.samlegamer.mcwregionsunexplored;

import java.util.List;
import fr.addonslib.api.client.McwColors;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = McwRegionsUnexplored.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
	private static final ColorRegistry COLOR = new ColorRegistry(new McwColors(List.of(
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "baobab"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "cherry"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "cypress"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "eucalyptus"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "palm"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "pine"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "redwood"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "willow")
	)));

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR.registryBlockColorsAverage(event);
	}

	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		COLOR.registryItemColors(event);
	}
}