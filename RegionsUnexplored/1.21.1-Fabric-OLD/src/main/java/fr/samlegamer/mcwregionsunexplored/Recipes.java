package fr.samlegamer.mcwregionsunexplored;

import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.registry.RegistryWrapper;
import net.regions_unexplored.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import static net.regions_unexplored.block.RuBlocks.*;

public class Recipes extends McwRecipes
{
    public Recipes(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        registerAllMcwWood(recipeExporter, McwRegionsUnexplored.MODID, Constants.MOD_ID, McwRegionsUnexplored.WOOD, getWoodMat());
        registerMcwHedge(recipeExporter, McwRegionsUnexplored.MODID, Constants.MOD_ID, McwRegionsUnexplored.LEAVES, getLeavesMat());
    }

    private List<Block> getLeavesMat()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(BAOBAB_NATURAL_SET.getLeaves());
        mats.add(BLACKWOOD_NATURAL_SET.getLeaves());
        mats.add(CYPRESS_NATURAL_SET.getLeaves());
        mats.add(DEAD_NATURAL_SET.getLeaves());
        mats.add(EUCALYPTUS_NATURAL_SET.getLeaves());
        mats.add(LARCH_NATURAL_SET.getLeaves());
        mats.add(MAPLE_NATURAL_SET.getLeaves());
        mats.add(MAUVE_NATURAL_SET.getLeaves());
        mats.add(PALM_NATURAL_SET.getLeaves());
        mats.add(PINE_NATURAL_SET.getLeaves());
        mats.add(REDWOOD_NATURAL_SET.getLeaves());
        mats.add(WILLOW_NATURAL_SET.getLeaves());
        mats.add(ALPHA_NATURAL_SET.getLeaves());
        mats.add(RED_MAPLE_NATURAL_SET.getLeaves());
        mats.add(ORANGE_MAPLE_NATURAL_SET.getLeaves());
        mats.add(GOLDEN_LARCH_NATURAL_SET.getLeaves());
        mats.add(DEAD_PINE_NATURAL_SET.getLeaves());
        mats.add(SILVER_BIRCH_NATURAL_SET.getLeaves());
        mats.add(BAMBOO_NATURAL_SET.getLeaves());
        mats.add(SOCOTRA_NATURAL_SET.getLeaves());
        mats.add(KAPOK_NATURAL_SET.getLeaves());
        mats.add(ENCHANTED_BIRCH_NATURAL_SET.getLeaves());
        mats.add(BLUE_MAGNOLIA_NATURAL_SET.getLeaves());
        mats.add(MAGNOLIA_NATURAL_SET.getLeaves());
        mats.add(PINK_MAGNOLIA_NATURAL_SET.getLeaves());
        mats.add(WHITE_MAGNOLIA_NATURAL_SET.getLeaves());
        mats.add(BRIMWOOD_NATURAL_SET.getLeaves());
        return mats;
    }


    private List<McwWoodMat<Block>> getWoodMat()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(BAOBAB_WOOD_SET.getLog(), BAOBAB_WOOD_SET.getPlanks(), BAOBAB_WOOD_SET.getStrippedLog(), BAOBAB_WOOD_SET.getSlab(), BAOBAB_WOOD_SET.getFence(), BAOBAB_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(BLACKWOOD_WOOD_SET.getLog(), BLACKWOOD_WOOD_SET.getPlanks(), BLACKWOOD_WOOD_SET.getStrippedLog(), BLACKWOOD_WOOD_SET.getSlab(), BLACKWOOD_WOOD_SET.getFence(), BLACKWOOD_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(CYPRESS_WOOD_SET.getLog(), CYPRESS_WOOD_SET.getPlanks(), CYPRESS_WOOD_SET.getStrippedLog(), CYPRESS_WOOD_SET.getSlab(), CYPRESS_WOOD_SET.getFence(), CYPRESS_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(DEAD_WOOD_SET.getLog(), DEAD_WOOD_SET.getPlanks(), DEAD_WOOD_SET.getStrippedLog(), DEAD_WOOD_SET.getSlab(), DEAD_WOOD_SET.getFence(), DEAD_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(EUCALYPTUS_WOOD_SET.getLog(), EUCALYPTUS_WOOD_SET.getPlanks(), EUCALYPTUS_WOOD_SET.getStrippedLog(), EUCALYPTUS_WOOD_SET.getSlab(), EUCALYPTUS_WOOD_SET.getFence(), EUCALYPTUS_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(JOSHUA_WOOD_SET.getLog(), JOSHUA_WOOD_SET.getPlanks(), JOSHUA_WOOD_SET.getStrippedLog(), JOSHUA_WOOD_SET.getSlab(), JOSHUA_WOOD_SET.getFence(), JOSHUA_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(LARCH_WOOD_SET.getLog(), LARCH_WOOD_SET.getPlanks(), LARCH_WOOD_SET.getStrippedLog(), LARCH_WOOD_SET.getSlab(), LARCH_WOOD_SET.getFence(), LARCH_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(MAPLE_WOOD_SET.getLog(), MAPLE_WOOD_SET.getPlanks(), MAPLE_WOOD_SET.getStrippedLog(), MAPLE_WOOD_SET.getSlab(), MAPLE_WOOD_SET.getFence(), MAPLE_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(MAUVE_WOOD_SET.getLog(), MAUVE_WOOD_SET.getPlanks(), MAUVE_WOOD_SET.getStrippedLog(), MAUVE_WOOD_SET.getSlab(), MAUVE_WOOD_SET.getFence(), MAUVE_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(PALM_WOOD_SET.getLog(), PALM_WOOD_SET.getPlanks(), PALM_WOOD_SET.getStrippedLog(), PALM_WOOD_SET.getSlab(), PALM_WOOD_SET.getFence(), PALM_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(PINE_WOOD_SET.getLog(), PINE_WOOD_SET.getPlanks(), PINE_WOOD_SET.getStrippedLog(), PINE_WOOD_SET.getSlab(), PINE_WOOD_SET.getFence(), PINE_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(REDWOOD_WOOD_SET.getLog(), REDWOOD_WOOD_SET.getPlanks(), REDWOOD_WOOD_SET.getStrippedLog(), REDWOOD_WOOD_SET.getSlab(), REDWOOD_WOOD_SET.getFence(), REDWOOD_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(WILLOW_WOOD_SET.getLog(), WILLOW_WOOD_SET.getPlanks(), WILLOW_WOOD_SET.getStrippedLog(), WILLOW_WOOD_SET.getSlab(), WILLOW_WOOD_SET.getFence(), WILLOW_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(BRIMWOOD_WOOD_SET.getLog(), BRIMWOOD_WOOD_SET.getPlanks(), BRIMWOOD_WOOD_SET.getStrippedLog(), BRIMWOOD_WOOD_SET.getSlab(), BRIMWOOD_WOOD_SET.getFence(), BRIMWOOD_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(COBALT_WOOD_SET.getLog(), COBALT_WOOD_SET.getPlanks(), COBALT_WOOD_SET.getStrippedLog(), COBALT_WOOD_SET.getSlab(), COBALT_WOOD_SET.getFence(), COBALT_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(KAPOK_WOOD_SET.getLog(), KAPOK_WOOD_SET.getPlanks(), KAPOK_WOOD_SET.getStrippedLog(), KAPOK_WOOD_SET.getSlab(), KAPOK_WOOD_SET.getFence(), KAPOK_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(MAGNOLIA_WOOD_SET.getLog(), MAGNOLIA_WOOD_SET.getPlanks(), MAGNOLIA_WOOD_SET.getStrippedLog(), MAGNOLIA_WOOD_SET.getSlab(), MAGNOLIA_WOOD_SET.getFence(), MAGNOLIA_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(SOCOTRA_WOOD_SET.getLog(), SOCOTRA_WOOD_SET.getPlanks(), SOCOTRA_WOOD_SET.getStrippedLog(), SOCOTRA_WOOD_SET.getSlab(), SOCOTRA_WOOD_SET.getFence(), SOCOTRA_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(BLUE_BIOSHROOM_WOOD_SET.getLog(), BLUE_BIOSHROOM_WOOD_SET.getPlanks(), BLUE_BIOSHROOM_WOOD_SET.getStrippedLog(), BLUE_BIOSHROOM_WOOD_SET.getSlab(), BLUE_BIOSHROOM_WOOD_SET.getFence(), BLUE_BIOSHROOM_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(GREEN_BIOSHROOM_WOOD_SET.getLog(), GREEN_BIOSHROOM_WOOD_SET.getPlanks(), GREEN_BIOSHROOM_WOOD_SET.getStrippedLog(), GREEN_BIOSHROOM_WOOD_SET.getSlab(), GREEN_BIOSHROOM_WOOD_SET.getFence(), GREEN_BIOSHROOM_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(PINK_BIOSHROOM_WOOD_SET.getLog(), PINK_BIOSHROOM_WOOD_SET.getPlanks(), PINK_BIOSHROOM_WOOD_SET.getStrippedLog(), PINK_BIOSHROOM_WOOD_SET.getSlab(), PINK_BIOSHROOM_WOOD_SET.getFence(), PINK_BIOSHROOM_WOOD_SET.getTrapdoor()));
        mats.add(new McwWoodMat<>(YELLOW_BIOSHROOM_WOOD_SET.getLog(), YELLOW_BIOSHROOM_WOOD_SET.getPlanks(), YELLOW_BIOSHROOM_WOOD_SET.getStrippedLog(), YELLOW_BIOSHROOM_WOOD_SET.getSlab(), YELLOW_BIOSHROOM_WOOD_SET.getFence(), YELLOW_BIOSHROOM_WOOD_SET.getTrapdoor()));
        return mats;
    }
}
