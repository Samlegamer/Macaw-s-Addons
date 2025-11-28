package fr.samlegamer.mcwbyg;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Data implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        Tags.Blocks blocks = new Tags.Blocks(fabricDataGenerator);
        fabricDataGenerator.addProvider(Recipes::new);
        fabricDataGenerator.addProvider(LootTables::new);
        fabricDataGenerator.addProvider(blocks);
        fabricDataGenerator.addProvider(new Tags.Items(fabricDataGenerator, blocks));
    }
}