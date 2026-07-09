package fr.samlegamer.mcwbetters;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class LootTables extends McwLootTables {
    protected LootTables(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {
        lootTableUtils.addBlockAllWood(McwBettersFabric.MODID, McwBettersFabric.WOOD_BETTER_END);
        lootTableUtils.addBlockHedges(McwBettersFabric.MODID, McwBettersFabric.LEAVE_BETTER_END);
        lootTableUtils.addBlockAllWood(McwBettersFabric.MODID, McwBettersFabric.WOOD_BETTER_NETHER);
        lootTableUtils.addBlockHedges(McwBettersFabric.MODID, McwBettersFabric.LEAVE_BETTER_NETHER);
        makeLootTables();

    }
}
