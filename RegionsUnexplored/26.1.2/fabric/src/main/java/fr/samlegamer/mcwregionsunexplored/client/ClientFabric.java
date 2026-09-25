package fr.samlegamer.mcwregionsunexplored.client;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.mcwregionsunexplored.Client;
import fr.samlegamer.mcwregionsunexplored.McwRegionsUnexplored;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;

public class ClientFabric implements ClientModInitializer
{
	@Override
	public void onInitializeClient() {
		Client.COLOR.registryBlockColors();
		BlockColorRegistry.register((bs, world, pos, index) -> Client.aspenBlock(world, pos), Finder.findBlock(McwRegionsUnexplored.MODID, "silver_birch_hedge"));
	}
}