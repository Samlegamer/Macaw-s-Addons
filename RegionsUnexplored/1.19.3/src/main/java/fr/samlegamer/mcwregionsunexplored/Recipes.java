package fr.samlegamer.mcwregionsunexplored;

import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Block;
import static net.regions_unexplored.block.RegionsUnexploredBlocks.*;

import net.regions_unexplored.RegionsUnexploredMod;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(PackOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        registerAllMcwWood(consumer, McwRegionsUnexplored.MODID, RegionsUnexploredMod.MOD_ID, McwRegionsUnexplored.WOOD, getWoodMat());
        registerMcwHedge(consumer, McwRegionsUnexplored.MODID, RegionsUnexploredMod.MOD_ID, McwRegionsUnexplored.LEAVES, getLeavesMat());
    }

    private List<Block> getLeavesMat()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(BAOBAB_LEAVES.get());
        mats.add(BLACKWOOD_LEAVES.get());
        mats.add(CHERRY_LEAVES.get());
        mats.add(CYPRESS_LEAVES.get());
        mats.add(DEAD_LEAVES.get());
        mats.add(EUCALYPTUS_LEAVES.get());
        mats.add(LARCH_LEAVES.get());
        mats.add(MAPLE_LEAVES.get());
        mats.add(MAUVE_LEAVES.get());
        mats.add(PALM_LEAVES.get());
        mats.add(PINE_LEAVES.get());
        mats.add(REDWOOD_LEAVES.get());
        mats.add(SCULKWOOD_LEAVES.get());
        mats.add(WILLOW_LEAVES.get());
        mats.add(ALPHA_LEAVES.get());
        mats.add(PINK_CHERRY_LEAVES.get());
        mats.add(RED_CHERRY_LEAVES.get());
        mats.add(WHITE_CHERRY_LEAVES.get());
        mats.add(RED_MAPLE_LEAVES.get());
        mats.add(ORANGE_MAPLE_LEAVES.get());
        mats.add(GOLDEN_LARCH_LEAVES.get());
        mats.add(DEAD_PINE_LEAVES.get());
        mats.add(SILVER_BIRCH_LEAVES.get());
        return mats;
    }


    private List<McwWoodMat<Block>> getWoodMat()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(BAOBAB_LOG.get(), BAOBAB_PLANKS.get(), STRIPPED_BAOBAB_LOG.get(), BAOBAB_SLAB.get(), BAOBAB_FENCE.get(), BAOBAB_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(BLACKWOOD_LOG.get(), BLACKWOOD_PLANKS.get(), STRIPPED_BLACKWOOD_LOG.get(), BLACKWOOD_SLAB.get(), BLACKWOOD_FENCE.get(), BLACKWOOD_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(CHERRY_LOG.get(), CHERRY_PLANKS.get(), STRIPPED_CHERRY_LOG.get(), CHERRY_SLAB.get(), CHERRY_FENCE.get(), CHERRY_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(CYPRESS_LOG.get(), CYPRESS_PLANKS.get(), STRIPPED_CYPRESS_LOG.get(), CYPRESS_SLAB.get(), CYPRESS_FENCE.get(), CYPRESS_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(DEAD_LOG.get(), DEAD_PLANKS.get(), STRIPPED_DEAD_LOG.get(), DEAD_SLAB.get(), DEAD_FENCE.get(), DEAD_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(EUCALYPTUS_LOG.get(), EUCALYPTUS_PLANKS.get(), STRIPPED_EUCALYPTUS_LOG.get(), EUCALYPTUS_SLAB.get(), EUCALYPTUS_FENCE.get(), EUCALYPTUS_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(JOSHUA_LOG.get(), JOSHUA_PLANKS.get(), STRIPPED_JOSHUA_LOG.get(), JOSHUA_SLAB.get(), JOSHUA_FENCE.get(), JOSHUA_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(LARCH_LOG.get(), LARCH_PLANKS.get(), STRIPPED_LARCH_LOG.get(), LARCH_SLAB.get(), LARCH_FENCE.get(), LARCH_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(MAPLE_LOG.get(), MAPLE_PLANKS.get(), STRIPPED_MAPLE_LOG.get(), MAPLE_SLAB.get(), MAPLE_FENCE.get(), MAPLE_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(MAUVE_LOG.get(), MAUVE_PLANKS.get(), STRIPPED_MAUVE_LOG.get(), MAUVE_SLAB.get(), MAUVE_FENCE.get(), MAUVE_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(PALM_LOG.get(), PALM_PLANKS.get(), STRIPPED_PALM_LOG.get(), PALM_SLAB.get(), PALM_FENCE.get(), PALM_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(PINE_LOG.get(), PINE_PLANKS.get(), STRIPPED_PINE_LOG.get(), PINE_SLAB.get(), PINE_FENCE.get(), PINE_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(REDWOOD_LOG.get(), REDWOOD_PLANKS.get(), STRIPPED_REDWOOD_LOG.get(), REDWOOD_SLAB.get(), REDWOOD_FENCE.get(), REDWOOD_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(SCULKWOOD_LOG.get(), SCULKWOOD_PLANKS.get(), SCULKWOOD_LOG_DARK.get(), SCULKWOOD_SLAB.get(), SCULKWOOD_FENCE.get(), SCULKWOOD_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(WILLOW_LOG.get(), WILLOW_PLANKS.get(), STRIPPED_WILLOW_LOG.get(), WILLOW_SLAB.get(), WILLOW_FENCE.get(), WILLOW_TRAPDOOR.get()));
        return mats;
    }
}
