package fr.samlegamer.mcwbyg;

import fr.addonslib.api.data.McwBlocksIdBase;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.function.BiConsumer;

public class LootTables extends McwLootTables {
    protected LootTables(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generate() {
        addBlockAllWood(McwByg.MODID, McwByg.WOOD);
        addBlockHedges(McwByg.MODID, McwByg.LEAVES);
        addBlock(McwByg.MODID, McwByg.bridges_rockable, McwBlocksIdBase.BRIDGES_STONE_BLOCKS);
        addBlock(McwByg.MODID, McwByg.fences_rockable, McwBlocksIdBase.ROOFS_STONE_BLOCKS);
        addBlock(McwByg.MODID, McwByg.fences_rockable, McwBlocksIdBase.FENCES_STONE_BLOCKS);
        makeLootTables();
    }

    @Override
    public void accept(BiConsumer<ResourceLocation, LootTable.Builder> exporter) {
        super.generate(exporter);
    }
}
