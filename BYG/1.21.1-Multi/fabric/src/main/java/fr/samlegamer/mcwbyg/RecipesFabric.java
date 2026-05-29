package fr.samlegamer.mcwbyg;

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
    public void buildRecipes(RecipeOutput exporter) {
        recipesUtils.registerAllMcwWood(exporter, McwByg.MODID, Recipes.MODID, McwByg.WOOD, Recipes.getWoodMat());
        recipesUtils.registerMcwHedge(exporter, McwByg.MODID, Recipes.MODID, McwByg.LEAVES, Recipes.getLeaveMat());
        recipesUtils.registerAllMcwStone(exporter, McwByg.MODID, Recipes.MODID, McwByg.STONE, Recipes.getStoneMat());
    }
}
