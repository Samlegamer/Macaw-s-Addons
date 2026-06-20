package fr.samlegamer.mcwregionsunexplored;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.Nullable;

public class Data implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(RecipesFabric::new);
        pack.addProvider(LootTables::new);
        pack.addProvider(TagsFabric.Blocks::new);
        pack.addProvider(TagsFabric.Items::new);
    }

    @Override
    public @Nullable String getEffectiveModId() {
        return McwRegionsUnexploredFabric.MODID;
    }
}