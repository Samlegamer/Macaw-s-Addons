package fr.samlegamer.mcwbetters;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class Tags
{
    public static class Blocks extends McwBlockTags
    {
        public Blocks(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider arg) {
            addAllMcwTagsWood(McwBetters.MODID, McwBetters.WOOD_BETTER_END, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwBetters.MODID, McwBetters.LEAVE_BETTER_END);
            addAllMcwTagsWood(McwBetters.MODID, McwBetters.WOOD_BETTER_NETHER.keySet().stream().toList(), ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwBetters.MODID, McwBetters.LEAVE_BETTER_NETHER);
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider arg) {
            addAllMcwTagsWood(McwBetters.MODID, McwBetters.WOOD_BETTER_END, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwBetters.MODID, McwBetters.LEAVE_BETTER_END);
            addAllMcwTagsWood(McwBetters.MODID, McwBetters.WOOD_BETTER_NETHER.keySet().stream().toList(), ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwBetters.MODID, McwBetters.LEAVE_BETTER_NETHER);
        }
    }
}