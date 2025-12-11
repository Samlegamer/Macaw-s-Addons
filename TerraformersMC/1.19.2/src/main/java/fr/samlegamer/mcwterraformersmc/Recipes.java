package fr.samlegamer.mcwterraformersmc;

import com.terraformersmc.cinderscapes.Cinderscapes;
import com.terraformersmc.cinderscapes.init.CinderscapesBlocks;
import com.terraformersmc.terrestria.Terrestria;
import com.terraformersmc.terrestria.init.TerrestriaBlocks;
import com.terraformersmc.traverse.Traverse;
import com.terraformersmc.traverse.block.TraverseBlocks;
import fr.addonslib.api.recipes.material.McwStoneMat;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        registerAllMcwWood(consumer, McwTerraformersMC.MODID, Traverse.MOD_ID, McwTerraformersMC.WOODS_TRAVERSE, getWoodTraverse());
        registerAllMcwWood(consumer, McwTerraformersMC.MODID, Cinderscapes.NAMESPACE, McwTerraformersMC.WOODS_CINDERSCAPES, getWoodCinderscapes());
        registerAllMcwWood(consumer, McwTerraformersMC.MODID, Terrestria.MOD_ID, McwTerraformersMC.WOODS_TERRESTRIA, getWoodTerrestria());

        registerAllMcwStone(consumer, McwTerraformersMC.MODID, Cinderscapes.NAMESPACE, McwTerraformersMC.ROCKS_CINDERSCAPES, getStoneCinderscapes());
        registerAllMcwStone(consumer, McwTerraformersMC.MODID, Terrestria.MOD_ID, McwTerraformersMC.ROCKS_TERRESTRIA, getStoneTerrestria());

        registerMcwHedge(consumer, McwTerraformersMC.MODID, Traverse.MOD_ID, McwTerraformersMC.LEAVES_TRAVERSE, getLeaveTraverse());
        registerMcwHedge(consumer, McwTerraformersMC.MODID, Terrestria.MOD_ID, McwTerraformersMC.LEAVES_TERRESTRIA, getLeaveTerrestria());
    }

    private List<McwWoodMat<Block>> getWoodTerrestria()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(TerrestriaBlocks.REDWOOD.log, TerrestriaBlocks.REDWOOD.planks, TerrestriaBlocks.REDWOOD.strippedLog, TerrestriaBlocks.REDWOOD.slab,
                TerrestriaBlocks.REDWOOD.fence, TerrestriaBlocks.REDWOOD.trapdoor));
        mats.add(new McwWoodMat<>(TerrestriaBlocks.HEMLOCK.log, TerrestriaBlocks.HEMLOCK.planks, TerrestriaBlocks.HEMLOCK.strippedLog, TerrestriaBlocks.HEMLOCK.slab,
                TerrestriaBlocks.HEMLOCK.fence, TerrestriaBlocks.HEMLOCK.trapdoor));
        mats.add(new McwWoodMat<>(TerrestriaBlocks.RUBBER.log, TerrestriaBlocks.RUBBER.planks, TerrestriaBlocks.RUBBER.strippedLog, TerrestriaBlocks.RUBBER.slab,
                TerrestriaBlocks.RUBBER.fence, TerrestriaBlocks.RUBBER.trapdoor));
        mats.add(new McwWoodMat<>(TerrestriaBlocks.CYPRESS.log, TerrestriaBlocks.CYPRESS.planks, TerrestriaBlocks.CYPRESS.strippedLog, TerrestriaBlocks.CYPRESS.slab,
                TerrestriaBlocks.CYPRESS.fence, TerrestriaBlocks.CYPRESS.trapdoor));
        mats.add(new McwWoodMat<>(TerrestriaBlocks.WILLOW.log, TerrestriaBlocks.WILLOW.planks, TerrestriaBlocks.WILLOW.strippedLog, TerrestriaBlocks.WILLOW.slab,
                TerrestriaBlocks.WILLOW.fence, TerrestriaBlocks.WILLOW.trapdoor));
        mats.add(new McwWoodMat<>(TerrestriaBlocks.JAPANESE_MAPLE.log, TerrestriaBlocks.JAPANESE_MAPLE.planks, TerrestriaBlocks.JAPANESE_MAPLE.strippedLog, TerrestriaBlocks.JAPANESE_MAPLE.slab,
                TerrestriaBlocks.JAPANESE_MAPLE.fence, TerrestriaBlocks.JAPANESE_MAPLE.trapdoor));
        mats.add(new McwWoodMat<>(TerrestriaBlocks.RAINBOW_EUCALYPTUS.log, TerrestriaBlocks.RAINBOW_EUCALYPTUS.planks, TerrestriaBlocks.RAINBOW_EUCALYPTUS.strippedLog, TerrestriaBlocks.RAINBOW_EUCALYPTUS.slab,
                TerrestriaBlocks.RAINBOW_EUCALYPTUS.fence, TerrestriaBlocks.RAINBOW_EUCALYPTUS.trapdoor));
        mats.add(new McwWoodMat<>(TerrestriaBlocks.SAKURA.log, TerrestriaBlocks.SAKURA.planks, TerrestriaBlocks.SAKURA.strippedLog, TerrestriaBlocks.SAKURA.slab,
                TerrestriaBlocks.SAKURA.fence, TerrestriaBlocks.SAKURA.trapdoor));
        mats.add(new McwWoodMat<>(TerrestriaBlocks.YUCCA_PALM.log, TerrestriaBlocks.YUCCA_PALM.planks, TerrestriaBlocks.YUCCA_PALM.strippedLog, TerrestriaBlocks.YUCCA_PALM.slab,
                TerrestriaBlocks.YUCCA_PALM.fence, TerrestriaBlocks.YUCCA_PALM.trapdoor));
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

    private List<McwStoneMat<Block>> getStoneTerrestria()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        mats.add(new McwStoneMat<>(TerrestriaBlocks.VOLCANIC_ROCK.bricks.full, TerrestriaBlocks.VOLCANIC_ROCK.bricks.wall,
                TerrestriaBlocks.VOLCANIC_ROCK.bricks.slab, TerrestriaBlocks.VOLCANIC_ROCK.cobblestone.full));
        mats.add(new McwStoneMat<>(TerrestriaBlocks.VOLCANIC_ROCK.mossyBricks.full, TerrestriaBlocks.VOLCANIC_ROCK.mossyBricks.wall,
                TerrestriaBlocks.VOLCANIC_ROCK.mossyBricks.slab, TerrestriaBlocks.VOLCANIC_ROCK.mossyCobblestone.full));
        return mats;
    }

    private List<McwStoneMat<Block>> getStoneCinderscapes()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        mats.add(new McwStoneMat<>(CinderscapesBlocks.SULFUR_QUARTZ_BRICKS, CinderscapesBlocks.SULFUR_QUARTZ_PILLAR, CinderscapesBlocks.SULFUR_QUARTZ_SLAB,
                CinderscapesBlocks.SULFUR_QUARTZ_BLOCK));
        mats.add(new McwStoneMat<>(CinderscapesBlocks.ROSE_QUARTZ_BRICKS, CinderscapesBlocks.ROSE_QUARTZ_PILLAR, CinderscapesBlocks.ROSE_QUARTZ_SLAB,
                CinderscapesBlocks.ROSE_QUARTZ_BLOCK));
        mats.add(new McwStoneMat<>(CinderscapesBlocks.SMOKY_QUARTZ_BRICKS, CinderscapesBlocks.SMOKY_QUARTZ_PILLAR, CinderscapesBlocks.SMOKY_QUARTZ_SLAB,
                CinderscapesBlocks.SMOKY_QUARTZ_BLOCK));
        return mats;
    }

    private List<McwWoodMat<Block>> getWoodCinderscapes()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(CinderscapesBlocks.SCORCHED_STEM, CinderscapesBlocks.SCORCHED_PLANKS, CinderscapesBlocks.STRIPPED_SCORCHED_STEM, CinderscapesBlocks.SCORCHED_SLAB,
                CinderscapesBlocks.SCORCHED_FENCE, CinderscapesBlocks.SCORCHED_TRAPDOOR));
        mats.add(new McwWoodMat<>(CinderscapesBlocks.UMBRAL_STEM, CinderscapesBlocks.UMBRAL_PLANKS, CinderscapesBlocks.STRIPPED_UMBRAL_STEM, CinderscapesBlocks.UMBRAL_SLAB,
                CinderscapesBlocks.UMBRAL_FENCE, CinderscapesBlocks.UMBRAL_TRAPDOOR));
        return mats;
    }

    private List<Block> getLeaveTraverse()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(TraverseBlocks.FIR_LEAVES);
        mats.add(TraverseBlocks.RED_AUTUMNAL_LEAVES);
        mats.add(TraverseBlocks.BROWN_AUTUMNAL_LEAVES);
        mats.add(TraverseBlocks.ORANGE_AUTUMNAL_LEAVES);
        mats.add(TraverseBlocks.YELLOW_AUTUMNAL_LEAVES);
        return mats;
    }

    private List<McwWoodMat<Block>> getWoodTraverse()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(TraverseBlocks.FIR_LOG, TraverseBlocks.FIR_PLANKS, TraverseBlocks.STRIPPED_FIR_LOG, TraverseBlocks.FIR_SLAB,
                TraverseBlocks.FIR_FENCE, TraverseBlocks.FIR_TRAPDOOR));
        return mats;
    }
}