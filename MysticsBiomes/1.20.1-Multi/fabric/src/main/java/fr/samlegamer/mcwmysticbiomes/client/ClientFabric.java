package fr.samlegamer.mcwmysticbiomes.client;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.mcwmysticbiomes.McwMysticBiomes;
import net.fabricmc.api.ClientModInitializer;

public class ClientFabric implements ClientModInitializer
{
    @Override
    public void onInitializeClient() {
        APIRenderTypes.initAllWood(McwMysticBiomes.MODID, McwMysticBiomes.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(McwMysticBiomes.MODID, McwMysticBiomes.LEAVES);
    }
}