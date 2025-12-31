package fr.samlegamer.mcwbyg;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.Nullable;

public class Tags
{
    public static class Blocks extends McwBlockTags
    {
        public Blocks(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateTags() {
            addAllMcwTagsWood(McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwByg.MODID, McwByg.LEAVES);
            addAllMcwTagsStone(McwByg.MODID, McwByg.bridges_rockable, ModType.BRIDGES);
            addAllMcwTagsStone(McwByg.MODID, McwByg.fences_rockable, ModType.FENCES, ModType.ROOFS);
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataGenerator dataGenerator, @Nullable BlockTagProvider blockTagProvider) {
            super(dataGenerator, blockTagProvider);
        }

        @Override
        protected void generateTags() {
            addAllMcwTagsWood(McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwByg.MODID, McwByg.LEAVES);
            addAllMcwTagsStone(McwByg.MODID, McwByg.bridges_rockable, ModType.BRIDGES);
            addAllMcwTagsStone(McwByg.MODID, McwByg.fences_rockable, ModType.FENCES, ModType.ROOFS);
        }
    }
}