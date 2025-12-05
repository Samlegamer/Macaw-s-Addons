package fr.samlegamer.mcwaurora;

import fr.addonslib.api.client.McwColors;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = McwAurora.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
    private static final ColorRegistry colorRegistryAverage = new ColorRegistry(new McwColors(Arrays.asList(Finder.makeIdHedge(McwAurora.MODID, "cypress"))));
    private static final ColorRegistry colorRegistryCustom = new ColorRegistry(new McwColors(customs()));

    private static Map<String, Integer> customs()
    {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put(Finder.makeIdHedge(McwAurora.MODID, "redbud"), 11330386);
        return map;
    }

    /*
     * Copied parameter for match to original leaves
     * See original here : https://github.com/teamauroramods/BayouBlues/blob/1.18.x/common/src/main/java/com/teamaurora/bayou_blues/core/BayouBlues.java#L26
     */
	@SubscribeEvent
	public static void colorsBlock(ColorHandlerEvent.Block event)
	{
        colorRegistryAverage.registryBlockColorsAverage(event);
        colorRegistryCustom.registryBlockColors(event);
	}
	
	@SubscribeEvent
	public static void colorsItem(ColorHandlerEvent.Item event)
	{
        colorRegistryAverage.registryItemColors(event);
        colorRegistryCustom.registryItemColors(event);
	}
}