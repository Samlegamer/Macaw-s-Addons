package fr.samlegamer.mcwbetters;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import org.betterx.betterend.BetterEnd;
import org.betterx.betternether.BetterNether;
import java.util.function.Consumer;
import static fr.samlegamer.mcwbetters.Recipes.*;

public class RecipesForge extends McwRecipes
{
    public RecipesForge(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        recipesUtils.registerAllMcwWood(consumer, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.WOOD_BETTER_END, getBetterEndWood());
        recipesUtils.registerAllMcwWood(consumer, McwBetters.MODID, BetterNether.MOD_ID, McwBetters.WOOD_BETTER_NETHER.keySet().stream().toList(), getBetterNetherWood());

        recipesUtils.registerMcwHedge(consumer, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.LEAVE_BETTER_END, getBetterEndLeaves());
        recipesUtils.registerMcwHedge(consumer, McwBetters.MODID, BetterNether.MOD_ID, McwBetters.LEAVE_BETTER_NETHER, getBetterNetherLeaves());
    }
}