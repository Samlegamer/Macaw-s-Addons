package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RecipesFabric extends FabricRecipeProvider
{
    protected final FabricDataOutput fabricDataOutput;
    protected final CompletableFuture<HolderLookup.Provider> registriesFuture;

    public RecipesFabric(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
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
                        return McwByg.MODID;
                    }
                };

                mcwRecipes.recipesUtils.registerAllMcwWood(exporter, McwByg.MODID, Recipes.MODID, McwByg.WOOD, Recipes.getWoodMat());
                mcwRecipes.recipesUtils.registerMcwHedge(exporter, McwByg.MODID, Recipes.MODID, McwByg.LEAVES, Recipes.getLeaveMat());
                mcwRecipes.recipesUtils.registerAllMcwStone(exporter, McwByg.MODID, Recipes.MODID, McwByg.STONE, Recipes.getStoneMat());

            }
        };
    }

    @Override
    public @NotNull String getName() {
        return McwByg.MODID;
    }
}
//    @Override
//    public void buildRecipes(RecipeOutput exporter) {
//    }
