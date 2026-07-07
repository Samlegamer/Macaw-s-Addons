package fr.samlegamer.mcwnaturesspirit;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.function.Consumer;

public class RecipesForge extends McwRecipes
{
    public RecipesForge(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(@NonNull Consumer<FinishedRecipe> consumer) {
        recipesUtils.registerAllMcwWood(consumer, McwNaturesSpirit.MODID, Recipes.modIdExt, McwNaturesSpirit.WOOD, Recipes.getWoodMat());
        recipesUtils.registerMcwHedge(consumer, McwNaturesSpirit.MODID, Recipes.modIdExt, McwNaturesSpirit.LEAVES, Recipes.getLeavesMat());
    }
}