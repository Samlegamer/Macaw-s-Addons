package fr.samlegamer.mcwregionsunexplored.client;

import fr.addonslib.api.client.McwColors;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwregionsunexplored.McwRegionsUnexplored;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.world.biome.FoliageColors;
import java.awt.*;
import java.util.List;
import static net.regions_unexplored.client.color.RuColors.getAspenColor;
import static net.regions_unexplored.client.color.RuColors.getEnchantedAspenColor;

public class Client implements ClientModInitializer
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

	@Override
	public void onInitializeClient() {
		APIRenderTypes.initAllWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, Registration.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
		COLOR.registryBlockColorsAverage();
		COLOR.registryItemColors();

		ColorProviderRegistry.BLOCK.register((bs, world, pos, index) -> world != null && pos != null ? getAspenColor(world, pos) : FoliageColors.getDefaultColor(), Finder.findBlock(Finder.makeIdHedge(McwRegionsUnexplored.MODID, "silver_birch")));
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> Color.getHSBColor(0.15F, 0.8F, 1.0F).getRGB(),
				Finder.findBlock(Finder.makeIdHedge(McwRegionsUnexplored.MODID, "silver_birch")));

		ColorProviderRegistry.BLOCK.register((bs, world, pos, index) -> world != null && pos != null ? getEnchantedAspenColor(world, pos) : FoliageColors.getDefaultColor(), Finder.findBlock(Finder.makeIdHedge(McwRegionsUnexplored.MODID, "enchanted_birch")));
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> Color.getHSBColor(0.58F, 0.8F, 1.0F).getRGB(),
				Finder.findBlock(Finder.makeIdHedge(McwRegionsUnexplored.MODID, "enchanted_birch")));
	}
}