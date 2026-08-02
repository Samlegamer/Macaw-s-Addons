package fr.samlegamer.mcwbetters;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

public class LootTables extends McwLootTables {
    protected LootTables(FabricDataOutput dataGenerator) {
        super(dataGenerator);
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
