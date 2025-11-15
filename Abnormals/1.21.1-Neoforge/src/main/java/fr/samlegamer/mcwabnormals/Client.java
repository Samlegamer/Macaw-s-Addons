package fr.samlegamer.mcwabnormals;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Block;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import java.util.List;

@EventBusSubscriber(modid = McwAbnormals.MODID, value = Dist.CLIENT)
public class Client
{
	private static final List<String> LEAVES_NO_COLORED = List.of("river", "willow", "rosewood", "morado");
	private static final ColorRegistry COLOR = new ColorRegistry(McwAbnormals.MODID, LEAVES_NO_COLORED);

	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block event)
	{
		COLOR.colorsBlock(event);
		/*
		 * Copied parameter for match to original leaves
		 * See original here : https://github.com/team-abnormals/autumnity/blob/1.20.x/src/main/java/com/teamabnormals/autumnity/core/other/AutumnityClientCompat.java#L47
		 * See : https://github.com/team-abnormals/environmental/blob/1.20.x/src/main/java/com/teamabnormals/environmental/core/other/EnvironmentalClientCompat.java#L25
		 */
		event.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getAverageFoliageColor(view, pos) : FoliageColor.getDefaultColor(), Finder.findBlock(McwAbnormals.MODID, "maple_hedge"));
		event.register((state, world, pos, tintIndex) -> 12665871, Finder.findBlock(McwAbnormals.MODID, "red_maple_hedge"));
		event.register((state, world, pos, tintIndex) -> 16745768, Finder.findBlock(McwAbnormals.MODID, "orange_maple_hedge"));
		event.register((state, world, pos, tintIndex) -> 16760576, Finder.findBlock(McwAbnormals.MODID, "yellow_maple_hedge"));
		
		event.register((state, world, pos, tintIndex) -> 7578444, Finder.findBlock(McwAbnormals.MODID, "pine_hedge"));
		event.register((state, world, pos, tintIndex) -> 6975545, Finder.findBlock(McwAbnormals.MODID, "willow_hedge"));
	}
	
	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item event)
	{
		COLOR.colorsItem(event);
		event.register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return event.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, Finder.findBlock(McwAbnormals.MODID, "maple_hedge"));
		event.register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return event.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, Finder.findBlock(McwAbnormals.MODID, "red_maple_hedge"));
		event.register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return event.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, Finder.findBlock(McwAbnormals.MODID, "orange_maple_hedge"));
		event.register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return event.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, Finder.findBlock(McwAbnormals.MODID, "yellow_maple_hedge"));

		event.register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return event.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, Finder.findBlock(McwAbnormals.MODID, "pine_hedge"));
		event.register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return event.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, Finder.findBlock(McwAbnormals.MODID, "willow_hedge"));
	}
}