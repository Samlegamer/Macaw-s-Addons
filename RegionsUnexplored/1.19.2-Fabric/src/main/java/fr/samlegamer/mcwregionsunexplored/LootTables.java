package fr.samlegamer.mcwregionsunexplored;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class LootTables extends McwLootTables
{
    protected LootTables(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {
        addBlockAllWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD);
        addBlockHedges(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
        makeLootTables();
    }
}