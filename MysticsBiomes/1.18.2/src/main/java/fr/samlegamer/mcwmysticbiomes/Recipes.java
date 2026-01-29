package fr.samlegamer.mcwmysticbiomes;

import com.mysticsbiomes.core.MysticsBiomes;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import static com.mysticsbiomes.core.init.MysticBlocks.*;

public class Recipes extends McwRecipes
{
    public Recipes(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(@Nonnull Consumer<FinishedRecipe> consumer) {
        registerAllMcwWood(consumer, McwMysticBiomes.MODID, MysticsBiomes.modId, McwMysticBiomes.WOOD, getWoodMat());
        registerMcwHedge(consumer, McwMysticBiomes.MODID, MysticsBiomes.modId, McwMysticBiomes.LEAVES, getLeavesMat());
    }

    private List<Block> getLeavesMat()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(JACARANDA_BLOSSOMS.get());
        mats.add(JACARANDA_LEAVES.get());
        mats.add(PINK_CHERRY_BLOSSOMS.get());
        mats.add(WHITE_CHERRY_BLOSSOMS.get());
        mats.add(STRAWBERRY_BLOSSOMS.get());
        mats.add(BUDDING_PEONY_LEAVES.get());
        mats.add(PEONY_LEAVES.get());
        return mats;
    }


    private List<McwWoodMat<Block>> getWoodMat()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(CHERRY_LOG.get(), CHERRY_PLANKS.get(), STRIPPED_CHERRY_LOG.get(), CHERRY_SLAB.get(), CHERRY_FENCE.get(), CHERRY_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(JACARANDA_LOG.get(), JACARANDA_PLANKS.get(), STRIPPED_JACARANDA_LOG.get(), JACARANDA_SLAB.get(), JACARANDA_FENCE.get(), JACARANDA_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(STRAWBERRY_LOG.get(), STRAWBERRY_PLANKS.get(), STRIPPED_STRAWBERRY_LOG.get(), STRAWBERRY_SLAB.get(), STRAWBERRY_FENCE.get(), STRAWBERRY_TRAPDOOR.get()));
        return mats;
    }
}
