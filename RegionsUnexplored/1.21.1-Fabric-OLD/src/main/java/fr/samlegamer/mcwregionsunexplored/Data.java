package fr.samlegamer.mcwregionsunexplored;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.Nullable;

public class Data implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(Recipes::new);
        pack.addProvider(LootTables::new);
        pack.addProvider(Tags.Blocks::new);
        pack.addProvider(Tags.Items::new);
    }

    @Override
    public @Nullable String getEffectiveModId() {
        return McwRegionsUnexplored.MODID;
    }
}