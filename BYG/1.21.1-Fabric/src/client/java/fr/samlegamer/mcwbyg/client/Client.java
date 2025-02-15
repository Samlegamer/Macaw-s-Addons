package fr.samlegamer.mcwbyg.client;

import java.util.List;
import fr.samlegamer.addonslib.client.APIRenderer;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwbyg.McwByg;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
	private static final List<String> LEAVES_NO_COLORED = List.of("maple", "flowering_yucca", "mahogany");
	private static final ColorRegistry COLOR = new ColorRegistry(McwByg.MODID, LEAVES_NO_COLORED);

	@Override
	public void onInitializeClient()
	{
		COLOR.colorsBlock();
		COLOR.colorsItem();
		
    	APIRenderer.Bridges.clientWood(McwByg.MODID, McwByg.WOOD);
    	APIRenderer.Bridges.clientStone(McwByg.MODID, McwByg.STONE);
    	APIRenderer.Roofs.clientWood(McwByg.MODID, McwByg.WOOD);
    	APIRenderer.Roofs.clientStone(McwByg.MODID, McwByg.STONE);
    	APIRenderer.Fences.clientWood(McwByg.MODID, McwByg.WOOD);
    	APIRenderer.Fences.clientHedge(McwByg.MODID, McwByg.LEAVES);
    	APIRenderer.Fences.clientStone(McwByg.MODID, McwByg.STONE);
    	APIRenderer.Furnitures.clientWood(McwByg.MODID, McwByg.WOOD);
    	APIRenderer.Stairs.clientWood(McwByg.MODID, McwByg.WOOD);
		// 1.1 Update
		APIRenderer.Paths.clientWood(McwByg.MODID, McwByg.WOOD);
		APIRenderer.Doors.clientWood(McwByg.MODID, McwByg.WOOD);
		APIRenderer.Trapdoors.clientWood(McwByg.MODID, McwByg.WOOD);
		APIRenderer.Windows.clientWood(McwByg.MODID, McwByg.WOOD);
	}
}