package fr.samlegamer.mcwmysticbiomes;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import java.util.function.Consumer;

public class RecipesFabric extends McwRecipes
{
    public RecipesFabric(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        recipesUtils.registerAllMcwWood(exporter, McwMysticBiomes.MODID, Recipes.modIdExt, McwMysticBiomes.WOOD, Recipes.getWoodMat());
        recipesUtils.registerMcwHedge(exporter, McwMysticBiomes.MODID, Recipes.modIdExt, McwMysticBiomes.LEAVES, Recipes.getLeavesMat());
    }
}