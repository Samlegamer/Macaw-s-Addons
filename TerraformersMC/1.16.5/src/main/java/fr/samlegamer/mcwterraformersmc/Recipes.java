package fr.samlegamer.mcwterraformersmc;

import fr.addonslib.api.recipes.material.McwStoneMat;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import terraformmc.cinderscapes.Cinderscapes;
import terraformmc.cinderscapes.init.CinderscapesBlocks;
import terraformmc.terrestria.Terrestria;
import terraformmc.terrestria.init.TerrastriaBlocks;
import terraformsmc.traverse.Traverse;
import terraformsmc.traverse.init.ModBlocks;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        registerAllMcwWood(consumer, McwTerraformersMC.MODID, Traverse.MODID, McwTerraformersMC.WOODS_TRAVERSE, getWoodTraverse());
        registerAllMcwWood(consumer, McwTerraformersMC.MODID, Cinderscapes.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, getWoodCinderscapes());
        registerAllMcwWood(consumer, McwTerraformersMC.MODID, Terrestria.MODID, McwTerraformersMC.WOODS_TERRESTRIA, getWoodTerrestria());

        registerAllMcwStone(consumer, McwTerraformersMC.MODID, Cinderscapes.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES, getStoneCinderscapes());
        registerAllMcwStone(consumer, McwTerraformersMC.MODID, Terrestria.MODID, McwTerraformersMC.ROCKS_TERRESTRIA, getStoneTerrestria());

        registerMcwHedge(consumer, McwTerraformersMC.MODID, Traverse.MODID, McwTerraformersMC.LEAVES_TRAVERSE, getLeaveTraverse());
        registerMcwHedge(consumer, McwTerraformersMC.MODID, Terrestria.MODID, McwTerraformersMC.LEAVES_TERRESTRIA, getLeaveTerrestria());
    }

    private List<McwStoneMat<Block>> getStoneTerrestria()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        mats.add(new McwStoneMat<>(Finder.findBlock(Terrestria.MODID, "basalt_bricks"), Finder.findBlock(Terrestria.MODID, "basalt_brick_wall"),
                Finder.findBlock(Terrestria.MODID, "basalt_brick_slab"), Finder.findBlock(Terrestria.MODID, "basalt_cobblestone")));
        mats.add(new McwStoneMat<>(Finder.findBlock(Terrestria.MODID, "mossy_basalt_bricks"), Finder.findBlock(Terrestria.MODID, "mossy_basalt_brick_wall"),
                Finder.findBlock(Terrestria.MODID, "mossy_basalt_brick_slab"), Finder.findBlock(Terrestria.MODID, "mossy_basalt_cobblestone")));
        return mats;
    }

    private List<McwWoodMat<Block>> getWoodTerrestria()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(Finder.findBlock(Terrestria.MODID, "redwood_log"), Finder.findBlock(Terrestria.MODID, "redwood_planks"), Finder.findBlock(Terrestria.MODID, "stripped_redwood_log"), Finder.findBlock(Terrestria.MODID, "redwood_slab"),
                Finder.findBlock(Terrestria.MODID, "redwood_fence"), Finder.findBlock(Terrestria.MODID, "redwood_trapdoor")));
        mats.add(new McwWoodMat<>(Finder.findBlock(Terrestria.MODID, "hemlock_log"), Finder.findBlock(Terrestria.MODID, "hemlock_planks"), Finder.findBlock(Terrestria.MODID, "stripped_hemlock_log"), Finder.findBlock(Terrestria.MODID, "hemlock_slab"),
                Finder.findBlock(Terrestria.MODID, "hemlock_fence"), Finder.findBlock(Terrestria.MODID, "hemlock_trapdoor")));
        mats.add(new McwWoodMat<>(Finder.findBlock(Terrestria.MODID, "rubber_log"), Finder.findBlock(Terrestria.MODID, "rubber_planks"), Finder.findBlock(Terrestria.MODID, "stripped_rubber_log"), Finder.findBlock(Terrestria.MODID, "rubber_slab"),
                Finder.findBlock(Terrestria.MODID, "rubber_fence"), Finder.findBlock(Terrestria.MODID, "rubber_trapdoor")));
        mats.add(new McwWoodMat<>(Finder.findBlock(Terrestria.MODID, "cypress_log"), Finder.findBlock(Terrestria.MODID, "cypress_planks"), Finder.findBlock(Terrestria.MODID, "stripped_cypress_log"), Finder.findBlock(Terrestria.MODID, "cypress_slab"),
                Finder.findBlock(Terrestria.MODID, "cypress_fence"), Finder.findBlock(Terrestria.MODID, "cypress_trapdoor")));
        mats.add(new McwWoodMat<>(Finder.findBlock(Terrestria.MODID, "willow_log"), Finder.findBlock(Terrestria.MODID, "willow_planks"), Finder.findBlock(Terrestria.MODID, "stripped_willow_log"), Finder.findBlock(Terrestria.MODID, "willow_slab"),
                Finder.findBlock(Terrestria.MODID, "willow_fence"), Finder.findBlock(Terrestria.MODID, "willow_trapdoor")));
        mats.add(new McwWoodMat<>(Finder.findBlock(Terrestria.MODID, "japanese_maple_log"), Finder.findBlock(Terrestria.MODID, "japanese_maple_planks"), Finder.findBlock(Terrestria.MODID, "stripped_japanese_maple_log"), Finder.findBlock(Terrestria.MODID, "japanese_maple_slab"),
                Finder.findBlock(Terrestria.MODID, "japanese_maple_fence"), Finder.findBlock(Terrestria.MODID, "japanese_maple_trapdoor")));
        mats.add(new McwWoodMat<>(Finder.findBlock(Terrestria.MODID, "rainbow_eucalyptus_log"), Finder.findBlock(Terrestria.MODID, "rainbow_eucalyptus_planks"), Finder.findBlock(Terrestria.MODID, "stripped_rainbow_eucalyptus_log"), Finder.findBlock(Terrestria.MODID, "rainbow_eucalyptus_slab"),
                Finder.findBlock(Terrestria.MODID, "rainbow_eucalyptus_fence"), Finder.findBlock(Terrestria.MODID, "rainbow_eucalyptus_trapdoor")));
        mats.add(new McwWoodMat<>(Finder.findBlock(Terrestria.MODID, "sakura_log"), Finder.findBlock(Terrestria.MODID, "sakura_planks"), Finder.findBlock(Terrestria.MODID, "stripped_sakura_log"), Finder.findBlock(Terrestria.MODID, "sakura_slab"),
                Finder.findBlock(Terrestria.MODID, "sakura_fence"), Finder.findBlock(Terrestria.MODID, "sakura_trapdoor")));
        mats.add(new McwWoodMat<>(Finder.findBlock(Terrestria.MODID, "yucca_palm_log"), Finder.findBlock(Terrestria.MODID, "yucca_palm_planks"), Finder.findBlock(Terrestria.MODID, "stripped_yucca_palm_log"), Finder.findBlock(Terrestria.MODID, "yucca_palm_slab"),
                Finder.findBlock(Terrestria.MODID, "yucca_palm_fence"), Finder.findBlock(Terrestria.MODID, "yucca_palm_trapdoor")));
        return mats;
    }

    private List<Block> getLeaveTerrestria()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(TerrastriaBlocks.REDWOOD_LEAVES.get());
        mats.add(TerrastriaBlocks.HEMLOCK_LEAVES.get());
        mats.add(TerrastriaBlocks.RUBBER_LEAVES.get());
        mats.add(TerrastriaBlocks.CYPRESS_LEAVES.get());
        mats.add(TerrastriaBlocks.WILLOW_LEAVES.get());
        mats.add(TerrastriaBlocks.JAPANESE_MAPLE_LEAVES.get());
        mats.add(TerrastriaBlocks.RAINBOW_EUCALYPTUS_LEAVES.get());
        mats.add(TerrastriaBlocks.SAKURA_LEAVES.get());
        mats.add(TerrastriaBlocks.YUCCA_PALM_LEAVES.get());
        mats.add(TerrastriaBlocks.JAPANESE_MAPLE_SHRUB_LEAVES.get());
        mats.add(TerrastriaBlocks.DARK_JAPANESE_MAPLE_LEAVES.get());
        mats.add(TerrastriaBlocks.JUNGLE_PALM_LEAVES.get());
        return mats;
    }

    private List<McwStoneMat<Block>> getStoneCinderscapes()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        mats.add(new McwStoneMat<>(CinderscapesBlocks.SULFUR_QUARTZ_BRICKS.get(), CinderscapesBlocks.SULFUR_QUARTZ_PILLAR.get(), CinderscapesBlocks.SULFUR_QUARTZ_SLAB.get(),
                CinderscapesBlocks.SULFUR_QUARTZ_BLOCK.get()));
        mats.add(new McwStoneMat<>(CinderscapesBlocks.ROSE_QUARTZ_BRICKS.get(), CinderscapesBlocks.ROSE_QUARTZ_PILLAR.get(), CinderscapesBlocks.ROSE_QUARTZ_SLAB.get(),
                CinderscapesBlocks.ROSE_QUARTZ_BLOCK.get()));
        mats.add(new McwStoneMat<>(CinderscapesBlocks.SMOKY_QUARTZ_BRICKS.get(), CinderscapesBlocks.SMOKY_QUARTZ_PILLAR.get(), CinderscapesBlocks.SMOKY_QUARTZ_SLAB.get(),
                CinderscapesBlocks.SMOKY_QUARTZ_BLOCK.get()));
        return mats;
    }

    private List<McwWoodMat<Block>> getWoodCinderscapes()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(CinderscapesBlocks.SCORCHED_STEM.get(), CinderscapesBlocks.SCORCHED_PLANKS.get(), CinderscapesBlocks.STRIPPED_SCORCHED_STEM.get(), CinderscapesBlocks.SCORCHED_SLAB.get(),
                CinderscapesBlocks.SCORCHED_FENCE.get(), CinderscapesBlocks.SCORCHED_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(CinderscapesBlocks.UMBRAL_STEM.get(), CinderscapesBlocks.UMBRAL_PLANKS.get(), CinderscapesBlocks.STRIPPED_UMBRAL_STEM.get(), CinderscapesBlocks.UMBRAL_SLAB.get(),
                CinderscapesBlocks.UMBRAL_FENCE.get(), CinderscapesBlocks.UMBRAL_TRAPDOOR.get()));
        return mats;
    }

    private List<Block> getLeaveTraverse()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(ModBlocks.FIR_LEAVES.get());
        mats.add(ModBlocks.RED_AUTUMNAL_LEAVES.get());
        mats.add(ModBlocks.BROWN_AUTUMNAL_LEAVES.get());
        mats.add(ModBlocks.ORANGE_AUTUMNAL_LEAVES.get());
        mats.add(ModBlocks.YELLOW_AUTUMNAL_LEAVES.get());
        return mats;
    }

    private List<McwWoodMat<Block>> getWoodTraverse()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(ModBlocks.FIR_LOG.get(), ModBlocks.FIR_PLANKS.get(), ModBlocks.STRIPPED_FIR_LOG.get(), ModBlocks.FIR_SLAB.get(),
                ModBlocks.FIR_FENCE.get(), ModBlocks.FIR_TRAPDOOR.get()));
        return mats;
    }
}