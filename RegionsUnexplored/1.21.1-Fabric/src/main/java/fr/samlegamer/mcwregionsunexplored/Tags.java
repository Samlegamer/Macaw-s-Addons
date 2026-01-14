package fr.samlegamer.mcwregionsunexplored;

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
            addAllMcwTagsWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, Registration.getAllModTypeWood());
            addAllMcwTagsLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
            addAllMcwTagsWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, Registration.getAllModTypeWood());
            addAllMcwTagsLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
        }
    }
}