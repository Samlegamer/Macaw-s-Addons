package fr.samlegamer.mcwbyg;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ClientFabric implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
		Client.COLOR.registryBlockColors();
		Client.COLOR.registryItemColors();

        APIRenderTypes.initAllWood(McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllStone(McwByg.MODID, McwByg.STONE, ModType.getAllModTypeStone());
        APIRenderTypes.initAllLeave(McwByg.MODID, McwByg.LEAVES);
	}
}