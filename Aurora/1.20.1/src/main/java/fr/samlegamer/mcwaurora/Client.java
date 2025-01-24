package fr.samlegamer.mcwaurora;

import fr.samlegamer.addonslib.Finder;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = McwAurora.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		/*Copied parameter for match to original leaves
		 * See original here : https://github.com/teamauroramods/BayouBlues/blob/1.18.x/common/src/main/java/com/teamaurora/bayou_blues/core/BayouBlues.java#L26
		 */
		event.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getAverageFoliageColor(view, pos) : FoliageColor.getDefaultColor(), Finder.findBlock(McwAurora.MODID, "cypress_hedge"));
		event.register((state, world, pos, tintIndex) -> 11330386, Finder.findBlock(McwAurora.MODID, "redbud_hedge"));
	}
	
	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		event.register((stack, tintIndex) -> FoliageColor.getDefaultColor(), Finder.findBlock(McwAurora.MODID, "cypress_hedge"));
		event.register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return event.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, Finder.findBlock(McwAurora.MODID, "redbud_hedge"));
	}
}