package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.CompletableFuture;

public class RecipesNeoForge extends McwRecipes {
    public RecipesNeoForge(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput exporter) {
        recipesUtils.registerAllMcwWood(exporter, McwByg.MODID, Recipes.MODID, McwByg.WOOD, Recipes.getWoodMat());
        recipesUtils.registerMcwHedge(exporter, McwByg.MODID, Recipes.MODID, McwByg.LEAVES, Recipes.getLeaveMat());
        recipesUtils.registerAllMcwStone(exporter, McwByg.MODID, Recipes.MODID, McwByg.STONE, Recipes.getStoneMat());
    }
}