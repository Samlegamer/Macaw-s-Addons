package fr.samlegamer.mcwterraformersmc;

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
            addAllMcwTagsWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);

            addAllMcwTagsWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, ModType.getAllModTypeWood());
            addAllMcwTagsStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES, ModType.getAllModTypeStone());

            addAllMcwTagsWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);
            addAllMcwTagsStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA, ModType.getAllModTypeStone());
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataGenerator dataGenerator, @Nullable BlockTagProvider blockTagProvider) {
            super(dataGenerator, blockTagProvider);
        }

        @Override
        protected void generateTags() {
            addAllMcwTagsWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);

            addAllMcwTagsWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, ModType.getAllModTypeWood());
            addAllMcwTagsStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES, ModType.getAllModTypeStone());

            addAllMcwTagsWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, ModType.getAllModTypeWood());
            addAllMcwTagsLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);
            addAllMcwTagsStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA, ModType.getAllModTypeStone());
        }
    }
}