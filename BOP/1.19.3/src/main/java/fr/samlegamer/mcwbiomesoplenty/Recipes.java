package fr.samlegamer.mcwbiomesoplenty;

import static biomesoplenty.api.block.BOPBlocks.*;
import biomesoplenty.core.BiomesOPlenty;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import fr.samlegamer.addonslib.generation.recipes.mat.McwWoodMat;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Block;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.*;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(PackOutput p_248933_) {
        super(p_248933_, McwBOP.MODID, "", BiomesOPlenty.MOD_ID);
    }

    @ParametersAreNonnullByDefault
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        List<Block> leave = List.of(PINK_CHERRY_LEAVES.get(), DEAD_LEAVES.get(), FIR_LEAVES.get(), HELLBARK_LEAVES.get(), JACARANDA_LEAVES.get(), MAGIC_LEAVES.get(), MAHOGANY_LEAVES.get(),
                PALM_LEAVES.get(), REDWOOD_LEAVES.get(), UMBRAN_LEAVES.get(), WILLOW_LEAVES.get(), MAPLE_LEAVES.get(), ORANGE_AUTUMN_LEAVES.get(), YELLOW_AUTUMN_LEAVES.get(), WHITE_CHERRY_LEAVES.get(),
                FLOWERING_OAK_LEAVES.get(), RAINBOW_BIRCH_LEAVES.get(), ORIGIN_LEAVES.get());

        List<McwWoodMat> woodMats = getWoodMats();

        registerAllMcwWood(consumer, McwBOP.MODID, BiomesOPlenty.MOD_ID, McwBOP.WOOD, woodMats);
        registerMcwHedge(consumer, McwBOP.MODID, BiomesOPlenty.MOD_ID, McwBOP.LEAVES, leave);
    }

    private List<McwWoodMat> getWoodMats()
    {
        List<McwWoodMat> woodMats = new ArrayList<>();
        woodMats.add(new McwWoodMat(CHERRY_LOG.get(), CHERRY_PLANKS.get(), STRIPPED_CHERRY_LOG.get(), CHERRY_SLAB.get(), CHERRY_FENCE.get(), CHERRY_TRAPDOOR.get()));
        woodMats.add(new McwWoodMat(DEAD_LOG.get(), DEAD_PLANKS.get(), STRIPPED_DEAD_LOG.get(), DEAD_SLAB.get(), DEAD_FENCE.get(), DEAD_TRAPDOOR.get()));
        woodMats.add(new McwWoodMat(FIR_LOG.get(), FIR_PLANKS.get(), STRIPPED_FIR_LOG.get(), FIR_SLAB.get(), FIR_FENCE.get(), FIR_TRAPDOOR.get()));
        woodMats.add(new McwWoodMat(HELLBARK_LOG.get(), HELLBARK_PLANKS.get(), STRIPPED_HELLBARK_LOG.get(), HELLBARK_SLAB.get(), HELLBARK_FENCE.get(), HELLBARK_TRAPDOOR.get()));
        woodMats.add(new McwWoodMat(JACARANDA_LOG.get(), JACARANDA_PLANKS.get(), STRIPPED_JACARANDA_LOG.get(), JACARANDA_SLAB.get(), JACARANDA_FENCE.get(), JACARANDA_TRAPDOOR.get()));
        woodMats.add(new McwWoodMat(MAGIC_LOG.get(), MAGIC_PLANKS.get(), STRIPPED_MAGIC_LOG.get(), MAGIC_SLAB.get(), MAGIC_FENCE.get(), MAGIC_TRAPDOOR.get()));
        woodMats.add(new McwWoodMat(MAHOGANY_LOG.get(), MAHOGANY_PLANKS.get(), STRIPPED_MAHOGANY_LOG.get(), MAHOGANY_SLAB.get(), MAHOGANY_FENCE.get(), MAHOGANY_TRAPDOOR.get()));
        woodMats.add(new McwWoodMat(PALM_LOG.get(), PALM_PLANKS.get(), STRIPPED_PALM_LOG.get(), PALM_SLAB.get(), PALM_FENCE.get(), PALM_TRAPDOOR.get()));
        woodMats.add(new McwWoodMat(REDWOOD_LOG.get(), REDWOOD_PLANKS.get(), STRIPPED_REDWOOD_LOG.get(), REDWOOD_SLAB.get(), REDWOOD_FENCE.get(), REDWOOD_TRAPDOOR.get()));
        woodMats.add(new McwWoodMat(UMBRAN_LOG.get(), UMBRAN_PLANKS.get(), STRIPPED_UMBRAN_LOG.get(), UMBRAN_SLAB.get(), UMBRAN_FENCE.get(), UMBRAN_TRAPDOOR.get()));
        woodMats.add(new McwWoodMat(WILLOW_LOG.get(), WILLOW_PLANKS.get(), STRIPPED_WILLOW_LOG.get(), WILLOW_SLAB.get(), WILLOW_FENCE.get(), WILLOW_TRAPDOOR.get()));
        return woodMats;
    }
}