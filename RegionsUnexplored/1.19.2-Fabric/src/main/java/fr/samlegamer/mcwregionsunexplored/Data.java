package fr.samlegamer.mcwregionsunexplored;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.Nullable;

public class Data implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        Tags.Blocks mcwBlockTags = new Tags.Blocks(fabricDataGenerator);
        Tags.Items mcwItemTags = new Tags.Items(fabricDataGenerator, mcwBlockTags);

        fabricDataGenerator.addProvider(Recipes::new);
        fabricDataGenerator.addProvider(mcwBlockTags);
        fabricDataGenerator.addProvider(mcwItemTags);
        fabricDataGenerator.addProvider(LootTables::new);
    }

    @Override
    public @Nullable String getEffectiveModId() {
        return McwRegionsUnexplored.MODID;
    }
}