package fr.samlegamer.mcwbetters;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import org.betterx.betterend.BetterEnd;
import org.betterx.betternether.BetterNether;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import static fr.samlegamer.mcwbetters.Recipes.*;

public class RecipesNeoForge extends McwRecipes
{
    protected RecipesNeoForge(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
    }

    @Override
    protected void buildRecipes() {
        recipesUtils.registerAllMcwWood(output, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.WOOD_BETTER_END, getBetterEndWood());
        recipesUtils.registerAllMcwWood(output, McwBetters.MODID, BetterNether.MOD_ID, McwBetters.WOOD_BETTER_NETHER.keySet().stream().toList(), getBetterNetherWood());

        recipesUtils.registerMcwHedge(output, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.LEAVE_BETTER_END, getBetterEndLeaves());
        recipesUtils.registerMcwHedge(output, McwBetters.MODID, BetterNether.MOD_ID, McwBetters.LEAVE_BETTER_NETHER, getBetterNetherLeaves());
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider provider, @NotNull RecipeOutput recipeOutput) {
            return new RecipesNeoForge(provider, recipeOutput);
        }

        @Override
        public @NotNull String getName() {
            return "McwBetters Recipes";
        }
    }
}