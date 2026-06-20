package fr.samlegamer.mcwbiomesoplenty;

import biomesoplenty.core.BiomesOPlenty;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static biomesoplenty.api.block.BOPBlocks.*;

public class Recipes extends McwRecipes
{
    protected Recipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes()
    {
        List<Block> leave = List.of(DEAD_LEAVES, FIR_LEAVES, HELLBARK_LEAVES, JACARANDA_LEAVES, MAGIC_LEAVES, MAHOGANY_LEAVES,
                PALM_LEAVES, REDWOOD_LEAVES, UMBRAN_LEAVES, WILLOW_LEAVES, EMPYREAL_LEAVES, PINE_LEAVES, ORANGE_MAPLE_LEAVES,
                RED_MAPLE_LEAVES, YELLOW_MAPLE_LEAVES, CYPRESS_LEAVES, SNOWBLOSSOM_LEAVES, FLOWERING_OAK_LEAVES, ORIGIN_OAK_LEAVES);

        List<McwWoodMat<Block>> woodMats = getWoodMats();
        registerAllMcwWood(this.output, McwBOP.MODID, BiomesOPlenty.MOD_ID, McwBOP.WOOD, woodMats);
        registerMcwHedge(this.output, McwBOP.MODID, BiomesOPlenty.MOD_ID, McwBOP.LEAVES, leave);
    }

    private List<McwWoodMat<Block>> getWoodMats() {
        List<McwWoodMat<Block>> woodMats = new ArrayList<>();
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
        woodMats.add(new McwWoodMat<>(EMPYREAL_LOG, EMPYREAL_PLANKS, STRIPPED_EMPYREAL_LOG, EMPYREAL_SLAB, EMPYREAL_FENCE, EMPYREAL_TRAPDOOR));
        woodMats.add(new McwWoodMat<>(MAPLE_LOG, MAPLE_PLANKS, STRIPPED_MAPLE_LOG, MAPLE_SLAB, MAPLE_FENCE, MAPLE_TRAPDOOR));
        woodMats.add(new McwWoodMat<>(PINE_LOG, PINE_PLANKS, STRIPPED_PINE_LOG, PINE_SLAB, PINE_FENCE, PINE_TRAPDOOR));
        return woodMats;
    }

    public static class Runner extends RecipeProvider.Runner
    {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider provider, @NotNull RecipeOutput recipeOutput) {
            return new Recipes(provider, recipeOutput);
        }

        @Override
        public @NotNull String getName() {
            return McwBOP.MODID + " Recipes";
        }
    }
}
