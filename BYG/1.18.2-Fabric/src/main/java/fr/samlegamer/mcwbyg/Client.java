package fr.samlegamer.mcwbyg;

import java.util.List;

import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
	private static final List<String> LEAVES_NO_COLORED = List.of("mahogany", "maple");
	private static final ColorRegistry COLOR = new ColorRegistry(McwByg.MODID, LEAVES_NO_COLORED);

	@Override
	public void onInitializeClient()
	{
		COLOR.colorsBlock();
		COLOR.colorsItem();
		
    	Bridges.clientWood(McwByg.MODID, McwByg.WOOD);
    	Bridges.clientStone(McwByg.MODID, McwByg.bridges_rockable);
    	Roofs.clientWood(McwByg.MODID, McwByg.WOOD);
    	Roofs.clientStone(McwByg.MODID, McwByg.fences_rockable);
    	Fences.clientWood(McwByg.MODID, McwByg.WOOD);
    	Fences.clientHedge(McwByg.MODID, McwByg.LEAVES);
    	Fences.clientStone(McwByg.MODID, McwByg.fences_rockable);
    	Furnitures.clientWood(McwByg.MODID, McwByg.WOOD);
    	Stairs.clientWood(McwByg.MODID, McwByg.WOOD);
	}
}