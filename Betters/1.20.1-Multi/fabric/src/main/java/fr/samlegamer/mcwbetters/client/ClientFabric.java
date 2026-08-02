package fr.samlegamer.mcwbetters.client;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.mcwbetters.McwBetters;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ClientFabric implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
		APIRenderTypes.initAllWood(McwBetters.MODID, McwBetters.WOOD_BETTER_END, ModType.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwBetters.MODID, McwBetters.LEAVE_BETTER_END);
		APIRenderTypes.initAllWood(McwBetters.MODID, McwBetters.WOOD_BETTER_NETHER.keySet().stream().toList(), ModType.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwBetters.MODID, McwBetters.LEAVE_BETTER_NETHER);
	}
}