package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.data.McwBlocksIdBase;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.Nullable;
import java.util.ArrayList;

public class Data implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(new Recipes(fabricDataGenerator));
        fabricDataGenerator.addProvider(new McwBlockTags(fabricDataGenerator) {
            @Override
            protected void generateTags() {
                addAllMcwTags(McwByg.MODID, McwByg.WOOD, McwByg.LEAVES);
                mcwBridgesTagsStone(McwByg.MODID, McwByg.bridges_rockable);
                mcwFencesTags(McwByg.MODID, new ArrayList<>(), new ArrayList<>(), McwByg.fences_rockable);
            }
        });
        fabricDataGenerator.addProvider(new McwItemTags(fabricDataGenerator) {
            @Override
            protected void generateTags() {
                addAllMcwTags(McwByg.MODID, McwByg.WOOD, McwByg.LEAVES);
                mcwFencesTags(McwByg.MODID, new ArrayList<>(), new ArrayList<>(), McwByg.fences_rockable);
            }
        });
        fabricDataGenerator.addProvider(new McwLootTables(fabricDataGenerator) {
            @Override
            protected void generateBlockLootTables() {
                addBlockAllWood(McwByg.MODID, McwByg.WOOD);
                addBlockHedges(McwByg.MODID, McwByg.LEAVES);
                addBlock(McwByg.MODID, McwByg.bridges_rockable, McwBlocksIdBase.BRIDGES_STONE_BLOCKS);
                addBlock(McwByg.MODID, McwByg.fences_rockable, McwBlocksIdBase.ROOFS_STONE_BLOCKS);
                addBlock(McwByg.MODID, McwByg.fences_rockable, McwBlocksIdBase.FENCES_STONE_BLOCKS);
                makeLootTables();
            }
        });
    }

    @Override
    public @Nullable String getEffectiveModId() {
        return McwByg.MODID;
    }
}
