package fr.samlegamer.mcwbyg;

import fr.addonslib.api.data.ModType;
import fr.addonslib.api.recipes.material.McwStoneMat;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Block;
import potionstudios.byg.BYG;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import static potionstudios.byg.common.block.BYGWoodTypes.*;
import static potionstudios.byg.common.block.BYGBlocks.*;

public class Recipes extends McwRecipes
{
    public Recipes(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> consumer) {
        registerAllMcwWood(consumer, McwByg.MODID, BYG.MOD_ID, McwByg.WOOD, getWood());
        registerMcwHedge(consumer, McwByg.MODID, BYG.MOD_ID, McwByg.LEAVES, getLeaves());
        registerMcwStone(consumer, McwByg.MODID, BYG.MOD_ID, McwByg.bridges_rockable, getStoneBridges(), ModType.BRIDGES);
        registerMcwStone(consumer, McwByg.MODID, BYG.MOD_ID, McwByg.fences_rockable, getStoneFencesAndRoofs(), ModType.ROOFS, ModType.FENCES);
    }

    private static List<Block> getLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(ASPEN.leaves().get());
        mats.add(BAOBAB.leaves().get());
        mats.add(BLUE_ENCHANTED.leaves().get());
        mats.add(CIKA.leaves().get());
        mats.add(CYPRESS.leaves().get());
        mats.add(EBONY.leaves().get());
        mats.add(ETHER.leaves().get());
        mats.add(FIR.leaves().get());
        mats.add(GREEN_ENCHANTED.leaves().get());
        mats.add(HOLLY.leaves().get());
        mats.add(JACARANDA.leaves().get());
        mats.add(LAMENT.leaves().get());
        mats.add(MAHOGANY.leaves().get());
        mats.add(MAPLE.leaves().get());
        mats.add(PALM.leaves().get());
        mats.add(PINE.leaves().get());
        mats.add(RAINBOW_EUCALYPTUS.leaves().get());
        mats.add(REDWOOD.leaves().get());
        mats.add(SKYRIS.leaves().get());
        mats.add(WHITE_MANGROVE.leaves().get());
        mats.add(WILLOW.leaves().get());
        mats.add(WITCH_HAZEL.leaves().get());
        mats.add(ZELKOVA.leaves().get());
        mats.add(BLUE_SPRUCE_LEAVES.get());
        mats.add(ORANGE_SPRUCE_LEAVES.get());
        mats.add(RED_SPRUCE_LEAVES.get());
        mats.add(YELLOW_SPRUCE_LEAVES.get());
        mats.add(BROWN_BIRCH_LEAVES.get());
        mats.add(ORANGE_BIRCH_LEAVES.get());
        mats.add(RED_BIRCH_LEAVES.get());
        mats.add(YELLOW_BIRCH_LEAVES.get());
        mats.add(BROWN_OAK_LEAVES.get());
        mats.add(ORANGE_OAK_LEAVES.get());
        mats.add(RED_OAK_LEAVES.get());
        mats.add(WHITE_CHERRY_LEAVES.get());
        mats.add(PINK_CHERRY_LEAVES.get());
        mats.add(ARAUCARIA_LEAVES.get());
        mats.add(BLOOMING_WITCH_HAZEL_LEAVES.get());
        mats.add(FLOWERING_INDIGO_JACARANDA_LEAVES.get());
        mats.add(FLOWERING_JACARANDA_LEAVES.get());
        mats.add(FLOWERING_ORCHARD_LEAVES.get());
        mats.add(FLOWERING_PALO_VERDE_LEAVES.get());
        mats.add(PALO_VERDE_LEAVES.get());
        return mats;
    }

    private static List<McwStoneMat<Block>> getStoneBridges()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        mats.add(new McwStoneMat<>(CRYPTIC_STONE.get(), CRYPTIC_STONE_WALL.get(), CRYPTIC_STONE_SLAB.get(), CRYPTIC_STONE.get()));
        mats.add(new McwStoneMat<>(DACITE_BRICKS.get(), DACITE_BRICK_WALL.get(), DACITE_BRICK_SLAB.get(), DACITE.get()));
        mats.add(new McwStoneMat<>(POLISHED_TRAVERTINE.get(), POLISHED_TRAVERTINE_WALL.get(), POLISHED_TRAVERTINE_SLAB.get(), TRAVERTINE.get()));
        mats.add(new McwStoneMat<>(PURPUR_STONE.get(), PURPUR_STONE_WALL.get(), PURPUR_STONE_SLAB.get(), PURPUR_STONE.get()));
        mats.add(new McwStoneMat<>(RED_ROCK_BRICKS.get(), RED_ROCK_BRICK_WALL.get(), RED_ROCK_BRICK_SLAB.get(), RED_ROCK_BRICKS.get()));
        mats.add(new McwStoneMat<>(SCORIA_STONEBRICKS.get(), SCORIA_STONEBRICK_WALL.get(), SCORIA_STONEBRICK_SLAB.get(), SCORIA_STONEBRICKS.get()));
        mats.add(new McwStoneMat<>(SOAPSTONE_BRICKS.get(), SOAPSTONE_BRICK_WALL.get(), SOAPSTONE_BRICK_SLAB.get(), SOAPSTONE_BRICKS.get()));
        return mats;
    }

    private static List<McwStoneMat<Block>> getStoneFencesAndRoofs()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        mats.add(new McwStoneMat<>(SOAPSTONE.get(), SOAPSTONE_WALL.get(), SOAPSTONE_SLAB.get(), POLISHED_SOAPSTONE.get()));
        mats.add(new McwStoneMat<>(TRAVERTINE.get(), TRAVERTINE_WALL.get(), TRAVERTINE_SLAB.get(), POLISHED_TRAVERTINE.get()));
        mats.add(new McwStoneMat<>(DACITE.get(), DACITE_WALL.get(), DACITE_SLAB.get(), DACITE_BRICKS.get()));
        mats.add(new McwStoneMat<>(RED_ROCK.get(), RED_ROCK_WALL.get(), RED_ROCK_SLAB.get(), RED_ROCK_BRICKS.get()));
        mats.add(new McwStoneMat<>(SCORIA_STONE.get(), SCORIA_STONEBRICK_WALL.get(), SCORIA_STONEBRICK_SLAB.get(), SCORIA_STONEBRICKS.get()));
        return mats;
    }

    private static List<McwWoodMat<Block>> getWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(ASPEN.log().get(), ASPEN.planks().get(), ASPEN.strippedLog().get(), ASPEN.slab().get(), ASPEN.fence().get(), ASPEN.trapdoor().get()));
        mats.add(new McwWoodMat<>(BAOBAB.log().get(), BAOBAB.planks().get(), BAOBAB.strippedLog().get(), BAOBAB.slab().get(), BAOBAB.fence().get(), BAOBAB.trapdoor().get()));
        mats.add(new McwWoodMat<>(BLUE_ENCHANTED.log().get(), BLUE_ENCHANTED.planks().get(), BLUE_ENCHANTED.strippedLog().get(), BLUE_ENCHANTED.slab().get(), BLUE_ENCHANTED.fence().get(), BLUE_ENCHANTED.trapdoor().get()));
        mats.add(new McwWoodMat<>(CHERRY.log().get(), CHERRY.planks().get(), CHERRY.strippedLog().get(), CHERRY.slab().get(), CHERRY.fence().get(), CHERRY.trapdoor().get()));
        mats.add(new McwWoodMat<>(CIKA.log().get(), CIKA.planks().get(), CIKA.strippedLog().get(), CIKA.slab().get(), CIKA.fence().get(), CIKA.trapdoor().get()));
        mats.add(new McwWoodMat<>(CYPRESS.log().get(), CYPRESS.planks().get(), CYPRESS.strippedLog().get(), CYPRESS.slab().get(), CYPRESS.fence().get(), CYPRESS.trapdoor().get()));
        mats.add(new McwWoodMat<>(EBONY.log().get(), EBONY.planks().get(), EBONY.strippedLog().get(), EBONY.slab().get(), EBONY.fence().get(), EBONY.trapdoor().get()));
        mats.add(new McwWoodMat<>(ETHER.log().get(), ETHER.planks().get(), ETHER.strippedLog().get(), ETHER.slab().get(), ETHER.fence().get(), ETHER.trapdoor().get()));
        mats.add(new McwWoodMat<>(FIR.log().get(), FIR.planks().get(), FIR.strippedLog().get(), FIR.slab().get(), FIR.fence().get(), FIR.trapdoor().get()));
        mats.add(new McwWoodMat<>(GREEN_ENCHANTED.log().get(), GREEN_ENCHANTED.planks().get(), GREEN_ENCHANTED.strippedLog().get(), GREEN_ENCHANTED.slab().get(), GREEN_ENCHANTED.fence().get(), GREEN_ENCHANTED.trapdoor().get()));
        mats.add(new McwWoodMat<>(HOLLY.log().get(), HOLLY.planks().get(), HOLLY.strippedLog().get(), HOLLY.slab().get(), HOLLY.fence().get(), HOLLY.trapdoor().get()));
        mats.add(new McwWoodMat<>(JACARANDA.log().get(), JACARANDA.planks().get(), JACARANDA.strippedLog().get(), JACARANDA.slab().get(), JACARANDA.fence().get(), JACARANDA.trapdoor().get()));
        mats.add(new McwWoodMat<>(LAMENT.log().get(), LAMENT.planks().get(), LAMENT.strippedLog().get(), LAMENT.slab().get(), LAMENT.fence().get(), LAMENT.trapdoor().get()));
        mats.add(new McwWoodMat<>(MAHOGANY.log().get(), MAHOGANY.planks().get(), MAHOGANY.strippedLog().get(), MAHOGANY.slab().get(), MAHOGANY.fence().get(), MAHOGANY.trapdoor().get()));
        mats.add(new McwWoodMat<>(WHITE_MANGROVE.log().get(), WHITE_MANGROVE.planks().get(), WHITE_MANGROVE.strippedLog().get(), WHITE_MANGROVE.slab().get(), WHITE_MANGROVE.fence().get(), WHITE_MANGROVE.trapdoor().get()));
        mats.add(new McwWoodMat<>(MAPLE.log().get(), MAPLE.planks().get(), MAPLE.strippedLog().get(), MAPLE.slab().get(), MAPLE.fence().get(), MAPLE.trapdoor().get()));
        mats.add(new McwWoodMat<>(NIGHTSHADE.log().get(), NIGHTSHADE.planks().get(), NIGHTSHADE.strippedLog().get(), NIGHTSHADE.slab().get(), NIGHTSHADE.fence().get(), NIGHTSHADE.trapdoor().get()));
        mats.add(new McwWoodMat<>(PALM.log().get(), PALM.planks().get(), PALM.strippedLog().get(), PALM.slab().get(), PALM.fence().get(), PALM.trapdoor().get()));
        mats.add(new McwWoodMat<>(PINE.log().get(), PINE.planks().get(), PINE.strippedLog().get(), PINE.slab().get(), PINE.fence().get(), PINE.trapdoor().get()));
        mats.add(new McwWoodMat<>(RAINBOW_EUCALYPTUS.log().get(), RAINBOW_EUCALYPTUS.planks().get(), RAINBOW_EUCALYPTUS.strippedLog().get(), RAINBOW_EUCALYPTUS.slab().get(), RAINBOW_EUCALYPTUS.fence().get(), RAINBOW_EUCALYPTUS.trapdoor().get()));
        mats.add(new McwWoodMat<>(REDWOOD.log().get(), REDWOOD.planks().get(), REDWOOD.strippedLog().get(), REDWOOD.slab().get(), REDWOOD.fence().get(), REDWOOD.trapdoor().get()));
        mats.add(new McwWoodMat<>(SKYRIS.log().get(), SKYRIS.planks().get(), SKYRIS.strippedLog().get(), SKYRIS.slab().get(), SKYRIS.fence().get(), SKYRIS.trapdoor().get()));
        mats.add(new McwWoodMat<>(WILLOW.log().get(), WILLOW.planks().get(), WILLOW.strippedLog().get(), WILLOW.slab().get(), WILLOW.fence().get(), WILLOW.trapdoor().get()));
        mats.add(new McwWoodMat<>(WITCH_HAZEL.log().get(), WITCH_HAZEL.planks().get(), WITCH_HAZEL.strippedLog().get(), WITCH_HAZEL.slab().get(), WITCH_HAZEL.fence().get(), WITCH_HAZEL.trapdoor().get()));
        mats.add(new McwWoodMat<>(ZELKOVA.log().get(), ZELKOVA.planks().get(), ZELKOVA.strippedLog().get(), ZELKOVA.slab().get(), ZELKOVA.fence().get(), ZELKOVA.trapdoor().get()));
        mats.add(new McwWoodMat<>(BULBIS.log().get(), BULBIS.planks().get(), BULBIS.strippedLog().get(), BULBIS.slab().get(), BULBIS.fence().get(), BULBIS.trapdoor().get()));
        mats.add(new McwWoodMat<>(IMPARIUS.log().get(), IMPARIUS.planks().get(), FUNGAL_IMPARIUS_STEM.get(), IMPARIUS.slab().get(), IMPARIUS.fence().get(), IMPARIUS.trapdoor().get()));
        mats.add(new McwWoodMat<>(SYTHIAN.log().get(), SYTHIAN.planks().get(), SYTHIAN.strippedLog().get(), SYTHIAN.slab().get(), SYTHIAN.fence().get(), SYTHIAN.trapdoor().get()));
        return mats;
    }
}