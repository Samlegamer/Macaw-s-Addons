package fr.samlegamer.mcwbiomesoplenty;

import static biomesoplenty.api.block.BOPBlocks.*;
import biomesoplenty.core.BiomesOPlenty;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.*;
import java.util.function.Consumer;

public class Recipes extends McwRecipes {
    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @ParametersAreNonnullByDefault
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {

        List<Block> leave = Arrays.asList(pink_cherry_leaves, dead_leaves, fir_leaves, hellbark_leaves, jacaranda_leaves, magic_leaves, mahogany_leaves,
                palm_leaves, redwood_leaves, umbran_leaves, willow_leaves, maple_leaves, orange_autumn_leaves, yellow_autumn_leaves, white_cherry_leaves,
                flowering_oak_leaves, rainbow_birch_leaves, origin_leaves);

        registerAllMcwWood(consumer, McwBOP.MODID, BiomesOPlenty.MOD_ID, McwBOP.WOOD, getWoodMats());
        registerMcwHedge(consumer, McwBOP.MODID, BiomesOPlenty.MOD_ID, McwBOP.LEAVES, leave);
    }

    private List<McwWoodMat<Block>> getWoodMats()
    {
        List<McwWoodMat<Block>> woodMats = new ArrayList<>();
        woodMats.add(new McwWoodMat<>(cherry_log, cherry_planks, stripped_cherry_log, cherry_slab, cherry_fence, cherry_trapdoor));
        woodMats.add(new McwWoodMat<>(dead_log, dead_planks, stripped_dead_log, dead_slab, dead_fence, dead_trapdoor));
        woodMats.add(new McwWoodMat<>(fir_log, fir_planks, stripped_fir_log, fir_slab, fir_fence, fir_trapdoor));
        woodMats.add(new McwWoodMat<>(hellbark_log, hellbark_planks, stripped_hellbark_log, hellbark_slab, hellbark_fence, hellbark_trapdoor));
        woodMats.add(new McwWoodMat<>(jacaranda_log, jacaranda_planks, stripped_jacaranda_log, jacaranda_slab, jacaranda_fence, jacaranda_trapdoor));
        woodMats.add(new McwWoodMat<>(magic_log, magic_planks, stripped_magic_log, magic_slab, magic_fence, magic_trapdoor));
        woodMats.add(new McwWoodMat<>(mahogany_log, mahogany_planks, stripped_mahogany_log, mahogany_slab, mahogany_fence, mahogany_trapdoor));
        woodMats.add(new McwWoodMat<>(palm_log, palm_planks, stripped_palm_log, palm_slab, palm_fence, palm_trapdoor));
        woodMats.add(new McwWoodMat<>(redwood_log, redwood_planks, stripped_redwood_log, redwood_slab, redwood_fence, redwood_trapdoor));
        woodMats.add(new McwWoodMat<>(umbran_log, umbran_planks, stripped_umbran_log, umbran_slab, umbran_fence, umbran_trapdoor));
        woodMats.add(new McwWoodMat<>(willow_log, willow_planks, stripped_willow_log, willow_slab, willow_fence, willow_trapdoor));
        return woodMats;
    }
}