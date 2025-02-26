package fr.samlegamer.mcwterraformersmc;

import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import java.util.List;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = McwTerraformersMC.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Client
{
    protected static final ColorRegistry colorRegistry = new ColorRegistry(McwTerraformersMC.MODID, List.of("redwood", "hemlock", "rubber", "cypress",
            "willow", "japanese_maple_shrub", "rainbow_eucalyptus"));

    @SubscribeEvent
    public static void blockColor(RegisterColorHandlersEvent.Block event)
    {
        colorRegistry.colorsBlock(event);
    }

    @SubscribeEvent
    public static void itemColor(RegisterColorHandlersEvent.Item event)
    {
        colorRegistry.colorsItem(event);
    }
}
