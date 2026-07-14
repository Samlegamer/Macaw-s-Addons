package fr.samlegamer.mcwbetters.client;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.mcwbetters.McwBettersFabric;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ClientFabric implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
		APIRenderTypes.initAllWood(McwBettersFabric.MODID, McwBettersFabric.WOOD_BETTER_END, ModType.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwBettersFabric.MODID, McwBettersFabric.LEAVE_BETTER_END);
		APIRenderTypes.initAllWood(McwBettersFabric.MODID, McwBettersFabric.WOOD_BETTER_NETHER, ModType.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwBettersFabric.MODID, McwBettersFabric.LEAVE_BETTER_NETHER);
	}
}