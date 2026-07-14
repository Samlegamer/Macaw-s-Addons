package fr.samlegamer.mcwbiomesoplenty;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class Tags
{
    public static class Blocks extends McwBlockTags
    {
        public Blocks(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider wrapperLookup) {
            addAllMcwTagsWood(McwBOP.MODID, McwBOP.WOOD, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwBOP.MODID, McwBOP.LEAVES);
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider wrapperLookup) {
            addAllMcwTagsWood(McwBOP.MODID, McwBOP.WOOD, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwBOP.MODID, McwBOP.LEAVES);
        }
    }
}