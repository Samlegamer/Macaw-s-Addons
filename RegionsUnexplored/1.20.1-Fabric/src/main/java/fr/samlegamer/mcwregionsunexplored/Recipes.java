package fr.samlegamer.mcwregionsunexplored;

import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import io.github.uhq_games.regions_unexplored.RegionsUnexplored;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import static io.github.uhq_games.regions_unexplored.block.RuBlocks.*;

public class Recipes extends McwRecipes
{
    public Recipes(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        registerAllMcwWood(consumer, McwRegionsUnexplored.MODID, RegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, getWoodMat());
        registerMcwHedge(consumer, McwRegionsUnexplored.MODID, RegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES, getLeavesMat());
    }

    private List<Block> getLeavesMat()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(BAOBAB_LEAVES);
        mats.add(BLACKWOOD_LEAVES);
        mats.add(CYPRESS_LEAVES);
        mats.add(DEAD_LEAVES);
        mats.add(EUCALYPTUS_LEAVES);
        mats.add(LARCH_LEAVES);
        mats.add(MAPLE_LEAVES);
        mats.add(MAUVE_LEAVES);
        mats.add(PALM_LEAVES);
        mats.add(PINE_LEAVES);
        mats.add(REDWOOD_LEAVES);
        mats.add(WILLOW_LEAVES);
        mats.add(ALPHA_LEAVES);
        mats.add(RED_MAPLE_LEAVES);
        mats.add(ORANGE_MAPLE_LEAVES);
        mats.add(GOLDEN_LARCH_LEAVES);
        mats.add(DEAD_PINE_LEAVES);
        mats.add(SILVER_BIRCH_LEAVES);
        mats.add(BAMBOO_LEAVES);
        mats.add(SOCOTRA_LEAVES);
        mats.add(KAPOK_LEAVES);
        mats.add(ENCHANTED_BIRCH_LEAVES);
        mats.add(BLUE_MAGNOLIA_LEAVES);
        mats.add(MAGNOLIA_LEAVES);
        mats.add(PINK_MAGNOLIA_LEAVES);
        mats.add(WHITE_MAGNOLIA_LEAVES);
        mats.add(BRIMWOOD_LEAVES);
        return mats;
    }


    private List<McwWoodMat<Block>> getWoodMat()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(BAOBAB_LOG, BAOBAB_PLANKS, STRIPPED_BAOBAB_LOG, BAOBAB_SLAB, BAOBAB_FENCE, BAOBAB_TRAPDOOR));
        mats.add(new McwWoodMat<>(BLACKWOOD_LOG, BLACKWOOD_PLANKS, STRIPPED_BLACKWOOD_LOG, BLACKWOOD_SLAB, BLACKWOOD_FENCE, BLACKWOOD_TRAPDOOR));
        mats.add(new McwWoodMat<>(CYPRESS_LOG, CYPRESS_PLANKS, STRIPPED_CYPRESS_LOG, CYPRESS_SLAB, CYPRESS_FENCE, CYPRESS_TRAPDOOR));
        mats.add(new McwWoodMat<>(DEAD_LOG, DEAD_PLANKS, STRIPPED_DEAD_LOG, DEAD_SLAB, DEAD_FENCE, DEAD_TRAPDOOR));
        mats.add(new McwWoodMat<>(EUCALYPTUS_LOG, EUCALYPTUS_PLANKS, STRIPPED_EUCALYPTUS_LOG, EUCALYPTUS_SLAB, EUCALYPTUS_FENCE, EUCALYPTUS_TRAPDOOR));
        mats.add(new McwWoodMat<>(JOSHUA_LOG, JOSHUA_PLANKS, STRIPPED_JOSHUA_LOG, JOSHUA_SLAB, JOSHUA_FENCE, JOSHUA_TRAPDOOR));
        mats.add(new McwWoodMat<>(LARCH_LOG, LARCH_PLANKS, STRIPPED_LARCH_LOG, LARCH_SLAB, LARCH_FENCE, LARCH_TRAPDOOR));
        mats.add(new McwWoodMat<>(MAPLE_LOG, MAPLE_PLANKS, STRIPPED_MAPLE_LOG, MAPLE_SLAB, MAPLE_FENCE, MAPLE_TRAPDOOR));
        mats.add(new McwWoodMat<>(MAUVE_LOG, MAUVE_PLANKS, STRIPPED_MAUVE_LOG, MAUVE_SLAB, MAUVE_FENCE, MAUVE_TRAPDOOR));
        mats.add(new McwWoodMat<>(PALM_LOG, PALM_PLANKS, STRIPPED_PALM_LOG, PALM_SLAB, PALM_FENCE, PALM_TRAPDOOR));
        mats.add(new McwWoodMat<>(PINE_LOG, PINE_PLANKS, STRIPPED_PINE_LOG, PINE_SLAB, PINE_FENCE, PINE_TRAPDOOR));
        mats.add(new McwWoodMat<>(REDWOOD_LOG, REDWOOD_PLANKS, STRIPPED_REDWOOD_LOG, REDWOOD_SLAB, REDWOOD_FENCE, REDWOOD_TRAPDOOR));
        mats.add(new McwWoodMat<>(WILLOW_LOG, WILLOW_PLANKS, STRIPPED_WILLOW_LOG, WILLOW_SLAB, WILLOW_FENCE, WILLOW_TRAPDOOR));
        mats.add(new McwWoodMat<>(BRIMWOOD_LOG, BRIMWOOD_PLANKS, STRIPPED_BRIMWOOD_LOG, BRIMWOOD_SLAB, BRIMWOOD_FENCE, BRIMWOOD_TRAPDOOR));
        mats.add(new McwWoodMat<>(COBALT_LOG, COBALT_PLANKS, STRIPPED_COBALT_LOG, COBALT_SLAB, COBALT_FENCE, COBALT_TRAPDOOR));
        mats.add(new McwWoodMat<>(KAPOK_LOG, KAPOK_PLANKS, STRIPPED_KAPOK_LOG, KAPOK_SLAB, KAPOK_FENCE, KAPOK_TRAPDOOR));
        mats.add(new McwWoodMat<>(MAGNOLIA_LOG, MAGNOLIA_PLANKS, STRIPPED_MAGNOLIA_LOG, MAGNOLIA_SLAB, MAGNOLIA_FENCE, MAGNOLIA_TRAPDOOR));
        mats.add(new McwWoodMat<>(SOCOTRA_LOG, SOCOTRA_PLANKS, STRIPPED_SOCOTRA_LOG, SOCOTRA_SLAB, SOCOTRA_FENCE, SOCOTRA_TRAPDOOR));
        mats.add(new McwWoodMat<>(BLUE_BIOSHROOM_HYPHAE, BLUE_BIOSHROOM_PLANKS, STRIPPED_BLUE_BIOSHROOM_HYPHAE, BLUE_BIOSHROOM_SLAB, BLUE_BIOSHROOM_FENCE, BLUE_BIOSHROOM_TRAPDOOR));
        mats.add(new McwWoodMat<>(GREEN_BIOSHROOM_HYPHAE, GREEN_BIOSHROOM_PLANKS, STRIPPED_GREEN_BIOSHROOM_HYPHAE, GREEN_BIOSHROOM_SLAB, GREEN_BIOSHROOM_FENCE, GREEN_BIOSHROOM_TRAPDOOR));
        mats.add(new McwWoodMat<>(PINK_BIOSHROOM_HYPHAE, PINK_BIOSHROOM_PLANKS, STRIPPED_PINK_BIOSHROOM_HYPHAE, PINK_BIOSHROOM_SLAB, PINK_BIOSHROOM_FENCE, PINK_BIOSHROOM_TRAPDOOR));
        mats.add(new McwWoodMat<>(YELLOW_BIOSHROOM_HYPHAE, YELLOW_BIOSHROOM_PLANKS, STRIPPED_YELLOW_BIOSHROOM_HYPHAE, YELLOW_BIOSHROOM_SLAB, YELLOW_BIOSHROOM_FENCE, YELLOW_BIOSHROOM_TRAPDOOR));
        return mats;
    }
}
