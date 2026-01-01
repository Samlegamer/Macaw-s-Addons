package fr.samlegamer.mcwbyg.client;

import java.util.List;
import fr.addonslib.api.client.McwColors;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwbyg.McwByg;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
	private static final ColorRegistry COLOR = new ColorRegistry(new McwColors(List.of(
			Finder.makeIdHedge(McwByg.MODID, "mahogany"),
			Finder.makeIdHedge(McwByg.MODID, "maple"))));

	@Override
	public void onInitializeClient()
	{
		COLOR.registryBlockColorsAverage();
		COLOR.registryItemColors();

		APIRenderTypes.initAllWood(McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwByg.MODID, McwByg.LEAVES);
		APIRenderTypes.initAllStone(McwByg.MODID, McwByg.bridges_rockable, ModType.BRIDGES);
		APIRenderTypes.initAllStone(McwByg.MODID, McwByg.fences_rockable, ModType.ROOFS, ModType.FENCES);
	}
}