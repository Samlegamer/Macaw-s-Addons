package fr.samlegamer.mcwbyg;

import fr.addonslib.api.recipes.material.McwStoneMat;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.registry.RegistryWrapper;
import net.potionstudios.biomeswevegone.BiomesWeveGone;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.potionstudios.biomeswevegone.world.level.block.BWGBlocks.*;
import static net.potionstudios.biomeswevegone.world.level.block.wood.BWGWood.*;

public class Recipes extends McwRecipes
{
    public Recipes(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                registerAllMcwWood(this, exporter, McwByg.MODID, BiomesWeveGone.MOD_ID, McwByg.WOOD, getWoodMat());
                registerMcwHedge(this, exporter, McwByg.MODID, BiomesWeveGone.MOD_ID, McwByg.LEAVES, getLeaveMat());
                registerAllMcwStone(this, exporter, McwByg.MODID, BiomesWeveGone.MOD_ID, McwByg.STONE, getStoneMat());
            }
        };
    }

    private List<Block> getLeaveMat()
    {
        List<Block> blocks = new ArrayList<>();
        blocks.add(ASPEN.leaves());
        blocks.add(BAOBAB.leaves());
        blocks.add(BLUE_ENCHANTED.leaves());
        blocks.add(CIKA.leaves());
        blocks.add(CYPRESS.leaves());
        blocks.add(EBONY.leaves());
        blocks.add(FIR.leaves());
        blocks.add(GREEN_ENCHANTED.leaves());
        blocks.add(HOLLY.leaves());
        blocks.add(IRONWOOD.leaves());
        blocks.add(JACARANDA.leaves());
        blocks.add(MAHOGANY.leaves());
        blocks.add(MAPLE.leaves());
        blocks.add(PALM.leaves());
        blocks.add(PINE.leaves());
        blocks.add(RAINBOW_EUCALYPTUS.leaves());
        blocks.add(REDWOOD.leaves());
        blocks.add(SKYRIS.leaves());
        blocks.add(WHITE_MANGROVE.leaves());
        blocks.add(WILLOW.leaves());
        blocks.add(WITCH_HAZEL.leaves());
        blocks.add(ZELKOVA.leaves());
        blocks.add(BLUE_SPRUCE_LEAVES.get());
        blocks.add(ORANGE_SPRUCE_LEAVES.get());
        blocks.add(RED_SPRUCE_LEAVES.get());
        blocks.add(YELLOW_SPRUCE_LEAVES.get());
        blocks.add(BROWN_BIRCH_LEAVES.get());
        blocks.add(ORANGE_BIRCH_LEAVES.get());
        blocks.add(RED_BIRCH_LEAVES.get());
        blocks.add(YELLOW_BIRCH_LEAVES.get());
        blocks.add(BROWN_OAK_LEAVES.get());
        blocks.add(ORANGE_OAK_LEAVES.get());
        blocks.add(RED_OAK_LEAVES.get());
        blocks.add(WHITE_SAKURA_LEAVES.get());
        blocks.add(YELLOW_SAKURA_LEAVES.get());
        blocks.add(RED_MAPLE_LEAVES.get());
        blocks.add(ARAUCARIA_LEAVES.get());
        blocks.add(BLOOMING_WITCH_HAZEL_LEAVES.get());
        blocks.add(FLOWERING_INDIGO_JACARANDA_LEAVES.get());
        blocks.add(FLOWERING_IRONWOOD_LEAVES.get());
        blocks.add(FLOWERING_JACARANDA_LEAVES.get());
        blocks.add(FLOWERING_ORCHARD_LEAVES.get());
        blocks.add(FLOWERING_PALO_VERDE_LEAVES.get());
        blocks.add(FLOWERING_SKYRIS_LEAVES.get());
        blocks.add(FLOWERING_YUCCA_LEAVES.get());
        return blocks;
    }

    private List<McwStoneMat<Block>> getStoneMat()
    {
        List<McwStoneMat<Block>> stoneMats = new ArrayList<>();
        stoneMats.add(new McwStoneMat<>(DACITE_BRICKS_SET.getBase(), DACITE_BRICKS_SET.getWall(), DACITE_BRICKS_SET.getSlab(), DACITE_BRICKS_SET.getBase()));
        stoneMats.add(new McwStoneMat<>(RED_ROCK_BRICKS_SET.getBase(), RED_ROCK_BRICKS_SET.getWall(), RED_ROCK_BRICKS_SET.getSlab(), RED_ROCK_BRICKS_SET.getBase()));
        stoneMats.add(new McwStoneMat<>(PINK_SAND_SET.getSandstone(), PINK_SAND_SET.getSandstoneWall(), PINK_SAND_SET.getSandstoneSlab(), PINK_SAND_SET.getSmoothSandstone()));
        stoneMats.add(new McwStoneMat<>(WHITE_SAND_SET.getSandstone(), WHITE_SAND_SET.getSandstoneWall(), WHITE_SAND_SET.getSandstoneSlab(), WHITE_SAND_SET.getSmoothSandstone()));
        stoneMats.add(new McwStoneMat<>(BLUE_SAND_SET.getSandstone(), BLUE_SAND_SET.getSandstoneWall(), BLUE_SAND_SET.getSandstoneSlab(), BLUE_SAND_SET.getSmoothSandstone()));
        stoneMats.add(new McwStoneMat<>(PURPLE_SAND_SET.getSandstone(), PURPLE_SAND_SET.getSandstoneWall(), PURPLE_SAND_SET.getSandstoneSlab(), PURPLE_SAND_SET.getSmoothSandstone()));
        stoneMats.add(new McwStoneMat<>(BLACK_SAND_SET.getSandstone(), BLACK_SAND_SET.getSandstoneWall(), BLACK_SAND_SET.getSandstoneSlab(), BLACK_SAND_SET.getSmoothSandstone()));
        stoneMats.add(new McwStoneMat<>(WINDSWEPT_SAND_SET.getSandstone(), WINDSWEPT_SAND_SET.getSandstoneWall(), WINDSWEPT_SAND_SET.getSandstoneSlab(), WINDSWEPT_SAND_SET.getSmoothSandstone()));
        return stoneMats;
    }

    private List<McwWoodMat<Block>> getWoodMat()
    {
        List<McwWoodMat<Block>> woodMats = new ArrayList<>();
        woodMats.add(new McwWoodMat<>(ASPEN.logstem(), ASPEN.planks(), ASPEN.strippedLogStem(), ASPEN.slab(), ASPEN.fence(), ASPEN.trapdoor()));
        woodMats.add(new McwWoodMat<>(BAOBAB.logstem(), BAOBAB.planks(), BAOBAB.strippedLogStem(), BAOBAB.slab(), BAOBAB.fence(), BAOBAB.trapdoor()));
        woodMats.add(new McwWoodMat<>(BLUE_ENCHANTED.logstem(), BLUE_ENCHANTED.planks(), BLUE_ENCHANTED.strippedLogStem(), BLUE_ENCHANTED.slab(), BLUE_ENCHANTED.fence(), BLUE_ENCHANTED.trapdoor()));
        woodMats.add(new McwWoodMat<>(CIKA.logstem(), CIKA.planks(), CIKA.strippedLogStem(), CIKA.slab(), CIKA.fence(), CIKA.trapdoor()));
        woodMats.add(new McwWoodMat<>(CYPRESS.logstem(), CYPRESS.planks(), CYPRESS.strippedLogStem(), CYPRESS.slab(), CYPRESS.fence(), CYPRESS.trapdoor()));
        woodMats.add(new McwWoodMat<>(EBONY.logstem(), EBONY.planks(), EBONY.strippedLogStem(), EBONY.slab(), EBONY.fence(), EBONY.trapdoor()));
        woodMats.add(new McwWoodMat<>(FIR.logstem(), FIR.planks(), FIR.strippedLogStem(), FIR.slab(), FIR.fence(), FIR.trapdoor()));
        woodMats.add(new McwWoodMat<>(GREEN_ENCHANTED.logstem(), GREEN_ENCHANTED.planks(), GREEN_ENCHANTED.strippedLogStem(), GREEN_ENCHANTED.slab(), GREEN_ENCHANTED.fence(), GREEN_ENCHANTED.trapdoor()));
        woodMats.add(new McwWoodMat<>(HOLLY.logstem(), HOLLY.planks(), HOLLY.strippedLogStem(), HOLLY.slab(), HOLLY.fence(), HOLLY.trapdoor()));
        woodMats.add(new McwWoodMat<>(IRONWOOD.logstem(), IRONWOOD.planks(), IRONWOOD.strippedLogStem(), IRONWOOD.slab(), IRONWOOD.fence(), IRONWOOD.trapdoor()));
        woodMats.add(new McwWoodMat<>(JACARANDA.logstem(), JACARANDA.planks(), JACARANDA.strippedLogStem(), JACARANDA.slab(), JACARANDA.fence(), JACARANDA.trapdoor()));
        woodMats.add(new McwWoodMat<>(MAHOGANY.logstem(), MAHOGANY.planks(), MAHOGANY.strippedLogStem(), MAHOGANY.slab(), MAHOGANY.fence(), MAHOGANY.trapdoor()));
        woodMats.add(new McwWoodMat<>(MAPLE.logstem(), MAPLE.planks(), MAPLE.strippedLogStem(), MAPLE.slab(), MAPLE.fence(), MAPLE.trapdoor()));
        woodMats.add(new McwWoodMat<>(PALM.logstem(), PALM.planks(), PALM.strippedLogStem(), PALM.slab(), PALM.fence(), PALM.trapdoor()));
        woodMats.add(new McwWoodMat<>(PINE.logstem(), PINE.planks(), PINE.strippedLogStem(), PINE.slab(), PINE.fence(), PINE.trapdoor()));
        woodMats.add(new McwWoodMat<>(RAINBOW_EUCALYPTUS.logstem(), RAINBOW_EUCALYPTUS.planks(), RAINBOW_EUCALYPTUS.strippedLogStem(), RAINBOW_EUCALYPTUS.slab(), RAINBOW_EUCALYPTUS.fence(), RAINBOW_EUCALYPTUS.trapdoor()));
        woodMats.add(new McwWoodMat<>(REDWOOD.logstem(), REDWOOD.planks(), REDWOOD.strippedLogStem(), REDWOOD.slab(), REDWOOD.fence(), REDWOOD.trapdoor()));
        woodMats.add(new McwWoodMat<>(SAKURA.logstem(), SAKURA.planks(), SAKURA.strippedLogStem(), SAKURA.slab(), SAKURA.fence(), SAKURA.trapdoor()));
        woodMats.add(new McwWoodMat<>(SKYRIS.logstem(), SKYRIS.planks(), SKYRIS.strippedLogStem(), SKYRIS.slab(), SKYRIS.fence(), SKYRIS.trapdoor()));
        woodMats.add(new McwWoodMat<>(WHITE_MANGROVE.logstem(), WHITE_MANGROVE.planks(), WHITE_MANGROVE.strippedLogStem(), WHITE_MANGROVE.slab(), WHITE_MANGROVE.fence(), WHITE_MANGROVE.trapdoor()));
        woodMats.add(new McwWoodMat<>(WILLOW.logstem(), WILLOW.planks(), WILLOW.strippedLogStem(), WILLOW.slab(), WILLOW.fence(), WILLOW.trapdoor()));
        woodMats.add(new McwWoodMat<>(WITCH_HAZEL.logstem(), WITCH_HAZEL.planks(), WITCH_HAZEL.strippedLogStem(), WITCH_HAZEL.slab(), WITCH_HAZEL.fence(), WITCH_HAZEL.trapdoor()));
        woodMats.add(new McwWoodMat<>(ZELKOVA.logstem(), ZELKOVA.planks(), ZELKOVA.strippedLogStem(), ZELKOVA.slab(), ZELKOVA.fence(), ZELKOVA.trapdoor()));
        woodMats.add(new McwWoodMat<>(FLORUS.logstem(), FLORUS.planks(), FLORUS.strippedLogStem(), FLORUS.slab(), FLORUS.fence(), FLORUS.trapdoor()));
        return woodMats;
    }

    @Override
    public String getName() {
        return McwByg.MODID + " Recipes";
    }
}
