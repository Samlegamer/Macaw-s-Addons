package fr.samlegamer.mcwterraformersmc;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BlockLootTables extends McwLootTables
{
    protected BlockLootTables(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockLootTables() {
        lootTableUtils.addBlockAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        lootTableUtils.addBlockAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        lootTableUtils.addBlockAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);
        lootTableUtils.addBlockHedges(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);
        lootTableUtils.addBlockHedges(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);
        lootTableUtils.addBlockAllStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES);
        lootTableUtils.addBlockAllStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA);
        makeLootTables();
    }
}