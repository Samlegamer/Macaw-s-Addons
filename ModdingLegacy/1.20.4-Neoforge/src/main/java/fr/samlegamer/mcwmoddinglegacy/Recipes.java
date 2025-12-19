package fr.samlegamer.mcwmoddinglegacy;

import com.legacy.blue_skies.BlueSkies;
import com.legacy.blue_skies.registries.SkiesBlocks;
import com.legacy.premium_wood.PremiumWoodMod;
import fr.addonslib.api.data.ModType;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import static com.legacy.premium_wood.registry.PremiumBlocks.*;

public class Recipes extends McwRecipes
{
    public Recipes(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        registerAllMcwWood(output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_blue_skies, getWoodBS());
        registerAllMcwWood(output, McwModdingLegacy.MODID, PremiumWoodMod.MODID, McwModdingLegacy.wood_premium_wood, getWoodPW());

        registerMcwWood(output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_crystallized, getWoodBSCrystallized(), ModType.BRIDGES, ModType.ROOFS);
        registerMcwHedge(output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_crystallized, getLeavesBSCrystallized());

        registerMcwHedge(output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_blue_skies, getLeavesBS());
        registerMcwHedge(output, McwModdingLegacy.MODID, PremiumWoodMod.MODID, McwModdingLegacy.wood_premium_wood, getLeavesPW());
    }

    private List<McwWoodMat<Block>> getWoodBS()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(SkiesBlocks.bluebright_log, SkiesBlocks.bluebright_planks, SkiesBlocks.stripped_bluebright_log, SkiesBlocks.bluebright_slab, SkiesBlocks.bluebright_fence, SkiesBlocks.bluebright_trapdoor));
        mats.add(new McwWoodMat<>(SkiesBlocks.comet_log, SkiesBlocks.comet_planks, SkiesBlocks.stripped_comet_log, SkiesBlocks.comet_slab, SkiesBlocks.comet_fence, SkiesBlocks.comet_trapdoor));
        mats.add(new McwWoodMat<>(SkiesBlocks.dusk_log, SkiesBlocks.dusk_planks, SkiesBlocks.stripped_dusk_log, SkiesBlocks.dusk_slab, SkiesBlocks.dusk_fence, SkiesBlocks.dusk_trapdoor));
        mats.add(new McwWoodMat<>(SkiesBlocks.frostbright_log, SkiesBlocks.frostbright_planks, SkiesBlocks.stripped_frostbright_log, SkiesBlocks.frostbright_slab, SkiesBlocks.frostbright_fence, SkiesBlocks.frostbright_trapdoor));
        mats.add(new McwWoodMat<>(SkiesBlocks.lunar_log, SkiesBlocks.lunar_planks, SkiesBlocks.stripped_lunar_log, SkiesBlocks.lunar_slab, SkiesBlocks.lunar_fence, SkiesBlocks.lunar_trapdoor));
        mats.add(new McwWoodMat<>(SkiesBlocks.maple_log, SkiesBlocks.maple_planks, SkiesBlocks.stripped_maple_log, SkiesBlocks.maple_slab, SkiesBlocks.maple_fence, SkiesBlocks.maple_trapdoor));
        mats.add(new McwWoodMat<>(SkiesBlocks.starlit_log, SkiesBlocks.starlit_planks, SkiesBlocks.stripped_starlit_log, SkiesBlocks.starlit_slab, SkiesBlocks.starlit_fence, SkiesBlocks.starlit_trapdoor));
        return mats;
    }

    private List<Block> getLeavesBSCrystallized()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(SkiesBlocks.crystallized_leaves);
        return mats;
    }

    private List<McwWoodMat<Block>> getWoodBSCrystallized()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(SkiesBlocks.crystallized_log, SkiesBlocks.crystallized_planks, SkiesBlocks.crystallized_log, SkiesBlocks.crystallized_slab, SkiesBlocks.crystallized_wall, SkiesBlocks.crystallized_trapdoor));
        return mats;
    }

    private List<Block> getLeavesBS()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(SkiesBlocks.bluebright_leaves);
        mats.add(SkiesBlocks.comet_leaves);
        mats.add(SkiesBlocks.dusk_leaves);
        mats.add(SkiesBlocks.frostbright_leaves);
        mats.add(SkiesBlocks.lunar_leaves);
        mats.add(SkiesBlocks.maple_leaves);
        mats.add(SkiesBlocks.starlit_leaves);
        return mats;
    }

    private List<McwWoodMat<Block>> getWoodPW()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(magic_log.get(), magic_planks.get(), magic_stripped_log.get(), magic_slab.get(), magic_fence.get(), magic_trapdoor.get()));
        mats.add(new McwWoodMat<>(maple_log.get(), maple_planks.get(), maple_stripped_log.get(), maple_slab.get(), maple_fence.get(), maple_trapdoor.get()));
        mats.add(new McwWoodMat<>(purple_heart_log.get(), purple_heart_planks.get(), purple_heart_stripped_log.get(), purple_heart_slab.get(), purple_heart_fence.get(), purple_heart_trapdoor.get()));
        mats.add(new McwWoodMat<>(silverbell_log.get(), silverbell_planks.get(), silverbell_stripped_log.get(), silverbell_slab.get(), silverbell_fence.get(), silverbell_trapdoor.get()));
        mats.add(new McwWoodMat<>(tiger_log.get(), tiger_planks.get(), tiger_stripped_log.get(), tiger_slab.get(), tiger_fence.get(), tiger_trapdoor.get()));
        mats.add(new McwWoodMat<>(willow_log.get(), willow_planks.get(), willow_stripped_log.get(), willow_slab.get(), willow_fence.get(), willow_trapdoor.get()));
        return mats;
    }

    private List<Block> getLeavesPW()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(magic_leaves.get());
        mats.add(maple_leaves.get());
        mats.add(purple_heart_leaves.get());
        mats.add(silverbell_leaves.get());
        mats.add(tiger_leaves.get());
        mats.add(willow_leaves.get());
        return mats;
    }
}