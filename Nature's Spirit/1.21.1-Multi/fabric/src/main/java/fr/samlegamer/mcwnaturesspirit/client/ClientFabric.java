package fr.samlegamer.mcwnaturesspirit.client;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorUtils;
import fr.samlegamer.mcwnaturesspirit.Client;
import fr.samlegamer.mcwnaturesspirit.McwNaturesSpirit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Block;

public class ClientFabric implements ClientModInitializer
{
    @Override
    public void onInitializeClient() {
        APIRenderTypes.initAllWood(McwNaturesSpirit.MODID, McwNaturesSpirit.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(McwNaturesSpirit.MODID, McwNaturesSpirit.LEAVES);

        for(String i : Client.colorRegistry)
        {
            Block hedges = Finder.findBlock(McwNaturesSpirit.MODID, i + "_hedge");
            if (ColorUtils.isValidBlock(hedges)) {
                ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> Client.getLeaveColor(view, pos), hedges);
                ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColor.getDefaultColor(), hedges);
            }
        }
    }
}