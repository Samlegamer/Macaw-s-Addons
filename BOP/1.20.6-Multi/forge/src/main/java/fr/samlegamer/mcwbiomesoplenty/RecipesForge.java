package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.CompletableFuture;

public class RecipesForge extends McwRecipes {
    protected RecipesForge(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
        super(packOutput, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        recipesUtils.registerAllMcwWood(recipeOutput, McwBOP.MODID, Recipes.MODID, McwBOP.WOOD, Recipes.getWoodMats());
        recipesUtils.registerMcwHedge(recipeOutput, McwBOP.MODID, Recipes.MODID, McwBOP.LEAVES, Recipes.getLeaveMats());
    }
}