package fr.samlegamer.mcwregionsunexplored.client;

import fr.addonslib.api.client.McwColors;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwregionsunexplored.McwRegionsUnexplored;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;

import java.awt.*;
import java.util.List;
import java.util.Objects;

public class Client implements ClientModInitializer
{
	private static final ColorRegistry COLOR = new ColorRegistry(new McwColors(List.of(
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "baobab"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "cherry"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "cypress"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "eucalyptus"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "palm"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "pine"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "redwood"),
			Finder.makeIdHedge(McwRegionsUnexplored.MODID, "willow")
	)));

	@Override
	public void onInitializeClient() {
		APIRenderTypes.initAllWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, ModType.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
		COLOR.registryBlockColorsAverage();
		COLOR.registryItemColors();
		ColorProviderRegistry.BLOCK.register((blockState, blockAndTintGetter, blockPos, i) ->
				(blockAndTintGetter != null && blockPos != null) ?
						BiomeColors.getFoliageColor(blockAndTintGetter, blockPos) :
						FoliageColors.getColor(0.5D, 1.0D),
				Finder.findBlock(Finder.makeIdHedge(McwRegionsUnexplored.MODID, "maple")));
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
			Block block = ((BlockItem)stack.getItem()).getBlock();
			return (Objects.requireNonNull(ColorProviderRegistry.BLOCK.get(block))).getColor(block.getDefaultState(), null, null, tintIndex);
		}, Finder.findBlock(Finder.makeIdHedge(McwRegionsUnexplored.MODID, "maple")));

	}
}