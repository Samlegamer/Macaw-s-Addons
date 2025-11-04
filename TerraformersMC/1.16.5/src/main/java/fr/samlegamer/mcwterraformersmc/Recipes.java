package fr.samlegamer.mcwterraformersmc;

//import com.terraformersmc.cinderscapes.Cinderscapes;
//import com.terraformersmc.cinderscapes.init.CinderscapesBlocks;
//import com.terraformersmc.terrestria.Terrestria;
//import com.terraformersmc.terrestria.init.TerrestriaBlocks;
//import epicsquid.traverse.Traverse;
//import epicsquid.traverse.init.ModBlocks;

public class Recipes //extends RecipeProvider
{
    /*
    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        McwRecipes.registerAllMcwWood(consumer, McwTerraformersMC.MODID, Traverse.MODID, McwTerraformersMC.WOODS_TRAVERSE, getWoodTraverse());
        McwRecipes.registerAllMcwWood(consumer, McwTerraformersMC.MODID, Cinderscapes.ID, McwTerraformersMC.WOODS_CINDERSCAPES, getWoodCinderscapes());
        McwRecipes.registerAllMcwWood(consumer, McwTerraformersMC.MODID, Terrestria.MOD_ID, McwTerraformersMC.WOODS_TERRESTRIA, getWoodTerrestria());

        McwRecipes.registerAllMcwStone(consumer, McwTerraformersMC.MODID, Cinderscapes.ID, McwTerraformersMC.ROCKS_CINDERSCAPES, getStoneCinderscapes());
        McwRecipes.registerAllMcwStone(consumer, McwTerraformersMC.MODID, Terrestria.MOD_ID, McwTerraformersMC.ROCKS_TERRESTRIA, getStoneTerrestria());

        McwRecipes.registerMcwHedge(consumer, McwTerraformersMC.MODID, Traverse.MODID, McwTerraformersMC.LEAVES_TRAVERSE, getLeaveTraverse());
        McwRecipes.registerMcwHedge(consumer, McwTerraformersMC.MODID, Terrestria.MOD_ID, McwTerraformersMC.LEAVES_TERRESTRIA, getLeaveTerrestria());
    }

    private List<McwStoneMat> getStoneTerrestria()
    {
        List<McwStoneMat> mats = new ArrayList<>();
        mats.add(new McwStoneMat(Finder.findBlock(Terrestria.MOD_ID, "basalt_bricks"), Finder.findBlock(Terrestria.MOD_ID, "basalt_brick_wall"),
                Finder.findBlock(Terrestria.MOD_ID, "basalt_brick_slab"), Finder.findBlock(Terrestria.MOD_ID, "basalt_cobblestone")));
        mats.add(new McwStoneMat(Finder.findBlock(Terrestria.MOD_ID, "mossy_basalt_bricks"), Finder.findBlock(Terrestria.MOD_ID, "mossy_basalt_brick_wall"),
                Finder.findBlock(Terrestria.MOD_ID, "mossy_basalt_brick_slab"), Finder.findBlock(Terrestria.MOD_ID, "mossy_basalt_cobblestone")));
        return mats;
    }

    private List<McwWoodMat> getWoodTerrestria()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(TerrestriaBlocks.REDWOOD.log, TerrestriaBlocks.REDWOOD.planks, TerrestriaBlocks.REDWOOD.strippedLog, TerrestriaBlocks.REDWOOD.slab,
                TerrestriaBlocks.REDWOOD.fence, Finder.findBlock(Traverse.MODID, "redwood_trapdoor")));
        mats.add(new McwWoodMat(TerrestriaBlocks.HEMLOCK.log, TerrestriaBlocks.HEMLOCK.planks, TerrestriaBlocks.HEMLOCK.strippedLog, TerrestriaBlocks.HEMLOCK.slab,
                TerrestriaBlocks.HEMLOCK.fence, Finder.findBlock(Terrestria.MOD_ID, "hemlock_trapdoor")));
        mats.add(new McwWoodMat(TerrestriaBlocks.RUBBER.log, TerrestriaBlocks.RUBBER.planks, TerrestriaBlocks.RUBBER.strippedLog, TerrestriaBlocks.RUBBER.slab,
                TerrestriaBlocks.RUBBER.fence, Finder.findBlock(Terrestria.MOD_ID, "rubber_trapdoor")));
        mats.add(new McwWoodMat(TerrestriaBlocks.CYPRESS.log, TerrestriaBlocks.CYPRESS.planks, TerrestriaBlocks.CYPRESS.strippedLog, TerrestriaBlocks.CYPRESS.slab,
                TerrestriaBlocks.CYPRESS.fence, Finder.findBlock(Terrestria.MOD_ID, "cypress_trapdoor")));
        mats.add(new McwWoodMat(TerrestriaBlocks.WILLOW.log, TerrestriaBlocks.WILLOW.planks, TerrestriaBlocks.WILLOW.strippedLog, TerrestriaBlocks.WILLOW.slab,
                TerrestriaBlocks.WILLOW.fence, Finder.findBlock(Terrestria.MOD_ID, "willow_trapdoor")));
        mats.add(new McwWoodMat(TerrestriaBlocks.JAPANESE_MAPLE.log, TerrestriaBlocks.JAPANESE_MAPLE.planks, TerrestriaBlocks.JAPANESE_MAPLE.strippedLog, TerrestriaBlocks.JAPANESE_MAPLE.slab,
                TerrestriaBlocks.JAPANESE_MAPLE.fence, Finder.findBlock(Terrestria.MOD_ID, "japanese_maple_trapdoor")));
        mats.add(new McwWoodMat(TerrestriaBlocks.RAINBOW_EUCALYPTUS.log, TerrestriaBlocks.RAINBOW_EUCALYPTUS.planks, TerrestriaBlocks.RAINBOW_EUCALYPTUS.strippedLog, TerrestriaBlocks.RAINBOW_EUCALYPTUS.slab,
                TerrestriaBlocks.RAINBOW_EUCALYPTUS.fence, Finder.findBlock(Terrestria.MOD_ID, "rainbow_eucalyptus_trapdoor")));
        mats.add(new McwWoodMat(TerrestriaBlocks.SAKURA.log, TerrestriaBlocks.SAKURA.planks, TerrestriaBlocks.SAKURA.strippedLog, TerrestriaBlocks.SAKURA.slab,
                TerrestriaBlocks.SAKURA.fence, Finder.findBlock(Terrestria.MOD_ID, "sakura_trapdoor")));
        mats.add(new McwWoodMat(TerrestriaBlocks.YUCCA_PALM.log, TerrestriaBlocks.YUCCA_PALM.planks, TerrestriaBlocks.YUCCA_PALM.strippedLog, TerrestriaBlocks.YUCCA_PALM.slab,
                TerrestriaBlocks.YUCCA_PALM.fence, Finder.findBlock(Terrestria.MOD_ID, "yucca_palm_trapdoor")));
        return mats;
    }

    private List<Block> getLeaveTerrestria()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(TerrestriaBlocks.REDWOOD.leaves);
        mats.add(TerrestriaBlocks.HEMLOCK.leaves);
        mats.add(TerrestriaBlocks.RUBBER.leaves);
        mats.add(TerrestriaBlocks.CYPRESS.leaves);
        mats.add(TerrestriaBlocks.WILLOW.leaves);
        mats.add(TerrestriaBlocks.JAPANESE_MAPLE.leaves);
        mats.add(TerrestriaBlocks.RAINBOW_EUCALYPTUS.leaves);
        mats.add(TerrestriaBlocks.SAKURA.leaves);
        mats.add(TerrestriaBlocks.YUCCA_PALM.leaves);
        mats.add(TerrestriaBlocks.JAPANESE_MAPLE_SHRUB_LEAVES);
        mats.add(TerrestriaBlocks.DARK_JAPANESE_MAPLE_LEAVES);
        mats.add(TerrestriaBlocks.JUNGLE_PALM_LEAVES);
        return mats;
    }

    private List<McwStoneMat> getStoneCinderscapes()
    {
        List<McwStoneMat> mats = new ArrayList<>();
        mats.add(new McwStoneMat(CinderscapesBlocks.SULFUR_QUARTZ_BRICKS, CinderscapesBlocks.SULFUR_QUARTZ_PILLAR, CinderscapesBlocks.SULFUR_QUARTZ_SLAB,
                CinderscapesBlocks.SULFUR_QUARTZ_BLOCK));
        mats.add(new McwStoneMat(CinderscapesBlocks.ROSE_QUARTZ_BRICKS, CinderscapesBlocks.ROSE_QUARTZ_PILLAR, CinderscapesBlocks.ROSE_QUARTZ_SLAB,
                CinderscapesBlocks.ROSE_QUARTZ_BLOCK));
        mats.add(new McwStoneMat(CinderscapesBlocks.SMOKY_QUARTZ_BRICKS, CinderscapesBlocks.SMOKY_QUARTZ_PILLAR, CinderscapesBlocks.SMOKY_QUARTZ_SLAB,
                CinderscapesBlocks.SMOKY_QUARTZ_BLOCK));
        return mats;
    }

    private List<McwWoodMat> getWoodCinderscapes()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(CinderscapesBlocks.SCORCHED_STEM, CinderscapesBlocks.SCORCHED_PLANKS, CinderscapesBlocks.STRIPPED_SCORCHED_STEM, CinderscapesBlocks.SCORCHED_SLAB,
                CinderscapesBlocks.SCORCHED_FENCE, CinderscapesBlocks.SCORCHED_TRAPDOOR));
        mats.add(new McwWoodMat(CinderscapesBlocks.UMBRAL_STEM, CinderscapesBlocks.UMBRAL_PLANKS, CinderscapesBlocks.STRIPPED_UMBRAL_STEM, CinderscapesBlocks.UMBRAL_SLAB,
                CinderscapesBlocks.UMBRAL_FENCE, CinderscapesBlocks.UMBRAL_TRAPDOOR));
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

    private List<McwWoodMat> getWoodTraverse()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(ModBlocks.FIR_LOG.get(), ModBlocks.FIR_PLANKS.get(), ModBlocks.STRIPPED_FIR_LOG.get(), ModBlocks.FIR_SLAB.get(),
                ModBlocks.FIR_FENCE.get(), ModBlocks.FIR_TRAPDOOR.get()));
        return mats;
    }*/
}