package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

public class BlockLootTables extends McwLootTables
{
    protected BlockLootTables(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generate() {
        lootTableUtils.addBlockAllWood(McwBOP.MODID, McwBOP.WOOD);
        lootTableUtils.addBlockHedges(McwBOP.MODID, McwBOP.LEAVES);
        makeLootTables();
    }
}