package fr.samlegamer.mcwbiomesoplenty.client;

import java.util.List;
import fr.addonslib.api.client.ObjectColor;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwbiomesoplenty.McwBOP;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ClientFabric implements ClientModInitializer
{
	private static final ColorRegistry COLOR = new ColorRegistry(List.of(
			new ObjectColor(McwBOP.MODID, "pine"),
			new ObjectColor(McwBOP.MODID, "mahogany"),
			new ObjectColor(McwBOP.MODID, "willow"),
			new ObjectColor(McwBOP.MODID, "palm"),
			new ObjectColor(McwBOP.MODID, "flowering_oak")
	));

	@Override
	public void onInitializeClient()
	{
		COLOR.registryBlockColors();
		COLOR.registryItemColors();
        APIRenderTypes.initAllWood(McwBOP.MODID, McwBOP.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(McwBOP.MODID, McwBOP.LEAVES);
	}
}