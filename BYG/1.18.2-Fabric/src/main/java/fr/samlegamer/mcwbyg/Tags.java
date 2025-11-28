package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.Nullable;
import java.util.ArrayList;

public class Tags
{
    public static class Blocks extends McwBlockTags
    {
        public Blocks(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateTags() {
            addAllMcwTags(McwByg.MODID, McwByg.WOOD, McwByg.LEAVES);
            mcwBridgesTagsStone(McwByg.MODID, McwByg.bridges_rockable);
            mcwRoofsTags(McwByg.MODID, new ArrayList<>(), McwByg.fences_rockable);
            mcwFencesTags(McwByg.MODID, new ArrayList<>(), new ArrayList<>(), McwByg.fences_rockable);
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataGenerator dataGenerator, @Nullable BlockTagProvider blockTagProvider) {
            super(dataGenerator, blockTagProvider);
        }

        @Override
        protected void generateTags() {
            addAllMcwTags(McwByg.MODID, McwByg.WOOD, McwByg.LEAVES);
            mcwFencesTags(McwByg.MODID, new ArrayList<>(), new ArrayList<>(), McwByg.fences_rockable);
        }
    }
}