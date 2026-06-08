package fr.samlegamer.mcwregionsunexplored.client;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.mcwregionsunexplored.Client;
import fr.samlegamer.mcwregionsunexplored.McwRegionsUnexplored;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import java.awt.*;

public class ClientFabric implements ClientModInitializer
{
	@Override
	public void onInitializeClient() {
		APIRenderTypes.initAllWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, ModType.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
		Client.COLOR.registryBlockColors();
		Client.COLOR.registryItemColors();

		ColorProviderRegistry.BLOCK.register((bs, world, pos, index) -> Client.aspenBlock(world, pos), Finder.findBlock(McwRegionsUnexplored.MODID, "silver_birch_hedge"));
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> Color.getHSBColor(0.15F, 0.8F, 1.0F).getRGB(),
				Finder.findBlock(McwRegionsUnexplored.MODID, "silver_birch_hedge"));
	}
}