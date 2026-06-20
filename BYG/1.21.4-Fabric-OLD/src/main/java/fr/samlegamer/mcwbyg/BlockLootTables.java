package fr.samlegamer.mcwbyg;

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
        addBlockAllWood(McwByg.MODID, McwByg.WOOD);
        addBlockAllStone(McwByg.MODID, McwByg.STONE);
        addBlockHedges(McwByg.MODID, McwByg.LEAVES);
        makeLootTables();
    }
}