package fr.samlegamer.mcwbetters;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import org.betterx.betterend.BetterEnd;
import org.betterx.betternether.BetterNether;
import static fr.samlegamer.mcwbetters.Recipes.*;
import java.util.function.Consumer;

public class RecipesFabric extends McwRecipes
{
    public RecipesFabric(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> consumer) {
        recipesUtils.registerAllMcwWood(consumer, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.WOOD_BETTER_END, getBetterEndWood());
        recipesUtils.registerMcwHedge(consumer, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.LEAVE_BETTER_END, getBetterEndLeaves());
        recipesUtils.registerAllMcwWood(consumer, McwBetters.MODID, BetterNether.MOD_ID, McwBetters.WOOD_BETTER_NETHER.keySet().stream().toList(), getBetterNetherWood());
        recipesUtils.registerMcwHedge(consumer, McwBetters.MODID, BetterNether.MOD_ID, McwBetters.LEAVE_BETTER_NETHER, getBetterNetherLeaves());
    }
}