package fr.samlegamer.mcwbyg;

import java.util.List;
import fr.addonslib.api.client.ObjectColor;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
	private static final ColorRegistry COLOR = new ColorRegistry(List.of(
			new ObjectColor(McwByg.MODID, "flowering_yucca"),
			new ObjectColor(McwByg.MODID, "mahogany"),
			new ObjectColor(McwByg.MODID, "maple")));

	@Override
	public void onInitializeClient()
	{
		COLOR.registryBlockColors();
		COLOR.registryItemColors();

        APIRenderTypes.initAllWood(McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllStone(McwByg.MODID, McwByg.STONE, ModType.getAllModTypeStone());
        APIRenderTypes.initAllLeave(McwByg.MODID, McwByg.LEAVES);
	}
}