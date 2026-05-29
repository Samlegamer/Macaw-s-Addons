package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.CompletableFuture;

public class RecipesForge extends McwRecipes {
    public RecipesForge(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
        super(packOutput, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput exporter) {
        recipesUtils.registerAllMcwWood(exporter, McwByg.MODID, Recipes.MODID, McwByg.WOOD, Recipes.getWoodMat());
        recipesUtils.registerMcwHedge(exporter, McwByg.MODID, Recipes.MODID, McwByg.LEAVES, Recipes.getLeaveMat());
        recipesUtils.registerAllMcwStone(exporter, McwByg.MODID, Recipes.MODID, McwByg.STONE, Recipes.getStoneMat());
    }
}