package fr.samlegamer.mcwbiomesoplenty.client;

import java.util.Arrays;
import java.util.List;
import fr.samlegamer.addonslib.client.APIRenderer;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwbiomesoplenty.McwBOP;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
	private static final List<String> LEAVES_NO_COLORED = Arrays.asList("mahogany", "willow", "palm", "flowering_oak");
	private static final ColorRegistry COLOR = new ColorRegistry(McwBOP.MODID, LEAVES_NO_COLORED);

	@Override
	public void onInitializeClient()
	{
		COLOR.colorsBlock();
		COLOR.colorsItem();
    	APIRenderer.Bridges.clientWood(McwBOP.MODID, McwBOP.WOOD);
    	APIRenderer.Fences.clientWood(McwBOP.MODID, McwBOP.WOOD);
    	APIRenderer.Fences.clientHedge(McwBOP.MODID, McwBOP.LEAVES);
    	APIRenderer.Furnitures.clientWood(McwBOP.MODID, McwBOP.WOOD);
    	APIRenderer.Roofs.clientWood(McwBOP.MODID, McwBOP.WOOD);
    	APIRenderer.Trapdoors.clientWood(McwBOP.MODID, McwBOP.WOOD);
    	APIRenderer.Paths.clientWood(McwBOP.MODID, McwBOP.WOOD);
    	APIRenderer.Doors.clientWood(McwBOP.MODID, McwBOP.WOOD);
    	APIRenderer.Windows.clientWood(McwBOP.MODID, McwBOP.WOOD);
    	APIRenderer.Stairs.clientWood(McwBOP.MODID, McwBOP.WOOD);
	}
}