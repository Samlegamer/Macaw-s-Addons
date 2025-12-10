package fr.samlegamer.mcwterraformersmc;

import fr.addonslib.api.client.McwColors;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import java.util.Arrays;

@Mod.EventBusSubscriber(modid = McwTerraformersMC.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Client
{
    protected static final ColorRegistry colorRegistry = new ColorRegistry(new McwColors(Arrays.asList(
            Finder.makeIdHedge(McwTerraformersMC.MODID, "redwood"),
            Finder.makeIdHedge(McwTerraformersMC.MODID, "hemlock"),
            Finder.makeIdHedge(McwTerraformersMC.MODID, "rubber"),
            Finder.makeIdHedge(McwTerraformersMC.MODID, "cypress"),
            Finder.makeIdHedge(McwTerraformersMC.MODID, "willow"),
            Finder.makeIdHedge(McwTerraformersMC.MODID, "japanese_maple_shrub"),
            Finder.makeIdHedge(McwTerraformersMC.MODID, "rainbow_eucalyptus"))));

    @SubscribeEvent
    public static void blockColor(ColorHandlerEvent.Block event)
    {
        colorRegistry.registryBlockColorsAverage(event);
    }

    @SubscribeEvent
    public static void itemColor(ColorHandlerEvent.Item event)
    {
        colorRegistry.registryItemColors(event);
    }
}