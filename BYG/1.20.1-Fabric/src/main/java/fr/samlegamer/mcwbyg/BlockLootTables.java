package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

public class BlockLootTables extends McwLootTables
{
    protected BlockLootTables(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generate() {
        lootTableUtils.addBlockAllWood(McwByg.MODID, McwByg.WOOD);
        lootTableUtils.addBlockAllStone(McwByg.MODID, McwByg.STONE);
        lootTableUtils.addBlockHedges(McwByg.MODID, McwByg.LEAVES);
        makeLootTables();
    }
}