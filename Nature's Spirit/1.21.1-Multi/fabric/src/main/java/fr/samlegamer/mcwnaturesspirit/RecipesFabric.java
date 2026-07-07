package fr.samlegamer.mcwnaturesspirit;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import java.util.concurrent.CompletableFuture;

public class RecipesFabric extends McwRecipes
{
    public RecipesFabric(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput recipeOutput) {
        recipesUtils.registerAllMcwWood(recipeOutput, McwNaturesSpirit.MODID, Recipes.modIdExt, McwNaturesSpirit.WOOD, Recipes.getWoodMat());
        recipesUtils.registerMcwHedge(recipeOutput, McwNaturesSpirit.MODID, Recipes.modIdExt, McwNaturesSpirit.LEAVES, Recipes.getLeavesMat());
    }
}