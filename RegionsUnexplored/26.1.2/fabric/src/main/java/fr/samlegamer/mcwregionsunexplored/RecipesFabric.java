package fr.samlegamer.mcwregionsunexplored;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RecipesFabric extends FabricRecipeProvider
{
    protected final FabricPackOutput fabricDataOutput;
    protected final CompletableFuture<HolderLookup.Provider> registriesFuture;

    public RecipesFabric(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
        this.fabricDataOutput = output;
        this.registriesFuture = registriesFuture;
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                McwRecipes mcwRecipes = new McwRecipes(fabricDataOutput, registriesFuture, registryLookup, exporter) {
                    @Override
                    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
                        return new RecipeProvider(registryLookup, exporter) {
                            @Override
                            public void buildRecipes() {

                            }
                        };
                    }

                    @Override
                    public @NotNull String getName() {
                        return McwRegionsUnexplored.MODID;
                    }
                };

                mcwRecipes.recipesUtils.registerAllMcwWood(exporter, McwRegionsUnexplored.MODID, Recipes.MODID, McwRegionsUnexplored.WOOD, Recipes.getWoodMat());
                mcwRecipes.recipesUtils.registerMcwHedge(exporter, McwRegionsUnexplored.MODID, Recipes.MODID, McwRegionsUnexplored.LEAVES, Recipes.getLeavesMat());
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return McwRegionsUnexplored.MODID;
    }
}