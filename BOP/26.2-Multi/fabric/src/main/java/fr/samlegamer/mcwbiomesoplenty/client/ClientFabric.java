package fr.samlegamer.mcwbiomesoplenty.client;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.mcwbiomesoplenty.Client;
import fr.samlegamer.mcwbiomesoplenty.McwBOP;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;

@Environment(EnvType.CLIENT)
public class ClientFabric implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
		Client.COLOR.registryBlockColors();
		BlockColorRegistry.register(Client.deadHedgeColor(), Finder.findBlock(McwBOP.MODID, "dead_hedge"));
	}
}