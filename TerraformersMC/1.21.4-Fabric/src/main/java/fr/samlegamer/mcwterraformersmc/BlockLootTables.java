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
        addBlockAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        addBlockAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        addBlockAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);
        addBlockHedges(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);
        addBlockHedges(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);
        addBlockAllStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES);
        addBlockAllStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA);
        makeLootTables();
    }
}