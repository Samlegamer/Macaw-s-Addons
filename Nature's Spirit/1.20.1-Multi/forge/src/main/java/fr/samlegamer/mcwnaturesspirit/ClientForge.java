package fr.samlegamer.mcwnaturesspirit;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.ColorUtils;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = McwNaturesSpirit.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientForge
{
    @SubscribeEvent
    public static void colorsBlock(RegisterColorHandlersEvent.Block event)
    {
        for(String i : Client.colorRegistry)
        {
            Block hedges = Finder.findBlock(McwNaturesSpirit.MODID, i + "_hedge");
            if (ColorUtils.isValidBlock(hedges)) {
                event.register((blockState, blockAndTintGetter, blockPos, tintIndex)
                        -> Client.getLeaveColor(blockAndTintGetter, blockPos), hedges);
            }
        }
    }

    @SubscribeEvent
    public static void colorsItem(RegisterColorHandlersEvent.Item event)
    {
        for(String i : Client.colorRegistry)
        {
            Block hedges = Finder.findBlock(McwNaturesSpirit.MODID, i + "_hedge");
            if (ColorUtils.isValidBlock(hedges)) {
                event.register((stack, tintIndex) -> FoliageColor.getDefaultColor(), hedges);
            }
        }
    }
}
