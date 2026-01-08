package fr.samlegamer.mcwregionsunexplored;

import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.regions_unexplored.RegionsUnexploredMod;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static net.regions_unexplored.block.RegionsUnexploredBlocks.*;

public class Recipes extends McwRecipes
{
    public Recipes(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }


    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> consumer) {
        registerAllMcwWood(consumer, McwRegionsUnexplored.MODID, RegionsUnexploredMod.MOD_ID, McwRegionsUnexplored.WOOD, getWoodMat());
        registerMcwHedge(consumer, McwRegionsUnexplored.MODID, RegionsUnexploredMod.MOD_ID, McwRegionsUnexplored.LEAVES, getLeavesMat());
    }

    private List<Block> getLeavesMat()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(BAOBAB_LEAVES);
        mats.add(BLACKWOOD_LEAVES);
        mats.add(CHERRY_LEAVES);
        mats.add(CYPRESS_LEAVES);
        mats.add(DEAD_LEAVES);
        mats.add(EUCALYPTUS_LEAVES);
        mats.add(LARCH_LEAVES);
        mats.add(MAPLE_LEAVES);
        mats.add(MAUVE_LEAVES);
        mats.add(PALM_LEAVES);
        mats.add(PINE_LEAVES);
        mats.add(REDWOOD_LEAVES);
        mats.add(SCULKWOOD_LEAVES);
        mats.add(WILLOW_LEAVES);
        mats.add(ALPHA_LEAVES);
        mats.add(PINK_CHERRY_LEAVES);
        mats.add(RED_CHERRY_LEAVES);
        mats.add(WHITE_CHERRY_LEAVES);
        mats.add(RED_MAPLE_LEAVES);
        mats.add(ORANGE_MAPLE_LEAVES);
        mats.add(GOLDEN_LARCH_LEAVES);
        mats.add(DEAD_PINE_LEAVES);
        mats.add(SILVER_BIRCH_LEAVES);
        return mats;
    }


    private List<McwWoodMat<Block>> getWoodMat()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(BAOBAB_LOG, BAOBAB_PLANKS, STRIPPED_BAOBAB_LOG, BAOBAB_SLAB, BAOBAB_FENCE, BAOBAB_TRAPDOOR));
        mats.add(new McwWoodMat<>(BLACKWOOD_LOG, BLACKWOOD_PLANKS, STRIPPED_BLACKWOOD_LOG, BLACKWOOD_SLAB, BLACKWOOD_FENCE, BLACKWOOD_TRAPDOOR));
        mats.add(new McwWoodMat<>(CHERRY_LOG, CHERRY_PLANKS, STRIPPED_CHERRY_LOG, CHERRY_SLAB, CHERRY_FENCE, CHERRY_TRAPDOOR));
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
        mats.add(new McwWoodMat<>(SCULKWOOD_LOG, SCULKWOOD_PLANKS, SCULKWOOD_LOG_DARK, SCULKWOOD_SLAB, SCULKWOOD_FENCE, SCULKWOOD_TRAPDOOR));
        mats.add(new McwWoodMat<>(WILLOW_LOG, WILLOW_PLANKS, STRIPPED_WILLOW_LOG, WILLOW_SLAB, WILLOW_FENCE, WILLOW_TRAPDOOR));
        return mats;
    }

}
