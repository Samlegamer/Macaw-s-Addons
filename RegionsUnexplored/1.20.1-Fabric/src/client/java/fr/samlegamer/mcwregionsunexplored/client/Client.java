package fr.samlegamer.mcwregionsunexplored.client;

import fr.addonslib.api.client.ObjectColor;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwregionsunexplored.McwRegionsUnexplored;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.FoliageColors;
import java.awt.*;
import java.util.List;

import static io.github.uhq_games.regions_unexplored.client.color.RuColors.getAspenColor;
import static io.github.uhq_games.regions_unexplored.client.color.RuColors.getEnchantedAspenColor;

public class Client implements ClientModInitializer
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

	@Override
	public void onInitializeClient() {
		APIRenderTypes.initAllWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, ModType.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
		COLOR.registryBlockColors();
		COLOR.registryItemColors();

		ColorProviderRegistry.BLOCK.register((bs, world, pos, index) -> world != null && pos != null ? getAspenColor(world, pos) : FoliageColors.getDefaultColor(), Finder.findBlock(McwRegionsUnexplored.MODID, "silver_birch_hedge"));
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> Color.getHSBColor(0.15F, 0.8F, 1.0F).getRGB(),
				Finder.findBlock(McwRegionsUnexplored.MODID, "silver_birch_hedge"));

		ColorProviderRegistry.BLOCK.register((bs, world, pos, index) -> world != null && pos != null ? getEnchantedAspenColor(world, pos) : FoliageColors.getDefaultColor(), Finder.findBlock(McwRegionsUnexplored.MODID, "enchanted_birch_hedge"));
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> Color.getHSBColor(0.58F, 0.8F, 1.0F).getRGB(),
				Finder.findBlock(McwRegionsUnexplored.MODID, "enchanted_birch_hedge"));
	}
}