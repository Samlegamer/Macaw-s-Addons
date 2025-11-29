package fr.samlegamer.mcwmoddinglegacy;

import com.legacy.blue_skies.BlueSkies;
//import com.legacy.premium_wood.PremiumWoodMod;
//import com.legacy.premium_wood.registry.PremiumBlocks;
import fr.samlegamer.addonslib.data.ModType;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import fr.samlegamer.addonslib.generation.recipes.mat.McwWoodMat;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import com.legacy.blue_skies.registries.SkiesBlocks;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_, McwModdingLegacy.MODID, "", "");
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer)
    {
        registerAllMcwWood(consumer, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_blue_skies, getWoodBS());
//        registerAllMcwWood(consumer, McwModdingLegacy.MODID, PremiumWoodMod.MODID, McwModdingLegacy.wood_premium_wood, getWoodPW());

        onRegisterMcwWood(ModType.BRIDGES, consumer, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_crystallized, getWoodBSCrystallized());
        onRegisterMcwWood(ModType.ROOFS, consumer, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_crystallized, getWoodBSCrystallized());
        registerMcwHedge(consumer, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_crystallized, getLeavesBSCrystallized());

        registerMcwHedge(consumer, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_blue_skies, getLeavesBS());
//        registerMcwHedge(consumer, McwModdingLegacy.MODID, PremiumWoodMod.MODID, McwModdingLegacy.wood_premium_wood, getLeavesPW());
    }

//    private List<Block> getLeavesPW()
//    {
//        List<Block> mats = new ArrayList<>();
//        mats.add(PremiumBlocks.magic_leaves);
//        mats.add(PremiumBlocks.maple_leaves);
//        mats.add(PremiumBlocks.purple_heart_leaves);
//        mats.add(PremiumBlocks.silverbell_leaves);
//        mats.add(PremiumBlocks.tiger_leaves);
//        mats.add(PremiumBlocks.willow_leaves);
//        return mats;
//    }

    private List<Block> getLeavesBS()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(SkiesBlocks.bluebright_leaves);
        mats.add(SkiesBlocks.cherry_leaves);
        mats.add(SkiesBlocks.dusk_leaves);
        mats.add(SkiesBlocks.frostbright_leaves);
        mats.add(SkiesBlocks.lunar_leaves);
        mats.add(SkiesBlocks.maple_leaves);
        mats.add(SkiesBlocks.starlit_leaves);
        return mats;
    }

    private List<Block> getLeavesBSCrystallized()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(SkiesBlocks.crystallized_leaves);
        return mats;
    }

    private List<McwWoodMat> getWoodBSCrystallized()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(SkiesBlocks.crystallized_log, SkiesBlocks.crystallized_planks, SkiesBlocks.crystallized_log, SkiesBlocks.crystallized_slab, SkiesBlocks.crystallized_wall, SkiesBlocks.crystallized_trapdoor));
        return mats;
    }

//    private List<McwWoodMat> getWoodPW()
//    {
//        List<McwWoodMat> mats = new ArrayList<>();
//        mats.add(new McwWoodMat(PremiumBlocks.magic_log, PremiumBlocks.magic_planks, PremiumBlocks.magic_stripped_log, PremiumBlocks.magic_slab, PremiumBlocks.magic_fence, PremiumBlocks.magic_trapdoor));
//        mats.add(new McwWoodMat(PremiumBlocks.maple_log, PremiumBlocks.maple_planks, PremiumBlocks.maple_stripped_log, PremiumBlocks.maple_slab, PremiumBlocks.maple_fence, PremiumBlocks.maple_trapdoor));
//        mats.add(new McwWoodMat(PremiumBlocks.purple_heart_log, PremiumBlocks.purple_heart_planks, PremiumBlocks.purple_heart_stripped_log, PremiumBlocks.purple_heart_slab, PremiumBlocks.purple_heart_fence, PremiumBlocks.purple_heart_trapdoor));
//        mats.add(new McwWoodMat(PremiumBlocks.silverbell_log, PremiumBlocks.silverbell_planks, PremiumBlocks.silverbell_stripped_log, PremiumBlocks.silverbell_slab, PremiumBlocks.silverbell_fence, PremiumBlocks.silverbell_trapdoor));
//        mats.add(new McwWoodMat(PremiumBlocks.tiger_log, PremiumBlocks.tiger_planks, PremiumBlocks.tiger_stripped_log, PremiumBlocks.tiger_slab, PremiumBlocks.tiger_fence, PremiumBlocks.tiger_trapdoor));
//        mats.add(new McwWoodMat(PremiumBlocks.willow_log, PremiumBlocks.willow_planks, PremiumBlocks.willow_stripped_log, PremiumBlocks.willow_slab, PremiumBlocks.willow_fence, PremiumBlocks.willow_trapdoor));
//        return mats;
//    }

    private List<McwWoodMat> getWoodBS()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(SkiesBlocks.bluebright_log, SkiesBlocks.bluebright_planks, SkiesBlocks.stripped_bluebright_log, SkiesBlocks.bluebright_slab, SkiesBlocks.bluebright_fence, SkiesBlocks.bluebright_trapdoor));
        mats.add(new McwWoodMat(SkiesBlocks.cherry_log, SkiesBlocks.cherry_planks, SkiesBlocks.stripped_cherry_log, SkiesBlocks.cherry_slab, SkiesBlocks.cherry_fence, SkiesBlocks.cherry_trapdoor));
        mats.add(new McwWoodMat(SkiesBlocks.dusk_log, SkiesBlocks.dusk_planks, SkiesBlocks.stripped_dusk_log, SkiesBlocks.dusk_slab, SkiesBlocks.dusk_fence, SkiesBlocks.dusk_trapdoor));
        mats.add(new McwWoodMat(SkiesBlocks.frostbright_log, SkiesBlocks.frostbright_planks, SkiesBlocks.stripped_frostbright_log, SkiesBlocks.frostbright_slab, SkiesBlocks.frostbright_fence, SkiesBlocks.frostbright_trapdoor));
        mats.add(new McwWoodMat(SkiesBlocks.lunar_log, SkiesBlocks.lunar_planks, SkiesBlocks.stripped_lunar_log, SkiesBlocks.lunar_slab, SkiesBlocks.lunar_fence, SkiesBlocks.lunar_trapdoor));
        mats.add(new McwWoodMat(SkiesBlocks.maple_log, SkiesBlocks.maple_planks, SkiesBlocks.stripped_maple_log, SkiesBlocks.maple_slab, SkiesBlocks.maple_fence, SkiesBlocks.maple_trapdoor));
        mats.add(new McwWoodMat(SkiesBlocks.starlit_log, SkiesBlocks.starlit_planks, SkiesBlocks.stripped_starlit_log, SkiesBlocks.starlit_slab, SkiesBlocks.starlit_fence, SkiesBlocks.starlit_trapdoor));
        return mats;
    }
}