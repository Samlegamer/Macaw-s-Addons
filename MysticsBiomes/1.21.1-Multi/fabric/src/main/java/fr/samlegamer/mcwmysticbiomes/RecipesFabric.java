package fr.samlegamer.mcwmysticbiomes;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.CompletableFuture;

public class RecipesFabric extends McwRecipes
{
    public RecipesFabric(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(@NotNull RecipeOutput exporter) {
        recipesUtils.registerAllMcwWood(exporter, McwMysticBiomes.MODID, Recipes.modIdExt, McwMysticBiomes.WOOD, Recipes.getWoodMat());
        recipesUtils.registerMcwHedge(exporter, McwMysticBiomes.MODID, Recipes.modIdExt, McwMysticBiomes.LEAVES, Recipes.getLeavesMat());
    }
}
