package fr.samlegamer.mcwterraformersmc;

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
            addAllMcwTags(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, McwTerraformersMC.LEAVES_TRAVERSE);
            addAllMcwTags(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, McwTerraformersMC.ROCKS_CINDERSCAPES, new ArrayList<>());
            addAllMcwTags(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, McwTerraformersMC.ROCKS_TERRESTRIA, McwTerraformersMC.LEAVES_TERRESTRIA);
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataGenerator dataGenerator, @Nullable BlockTagProvider blockTagProvider) {
            super(dataGenerator, blockTagProvider);
        }

        @Override
        protected void generateTags() {
            addAllMcwTags(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, McwTerraformersMC.LEAVES_TRAVERSE);
            addAllMcwTags(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, McwTerraformersMC.ROCKS_CINDERSCAPES, new ArrayList<>());
            addAllMcwTags(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, McwTerraformersMC.ROCKS_TERRESTRIA, McwTerraformersMC.LEAVES_TERRESTRIA);
        }
    }
}