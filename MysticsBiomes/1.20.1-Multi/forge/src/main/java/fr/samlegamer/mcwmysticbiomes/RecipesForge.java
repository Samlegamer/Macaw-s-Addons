package fr.samlegamer.mcwmysticbiomes;

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
        recipesUtils.registerAllMcwWood(consumer, McwMysticBiomes.MODID, Recipes.modIdExt, McwMysticBiomes.WOOD, Recipes.getWoodMat());
        recipesUtils.registerMcwHedge(consumer, McwMysticBiomes.MODID, Recipes.modIdExt, McwMysticBiomes.LEAVES, Recipes.getLeavesMat());
    }
}