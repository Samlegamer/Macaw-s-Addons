package fr.samlegamer.mcwterraformersmc;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BlockLootTables extends McwLootTables
{
    protected BlockLootTables(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataGenerator, registryLookup);
    }

    @Override
    public void generate() {
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