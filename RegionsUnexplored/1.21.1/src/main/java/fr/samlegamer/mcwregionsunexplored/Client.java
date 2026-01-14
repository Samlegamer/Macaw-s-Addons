package fr.samlegamer.mcwregionsunexplored;

import java.awt.*;
import java.util.List;
import fr.addonslib.api.client.McwColors;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.addonslib.Finder;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import static net.regions_unexplored.client.color.RuColorHandler.getAspenColor;
import static net.regions_unexplored.client.color.RuColorHandler.getEnchantedAspenColor;

@Mod.EventBusSubscriber(modid = McwRegionsUnexplored.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
	private static final ColorRegistry COLOR = new ColorRegistry(new McwColors(List.of(
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "baobab"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "cypress"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "eucalyptus"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "joshua"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "maple"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "palm"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "pine"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "redwood"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "willow"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "socotra"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "kapok"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "magnolia")
	)));

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR.registryBlockColorsAverage(event);
		event.register((bs, world, pos, index) -> world != null && pos != null ? getAspenColor(world, pos) : FoliageColor.getDefaultColor(), Finder.findBlock(Finder.makeIdHedge(McwRegionsUnexplored.MODID, "silver_birch")));
		event.register((bs, world, pos, index) -> world != null && pos != null ? getEnchantedAspenColor(world, pos) : FoliageColor.getDefaultColor(), Finder.findBlock(Finder.makeIdHedge(McwRegionsUnexplored.MODID, "enchanted_birch")));
	}

	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		COLOR.registryItemColors(event);
		event.register((stack, tintIndex) -> Color.getHSBColor(0.15F, 0.8F, 1.0F).getRGB(),
			Finder.findBlock(Finder.makeIdHedge(McwRegionsUnexplored.MODID, "silver_birch")));
		event.register((stack, tintIndex) -> Color.getHSBColor(0.58F, 0.8F, 1.0F).getRGB(),
			Finder.findBlock(Finder.makeIdHedge(McwRegionsUnexplored.MODID, "enchanted_birch")));
	}
}