package fr.samlegamer.mcwmysticbiomes;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

public class BlockLootTables extends McwLootTables
{
    protected BlockLootTables(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generate() {
        lootTableUtils.addBlockAllWood(McwMysticBiomes.MODID, McwMysticBiomes.WOOD);
        lootTableUtils.addBlockHedges(McwMysticBiomes.MODID, McwMysticBiomes.LEAVES);
        makeLootTables();
    }
}