package fr.samlegamer.mcwaurora;

import fr.addonslib.api.client.ObjectColor;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import java.util.Arrays;

@Mod.EventBusSubscriber(modid = McwAurora.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
    private static final ColorRegistry colorRegistryAverage = new ColorRegistry(Arrays.asList(new ObjectColor(McwAurora.MODID, "cypress")));
    private static final ColorRegistry colorRegistryCustom = new ColorRegistry(Arrays.asList(new ObjectColor(McwAurora.MODID, "redbud", 11330386)));

    /*
     * Copied parameter for match to original leaves
     * See original here : https://github.com/teamauroramods/BayouBlues/blob/1.18.x/common/src/main/java/com/teamaurora/bayou_blues/core/BayouBlues.java#L26
     */
	@SubscribeEvent
	public static void colorsBlock(ColorHandlerEvent.Block event)
	{
        colorRegistryAverage.registryBlockColors(event);
        colorRegistryCustom.registryBlockColors(event);
	}
	
	@SubscribeEvent
	public static void colorsItem(ColorHandlerEvent.Item event)
	{
        colorRegistryAverage.registryItemColors(event);
        colorRegistryCustom.registryItemColors(event);
	}
}