package fr.samlegamer.mcwbetters;

import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.Finder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.betterx.betterend.BetterEnd;
import org.betterx.betternether.BetterNether;

import java.util.ArrayList;
import java.util.List;

public class Recipes
{
    public static List<Block> getBetterEndLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(makeIdBE("dragon_tree_leaves"));
        mats.add(makeIdBE("lacugrove_leaves"));
        mats.add(makeIdBE("lucernia_leaves"));
        mats.add(makeIdBE("pythadendron_leaves"));
        mats.add(makeIdBE("tenanea_leaves"));
        return mats;
    }

    public static List<McwWoodMat<Block>> getBetterEndWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(makeIdBE("dragon_tree_log"), makeIdBE("dragon_tree_planks"), makeIdBE("dragon_tree_stripped_log"),
                makeIdBE("dragon_tree_slab"), makeIdBE("dragon_tree_fence"),
                makeIdBE("dragon_tree_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBE("end_lotus_log"), makeIdBE("end_lotus_planks"), makeIdBE("end_lotus_stripped_log"),
                makeIdBE("end_lotus_slab"), makeIdBE("end_lotus_fence"),
                makeIdBE("end_lotus_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBE("helix_tree_log"), makeIdBE("helix_tree_planks"), makeIdBE("helix_tree_stripped_log"),
                makeIdBE("helix_tree_slab"), makeIdBE("helix_tree_fence"),
                makeIdBE("helix_tree_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBE("jellyshroom_log"), makeIdBE("jellyshroom_planks"), makeIdBE("jellyshroom_stripped_log"),
                makeIdBE("jellyshroom_slab"), makeIdBE("jellyshroom_fence"),
                makeIdBE("jellyshroom_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBE("lacugrove_log"), makeIdBE("lacugrove_planks"), makeIdBE("lacugrove_stripped_log"),
                makeIdBE("lacugrove_slab"), makeIdBE("lacugrove_fence"),
                makeIdBE("lacugrove_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBE("lucernia_log"), makeIdBE("lucernia_planks"), makeIdBE("lucernia_stripped_log"),
                makeIdBE("lucernia_slab"), makeIdBE("lucernia_fence"),
                makeIdBE("lucernia_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBE("mossy_glowshroom_log"), makeIdBE("mossy_glowshroom_planks"), makeIdBE("mossy_glowshroom_stripped_log"),
                makeIdBE("mossy_glowshroom_slab"), makeIdBE("mossy_glowshroom_fence"),
                makeIdBE("mossy_glowshroom_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBE("pythadendron_log"), makeIdBE("pythadendron_planks"), makeIdBE("pythadendron_stripped_log"),
                makeIdBE("pythadendron_slab"), makeIdBE("pythadendron_fence"),
                makeIdBE("pythadendron_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBE("tenanea_log"), makeIdBE("tenanea_planks"), makeIdBE("tenanea_stripped_log"),
                makeIdBE("tenanea_slab"), makeIdBE("tenanea_fence"),
                makeIdBE("tenanea_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBE("umbrella_tree_log"), makeIdBE("umbrella_tree_planks"), makeIdBE("umbrella_tree_stripped_log"),
                makeIdBE("umbrella_tree_slab"), makeIdBE("umbrella_tree_fence"),
                makeIdBE("umbrella_tree_trapdoor")));
        return mats;
    }

    private static Block makeIdBE(String name)
    {
        return Finder.findBlock(BetterEnd.MOD_ID, name);
    }

    public static List<Block> getBetterNetherLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(makeIdBN("nether_sakura_leaves"));
        mats.add(makeIdBN("rubeus_leaves"));
        mats.add(makeIdBN("willow_leaves"));
        return mats;
    }

    public static List<McwWoodMat<Block>> getBetterNetherWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(makeIdBN("anchor_tree_log"), makeIdBN("anchor_tree_planks"), makeIdBN("anchor_tree_stripped_log"),
                makeIdBN("anchor_tree_slab"), makeIdBN("anchor_tree_fence"), makeIdBN("anchor_tree_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBN("mushroom_fir_log"), makeIdBN("mushroom_fir_planks"), makeIdBN("mushroom_fir_stripped_log"),
                makeIdBN("mushroom_fir_slab"), makeIdBN("mushroom_fir_fence"),
                makeIdBN("mushroom_fir_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBN("nether_mushroom_stem"), makeIdBN("nether_mushroom_planks"), Blocks.MUSHROOM_STEM,
                makeIdBN("nether_mushroom_slab"), makeIdBN("nether_mushroom_fence"),
                makeIdBN("nether_mushroom_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBN("nether_sakura_log"), makeIdBN("nether_sakura_planks"), makeIdBN("nether_sakura_stripped_log"),
                makeIdBN("nether_sakura_slab"), makeIdBN("nether_sakura_fence"),
                makeIdBN("nether_sakura_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBN("rubeus_log"), makeIdBN("rubeus_planks"), makeIdBN("rubeus_stripped_log"),
                makeIdBN("rubeus_slab"), makeIdBN("rubeus_fence"),
                makeIdBN("rubeus_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBN("stalagnate_log"), makeIdBN("stalagnate_planks"), makeIdBN("stalagnate_stripped_log"),
                makeIdBN("stalagnate_slab"), makeIdBN("stalagnate_fence"),
                makeIdBN("stalagnate_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBN("wart_log"), makeIdBN("wart_planks"), makeIdBN("wart_stripped_log"),
                makeIdBN("wart_slab"), makeIdBN("wart_fence"),
                makeIdBN("wart_trapdoor")));
        mats.add(new McwWoodMat<>(makeIdBN("willow_log"), makeIdBN("willow_planks"), makeIdBN("willow_stripped_log"),
                makeIdBN("willow_slab"), makeIdBN("willow_fence"),
                makeIdBN("willow_trapdoor")));
        return mats;
    }

    private static Block makeIdBN(String name)
    {
        return Finder.findBlock(BetterNether.MOD_ID, name);
    }
}