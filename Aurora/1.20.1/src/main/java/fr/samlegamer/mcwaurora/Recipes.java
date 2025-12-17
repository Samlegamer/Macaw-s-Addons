package fr.samlegamer.mcwaurora;

import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        registerAllMcwWood(consumer, McwAurora.MODID, EnhancedMushrooms.MOD_ID, McwAurora.WOOD_ENHANCED_MUSH, getEM());
    }

    private List<McwWoodMat<Block>> getEM()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(EMBlocks.MUSHROOM_STEM.get(), EMBlocks.MUSHROOM_PLANKS.get(), EMBlocks.STRIPPED_MUSHROOM_STEM.get(),
                EMBlocks.MUSHROOM_SLAB.get(), EMBlocks.MUSHROOM_FENCE.get(), EMBlocks.MUSHROOM_TRAPDOOR.get()));
        return mats;
    }
}