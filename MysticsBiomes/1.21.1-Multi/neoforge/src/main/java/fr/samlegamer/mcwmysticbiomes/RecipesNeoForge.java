package fr.samlegamer.mcwmysticbiomes;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.CompletableFuture;

public class RecipesNeoForge extends McwRecipes
{
    public RecipesNeoForge(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        recipesUtils.registerAllMcwWood(recipeOutput, McwMysticBiomes.MODID, Recipes.modIdExt, McwMysticBiomes.WOOD, Recipes.getWoodMat());
        recipesUtils.registerMcwHedge(recipeOutput, McwMysticBiomes.MODID, Recipes.modIdExt, McwMysticBiomes.LEAVES, Recipes.getLeavesMat());
    }
}