package fr.samlegamer.mcwbiomesoplenty;

import biomesoplenty.core.BiomesOPlenty;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Block;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static biomesoplenty.api.block.BOPBlocks.*;

public class Recipes extends McwRecipes {
    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @ParametersAreNonnullByDefault
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        List<Block> leave = List.of(PINK_CHERRY_LEAVES, DEAD_LEAVES, FIR_LEAVES, HELLBARK_LEAVES, JACARANDA_LEAVES, MAGIC_LEAVES, MAHOGANY_LEAVES,
                PALM_LEAVES, REDWOOD_LEAVES, UMBRAN_LEAVES, WILLOW_LEAVES, MAPLE_LEAVES, ORANGE_AUTUMN_LEAVES, YELLOW_AUTUMN_LEAVES, WHITE_CHERRY_LEAVES,
                FLOWERING_OAK_LEAVES, RAINBOW_BIRCH_LEAVES, ORIGIN_LEAVES);

        registerAllMcwWood(consumer, McwBOP.MODID, BiomesOPlenty.MOD_ID, McwBOP.WOOD, getWoodMats());
        registerMcwHedge(consumer, McwBOP.MODID, BiomesOPlenty.MOD_ID, McwBOP.LEAVES, leave);
    }

    private List<McwWoodMat<Block>> getWoodMats()
    {
        List<McwWoodMat<Block>> woodMats = new ArrayList<>();
        woodMats.add(new McwWoodMat<>(CHERRY_LOG, CHERRY_PLANKS, STRIPPED_CHERRY_LOG, CHERRY_SLAB, CHERRY_FENCE, CHERRY_TRAPDOOR));
        woodMats.add(new McwWoodMat<>(DEAD_LOG, DEAD_PLANKS, STRIPPED_DEAD_LOG, DEAD_SLAB, DEAD_FENCE, DEAD_TRAPDOOR));
        woodMats.add(new McwWoodMat<>(FIR_LOG, FIR_PLANKS, STRIPPED_FIR_LOG, FIR_SLAB, FIR_FENCE, FIR_TRAPDOOR));
        woodMats.add(new McwWoodMat<>(HELLBARK_LOG, HELLBARK_PLANKS, STRIPPED_HELLBARK_LOG, HELLBARK_SLAB, HELLBARK_FENCE, HELLBARK_TRAPDOOR));
        woodMats.add(new McwWoodMat<>(JACARANDA_LOG, JACARANDA_PLANKS, STRIPPED_JACARANDA_LOG, JACARANDA_SLAB, JACARANDA_FENCE, JACARANDA_TRAPDOOR));
        woodMats.add(new McwWoodMat<>(MAGIC_LOG, MAGIC_PLANKS, STRIPPED_MAGIC_LOG, MAGIC_SLAB, MAGIC_FENCE, MAGIC_TRAPDOOR));
        woodMats.add(new McwWoodMat<>(MAHOGANY_LOG, MAHOGANY_PLANKS, STRIPPED_MAHOGANY_LOG, MAHOGANY_SLAB, MAHOGANY_FENCE, MAHOGANY_TRAPDOOR));
        woodMats.add(new McwWoodMat<>(PALM_LOG, PALM_PLANKS, STRIPPED_PALM_LOG, PALM_SLAB, PALM_FENCE, PALM_TRAPDOOR));
        woodMats.add(new McwWoodMat<>(REDWOOD_LOG, REDWOOD_PLANKS, STRIPPED_REDWOOD_LOG, REDWOOD_SLAB, REDWOOD_FENCE, REDWOOD_TRAPDOOR));
        woodMats.add(new McwWoodMat<>(UMBRAN_LOG, UMBRAN_PLANKS, STRIPPED_UMBRAN_LOG, UMBRAN_SLAB, UMBRAN_FENCE, UMBRAN_TRAPDOOR));
        woodMats.add(new McwWoodMat<>(WILLOW_LOG, WILLOW_PLANKS, STRIPPED_WILLOW_LOG, WILLOW_SLAB, WILLOW_FENCE, WILLOW_TRAPDOOR));
        return woodMats;
    }
}