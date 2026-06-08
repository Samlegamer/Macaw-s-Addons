package mcwregionsunexplored;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import fr.samlegamer.mcwregionsunexplored.McwRegionsUnexplored;
import fr.samlegamer.mcwregionsunexplored.Recipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.CompletableFuture;

public class RecipesNeoForge extends McwRecipes
{
    public RecipesNeoForge(PackOutput p_248933_, CompletableFuture<HolderLookup.Provider> p_333797_) {
        super(p_248933_, p_333797_);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput consumer) {
        recipesUtils.registerAllMcwWood(consumer, McwRegionsUnexplored.MODID, Recipes.MODID, McwRegionsUnexplored.WOOD, Recipes.getWoodMat());
        recipesUtils.registerMcwHedge(consumer, McwRegionsUnexplored.MODID, Recipes.MODID, McwRegionsUnexplored.LEAVES, Recipes.getLeavesMat());
    }
}