package fr.samlegamer.mcwabnormals;

import java.util.Arrays;
import java.util.List;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = McwAbnormals.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
	private static final List<String> LEAVES_NO_COLORED = Arrays.asList("river", "willow", "rosewood", "morado");
	private static final ColorRegistry COLOR = new ColorRegistry(McwAbnormals.MODID, LEAVES_NO_COLORED);

	@SubscribeEvent
	public static void colorsBlock(ColorHandlerEvent.Block event)
	{
		COLOR.colorsBlock(event);
		/*Copied parameter for match to original leaves
		 * See original here : https://github.com/team-abnormals/autumnity/blob/1.20.x/src/main/java/com/teamabnormals/autumnity/core/other/AutumnityClientCompat.java#L47
		 */
		event.getBlockColors().register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getAverageFoliageColor(view, pos) : FoliageColors.getDefaultColor(), Finder.findBlock(McwAbnormals.MODID, "maple_hedge"));
		event.getBlockColors().register((state, world, pos, tintIndex) -> 12665871, Finder.findBlock(McwAbnormals.MODID, "red_maple_hedge"));
		event.getBlockColors().register((state, world, pos, tintIndex) -> 16745768, Finder.findBlock(McwAbnormals.MODID, "orange_maple_hedge"));
		event.getBlockColors().register((state, world, pos, tintIndex) -> 16760576, Finder.findBlock(McwAbnormals.MODID, "yellow_maple_hedge"));
	}
	
	@SubscribeEvent
	public static void colorsItem(ColorHandlerEvent.Item event)
	{
		COLOR.colorsItem(event);
		event.getItemColors().register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return event.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, Finder.findBlock(McwAbnormals.MODID, "maple_hedge"));
		event.getItemColors().register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return event.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, Finder.findBlock(McwAbnormals.MODID, "red_maple_hedge"));
		event.getItemColors().register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return event.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, Finder.findBlock(McwAbnormals.MODID, "orange_maple_hedge"));
		event.getItemColors().register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return event.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, Finder.findBlock(McwAbnormals.MODID, "yellow_maple_hedge"));

	}
}