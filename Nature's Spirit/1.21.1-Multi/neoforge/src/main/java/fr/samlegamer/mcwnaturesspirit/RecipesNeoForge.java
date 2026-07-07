package fr.samlegamer.mcwnaturesspirit;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import java.util.concurrent.CompletableFuture;

public class RecipesNeoForge extends McwRecipes
{
    public RecipesNeoForge(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        recipesUtils.registerAllMcwWood(recipeOutput, McwNaturesSpirit.MODID, Recipes.modIdExt, McwNaturesSpirit.WOOD, Recipes.getWoodMat());
        recipesUtils.registerMcwHedge(recipeOutput, McwNaturesSpirit.MODID, Recipes.modIdExt, McwNaturesSpirit.LEAVES, Recipes.getLeavesMat());
    }

}