package fr.samlegamer.mcwmysticbiomes;

import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Block;
import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import static com.mysticsbiomes.init.MysticBlocks.*;
import com.mysticsbiomes.MysticsBiomes;

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
        mats.add(PEACH_LEAVES.get());
        mats.add(MAPLE_LEAVES.get());
        mats.add(ORANGE_MAPLE_LEAVES.get());
        mats.add(YELLOW_MAPLE_LEAVES.get());
        mats.add(SEA_SHRUB_LEAVES.get());
        mats.add(TROPICAL_LEAVES.get());
        mats.add(HYDRANGEA_LEAVES.get());
        return mats;
    }


    private List<McwWoodMat<Block>> getWoodMat()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(CHERRY_LOG.get(), CHERRY_PLANKS.get(), STRIPPED_CHERRY_LOG.get(), CHERRY_SLAB.get(), CHERRY_FENCE.get(), CHERRY_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(JACARANDA_LOG.get(), JACARANDA_PLANKS.get(), STRIPPED_JACARANDA_LOG.get(), JACARANDA_SLAB.get(), JACARANDA_FENCE.get(), JACARANDA_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(STRAWBERRY_LOG.get(), STRAWBERRY_PLANKS.get(), STRIPPED_STRAWBERRY_LOG.get(), STRAWBERRY_SLAB.get(), STRAWBERRY_FENCE.get(), STRAWBERRY_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(PEACH_LOG.get(), PEACH_PLANKS.get(), STRIPPED_PEACH_LOG.get(), PEACH_SLAB.get(), PEACH_FENCE.get(), PEACH_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(MAPLE_LOG.get(), MAPLE_PLANKS.get(), STRIPPED_MAPLE_LOG.get(), MAPLE_SLAB.get(), MAPLE_FENCE.get(), MAPLE_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(SEA_FOAM_LOG.get(), SEA_FOAM_PLANKS.get(), STRIPPED_SEA_FOAM_LOG.get(), SEA_FOAM_SLAB.get(), SEA_FOAM_FENCE.get(), SEA_FOAM_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(TROPICAL_LOG.get(), TROPICAL_PLANKS.get(), STRIPPED_TROPICAL_LOG.get(), TROPICAL_SLAB.get(), TROPICAL_FENCE.get(), TROPICAL_TRAPDOOR.get()));
        return mats;
    }
}
