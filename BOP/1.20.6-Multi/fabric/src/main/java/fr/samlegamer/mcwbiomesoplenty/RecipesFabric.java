package fr.samlegamer.mcwbiomesoplenty;

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
    public void buildRecipes(RecipeOutput recipeExporter) {
        recipesUtils.registerAllMcwWood(recipeExporter, McwBOP.MODID, Recipes.MODID, McwBOP.WOOD, Recipes.getWoodMats());
        recipesUtils.registerMcwHedge(recipeExporter, McwBOP.MODID, Recipes.MODID, McwBOP.LEAVES, Recipes.getLeaveMats());
    }
}