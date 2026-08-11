package fr.samlegamer.mcwbetters;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import org.betterx.betterend.BetterEnd;
import org.jetbrains.annotations.NotNull;

import static fr.samlegamer.mcwbetters.Recipes.*;
import java.util.concurrent.CompletableFuture;

public class RecipesFabric  extends FabricRecipeProvider
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
                        return McwBetters.MODID;
                    }
                };
                mcwRecipes.recipesUtils.registerAllMcwWood(exporter, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.WOOD_BETTER_END, getBetterEndWood());
                mcwRecipes.recipesUtils.registerMcwHedge(exporter, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.LEAVE_BETTER_END, getBetterEndLeaves());
                mcwRecipes.recipesUtils.registerAllMcwWood(exporter, McwBetters.MODID, "betternether", McwBetters.WOOD_BETTER_NETHER.keySet().stream().toList(), getBetterNetherWood());
                mcwRecipes.recipesUtils.registerMcwHedge(exporter, McwBetters.MODID, "betternether", McwBetters.LEAVE_BETTER_NETHER, getBetterNetherLeaves());
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return McwBetters.MODID;
    }
}