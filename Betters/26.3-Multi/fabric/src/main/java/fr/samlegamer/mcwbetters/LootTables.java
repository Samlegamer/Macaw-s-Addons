package fr.samlegamer.mcwbetters;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class LootTables extends McwLootTables {
    protected LootTables(FabricPackOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataGenerator, registryLookup);
    }

    @Override
    public void generate() {
        lootTableUtils.addBlockAllWood(McwBetters.MODID, McwBetters.WOOD_BETTER_END);
        lootTableUtils.addBlockHedges(McwBetters.MODID, McwBetters.LEAVE_BETTER_END);
        lootTableUtils.addBlockAllWood(McwBetters.MODID, McwBetters.WOOD_BETTER_NETHER.keySet().stream().toList());
        lootTableUtils.addBlockHedges(McwBetters.MODID, McwBetters.LEAVE_BETTER_NETHER);
        makeLootTables();

    }
}
