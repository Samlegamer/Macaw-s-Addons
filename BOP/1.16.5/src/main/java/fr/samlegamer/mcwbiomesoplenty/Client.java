package fr.samlegamer.mcwbiomesoplenty;

import fr.addonslib.api.client.ObjectColor;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber(modid = McwBOP.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
    public static final List<ObjectColor> colorList = Arrays.asList(
            new ObjectColor(McwBOP.MODID, "mahogany"),
			new ObjectColor(McwBOP.MODID, "willow"),
			new ObjectColor(McwBOP.MODID, "palm"),
			new ObjectColor(McwBOP.MODID, "flowering_oak"));
    private static final ColorRegistry COLOR = new ColorRegistry(colorList);

	@SubscribeEvent
	public static void colorsBlock(ColorHandlerEvent.Block event)
	{
		COLOR.registryBlockColors(event);
    }
	
	@SubscribeEvent
	public static void colorsItem(ColorHandlerEvent.Item event)
	{
		COLOR.registryItemColors(event);
	}
}