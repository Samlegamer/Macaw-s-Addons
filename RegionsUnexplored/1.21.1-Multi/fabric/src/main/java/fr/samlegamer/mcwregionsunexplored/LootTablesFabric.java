package fr.samlegamer.mcwregionsunexplored;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class LootTablesFabric extends McwLootTables
{
    protected LootTablesFabric(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataGenerator, registryLookup);
    }

    @Override
    public void generate() {
        lootTableUtils.addBlockAllWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD);
        lootTableUtils.addBlockHedges(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
        makeLootTables();
    }
}