package fr.samlegamer.mcwterraformersmc;

import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;

import java.util.ArrayList;
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
            addAllMcwTags(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, McwTerraformersMC.LEAVES_TRAVERSE);
            addAllMcwTags(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, McwTerraformersMC.ROCKS_CINDERSCAPES, new ArrayList<>());
            addAllMcwTags(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, McwTerraformersMC.ROCKS_TERRESTRIA, McwTerraformersMC.LEAVES_TERRESTRIA);
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
            addAllMcwTags(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, McwTerraformersMC.LEAVES_TRAVERSE);
            addAllMcwTags(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, McwTerraformersMC.ROCKS_CINDERSCAPES, new ArrayList<>());
            addAllMcwTags(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, McwTerraformersMC.ROCKS_TERRESTRIA, McwTerraformersMC.LEAVES_TERRESTRIA);
        }
    }
}