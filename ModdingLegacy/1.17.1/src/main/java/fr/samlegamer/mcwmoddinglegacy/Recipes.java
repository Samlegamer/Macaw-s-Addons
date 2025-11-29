package fr.samlegamer.mcwmoddinglegacy;

import fr.samlegamer.addonslib.data.ModType;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import fr.samlegamer.addonslib.generation.recipes.mat.McwWoodMat;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Block;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import static com.legacy.premium_wood.registry.PremiumBlocks.*;
import com.legacy.blue_skies.BlueSkies;
import com.legacy.blue_skies.registries.SkiesBlocks;
import com.legacy.premium_wood.PremiumWoodMod;

import javax.annotation.ParametersAreNonnullByDefault;

public class Recipes extends McwRecipes
{
    public Recipes(DataGenerator pOutput) {
        super(pOutput, McwModdingLegacy.MODID, "", "");
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> output) {
        registerAllMcwWood(output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_blue_skies, getWoodBS());
        registerAllMcwWood(output, McwModdingLegacy.MODID, PremiumWoodMod.MODID, McwModdingLegacy.wood_premium_wood, getWoodPW());

        onRegisterMcwWood(ModType.BRIDGES, output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_crystallized, getWoodBSCrystallized());
        onRegisterMcwWood(ModType.ROOFS, output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_crystallized, getWoodBSCrystallized());
        registerMcwHedge(output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_crystallized, getLeavesBSCrystallized());

        registerMcwHedge(output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_blue_skies, getLeavesBS());
        registerMcwHedge(output, McwModdingLegacy.MODID, PremiumWoodMod.MODID, McwModdingLegacy.wood_premium_wood, getLeavesPW());
    }

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

    private List<McwWoodMat> getWoodPW()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(magic_log, magic_planks, magic_stripped_log, magic_slab, magic_fence, magic_trapdoor));
        mats.add(new McwWoodMat(maple_log, maple_planks, maple_stripped_log, maple_slab, maple_fence, maple_trapdoor));
        mats.add(new McwWoodMat(purple_heart_log, purple_heart_planks, purple_heart_stripped_log, purple_heart_slab, purple_heart_fence, purple_heart_trapdoor));
        mats.add(new McwWoodMat(silverbell_log, silverbell_planks, silverbell_stripped_log, silverbell_slab, silverbell_fence, silverbell_trapdoor));
        mats.add(new McwWoodMat(tiger_log, tiger_planks, tiger_stripped_log, tiger_slab, tiger_fence, tiger_trapdoor));
        mats.add(new McwWoodMat(willow_log, willow_planks, willow_stripped_log, willow_slab, willow_fence, willow_trapdoor));
        return mats;
    }

    private List<Block> getLeavesPW()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(magic_leaves);
        mats.add(maple_leaves);
        mats.add(purple_heart_leaves);
        mats.add(silverbell_leaves);
        mats.add(tiger_leaves);
        mats.add(willow_leaves);
        return mats;
    }
}