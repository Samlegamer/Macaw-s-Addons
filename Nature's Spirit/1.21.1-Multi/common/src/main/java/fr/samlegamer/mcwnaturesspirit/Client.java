package fr.samlegamer.mcwnaturesspirit;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;

import java.util.List;

public class Client
{
    public static final List<String> colorRegistry = List.of("aspen", "larch", "mahogany", "sugi");

    public static int getLeaveColor(BlockAndTintGetter blockAndTintGetter, BlockPos blockPos)
    {
        return blockAndTintGetter != null && blockPos != null ? BiomeColors.getAverageFoliageColor(blockAndTintGetter, blockPos) : -1;
    }
}