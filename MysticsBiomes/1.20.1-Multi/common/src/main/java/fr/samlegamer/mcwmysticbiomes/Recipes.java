package fr.samlegamer.mcwmysticbiomes;

import com.mysticsbiomes.MysticsBiomes;
import fr.addonslib.api.recipes.material.McwWoodMat;
import net.minecraft.world.level.block.Block;
import java.util.ArrayList;
import java.util.List;
import static com.mysticsbiomes.init.MysticBlocks.*;

public class Recipes
{
    public static final String modIdExt = MysticsBiomes.modId;

    public static List<Block> getLeavesMat()
    {
        List<Block> mats = new ArrayList<>();
//        mats.add(JACARANDA_BLOSSOMS.get());
//        mats.add(JACARANDA_LEAVES.get());
//        mats.add(PINK_CHERRY_BLOSSOMS.get());
//        mats.add(WHITE_CHERRY_BLOSSOMS.get());
//        mats.add(STRAWBERRY_BLOSSOMS.get());
//        mats.add(BUDDING_PEONY_LEAVES.get());
//        mats.add(PEONY_LEAVES.get());
//        mats.add(PEACH_LEAVES.get());
//        mats.add(MAPLE_LEAVES.get());
//        mats.add(ORANGE_MAPLE_LEAVES.get());
//        mats.add(YELLOW_MAPLE_LEAVES.get());
//        mats.add(SEA_SHRUB_LEAVES.get());
//        mats.add(TROPICAL_LEAVES.get());
//        mats.add(HYDRANGEA_LEAVES.get());
        return mats;
    }

    public static List<McwWoodMat<Block>> getWoodMat()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
//        mats.add(new McwWoodMat<>(CHERRY_LOG.get(), CHERRY_PLANKS.get(), STRIPPED_CHERRY_LOG.get(), CHERRY_SLAB.get(), CHERRY_FENCE.get(), CHERRY_TRAPDOOR.get()));
//        mats.add(new McwWoodMat<>(JACARANDA_LOG.get(), JACARANDA_PLANKS.get(), STRIPPED_JACARANDA_LOG.get(), JACARANDA_SLAB.get(), JACARANDA_FENCE.get(), JACARANDA_TRAPDOOR.get()));
//        mats.add(new McwWoodMat<>(STRAWBERRY_LOG.get(), STRAWBERRY_PLANKS.get(), STRIPPED_STRAWBERRY_LOG.get(), STRAWBERRY_SLAB.get(), STRAWBERRY_FENCE.get(), STRAWBERRY_TRAPDOOR.get()));
//        mats.add(new McwWoodMat<>(PEACH_LOG.get(), PEACH_PLANKS.get(), STRIPPED_PEACH_LOG.get(), PEACH_SLAB.get(), PEACH_FENCE.get(), PEACH_TRAPDOOR.get()));
//        mats.add(new McwWoodMat<>(MAPLE_LOG.get(), MAPLE_PLANKS.get(), STRIPPED_MAPLE_LOG.get(), MAPLE_SLAB.get(), MAPLE_FENCE.get(), MAPLE_TRAPDOOR.get()));
//        mats.add(new McwWoodMat<>(SEA_FOAM_LOG.get(), SEA_FOAM_PLANKS.get(), STRIPPED_SEA_FOAM_LOG.get(), SEA_FOAM_SLAB.get(), SEA_FOAM_FENCE.get(), SEA_FOAM_TRAPDOOR.get()));
//        mats.add(new McwWoodMat<>(TROPICAL_LOG.get(), TROPICAL_PLANKS.get(), STRIPPED_TROPICAL_LOG.get(), TROPICAL_SLAB.get(), TROPICAL_FENCE.get(), TROPICAL_TRAPDOOR.get()));
        return mats;
    }
}
