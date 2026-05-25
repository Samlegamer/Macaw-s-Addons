package fr.samlegamer.mcwterraformersmc;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class Tags
{
    public static class Blocks extends McwBlockTags
    {
        public Blocks(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
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
        public Items(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
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