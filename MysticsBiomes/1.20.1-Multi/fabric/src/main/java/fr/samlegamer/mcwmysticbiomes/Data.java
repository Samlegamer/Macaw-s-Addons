package fr.samlegamer.mcwmysticbiomes;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Data implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(RecipesFabric::new);
        pack.addProvider(BlockLootTables::new);
        pack.addProvider(Tags.Blocks::new);
        pack.addProvider(Tags.Items::new);
    }

    @Override
    public String getEffectiveModId() {
        return McwMysticBiomes.MODID;
    }
}