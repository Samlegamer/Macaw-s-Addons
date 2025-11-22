package fr.samlegamer.mcwaurora;

import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import fr.samlegamer.addonslib.generation.recipes.mat.McwWoodMat;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(PackOutput packOutput) {
        super(packOutput, McwAurora.MODID, "", EnhancedMushrooms.MOD_ID);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        registerAllMcwWood(consumer, McwAurora.MODID, EnhancedMushrooms.MOD_ID, McwAurora.WOOD_ENHANCED_MUSH, getEM());
    }

    private List<McwWoodMat> getEM()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(EMBlocks.MUSHROOM_STEM.get(), EMBlocks.MUSHROOM_PLANKS.get(), EMBlocks.STRIPPED_MUSHROOM_STEM.get(),
                EMBlocks.MUSHROOM_SLAB.get(), EMBlocks.MUSHROOM_FENCE.get(), EMBlocks.MUSHROOM_TRAPDOOR.get()));
        return mats;
    }
}