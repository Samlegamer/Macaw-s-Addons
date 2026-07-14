package fr.samlegamer.mcwbetters;

import fr.addonslib.api.data.ModType;
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
            addAllMcwTagsWood(McwBettersFabric.MODID, McwBettersFabric.WOOD_BETTER_END, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwBettersFabric.MODID, McwBettersFabric.LEAVE_BETTER_END);
            addAllMcwTagsWood(McwBettersFabric.MODID, McwBettersFabric.WOOD_BETTER_NETHER, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwBettersFabric.MODID, McwBettersFabric.LEAVE_BETTER_NETHER);
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataGenerator dataGenerator, @Nullable BlockTagProvider blockTagProvider) {
            super(dataGenerator, blockTagProvider);
        }

        @Override
        protected void generateTags() {
            addAllMcwTagsWood(McwBettersFabric.MODID, McwBettersFabric.WOOD_BETTER_END, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwBettersFabric.MODID, McwBettersFabric.LEAVE_BETTER_END);
            addAllMcwTagsWood(McwBettersFabric.MODID, McwBettersFabric.WOOD_BETTER_NETHER, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwBettersFabric.MODID, McwBettersFabric.LEAVE_BETTER_NETHER);
        }
    }
}