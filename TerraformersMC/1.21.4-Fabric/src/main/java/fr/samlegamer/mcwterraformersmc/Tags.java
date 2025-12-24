package fr.samlegamer.mcwterraformersmc;

import fr.samlegamer.addonslib.Registration;
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
            addAllMcwTagsWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, Registration.getAllModTypeWood());
            addAllMcwTagsLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);

            addAllMcwTagsWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, Registration.getAllModTypeWood());
            addAllMcwTagsStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES, Registration.getAllModTypeStone());

            addAllMcwTagsWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, Registration.getAllModTypeWood());
            addAllMcwTagsLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);
            addAllMcwTagsStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA, Registration.getAllModTypeStone());
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
            addAllMcwTagsWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, Registration.getAllModTypeWood());
            addAllMcwTagsLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);

            addAllMcwTagsWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, Registration.getAllModTypeWood());
            addAllMcwTagsStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES, Registration.getAllModTypeStone());

            addAllMcwTagsWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, Registration.getAllModTypeWood());
            addAllMcwTagsLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);
            addAllMcwTagsStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA, Registration.getAllModTypeStone());
        }
    }
}