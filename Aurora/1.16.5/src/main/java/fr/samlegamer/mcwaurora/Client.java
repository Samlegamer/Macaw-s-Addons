package fr.samlegamer.mcwaurora;

import fr.samlegamer.addonslib.Finder;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = McwAurora.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
	@SubscribeEvent
	public static void colorsBlock(ColorHandlerEvent.Block event)
	{
		/*
		 * Copied parameter for match to original leaves
		 * See original here : https://github.com/teamauroramods/BayouBlues/blob/1.18.x/common/src/main/java/com/teamaurora/bayou_blues/core/BayouBlues.java#L26
		 */
		event.getBlockColors().register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getAverageFoliageColor(view, pos) : FoliageColors.getDefaultColor(), Finder.findBlock(McwAurora.MODID, "cypress_hedge"));
		event.getBlockColors().register((state, world, pos, tintIndex) -> 11330386, Finder.findBlock(McwAurora.MODID, "redbud_hedge"));
	}
	
	@SubscribeEvent
	public static void colorsItem(ColorHandlerEvent.Item event)
	{
		event.getItemColors().register((stack, tintIndex) -> FoliageColors.getDefaultColor(), Finder.findBlock(McwAurora.MODID, "cypress_hedge"));
		event.getItemColors().register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return event.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, Finder.findBlock(McwAurora.MODID, "redbud_hedge"));
	}
}