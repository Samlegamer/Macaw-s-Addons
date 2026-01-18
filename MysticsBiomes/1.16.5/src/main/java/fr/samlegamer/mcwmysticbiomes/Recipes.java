package fr.samlegamer.mcwmysticbiomes;

import com.jayhill.mysticsbiomes.core.MysticsBiomes;
import static com.jayhill.mysticsbiomes.init.ModBlocks.*;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildShapelessRecipes(@Nonnull Consumer<IFinishedRecipe> consumer) {
        registerAllMcwWood(consumer, McwMysticBiomes.MODID, MysticsBiomes.MOD_ID, McwMysticBiomes.WOOD, getWoodMat());
        registerMcwHedge(consumer, McwMysticBiomes.MODID, MysticsBiomes.MOD_ID, McwMysticBiomes.LEAVES, getLeavesMat());
    }

    private List<Block> getLeavesMat()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(LAVENDER_BLOSSOM_LEAVES.get());
        mats.add(PEONY_LEAVES.get());
        mats.add(PINK_CHERRY_BLOSSOM_LEAVES.get());
        mats.add(STRAWBERRY_BLOSSOM_LEAVES.get());
        mats.add(SWEET_BLOSSOM_LEAVES.get());
        mats.add(WHITE_CHERRY_BLOSSOM_LEAVES.get());
        return mats;
    }


    private List<McwWoodMat<Block>> getWoodMat()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(CHERRY_LOG.get(), CHERRY_PLANKS.get(), STRIPPED_CHERRY_LOG.get(), CHERRY_SLAB.get(), CHERRY_FENCE.get(), CHERRY_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(LAVENDER_LOG.get(), LAVENDER_PLANKS.get(), STRIPPED_LAVENDER_LOG.get(), LAVENDER_SLAB.get(), LAVENDER_FENCE.get(), LAVENDER_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(STRAWBERRY_LOG.get(), STRAWBERRY_PLANKS.get(), STRIPPED_STRAWBERRY_LOG.get(), STRAWBERRY_SLAB.get(), STRAWBERRY_FENCE.get(), STRAWBERRY_TRAPDOOR.get()));
        return mats;
    }
}
