package fr.samlegamer.mcwbiomesoplenty;

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
            addAllMcwTagsWood(McwBOP.MODID, McwBOP.WOOD, Registration.getAllModTypeWood());
            addAllMcwTagsLeave(McwBOP.MODID, McwBOP.LEAVES);
        }
    }

    public static class Items extends McwItemTags
    {
        public Items(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
            addAllMcwTagsWood(McwBOP.MODID, McwBOP.WOOD, Registration.getAllModTypeWood());
            addAllMcwTagsLeave(McwBOP.MODID, McwBOP.LEAVES);
        }
    }
}