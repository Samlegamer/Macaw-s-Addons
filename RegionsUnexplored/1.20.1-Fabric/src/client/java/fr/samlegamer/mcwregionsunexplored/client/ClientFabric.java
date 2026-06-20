package fr.samlegamer.mcwregionsunexplored.client;

import fr.addonslib.api.client.ObjectColor;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwregionsunexplored.McwRegionsUnexploredFabric;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.FoliageColors;
import java.awt.*;
import java.util.List;

import static io.github.uhq_games.regions_unexplored.client.color.RuColors.getAspenColor;
import static io.github.uhq_games.regions_unexplored.client.color.RuColors.getEnchantedAspenColor;

public class ClientFabric implements ClientModInitializer
{
	private static final ColorRegistry COLOR = new ColorRegistry(List.of(
			new ObjectColor(McwRegionsUnexploredFabric.MODID, "baobab"),
			new ObjectColor(McwRegionsUnexploredFabric.MODID, "cypress"),
			new ObjectColor(McwRegionsUnexploredFabric.MODID, "eucalyptus"),
			new ObjectColor(McwRegionsUnexploredFabric.MODID, "joshua"),
			new ObjectColor(McwRegionsUnexploredFabric.MODID, "maple"),
			new ObjectColor(McwRegionsUnexploredFabric.MODID, "palm"),
			new ObjectColor(McwRegionsUnexploredFabric.MODID, "pine"),
			new ObjectColor(McwRegionsUnexploredFabric.MODID, "redwood"),
			new ObjectColor(McwRegionsUnexploredFabric.MODID, "willow"),
			new ObjectColor(McwRegionsUnexploredFabric.MODID, "socotra"),
			new ObjectColor(McwRegionsUnexploredFabric.MODID, "kapok"),
			new ObjectColor(McwRegionsUnexploredFabric.MODID, "magnolia")
	));

	@Override
	public void onInitializeClient() {
		APIRenderTypes.initAllWood(McwRegionsUnexploredFabric.MODID, McwRegionsUnexploredFabric.WOOD, ModType.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwRegionsUnexploredFabric.MODID, McwRegionsUnexploredFabric.LEAVES);
		COLOR.registryBlockColors();
		COLOR.registryItemColors();

		ColorProviderRegistry.BLOCK.register((bs, world, pos, index) -> world != null && pos != null ? getAspenColor(world, pos) : FoliageColors.getDefaultColor(), Finder.findBlock(McwRegionsUnexploredFabric.MODID, "silver_birch_hedge"));
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> Color.getHSBColor(0.15F, 0.8F, 1.0F).getRGB(),
				Finder.findBlock(McwRegionsUnexploredFabric.MODID, "silver_birch_hedge"));

		ColorProviderRegistry.BLOCK.register((bs, world, pos, index) -> world != null && pos != null ? getEnchantedAspenColor(world, pos) : FoliageColors.getDefaultColor(), Finder.findBlock(McwRegionsUnexploredFabric.MODID, "enchanted_birch_hedge"));
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> Color.getHSBColor(0.58F, 0.8F, 1.0F).getRGB(),
				Finder.findBlock(McwRegionsUnexploredFabric.MODID, "enchanted_birch_hedge"));
	}
}