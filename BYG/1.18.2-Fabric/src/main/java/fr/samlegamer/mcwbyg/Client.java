package fr.samlegamer.mcwbyg;

import net.fabricmc.api.ClientModInitializer;

//@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
	//private static final List<String> LEAVES_NO_COLORED = Arrays.asList("mahogany", "maple");
	//private static final ColorRegistry COLOR = new ColorRegistry(McwByg.MODID, LEAVES_NO_COLORED);

	@Override
	public void onInitializeClient()
	{
		//COLOR.colorsBlock();
		//COLOR.colorsItem();
		
    	//Bridges.clientWood(McwByg.MODID, McwByg.WOOD);
    	//Bridges.clientStone(McwByg.MODID, McwByg.bridges_rockable);
    	//Fences.clientWood(McwByg.MODID, McwByg.WOOD);
    	//Fences.clientHedge(McwByg.MODID, McwByg.LEAVES);
    	//Fences.clientStone(McwByg.MODID, McwByg.fences_rockable);
    	//Roofs.clientWood(McwByg.MODID, McwByg.WOOD);
    	//Roofs.clientStone(McwByg.MODID, McwByg.fences_rockable);
    	//Furnitures.clientWood(McwByg.MODID, McwByg.WOOD);
    	//Stairs.clientWood(McwByg.MODID, McwByg.WOOD);
	}
}