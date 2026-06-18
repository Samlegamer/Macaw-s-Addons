package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class BlockLootTables extends McwLootTables
{
    protected BlockLootTables(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataGenerator, registryLookup);
    }

    @Override
    public void generate() {
        lootTableUtils.addBlockAllWood(McwByg.MODID, McwByg.WOOD);
        lootTableUtils.addBlockAllStone(McwByg.MODID, McwByg.STONE);
        lootTableUtils.addBlockHedges(McwByg.MODID, McwByg.LEAVES);
        makeLootTables();
    }
}