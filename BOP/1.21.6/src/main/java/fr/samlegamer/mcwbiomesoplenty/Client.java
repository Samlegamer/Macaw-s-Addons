package fr.samlegamer.mcwbiomesoplenty;

import java.util.Arrays;
import fr.addonslib.api.client.McwColors;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = McwBOP.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
	private static final ColorRegistry COLOR = new ColorRegistry(new McwColors(Arrays.asList(
			Finder.makeIdHedge(McwBOP.MODID, "pine"),
			Finder.makeIdHedge(McwBOP.MODID, "mahogany"),
			Finder.makeIdHedge(McwBOP.MODID, "willow"),
			Finder.makeIdHedge(McwBOP.MODID, "palm"),
			Finder.makeIdHedge(McwBOP.MODID, "flowering_oak")
	)));

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR.registryBlockColorsAverage(event);
		event.register((state, world, pos, tintIndex) ->
				(world != null && pos != null) ? BiomeColors.getAverageDryFoliageColor(world, pos) : -10732494, Finder.findBlock(McwBOP.MODID, "dead_hedge"));
	}
}