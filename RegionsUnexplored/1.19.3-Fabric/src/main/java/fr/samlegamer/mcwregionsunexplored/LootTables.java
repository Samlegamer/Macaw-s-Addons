package fr.samlegamer.mcwregionsunexplored;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

public class LootTables extends McwLootTables
{
    protected LootTables(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generate() {
        addBlockAllWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD);
        addBlockHedges(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
        makeLootTables();
    }
}