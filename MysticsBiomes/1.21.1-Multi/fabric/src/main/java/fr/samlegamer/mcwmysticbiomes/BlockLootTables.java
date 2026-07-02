package fr.samlegamer.mcwmysticbiomes;

import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class BlockLootTables extends McwLootTables
{
    protected BlockLootTables(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(dataGenerator, registriesFuture);
    }

    @Override
    public void generate() {
        lootTableUtils.addBlockAllWood(McwMysticBiomes.MODID, McwMysticBiomes.WOOD);
        lootTableUtils.addBlockHedges(McwMysticBiomes.MODID, McwMysticBiomes.LEAVES);
        makeLootTables();
    }
}
