package fr.samlegamer.mcwbetters;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.crafting.Recipe;
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
                        return McwBetters.MODID;
                    }
                };
                mcwRecipes.recipesUtils.registerAllMcwWood(output, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.WOOD_BETTER_END, getBetterEndWood());
                mcwRecipes.recipesUtils.registerMcwHedge(output, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.LEAVE_BETTER_END, getBetterEndLeaves());
                mcwRecipes.recipesUtils.registerAllMcwWood(output, McwBetters.MODID, "betternether", McwBetters.WOOD_BETTER_NETHER.keySet().stream().toList(), getBetterNetherWood());
                mcwRecipes.recipesUtils.registerMcwHedge(output, McwBetters.MODID, "betternether", McwBetters.LEAVE_BETTER_NETHER, getBetterNetherLeaves());
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return McwBetters.MODID;
    }
}