package fr.samlegamer.mcwregionsunexplored;

import java.awt.*;
import java.util.List;

import fr.addonslib.api.client.ObjectColor;
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
	private static final ColorRegistry COLOR = new ColorRegistry(List.of(
			new ObjectColor(McwRegionsUnexplored.MODID, "baobab"),
			new ObjectColor(McwRegionsUnexplored.MODID, "cypress"),
			new ObjectColor(McwRegionsUnexplored.MODID, "eucalyptus"),
			new ObjectColor(McwRegionsUnexplored.MODID, "joshua"),
			new ObjectColor(McwRegionsUnexplored.MODID, "maple"),
			new ObjectColor(McwRegionsUnexplored.MODID, "palm"),
			new ObjectColor(McwRegionsUnexplored.MODID, "pine"),
			new ObjectColor(McwRegionsUnexplored.MODID, "redwood"),
			new ObjectColor(McwRegionsUnexplored.MODID, "willow"),
			new ObjectColor(McwRegionsUnexplored.MODID, "socotra"),
			new ObjectColor(McwRegionsUnexplored.MODID, "kapok"),
			new ObjectColor(McwRegionsUnexplored.MODID, "magnolia")
	));

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR.registryBlockColors(event);
		event.register((bs, world, pos, index) -> world != null && pos != null ? getAspenColor(world, pos) : FoliageColor.getDefaultColor(), Finder.findBlock(McwRegionsUnexplored.MODID, "silver_birch_hedge"));
		event.register((bs, world, pos, index) -> world != null && pos != null ? getEnchantedAspenColor(world, pos) : FoliageColor.getDefaultColor(), Finder.findBlock(McwRegionsUnexplored.MODID, "enchanted_birch_hedge"));
	}

	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		COLOR.registryItemColors(event);
		event.register((stack, tintIndex) -> Color.getHSBColor(0.15F, 0.8F, 1.0F).getRGB(),
			Finder.findBlock(McwRegionsUnexplored.MODID, "silver_birch_hedge"));
		event.register((stack, tintIndex) -> Color.getHSBColor(0.58F, 0.8F, 1.0F).getRGB(),
			Finder.findBlock(McwRegionsUnexplored.MODID, "enchanted_birch_hedge"));
	}
}