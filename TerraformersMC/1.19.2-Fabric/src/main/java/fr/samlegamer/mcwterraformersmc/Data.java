package fr.samlegamer.mcwterraformersmc;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.Nullable;

public class Data implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        Tags.Blocks blocks = new Tags.Blocks(fabricDataGenerator);
        fabricDataGenerator.addProvider(Recipes::new);
        fabricDataGenerator.addProvider(BlockLootTables::new);
        fabricDataGenerator.addProvider(blocks);
        fabricDataGenerator.addProvider(new Tags.Items(fabricDataGenerator, blocks));
    }

    @Override
    public @Nullable String getEffectiveModId() {
        return McwTerraformersMC.MODID;
    }
}
