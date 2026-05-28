package fr.samlegamer.mcwbiomesoplenty.client;

import java.util.Arrays;
import fr.addonslib.api.client.McwColors;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwbiomesoplenty.McwBOP;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
	private static final ColorRegistry COLOR = new ColorRegistry(new McwColors(Arrays.asList(
			Finder.makeIdHedge(McwBOP.MODID, "pine"),
			Finder.makeIdHedge(McwBOP.MODID, "mahogany"),
			Finder.makeIdHedge(McwBOP.MODID, "willow"),
			Finder.makeIdHedge(McwBOP.MODID, "palm"),
			Finder.makeIdHedge(McwBOP.MODID, "flowering_oak")
	)));

	@Override
	public void onInitializeClient()
	{
		COLOR.registryBlockColorsAverage();
		COLOR.registryItemColors();
        APIRenderTypes.initAllWood(McwBOP.MODID, McwBOP.WOOD, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(McwBOP.MODID, McwBOP.LEAVES);
	}
}