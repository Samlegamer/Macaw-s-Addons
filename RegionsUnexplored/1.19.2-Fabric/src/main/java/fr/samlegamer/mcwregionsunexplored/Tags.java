package fr.samlegamer.mcwregionsunexplored;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Tags
{
    public static class Blocks extends McwBlockTags
    {
        public Blocks(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateTags() {
            addAllMcwTagsWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataGenerator dataGenerator, McwBlockTags blockTags) {
            super(dataGenerator, blockTags);
        }

        @Override
        protected void generateTags() {
            addAllMcwTagsWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
        }
    }
}