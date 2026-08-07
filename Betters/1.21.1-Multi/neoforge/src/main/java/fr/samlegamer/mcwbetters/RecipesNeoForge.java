package fr.samlegamer.mcwbetters;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import org.betterx.betterend.BetterEnd;
import org.betterx.betternether.BetterNether;
import java.util.concurrent.CompletableFuture;
import static fr.samlegamer.mcwbetters.Recipes.*;

public class RecipesNeoForge extends McwRecipes
{
    public RecipesNeoForge(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        recipesUtils.registerAllMcwWood(output, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.WOOD_BETTER_END, getBetterEndWood());
        recipesUtils.registerAllMcwWood(output, McwBetters.MODID, BetterNether.MOD_ID, McwBetters.WOOD_BETTER_NETHER.keySet().stream().toList(), getBetterNetherWood());

        recipesUtils.registerMcwHedge(output, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.LEAVE_BETTER_END, getBetterEndLeaves());
        recipesUtils.registerMcwHedge(output, McwBetters.MODID, BetterNether.MOD_ID, McwBetters.LEAVE_BETTER_NETHER, getBetterNetherLeaves());
    }
}