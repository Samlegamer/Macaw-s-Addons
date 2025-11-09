package fr.samlegamer.mcwterraformersmc;

import com.terraformersmc.traverse.Traverse;
import static com.terraformersmc.traverse.block.TraverseBlocks.*;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import fr.samlegamer.addonslib.generation.recipes.mat.McwWoodMat;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.registry.RegistryWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Recipes extends FabricRecipeProvider
{
    public Recipes(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

//    public static final List<String> WOODS_CINDERSCAPES = List.of("scorched", "umbral");
//    public static final List<String> WOODS_TERRESTRIA = List.of("redwood", "hemlock", "rubber", "cypress", "willow",
//            "japanese_maple", "rainbow_eucalyptus", "sakura", "yucca_palm");
//
//    public static final List<String> ROCKS_CINDERSCAPES = List.of("sulfur_quartz_bricks", "rose_quartz_bricks", "smoky_quartz_bricks");
//    public static final List<String> ROCKS_TERRESTRIA = List.of("basalt_bricks", "mossy_basalt_bricks");
//
//    public static final List<String> LEAVES_TRAVERSE = List.of("fir", "red_autumnal", "brown_autumnal", "orange_autumnal", "yellow_autumnal");
//    public static final List<String> LEAVES_TERRESTRIA = List.of("redwood", "hemlock", "rubber", "cypress", "willow", "japanese_maple",
//            "rainbow_eucalyptus", "sakura", "yucca_palm", "japanese_maple_shrub", "dark_japanese_maple", "jungle_palm");

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
//                List<Block> leave = List.of(DEAD_LEAVES, FIR_LEAVES, HELLBARK_LEAVES, JACARANDA_LEAVES, MAGIC_LEAVES, MAHOGANY_LEAVES,
//                        PALM_LEAVES, REDWOOD_LEAVES, UMBRAN_LEAVES, WILLOW_LEAVES, EMPYREAL_LEAVES, PINE_LEAVES, ORANGE_MAPLE_LEAVES,
//                        RED_MAPLE_LEAVES, YELLOW_MAPLE_LEAVES, CYPRESS_LEAVES, SNOWBLOSSOM_LEAVES, FLOWERING_OAK_LEAVES, ORIGIN_OAK_LEAVES);

//                List<McwWoodMat> woodMats = getWoodMats();
                McwRecipes.registerAllMcwWood(this, recipeExporter, McwTerraformersMC.MODID, Traverse.MOD_ID, McwTerraformersMC.WOODS_TRAVERSE, getWoodMatsTraverse());
                McwRecipes.registerMcwHedge(this, recipeExporter, McwTerraformersMC.MODID, Traverse.MOD_ID, McwTerraformersMC.LEAVES_TRAVERSE, getLeavesMatsTraverse());


            }
        };
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


    private List<McwWoodMat> getWoodMats()
    {
        List<McwWoodMat> woodMats = new ArrayList<>();
//        woodMats.add(new McwWoodMat(DEAD_LOG, DEAD_PLANKS, STRIPPED_DEAD_LOG, DEAD_SLAB, DEAD_FENCE, DEAD_TRAPDOOR));
//        woodMats.add(new McwWoodMat(FIR_LOG, FIR_PLANKS, STRIPPED_FIR_LOG, FIR_SLAB, FIR_FENCE, FIR_TRAPDOOR));
//        woodMats.add(new McwWoodMat(HELLBARK_LOG, HELLBARK_PLANKS, STRIPPED_HELLBARK_LOG, HELLBARK_SLAB, HELLBARK_FENCE, HELLBARK_TRAPDOOR));
//        woodMats.add(new McwWoodMat(JACARANDA_LOG, JACARANDA_PLANKS, STRIPPED_JACARANDA_LOG, JACARANDA_SLAB, JACARANDA_FENCE, JACARANDA_TRAPDOOR));
//        woodMats.add(new McwWoodMat(MAGIC_LOG, MAGIC_PLANKS, STRIPPED_MAGIC_LOG, MAGIC_SLAB, MAGIC_FENCE, MAGIC_TRAPDOOR));
//        woodMats.add(new McwWoodMat(MAHOGANY_LOG, MAHOGANY_PLANKS, STRIPPED_MAHOGANY_LOG, MAHOGANY_SLAB, MAHOGANY_FENCE, MAHOGANY_TRAPDOOR));
//        woodMats.add(new McwWoodMat(PALM_LOG, PALM_PLANKS, STRIPPED_PALM_LOG, PALM_SLAB, PALM_FENCE, PALM_TRAPDOOR));
//        woodMats.add(new McwWoodMat(REDWOOD_LOG, REDWOOD_PLANKS, STRIPPED_REDWOOD_LOG, REDWOOD_SLAB, REDWOOD_FENCE, REDWOOD_TRAPDOOR));
//        woodMats.add(new McwWoodMat(UMBRAN_LOG, UMBRAN_PLANKS, STRIPPED_UMBRAN_LOG, UMBRAN_SLAB, UMBRAN_FENCE, UMBRAN_TRAPDOOR));
//        woodMats.add(new McwWoodMat(WILLOW_LOG, WILLOW_PLANKS, STRIPPED_WILLOW_LOG, WILLOW_SLAB, WILLOW_FENCE, WILLOW_TRAPDOOR));
//        woodMats.add(new McwWoodMat(EMPYREAL_LOG, EMPYREAL_PLANKS, STRIPPED_EMPYREAL_LOG, EMPYREAL_SLAB, EMPYREAL_FENCE, EMPYREAL_TRAPDOOR));
//        woodMats.add(new McwWoodMat(MAPLE_LOG, MAPLE_PLANKS, STRIPPED_MAPLE_LOG, MAPLE_SLAB, MAPLE_FENCE, MAPLE_TRAPDOOR));
//        woodMats.add(new McwWoodMat(PINE_LOG, PINE_PLANKS, STRIPPED_PINE_LOG, PINE_SLAB, PINE_FENCE, PINE_TRAPDOOR));
        return woodMats;
    }

    @Override
    public String getName() {
        return McwTerraformersMC.MODID + " Recipes Generator";
    }
}