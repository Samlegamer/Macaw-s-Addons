package fr.samlegamer.mcwbetters;

import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import mod.beethoven92.betterendforge.BetterEnd;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import someoneelse.betternetherreforged.BetterNether;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static mod.beethoven92.betterendforge.common.init.ModBlocks.*;
import static someoneelse.betternetherreforged.registry.BlocksRegistry.*;

public class Recipes extends McwRecipes
{
    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        recipesUtils.registerAllMcwWood(consumer, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.WOOD_BETTER_END, getBetterEndWood());
        recipesUtils.registerAllMcwWood(consumer, McwBetters.MODID, BetterNether.MOD_ID, McwBetters.WOOD_BETTER_NETHER, getBetterNetherWood());

        recipesUtils.registerMcwHedge(consumer, McwBetters.MODID, BetterEnd.MOD_ID, McwBetters.LEAVE_BETTER_END, getBetterEndLeaves());
        recipesUtils.registerMcwHedge(consumer, McwBetters.MODID, BetterNether.MOD_ID, McwBetters.LEAVE_BETTER_NETHER, getBetterNetherLeaves());
    }

    private List<Block> getBetterEndLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(DRAGON_TREE_LEAVES.get());
        mats.add(LACUGROVE_LEAVES.get());
        mats.add(LUCERNIA_LEAVES.get());
        mats.add(PYTHADENDRON_LEAVES.get());
        mats.add(TENANEA_LEAVES.get());
        return mats;
    }


    private List<Block> getBetterNetherLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(NETHER_SAKURA_LEAVES);
        mats.add(RUBEUS_LEAVES);
        mats.add(WILLOW_LEAVES);
        return mats;
    }

    private List<McwWoodMat<Block>> getBetterEndWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(DRAGON_TREE.log.get(), DRAGON_TREE.planks.get(), DRAGON_TREE.log_stripped.get(), DRAGON_TREE.slab.get(), DRAGON_TREE.fence.get(), DRAGON_TREE.trapdoor.get()));
        mats.add(new McwWoodMat<>(END_LOTUS.log.get(), END_LOTUS.planks.get(), END_LOTUS.log_stripped.get(), END_LOTUS.slab.get(), END_LOTUS.fence.get(), END_LOTUS.trapdoor.get()));
        mats.add(new McwWoodMat<>(HELIX_TREE.log.get(), HELIX_TREE.planks.get(), HELIX_TREE.log_stripped.get(), HELIX_TREE.slab.get(), HELIX_TREE.fence.get(), HELIX_TREE.trapdoor.get()));
        mats.add(new McwWoodMat<>(JELLYSHROOM.log.get(), JELLYSHROOM.planks.get(), JELLYSHROOM.log_stripped.get(), JELLYSHROOM.slab.get(), JELLYSHROOM.fence.get(), JELLYSHROOM.trapdoor.get()));
        mats.add(new McwWoodMat<>(LACUGROVE.log.get(), LACUGROVE.planks.get(), LACUGROVE.log_stripped.get(), LACUGROVE.slab.get(), LACUGROVE.fence.get(), LACUGROVE.trapdoor.get()));
        mats.add(new McwWoodMat<>(LUCERNIA.log.get(), LUCERNIA.planks.get(), LUCERNIA.log_stripped.get(), LUCERNIA.slab.get(), LUCERNIA.fence.get(), LUCERNIA.trapdoor.get()));
        mats.add(new McwWoodMat<>(MOSSY_GLOWSHROOM.log.get(), MOSSY_GLOWSHROOM.planks.get(), MOSSY_GLOWSHROOM.log_stripped.get(), MOSSY_GLOWSHROOM.slab.get(), MOSSY_GLOWSHROOM.fence.get(), MOSSY_GLOWSHROOM.trapdoor.get()));
        mats.add(new McwWoodMat<>(PYTHADENDRON.log.get(), PYTHADENDRON.planks.get(), PYTHADENDRON.log_stripped.get(), PYTHADENDRON.slab.get(), PYTHADENDRON.fence.get(), PYTHADENDRON.trapdoor.get()));
        mats.add(new McwWoodMat<>(TENANEA.log.get(), TENANEA.planks.get(), TENANEA.log_stripped.get(), TENANEA.slab.get(), TENANEA.fence.get(), TENANEA.trapdoor.get()));
        mats.add(new McwWoodMat<>(UMBRELLA_TREE.log.get(), UMBRELLA_TREE.planks.get(), UMBRELLA_TREE.log_stripped.get(), UMBRELLA_TREE.slab.get(), UMBRELLA_TREE.fence.get(), UMBRELLA_TREE.trapdoor.get()));
        return mats;
    }

    private List<McwWoodMat<Block>> getBetterNetherWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(ANCHOR_TREE.log, ANCHOR_TREE.planks, ANCHOR_TREE.log_striped, ANCHOR_TREE.planks_slab, ANCHOR_TREE.fence, ANCHOR_TREE.trapdoor));
        mats.add(new McwWoodMat<>(MUSHROOM_FIR_LOG, MUSHROOM_FIR_PLANKS, STRIPED_LOG_MUSHROOM_FIR, MUSHROOM_FIR_SLAB, MUSHROOM_FIR_FENCE, MUSHROOM_FIR_TRAPDOOR));
        mats.add(new McwWoodMat<>(MUSHROOM_STEM, MUSHROOM_PLANKS, Blocks.MUSHROOM_STEM, MUSHROOM_SLAB, MUSHROOM_FENCE, MUSHROOM_TRAPDOOR));
        mats.add(new McwWoodMat<>(NETHER_SAKURA.log, NETHER_SAKURA.planks, NETHER_SAKURA.log_striped, NETHER_SAKURA.planks_slab, NETHER_SAKURA.fence, NETHER_SAKURA.trapdoor));
        mats.add(new McwWoodMat<>(RUBEUS_LOG, RUBEUS_PLANKS, STRIPED_LOG_RUBEUS, RUBEUS_SLAB, RUBEUS_FENCE, RUBEUS_TRAPDOOR));
        mats.add(new McwWoodMat<>(STALAGNATE_LOG, STALAGNATE_PLANKS, STRIPED_LOG_STALAGNATE, STALAGNATE_SLAB, STALAGNATE_FENCE, STALAGNATE_TRAPDOOR));
        mats.add(new McwWoodMat<>(WART_LOG, WART_PLANKS, STRIPED_LOG_WART, WART_SLAB, WART_FENCE, WART_TRAPDOOR));
        mats.add(new McwWoodMat<>(WILLOW_LOG, WILLOW_PLANKS, STRIPED_LOG_WILLOW, WILLOW_SLAB, WILLOW_FENCE, WILLOW_TRAPDOOR));
        return mats;
    }
}