package fr.samlegamer.mcwbyg;

import fr.addonslib.api.data.ModType;
import fr.addonslib.api.recipes.material.McwStoneMat;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import potionstudios.byg.BYG;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static potionstudios.byg.common.block.BYGBlocks.*;

public class Recipes extends McwRecipes
{
    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer)
    {
        registerAllMcwWood(consumer, McwByg.MODID, BYG.MOD_ID, McwByg.WOOD, getWood());
        registerMcwHedge(consumer, McwByg.MODID, BYG.MOD_ID, McwByg.LEAVES, getLeaves());
        registerMcwStone(consumer, McwByg.MODID, BYG.MOD_ID, McwByg.bridges_rockable, getStoneBridges(), ModType.BRIDGES);
        registerMcwStone(consumer, McwByg.MODID, BYG.MOD_ID, McwByg.fences_rockable, getStoneFencesAndRoofs(), ModType.ROOFS, ModType.FENCES);
    }

    private static List<Block> getLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(ASPEN_LEAVES.get());
        mats.add(BAOBAB_LEAVES.get());
        mats.add(BLUE_ENCHANTED_LEAVES.get());
        mats.add(CIKA_LEAVES.get());
        mats.add(CYPRESS_LEAVES.get());
        mats.add(EBONY_LEAVES.get());
        mats.add(ETHER_LEAVES.get());
        mats.add(FIR_LEAVES.get());
        mats.add(GREEN_ENCHANTED_LEAVES.get());
        mats.add(HOLLY_LEAVES.get());
        mats.add(JACARANDA_LEAVES.get());
        mats.add(LAMENT_LEAVES.get());
        mats.add(MAHOGANY_LEAVES.get());
        mats.add(MAPLE_LEAVES.get());
        mats.add(PALM_LEAVES.get());
        mats.add(PINE_LEAVES.get());
        mats.add(RAINBOW_EUCALYPTUS_LEAVES.get());
        mats.add(REDWOOD_LEAVES.get());
        mats.add(SKYRIS_LEAVES.get());
        mats.add(MANGROVE_LEAVES.get());
        mats.add(WILLOW_LEAVES.get());
        mats.add(WITCH_HAZEL_LEAVES.get());
        mats.add(ZELKOVA_LEAVES.get());
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
        mats.add(new McwStoneMat<>(SCORIA_STONE.get(), SCORIA_STONEBRICK_WALL.get(), SCORIA_STONEBRICK_SLAB.get(), SCORIA_STONEBRICKS.get()));        return mats;
    }

    private static List<McwWoodMat<Block>> getWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(ASPEN_LOG.get(), ASPEN_PLANKS.get(), STRIPPED_ASPEN_LOG.get(), ASPEN_SLAB.get(), ASPEN_FENCE.get(), ASPEN_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(BAOBAB_LOG.get(), BAOBAB_PLANKS.get(), STRIPPED_BAOBAB_LOG.get(), BAOBAB_SLAB.get(), BAOBAB_FENCE.get(), BAOBAB_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(BLUE_ENCHANTED_LOG.get(), BLUE_ENCHANTED_PLANKS.get(), STRIPPED_BLUE_ENCHANTED_LOG.get(), BLUE_ENCHANTED_SLAB.get(), BLUE_ENCHANTED_FENCE.get(), BLUE_ENCHANTED_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(CHERRY_LOG.get(), CHERRY_PLANKS.get(), STRIPPED_CHERRY_LOG.get(), CHERRY_SLAB.get(), CHERRY_FENCE.get(), CHERRY_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(CIKA_LOG.get(), CIKA_PLANKS.get(), STRIPPED_CIKA_LOG.get(), CIKA_SLAB.get(), CIKA_FENCE.get(), CIKA_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(CYPRESS_LOG.get(), CYPRESS_PLANKS.get(), STRIPPED_CYPRESS_LOG.get(), CYPRESS_SLAB.get(), CYPRESS_FENCE.get(), CYPRESS_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(EBONY_LOG.get(), EBONY_PLANKS.get(), STRIPPED_EBONY_LOG.get(), EBONY_SLAB.get(), EBONY_FENCE.get(), EBONY_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(ETHER_LOG.get(), ETHER_PLANKS.get(), STRIPPED_ETHER_LOG.get(), ETHER_SLAB.get(), ETHER_FENCE.get(), ETHER_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(FIR_LOG.get(), FIR_PLANKS.get(), STRIPPED_FIR_LOG.get(), FIR_SLAB.get(), FIR_FENCE.get(), FIR_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(GREEN_ENCHANTED_LOG.get(), GREEN_ENCHANTED_PLANKS.get(), STRIPPED_GREEN_ENCHANTED_LOG.get(), GREEN_ENCHANTED_SLAB.get(), GREEN_ENCHANTED_FENCE.get(), GREEN_ENCHANTED_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(HOLLY_LOG.get(), HOLLY_PLANKS.get(), STRIPPED_HOLLY_LOG.get(), HOLLY_SLAB.get(), HOLLY_FENCE.get(), HOLLY_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(JACARANDA_LOG.get(), JACARANDA_PLANKS.get(), STRIPPED_JACARANDA_LOG.get(), JACARANDA_SLAB.get(), JACARANDA_FENCE.get(), JACARANDA_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(LAMENT_LOG.get(), LAMENT_PLANKS.get(), STRIPPED_LAMENT_LOG.get(), LAMENT_SLAB.get(), LAMENT_FENCE.get(), LAMENT_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(MAHOGANY_LOG.get(), MAHOGANY_PLANKS.get(), STRIPPED_MAHOGANY_LOG.get(), MAHOGANY_SLAB.get(), MAHOGANY_FENCE.get(), MAHOGANY_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(MANGROVE_LOG.get(), MANGROVE_PLANKS.get(), STRIPPED_MANGROVE_LOG.get(), MANGROVE_SLAB.get(), MANGROVE_FENCE.get(), MANGROVE_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(MAPLE_LOG.get(), MAPLE_PLANKS.get(), STRIPPED_MAPLE_LOG.get(), MAPLE_SLAB.get(), MAPLE_FENCE.get(), MAPLE_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(NIGHTSHADE_LOG.get(), NIGHTSHADE_PLANKS.get(), STRIPPED_NIGHTSHADE_LOG.get(), NIGHTSHADE_SLAB.get(), NIGHTSHADE_FENCE.get(), NIGHTSHADE_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(PALM_LOG.get(), PALM_PLANKS.get(), STRIPPED_PALM_LOG.get(), PALM_SLAB.get(), PALM_FENCE.get(), PALM_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(PINE_LOG.get(), PINE_PLANKS.get(), STRIPPED_PINE_LOG.get(), PINE_SLAB.get(), PINE_FENCE.get(), PINE_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(RAINBOW_EUCALYPTUS_LOG.get(), RAINBOW_EUCALYPTUS_PLANKS.get(), STRIPPED_RAINBOW_EUCALYPTUS_LOG.get(), RAINBOW_EUCALYPTUS_SLAB.get(), RAINBOW_EUCALYPTUS_FENCE.get(), RAINBOW_EUCALYPTUS_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(REDWOOD_LOG.get(), REDWOOD_PLANKS.get(), STRIPPED_REDWOOD_LOG.get(), REDWOOD_SLAB.get(), REDWOOD_FENCE.get(), REDWOOD_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(SKYRIS_LOG.get(), SKYRIS_PLANKS.get(), STRIPPED_SKYRIS_LOG.get(), SKYRIS_SLAB.get(), SKYRIS_FENCE.get(), SKYRIS_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(WILLOW_LOG.get(), WILLOW_PLANKS.get(), STRIPPED_WILLOW_LOG.get(), WILLOW_SLAB.get(), WILLOW_FENCE.get(), WILLOW_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(WITCH_HAZEL_LOG.get(), WITCH_HAZEL_PLANKS.get(), STRIPPED_WITCH_HAZEL_LOG.get(), WITCH_HAZEL_SLAB.get(), WITCH_HAZEL_FENCE.get(), WITCH_HAZEL_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(ZELKOVA_LOG.get(), ZELKOVA_PLANKS.get(), STRIPPED_ZELKOVA_LOG.get(), ZELKOVA_SLAB.get(), ZELKOVA_FENCE.get(), ZELKOVA_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(BULBIS_STEM.get(), BULBIS_PLANKS.get(), STRIPPED_BULBIS_LOG.get(), BULBIS_SLAB.get(), BULBIS_FENCE.get(), BULBIS_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(IMPARIUS_STEM.get(), IMPARIUS_PLANKS.get(), FUNGAL_IMPARIUS_STEM.get(), IMPARIUS_SLAB.get(), IMPARIUS_FENCE.get(), IMPARIUS_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(SYTHIAN_STEM.get(), SYTHIAN_PLANKS.get(), STRIPPED_SYTHIAN_STEM.get(), SYTHIAN_SLAB.get(), SYTHIAN_FENCE.get(), SYTHIAN_TRAPDOOR.get()));
        return mats;
    }
}
