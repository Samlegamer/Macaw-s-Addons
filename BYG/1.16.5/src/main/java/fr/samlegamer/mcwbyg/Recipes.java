package fr.samlegamer.mcwbyg;

import corgiaoc.byg.BYG;
import fr.samlegamer.addonslib.data.ModType;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import fr.samlegamer.addonslib.generation.recipes.mat.McwStoneMat;
import fr.samlegamer.addonslib.generation.recipes.mat.McwWoodMat;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import static corgiaoc.byg.core.BYGBlocks.*;

public class Recipes extends McwRecipes
{
    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_, McwByg.MODID, "", BYG.MOD_ID);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer)
    {
        registerAllMcwWood(consumer, McwByg.MODID, BYG.MOD_ID, McwByg.WOOD, getWood());
        registerMcwHedge(consumer, McwByg.MODID, BYG.MOD_ID, McwByg.LEAVES, getLeaves());
        onRegisterMcwStone(ModType.BRIDGES, consumer, McwByg.MODID, BYG.MOD_ID, McwByg.bridges_rockable, getStoneBridges());
        onRegisterMcwStone(ModType.FENCES, consumer, McwByg.MODID, BYG.MOD_ID, McwByg.fences_rockable, getStoneFencesAndRoofs());
        onRegisterMcwStone(ModType.ROOFS, consumer, McwByg.MODID, BYG.MOD_ID, McwByg.fences_rockable, getStoneFencesAndRoofs());
    }

    private static List<Block> getLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(ASPEN_LEAVES);
        mats.add(BAOBAB_LEAVES);
        mats.add(BLUE_ENCHANTED_LEAVES);
        mats.add(CIKA_LEAVES);
        mats.add(CYPRESS_LEAVES);
        mats.add(EBONY_LEAVES);
        mats.add(ETHER_LEAVES);
        mats.add(FIR_LEAVES);
        mats.add(GREEN_ENCHANTED_LEAVES);
        mats.add(HOLLY_LEAVES);
        mats.add(JACARANDA_LEAVES);
        mats.add(LAMENT_LEAVES);
        mats.add(MAHOGANY_LEAVES);
        mats.add(MAPLE_LEAVES);
        mats.add(PALM_LEAVES);
        mats.add(PINE_LEAVES);
        mats.add(RAINBOW_EUCALYPTUS_LEAVES);
        mats.add(REDWOOD_LEAVES);
        mats.add(SKYRIS_LEAVES);
        mats.add(MANGROVE_LEAVES);
        mats.add(WILLOW_LEAVES);
        mats.add(WITCH_HAZEL_LEAVES);
        mats.add(ZELKOVA_LEAVES);
        mats.add(BLUE_SPRUCE_LEAVES);
        mats.add(ORANGE_SPRUCE_LEAVES);
        mats.add(RED_SPRUCE_LEAVES);
        mats.add(YELLOW_SPRUCE_LEAVES);
        mats.add(BROWN_BIRCH_LEAVES);
        mats.add(ORANGE_BIRCH_LEAVES);
        mats.add(RED_BIRCH_LEAVES);
        mats.add(YELLOW_BIRCH_LEAVES);
        mats.add(BROWN_OAK_LEAVES);
        mats.add(ORANGE_OAK_LEAVES);
        mats.add(RED_OAK_LEAVES);
        mats.add(WHITE_CHERRY_LEAVES);
        mats.add(PINK_CHERRY_LEAVES);
        mats.add(ARAUCARIA_LEAVES);
        mats.add(BLOOMING_WITCH_HAZEL_LEAVES);
        mats.add(FLOWERING_INDIGO_JACARANDA_LEAVES);
        mats.add(FLOWERING_JACARANDA_LEAVES);
        mats.add(FLOWERING_ORCHARD_LEAVES);
        mats.add(FLOWERING_PALO_VERDE_LEAVES);
        mats.add(PALO_VERDE_LEAVES);
        return mats;
    }

    private static List<McwStoneMat> getStoneBridges()
    {
        List<McwStoneMat> mats = new ArrayList<>();
        mats.add(new McwStoneMat(CRYPTIC_STONE, CRYPTIC_STONE_WALL, CRYPTIC_STONE_SLAB, CRYPTIC_STONE));
        mats.add(new McwStoneMat(DACITE_BRICKS, DACITE_BRICK_WALL, DACITE_BRICK_SLAB, DACITE));
        mats.add(new McwStoneMat(POLISHED_TRAVERTINE, POLISHED_TRAVERTINE_WALL, POLISHED_TRAVERTINE_SLAB, TRAVERTINE));
        mats.add(new McwStoneMat(PURPUR_STONE, PURPUR_STONE_WALL, PURPUR_STONE_SLAB, PURPUR_STONE));
        mats.add(new McwStoneMat(RED_ROCK_BRICKS, RED_ROCK_BRICK_WALL, RED_ROCK_BRICK_SLAB, RED_ROCK_BRICKS));
        mats.add(new McwStoneMat(SCORIA_STONEBRICKS, SCORIA_STONEBRICK_WALL, SCORIA_STONEBRICK_SLAB, SCORIA_STONEBRICKS));
        mats.add(new McwStoneMat(SOAPSTONE_BRICKS, SOAPSTONE_BRICK_WALL, SOAPSTONE_BRICK_SLAB, SOAPSTONE_BRICKS));
        return mats;
    }

    private static List<McwStoneMat> getStoneFencesAndRoofs()
    {
        List<McwStoneMat> mats = new ArrayList<>();
        mats.add(new McwStoneMat(SOAPSTONE, SOAPSTONE_WALL, SOAPSTONE_SLAB, POLISHED_SOAPSTONE));
        mats.add(new McwStoneMat(TRAVERTINE, TRAVERTINE_WALL, TRAVERTINE_SLAB, POLISHED_TRAVERTINE));
        mats.add(new McwStoneMat(DACITE, DACITE_WALL, DACITE_SLAB, DACITE_BRICKS));
        mats.add(new McwStoneMat(RED_ROCK, RED_ROCK_WALL, RED_ROCK_SLAB, RED_ROCK_BRICKS));
        mats.add(new McwStoneMat(SCORIA_STONE, SCORIA_STONEBRICK_WALL, SCORIA_STONEBRICK_SLAB, SCORIA_STONEBRICKS));
        return mats;
    }

    private static List<McwWoodMat> getWood()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(ASPEN_LOG, ASPEN_PLANKS, STRIPPED_ASPEN_LOG, ASPEN_SLAB, ASPEN_FENCE, ASPEN_TRAPDOOR));
        mats.add(new McwWoodMat(BAOBAB_LOG, BAOBAB_PLANKS, STRIPPED_BAOBAB_LOG, BAOBAB_SLAB, BAOBAB_FENCE, BAOBAB_TRAPDOOR));
        mats.add(new McwWoodMat(BLUE_ENCHANTED_LOG, BLUE_ENCHANTED_PLANKS, STRIPPED_BLUE_ENCHANTED_LOG, BLUE_ENCHANTED_SLAB, BLUE_ENCHANTED_FENCE, BLUE_ENCHANTED_TRAPDOOR));
        mats.add(new McwWoodMat(CHERRY_LOG, CHERRY_PLANKS, STRIPPED_CHERRY_LOG, CHERRY_SLAB, CHERRY_FENCE, CHERRY_TRAPDOOR));
        mats.add(new McwWoodMat(CIKA_LOG, CIKA_PLANKS, STRIPPED_CIKA_LOG, CIKA_SLAB, CIKA_FENCE, CIKA_TRAPDOOR));
        mats.add(new McwWoodMat(CYPRESS_LOG, CYPRESS_PLANKS, STRIPPED_CYPRESS_LOG, CYPRESS_SLAB, CYPRESS_FENCE, CYPRESS_TRAPDOOR));
        mats.add(new McwWoodMat(EBONY_LOG, EBONY_PLANKS, STRIPPED_EBONY_LOG, EBONY_SLAB, EBONY_FENCE, EBONY_TRAPDOOR));
        mats.add(new McwWoodMat(ETHER_LOG, ETHER_PLANKS, STRIPPED_ETHER_LOG, ETHER_SLAB, ETHER_FENCE, ETHER_TRAPDOOR));
        mats.add(new McwWoodMat(FIR_LOG, FIR_PLANKS, STRIPPED_FIR_LOG, FIR_SLAB, FIR_FENCE, FIR_TRAPDOOR));
        mats.add(new McwWoodMat(GREEN_ENCHANTED_LOG, GREEN_ENCHANTED_PLANKS, STRIPPED_GREEN_ENCHANTED_LOG, GREEN_ENCHANTED_SLAB, GREEN_ENCHANTED_FENCE, GREEN_ENCHANTED_TRAPDOOR));
        mats.add(new McwWoodMat(HOLLY_LOG, HOLLY_PLANKS, STRIPPED_HOLLY_LOG, HOLLY_SLAB, HOLLY_FENCE, HOLLY_TRAPDOOR));
        mats.add(new McwWoodMat(JACARANDA_LOG, JACARANDA_PLANKS, STRIPPED_JACARANDA_LOG, JACARANDA_SLAB, JACARANDA_FENCE, JACARANDA_TRAPDOOR));
        mats.add(new McwWoodMat(LAMENT_LOG, LAMENT_PLANKS, STRIPPED_LAMENT_LOG, LAMENT_SLAB, LAMENT_FENCE, LAMENT_TRAPDOOR));
        mats.add(new McwWoodMat(MAHOGANY_LOG, MAHOGANY_PLANKS, STRIPPED_MAHOGANY_LOG, MAHOGANY_SLAB, MAHOGANY_FENCE, MAHOGANY_TRAPDOOR));
        mats.add(new McwWoodMat(MANGROVE_LOG, MANGROVE_PLANKS, STRIPPED_MANGROVE_LOG, MANGROVE_SLAB, MANGROVE_FENCE, MANGROVE_TRAPDOOR));
        mats.add(new McwWoodMat(MAPLE_LOG, MAPLE_PLANKS, STRIPPED_MAPLE_LOG, MAPLE_SLAB, MAPLE_FENCE, MAPLE_TRAPDOOR));
        mats.add(new McwWoodMat(NIGHTSHADE_LOG, NIGHTSHADE_PLANKS, STRIPPED_NIGHTSHADE_LOG, NIGHTSHADE_SLAB, NIGHTSHADE_FENCE, NIGHTSHADE_TRAPDOOR));
        mats.add(new McwWoodMat(PALM_LOG, PALM_PLANKS, STRIPPED_PALM_LOG, PALM_SLAB, PALM_FENCE, PALM_TRAPDOOR));
        mats.add(new McwWoodMat(PINE_LOG, PINE_PLANKS, STRIPPED_PINE_LOG, PINE_SLAB, PINE_FENCE, PINE_TRAPDOOR));
        mats.add(new McwWoodMat(RAINBOW_EUCALYPTUS_LOG, RAINBOW_EUCALYPTUS_PLANKS, STRIPPED_RAINBOW_EUCALYPTUS_LOG, RAINBOW_EUCALYPTUS_SLAB, RAINBOW_EUCALYPTUS_FENCE, RAINBOW_EUCALYPTUS_TRAPDOOR));
        mats.add(new McwWoodMat(REDWOOD_LOG, REDWOOD_PLANKS, STRIPPED_REDWOOD_LOG, REDWOOD_SLAB, REDWOOD_FENCE, REDWOOD_TRAPDOOR));
        mats.add(new McwWoodMat(SKYRIS_LOG, SKYRIS_PLANKS, STRIPPED_SKYRIS_LOG, SKYRIS_SLAB, SKYRIS_FENCE, SKYRIS_TRAPDOOR));
        mats.add(new McwWoodMat(WILLOW_LOG, WILLOW_PLANKS, STRIPPED_WILLOW_LOG, WILLOW_SLAB, WILLOW_FENCE, WILLOW_TRAPDOOR));
        mats.add(new McwWoodMat(WITCH_HAZEL_LOG, WITCH_HAZEL_PLANKS, STRIPPED_WITCH_HAZEL_LOG, WITCH_HAZEL_SLAB, WITCH_HAZEL_FENCE, WITCH_HAZEL_TRAPDOOR));
        mats.add(new McwWoodMat(ZELKOVA_LOG, ZELKOVA_PLANKS, STRIPPED_ZELKOVA_LOG, ZELKOVA_SLAB, ZELKOVA_FENCE, ZELKOVA_TRAPDOOR));
        mats.add(new McwWoodMat(BULBIS_STEM, BULBIS_PLANKS, STRIPPED_BULBIS_LOG, BULBIS_SLAB, BULBIS_FENCE, BULBIS_TRAPDOOR));
        mats.add(new McwWoodMat(IMPARIUS_STEM, IMPARIUS_PLANKS, FUNGAL_IMPARIUS_STEM, IMPARIUS_SLAB, IMPARIUS_FENCE, IMPARIUS_TRAPDOOR));
        mats.add(new McwWoodMat(SYTHIAN_STEM, SYTHIAN_PLANKS, STRIPPED_SYTHIAN_STEM, SYTHIAN_SLAB, SYTHIAN_FENCE, SYTHIAN_TRAPDOOR));
        return mats;
    }
}
