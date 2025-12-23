package fr.samlegamer.mcwabnormals;

import fr.addonslib.api.client.McwColors;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@EventBusSubscriber(modid = McwAbnormals.MODID, value = Dist.CLIENT)
public class Client
{
	private static final ColorRegistry COLOR_AVERAGE = new ColorRegistry(new McwColors(getLeavesNoColorCustom()));
	private static final ColorRegistry COLOR_CUSTOM = new ColorRegistry(new McwColors(getLeavesColorsCustom()));

	/*
	 * Copied parameter for match to original leaves
	 * See original here : https://github.com/team-abnormals/autumnity/blob/1.20.x/src/main/java/com/teamabnormals/autumnity/core/other/AutumnityClientCompat.java#L47
	 * See : https://github.com/team-abnormals/environmental/blob/1.20.x/src/main/java/com/teamabnormals/environmental/core/other/EnvironmentalClientCompat.java#L25
	 */
	private static Map<String, Integer> getLeavesColorsCustom()
	{
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put(Finder.makeIdHedge(McwAbnormals.MODID, "red_maple"), 12665871);
		map.put(Finder.makeIdHedge(McwAbnormals.MODID, "orange_maple"), 16745768);
		map.put(Finder.makeIdHedge(McwAbnormals.MODID, "yellow_maple"), 16760576);
		map.put(Finder.makeIdHedge(McwAbnormals.MODID, "pine"), 7578444);
		map.put(Finder.makeIdHedge(McwAbnormals.MODID, "willow"), 6975545);
		return map;
	}

	private static List<String> getLeavesNoColorCustom()
	{
		return Arrays.asList(
				Finder.makeIdHedge(McwAbnormals.MODID, "maple"),
				Finder.makeIdHedge(McwAbnormals.MODID, "river"),
				Finder.makeIdHedge(McwAbnormals.MODID, "rosewood"),
				Finder.makeIdHedge(McwAbnormals.MODID, "morado"));
	}


	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR_AVERAGE.registryBlockColorsAverage(event);
		COLOR_CUSTOM.registryBlockColors(event);
	}

	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		COLOR_AVERAGE.registryItemColors(event);
		COLOR_CUSTOM.registryItemColors(event);
	}
}