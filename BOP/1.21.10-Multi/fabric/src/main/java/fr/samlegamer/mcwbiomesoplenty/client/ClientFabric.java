package fr.samlegamer.mcwbiomesoplenty.client;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.mcwbiomesoplenty.Client;
import fr.samlegamer.mcwbiomesoplenty.McwBOP;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

@Environment(EnvType.CLIENT)
public class ClientFabric implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
		Client.COLOR.registryBlockColors();
        APIRenderTypes.initAllWood(McwBOP.MODID, McwBOP.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(McwBOP.MODID, McwBOP.LEAVES);
		ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
				Client.deadHedgeColor(world, pos), Finder.findBlock(McwBOP.MODID, "dead_hedge"));
	}
}