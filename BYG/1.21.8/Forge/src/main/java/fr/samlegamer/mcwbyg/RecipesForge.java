package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RecipesForge extends McwRecipes {

    protected RecipesForge(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
    }

    @Override
    protected void buildRecipes() {
        recipesUtils.registerAllMcwWood(output, McwByg.MODID, Recipes.MODID, McwByg.WOOD, Recipes.getWoodMat());
        recipesUtils.registerMcwHedge(output, McwByg.MODID, Recipes.MODID, McwByg.LEAVES, Recipes.getLeaveMat());
        recipesUtils.registerAllMcwStone(output, McwByg.MODID, Recipes.MODID, McwByg.STONE, Recipes.getStoneMat());
    }

    public static class Runner extends RecipeProvider.Runner {

        protected Runner(PackOutput p_365720_, CompletableFuture<HolderLookup.Provider> p_365098_) {
            super(p_365720_, p_365098_);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider provider, @NotNull RecipeOutput recipeOutput) {
            return new RecipesForge(provider, recipeOutput);
        }

        @Override
        public @NotNull String getName() {
            return "McwByg Recipes";
        }
    }
}