package fr.samlegamer.mcwbetters;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import org.betterx.betterend.BetterEnd;
import static fr.samlegamer.mcwbetters.Recipes.*;
import java.util.concurrent.CompletableFuture;

public class RecipesFabric extends McwRecipes
{
    public RecipesFabric(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        recipesUtils.registerAllMcwWood(exporter, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.WOOD_BETTER_END, getBetterEndWood());
        recipesUtils.registerMcwHedge(exporter, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.LEAVE_BETTER_END, getBetterEndLeaves());
        recipesUtils.registerAllMcwWood(exporter, McwBetters.MODID, "betternether", McwBetters.WOOD_BETTER_NETHER.keySet().stream().toList(), getBetterNetherWood());
        recipesUtils.registerMcwHedge(exporter, McwBetters.MODID, "betternether", McwBetters.LEAVE_BETTER_NETHER, getBetterNetherLeaves());
    }
}