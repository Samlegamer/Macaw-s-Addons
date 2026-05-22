package fr.samlegamer.mcwregionsunexplored.client;

import fr.addonslib.api.client.ObjectColor;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwregionsunexplored.McwRegionsUnexplored;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.item.BlockItem;
import java.awt.*;
import java.util.List;
import java.util.Objects;

public class Client implements ClientModInitializer
{
	private static final ColorRegistry COLOR = new ColorRegistry(List.of(
			new ObjectColor(McwRegionsUnexplored.MODID, "baobab"),
			new ObjectColor(McwRegionsUnexplored.MODID, "cherry"),
			new ObjectColor(McwRegionsUnexplored.MODID, "cypress"),
			new ObjectColor(McwRegionsUnexplored.MODID, "eucalyptus"),
			new ObjectColor(McwRegionsUnexplored.MODID, "palm"),
			new ObjectColor(McwRegionsUnexplored.MODID, "pine"),
			new ObjectColor(McwRegionsUnexplored.MODID, "redwood"),
			new ObjectColor(McwRegionsUnexplored.MODID, "willow")
	));

	@Override
	public void onInitializeClient() {
		APIRenderTypes.initAllWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, ModType.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
		COLOR.registryBlockColors();
		COLOR.registryItemColors();
		ColorProviderRegistry.BLOCK.register((blockState, blockAndTintGetter, blockPos, i) ->
				(blockAndTintGetter != null && blockPos != null) ?
						BiomeColors.getFoliageColor(blockAndTintGetter, blockPos) :
						FoliageColors.getColor(0.5D, 1.0D),
				Finder.findBlock(McwRegionsUnexplored.MODID, "maple_hedge"));
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
			Block block = ((BlockItem)stack.getItem()).getBlock();
			return (Objects.requireNonNull(ColorProviderRegistry.BLOCK.get(block))).getColor(block.getDefaultState(), null, null, tintIndex);
		}, Finder.findBlock(McwRegionsUnexplored.MODID, "maple_hedge"));

	}
}