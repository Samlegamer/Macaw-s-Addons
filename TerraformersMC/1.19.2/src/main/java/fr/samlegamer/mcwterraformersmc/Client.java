package fr.samlegamer.mcwterraformersmc;

import fr.addonslib.api.client.ObjectColor;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import java.util.Arrays;

@Mod.EventBusSubscriber(modid = McwTerraformersMC.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Client
{
    protected static final ColorRegistry colorRegistry = new ColorRegistry(Arrays.asList(
            new ObjectColor(McwTerraformersMC.MODID, "redwood"),
            new ObjectColor(McwTerraformersMC.MODID, "hemlock"),
            new ObjectColor(McwTerraformersMC.MODID, "rubber"),
            new ObjectColor(McwTerraformersMC.MODID, "cypress"),
            new ObjectColor(McwTerraformersMC.MODID, "willow"),
            new ObjectColor(McwTerraformersMC.MODID, "japanese_maple_shrub"),
            new ObjectColor(McwTerraformersMC.MODID, "rainbow_eucalyptus")));

    @SubscribeEvent
    public static void blockColor(RegisterColorHandlersEvent.Block event)
    {
        colorRegistry.registryBlockColors(event);
    }

    @SubscribeEvent
    public static void itemColor(RegisterColorHandlersEvent.Item event)
    {
        colorRegistry.registryItemColors(event);
    }
}
