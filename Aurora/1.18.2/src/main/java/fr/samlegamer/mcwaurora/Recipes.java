package fr.samlegamer.mcwaurora;

import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import fr.samlegamer.addonslib.generation.recipes.mat.McwWoodMat;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_, McwAurora.MODID, "", EnhancedMushrooms.MOD_ID);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        registerAllMcwWood(consumer, McwAurora.MODID, EnhancedMushrooms.MOD_ID, McwAurora.WOOD_ENHANCED_MUSH, getEM());
    }

    private List<McwWoodMat> getEM()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(EMBlocks.BROWN_MUSHROOM_STEM.get(), EMBlocks.BROWN_MUSHROOM_PLANKS.get(), EMBlocks.STRIPPED_BROWN_MUSHROOM_STEM.get(),
                EMBlocks.BROWN_MUSHROOM_SLAB.get(), EMBlocks.BROWN_MUSHROOM_FENCE.get(), EMBlocks.BROWN_MUSHROOM_TRAPDOOR.get()));
        mats.add(new McwWoodMat(EMBlocks.RED_MUSHROOM_STEM.get(), EMBlocks.RED_MUSHROOM_PLANKS.get(), EMBlocks.STRIPPED_RED_MUSHROOM_STEM.get(),
                EMBlocks.RED_MUSHROOM_SLAB.get(), EMBlocks.RED_MUSHROOM_FENCE.get(), EMBlocks.RED_MUSHROOM_TRAPDOOR.get()));
        return mats;
    }
}