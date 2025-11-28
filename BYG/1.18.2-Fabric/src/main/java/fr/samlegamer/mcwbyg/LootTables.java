package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.data.McwBlocksIdBase;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class LootTables extends McwLootTables {
    protected LootTables(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {
        addBlockAllWood(McwByg.MODID, McwByg.WOOD);
        addBlockHedges(McwByg.MODID, McwByg.LEAVES);
        addBlock(McwByg.MODID, McwByg.bridges_rockable, McwBlocksIdBase.BRIDGES_STONE_BLOCKS);
        addBlock(McwByg.MODID, McwByg.fences_rockable, McwBlocksIdBase.ROOFS_STONE_BLOCKS);
        addBlock(McwByg.MODID, McwByg.fences_rockable, McwBlocksIdBase.FENCES_STONE_BLOCKS);
        makeLootTables();

    }
}
