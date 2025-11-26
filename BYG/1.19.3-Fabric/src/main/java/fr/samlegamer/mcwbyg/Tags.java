package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;

import java.util.ArrayList;
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
            addAllMcwTags(McwByg.MODID, McwByg.WOOD, McwByg.LEAVES);
            mcwBridgesTagsStone(McwByg.MODID, McwByg.bridges_rockable);
            mcwRoofsTags(McwByg.MODID, new ArrayList<>(), McwByg.fences_rockable);
            mcwFencesTags(McwByg.MODID, new ArrayList<>(), new ArrayList<>(), McwByg.fences_rockable);
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider arg) {
            addAllMcwTags(McwByg.MODID, McwByg.WOOD, McwByg.LEAVES);
            mcwFencesTags(McwByg.MODID, new ArrayList<>(), new ArrayList<>(), McwByg.fences_rockable);
        }
    }
}