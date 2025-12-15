package fr.samlegamer.mcwbyg;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Registration;
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
            addAllMcwTagsWood(McwByg.MODID, McwByg.WOOD, Registration.getAllModTypeWood());
            addAllMcwTagsLeave(McwByg.MODID, McwByg.LEAVES);
            addAllMcwTagsStone(McwByg.MODID, McwByg.bridges_rockable, ModType.BRIDGES);
            addAllMcwTagsStone(McwByg.MODID, McwByg.fences_rockable, ModType.FENCES, ModType.ROOFS);
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider arg) {
            addAllMcwTagsWood(McwByg.MODID, McwByg.WOOD, Registration.getAllModTypeWood());
            addAllMcwTagsLeave(McwByg.MODID, McwByg.LEAVES);
            addAllMcwTagsStone(McwByg.MODID, McwByg.bridges_rockable, ModType.BRIDGES);
            addAllMcwTagsStone(McwByg.MODID, McwByg.fences_rockable, ModType.FENCES, ModType.ROOFS);
        }
    }
}