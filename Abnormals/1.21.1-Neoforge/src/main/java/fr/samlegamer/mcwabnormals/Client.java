package fr.samlegamer.mcwabnormals;

import fr.addonslib.api.client.ObjectColor;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import java.util.*;

@EventBusSubscriber(modid = McwAbnormals.MODID, value = Dist.CLIENT)
public class Client
{
	private static final ColorRegistry COLOR_AVERAGE = new ColorRegistry(getLeavesNoColorCustom());
	private static final ColorRegistry COLOR_CUSTOM = new ColorRegistry(getLeavesColorsCustom());

	/*
	 * Copied parameter for match to original leaves
	 * See original here : https://github.com/team-abnormals/autumnity/blob/1.20.x/src/main/java/com/teamabnormals/autumnity/core/other/AutumnityClientCompat.java#L47
	 * See : https://github.com/team-abnormals/environmental/blob/1.20.x/src/main/java/com/teamabnormals/environmental/core/other/EnvironmentalClientCompat.java#L25
	 */
	private static List<ObjectColor> getLeavesColorsCustom()
	{
		List<ObjectColor> list = new ArrayList<>();
		list.add(new ObjectColor(McwAbnormals.MODID, "red_maple", 12665871));
		list.add(new ObjectColor(McwAbnormals.MODID, "orange_maple", 16745768));
		list.add(new ObjectColor(McwAbnormals.MODID, "yellow_maple", 16760576));
		list.add(new ObjectColor(McwAbnormals.MODID, "pine", 7578444));
		list.add(new ObjectColor(McwAbnormals.MODID, "willow", 6975545));
		return list;
	}

	private static List<ObjectColor> getLeavesNoColorCustom()
	{
		return Arrays.asList(
				new ObjectColor(McwAbnormals.MODID, "maple"),
				new ObjectColor(McwAbnormals.MODID, "river"),
				new ObjectColor(McwAbnormals.MODID, "rosewood"),
				new ObjectColor(McwAbnormals.MODID, "morado"));
	}


	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR_AVERAGE.registryBlockColors(event);
		COLOR_CUSTOM.registryBlockColors(event);
	}

	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		COLOR_AVERAGE.registryItemColors(event);
		COLOR_CUSTOM.registryItemColors(event);
	}
}