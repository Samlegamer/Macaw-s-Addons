package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.crafting.Recipe;
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
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {
                McwRecipes mcwRecipes = new McwRecipes(fabricDataOutput, registriesFuture, registries, output, recipes, advancements) {
                    @Override
                    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
                        return null;
                    }

                    @Override
                    public @NotNull String getName() {
                        return McwBOP.MODID;
                    }
                };

                mcwRecipes.recipesUtils.registerAllMcwWood(output, McwBOP.MODID, Recipes.MODID, McwBOP.WOOD, Recipes.getWoodMats());
                mcwRecipes.recipesUtils.registerMcwHedge(output, McwBOP.MODID, Recipes.MODID, McwBOP.LEAVES, Recipes.getLeaveMats());
            }
        };
    }

//    @Override
//    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
//        return new RecipeProvider(registryLookup, exporter) {
//            @Override
//            public void buildRecipes() {

//            }
//        };
//    }

    @Override
    public @NotNull String getName() {
        return McwBOP.MODID;
    }
}