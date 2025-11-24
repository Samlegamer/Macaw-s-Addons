package fr.samlegamer.mcwterraformersmc;

import static com.terraformersmc.cinderscapes.init.CinderscapesBlocks.*;
import static com.terraformersmc.terrestria.init.TerrestriaBlocks.*;
import static com.terraformersmc.traverse.block.TraverseBlocks.*;
import com.terraformersmc.cinderscapes.Cinderscapes;
import com.terraformersmc.terrestria.Terrestria;
import com.terraformersmc.traverse.Traverse;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import fr.samlegamer.addonslib.generation.recipes.mat.McwStoneMat;
import fr.samlegamer.addonslib.generation.recipes.mat.McwWoodMat;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(FabricDataOutput output) {
        super(output, McwTerraformersMC.MODID, "", "");
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> recipeExporter) {
        registerAllMcwWood(recipeExporter, McwTerraformersMC.MODID, Traverse.MOD_ID, McwTerraformersMC.WOODS_TRAVERSE, getWoodMatsTraverse());
        registerMcwHedge(recipeExporter, McwTerraformersMC.MODID, Traverse.MOD_ID, McwTerraformersMC.LEAVES_TRAVERSE, getLeavesMatsTraverse());

        registerAllMcwWood(recipeExporter, McwTerraformersMC.MODID, Cinderscapes.NAMESPACE, McwTerraformersMC.WOODS_CINDERSCAPES, getWoodMatsCinderscapes());
        registerAllMcwStone(recipeExporter, McwTerraformersMC.MODID, Cinderscapes.NAMESPACE, McwTerraformersMC.ROCKS_CINDERSCAPES, getRockMatsCinderscapes());

        registerAllMcwWood(recipeExporter, McwTerraformersMC.MODID, Terrestria.MOD_ID, McwTerraformersMC.WOODS_TERRESTRIA, getWoodMatsTerrestria());
        registerAllMcwStone(recipeExporter, McwTerraformersMC.MODID, Terrestria.MOD_ID, McwTerraformersMC.ROCKS_TERRESTRIA, getRockMatsTerrestria());
        registerMcwHedge(recipeExporter, McwTerraformersMC.MODID, Terrestria.MOD_ID, McwTerraformersMC.LEAVES_TERRESTRIA, getLeavesMatsTerrestria());
    }

    private List<Block> getLeavesMatsTerrestria()
    {
        List<Block> woodMats = new ArrayList<>();
        woodMats.add(REDWOOD.leaves);
        woodMats.add(HEMLOCK.leaves);
        woodMats.add(RUBBER.leaves);
        woodMats.add(CYPRESS.leaves);
        woodMats.add(WILLOW.leaves);
        woodMats.add(JAPANESE_MAPLE.leaves);
        woodMats.add(RAINBOW_EUCALYPTUS.leaves);
        woodMats.add(SAKURA.leaves);
        woodMats.add(YUCCA_PALM.leaves);
        woodMats.add(JAPANESE_MAPLE_SHRUB_LEAVES);
        woodMats.add(DARK_JAPANESE_MAPLE_LEAVES);
        woodMats.add(JUNGLE_PALM_LEAVES);
        return woodMats;
    }

    private List<McwStoneMat> getRockMatsTerrestria()
    {
        List<McwStoneMat> stoneMats = new ArrayList<>();
        stoneMats.add(new McwStoneMat(VOLCANIC_ROCK.bricks.full, VOLCANIC_ROCK.bricks.wall, VOLCANIC_ROCK.bricks.slab, VOLCANIC_ROCK.cobblestone.full));
        stoneMats.add(new McwStoneMat(VOLCANIC_ROCK.mossyBricks.full, VOLCANIC_ROCK.mossyBricks.wall, VOLCANIC_ROCK.mossyBricks.slab, VOLCANIC_ROCK.mossyCobblestone.full));
        return stoneMats;
    }

    private List<McwWoodMat> getWoodMatsTerrestria()
    {
        List<McwWoodMat> woodMats = new ArrayList<>();
        woodMats.add(new McwWoodMat(REDWOOD.log, REDWOOD.planks, REDWOOD.strippedLog, REDWOOD.slab, REDWOOD.fence, REDWOOD.trapdoor));
        woodMats.add(new McwWoodMat(HEMLOCK.log, HEMLOCK.planks, HEMLOCK.strippedLog, HEMLOCK.slab, HEMLOCK.fence, HEMLOCK.trapdoor));
        woodMats.add(new McwWoodMat(RUBBER.log, RUBBER.planks, RUBBER.strippedLog, RUBBER.slab, RUBBER.fence, RUBBER.trapdoor));
        woodMats.add(new McwWoodMat(CYPRESS.log, CYPRESS.planks, CYPRESS.strippedLog, CYPRESS.slab, CYPRESS.fence, CYPRESS.trapdoor));
        woodMats.add(new McwWoodMat(WILLOW.log, WILLOW.planks, WILLOW.strippedLog, WILLOW.slab, WILLOW.fence, WILLOW.trapdoor));
        woodMats.add(new McwWoodMat(JAPANESE_MAPLE.log, JAPANESE_MAPLE.planks, JAPANESE_MAPLE.strippedLog, JAPANESE_MAPLE.slab, JAPANESE_MAPLE.fence, JAPANESE_MAPLE.trapdoor));
        woodMats.add(new McwWoodMat(RAINBOW_EUCALYPTUS.log, RAINBOW_EUCALYPTUS.planks, RAINBOW_EUCALYPTUS.strippedLog, RAINBOW_EUCALYPTUS.slab, RAINBOW_EUCALYPTUS.fence, RAINBOW_EUCALYPTUS.trapdoor));
        woodMats.add(new McwWoodMat(SAKURA.log, SAKURA.planks, SAKURA.strippedLog, SAKURA.slab, SAKURA.fence, SAKURA.trapdoor));
        woodMats.add(new McwWoodMat(YUCCA_PALM.log, YUCCA_PALM.planks, YUCCA_PALM.strippedLog, YUCCA_PALM.slab, YUCCA_PALM.fence, YUCCA_PALM.trapdoor));
        return woodMats;
    }

    private List<McwStoneMat> getRockMatsCinderscapes()
    {
        List<McwStoneMat> stoneMats = new ArrayList<>();
        stoneMats.add(new McwStoneMat(SULFUR_QUARTZ_BRICKS, SULFUR_QUARTZ_PILLAR, SULFUR_QUARTZ_SLAB, SULFUR_QUARTZ_BLOCK));
        stoneMats.add(new McwStoneMat(ROSE_QUARTZ_BRICKS, ROSE_QUARTZ_PILLAR, ROSE_QUARTZ_SLAB, ROSE_QUARTZ_BLOCK));
        stoneMats.add(new McwStoneMat(SMOKY_QUARTZ_BRICKS, SMOKY_QUARTZ_PILLAR, SMOKY_QUARTZ_SLAB, SMOKY_QUARTZ_BLOCK));
        return stoneMats;
    }

    private List<McwWoodMat> getWoodMatsCinderscapes()
    {
        List<McwWoodMat> woodMats = new ArrayList<>();
        woodMats.add(new McwWoodMat(SCORCHED_STEM, SCORCHED_PLANKS, STRIPPED_SCORCHED_STEM, SCORCHED_SLAB, SCORCHED_FENCE, SCORCHED_TRAPDOOR));
        woodMats.add(new McwWoodMat(UMBRAL_STEM, UMBRAL_PLANKS, STRIPPED_UMBRAL_STEM, UMBRAL_SLAB, UMBRAL_FENCE, UMBRAL_TRAPDOOR));
        return woodMats;
    }

    private List<Block> getLeavesMatsTraverse()
    {
        List<Block> woodMats = new ArrayList<>();
        woodMats.add(FIR_LEAVES);
        woodMats.add(RED_AUTUMNAL_LEAVES);
        woodMats.add(BROWN_AUTUMNAL_LEAVES);
        woodMats.add(ORANGE_AUTUMNAL_LEAVES);
        woodMats.add(YELLOW_AUTUMNAL_LEAVES);
        return woodMats;
    }

    private List<McwWoodMat> getWoodMatsTraverse()
    {
        List<McwWoodMat> woodMats = new ArrayList<>();
        woodMats.add(new McwWoodMat(FIR_LOG, FIR_PLANKS, STRIPPED_FIR_LOG, FIR_SLAB, FIR_FENCE, FIR_TRAPDOOR));
        return woodMats;
    }

    @Override
    public String getName() {
        return McwTerraformersMC.MODID + " Recipes Generator";
    }
}