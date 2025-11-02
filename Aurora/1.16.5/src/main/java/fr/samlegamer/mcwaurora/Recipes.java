package fr.samlegamer.mcwaurora;

import com.teamaurora.abundance.core.Abundance;
import com.teamaurora.abundance.core.registry.AbundanceBlocks;
import com.teamaurora.bayou_blues.core.BayouBlues;
import com.teamaurora.bayou_blues.core.registry.BayouBluesBlocks;
import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import fr.samlegamer.addonslib.generation.recipes.mat.McwWoodMat;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends RecipeProvider
{
    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        McwRecipes.registerAllMcwWood(consumer, McwAurora.MODID, EnhancedMushrooms.MODID, McwAurora.WOOD_ENHANCED_MUSH, getEM());
        McwRecipes.registerAllMcwWood(consumer, McwAurora.MODID, BayouBlues.MODID, McwAurora.WOOD_BAYOU, getBayouWood());
        McwRecipes.registerAllMcwWood(consumer, McwAurora.MODID, Abundance.MODID, McwAurora.WOOD_ABUNDANCE, getAbunWood());

        McwRecipes.registerMcwHedge(consumer, McwAurora.MODID, BayouBlues.MODID, McwAurora.WOOD_BAYOU, Arrays.asList(BayouBluesBlocks.CYPRESS_LEAVES.get()));
        McwRecipes.registerMcwHedge(consumer, McwAurora.MODID, Abundance.MODID, McwAurora.WOOD_ABUNDANCE, Arrays.asList(AbundanceBlocks.JACARANDA_LEAVES.get(), AbundanceBlocks.REDBUD_LEAVES.get()));
    }

    private List<McwWoodMat> getBayouWood()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(BayouBluesBlocks.CYPRESS_LOG.get(), BayouBluesBlocks.CYPRESS_PLANKS.get(), BayouBluesBlocks.STRIPPED_CYPRESS_LOG.get(),
                BayouBluesBlocks.CYPRESS_SLAB.get(), BayouBluesBlocks.CYPRESS_FENCE.get(), BayouBluesBlocks.CYPRESS_TRAPDOOR.get()));
        return mats;
    }

    private List<McwWoodMat> getAbunWood()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(AbundanceBlocks.JACARANDA_LOG.get(), AbundanceBlocks.JACARANDA_PLANKS.get(), AbundanceBlocks.STRIPPED_JACARANDA_LOG.get(),
                AbundanceBlocks.JACARANDA_SLAB.get(), AbundanceBlocks.JACARANDA_FENCE.get(), AbundanceBlocks.JACARANDA_TRAPDOOR.get()));
        mats.add(new McwWoodMat(AbundanceBlocks.REDBUD_LOG.get(), AbundanceBlocks.REDBUD_PLANKS.get(), AbundanceBlocks.STRIPPED_REDBUD_LOG.get(),
                AbundanceBlocks.REDBUD_SLAB.get(), AbundanceBlocks.REDBUD_FENCE.get(), AbundanceBlocks.REDBUD_TRAPDOOR.get()));
        return mats;
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