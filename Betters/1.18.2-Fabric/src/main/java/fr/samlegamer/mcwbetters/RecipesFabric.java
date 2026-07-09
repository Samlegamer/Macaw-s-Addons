package fr.samlegamer.mcwbetters;

import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import paulevs.betternether.BetterNether;
import ru.betterend.BetterEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static paulevs.betternether.registry.NetherBlocks.*;
import static ru.betterend.registry.EndBlocks.*;

public class RecipesFabric extends McwRecipes
{
    public RecipesFabric(FabricDataGenerator output) {
        super(output);
    }

    protected void generateRecipes(Consumer<RecipeJsonProvider> consumer) {
        recipesUtils.registerAllMcwWood(consumer, McwBettersFabric.MODID, BetterEnd.MOD_ID, McwBettersFabric.WOOD_BETTER_END, getBetterEndWood());
        recipesUtils.registerMcwHedge(consumer, McwBettersFabric.MODID, BetterEnd.MOD_ID, McwBettersFabric.LEAVE_BETTER_END, getBetterEndLeaves());
        recipesUtils.registerAllMcwWood(consumer, McwBettersFabric.MODID, BetterNether.MOD_ID, McwBettersFabric.WOOD_BETTER_NETHER, getBetterNetherWood());
        recipesUtils.registerMcwHedge(consumer, McwBettersFabric.MODID, BetterNether.MOD_ID, McwBettersFabric.LEAVE_BETTER_NETHER, getBetterNetherLeaves());
    }

    private List<Block> getBetterEndLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(DRAGON_TREE_LEAVES);
        mats.add(LACUGROVE_LEAVES);
        mats.add(LUCERNIA_LEAVES);
        mats.add(PYTHADENDRON_LEAVES);
        mats.add(TENANEA_LEAVES);
        return mats;
    }

    private List<Block> getBetterNetherLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(NETHER_SAKURA_LEAVES);
        mats.add(RUBEUS_LEAVES);
        mats.add(WILLOW_LEAVES);
        return mats;
    }

    private List<McwWoodMat<Block>> getBetterEndWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(DRAGON_TREE.getLog(), Finder.findBlock(BetterEnd.MOD_ID, "dragon_tree_planks"), Finder.findBlock(BetterEnd.MOD_ID, "dragon_tree_stripped_log"),
                Finder.findBlock(BetterEnd.MOD_ID, "dragon_tree_slab"), Finder.findBlock(BetterEnd.MOD_ID, "dragon_tree_fence"),
                Finder.findBlock(BetterEnd.MOD_ID, "dragon_tree_trapdoor")));
        mats.add(new McwWoodMat<>(END_LOTUS.getLog(), Finder.findBlock(BetterEnd.MOD_ID, "end_lotus_planks"), Finder.findBlock(BetterEnd.MOD_ID, "end_lotus_stripped_log"),
                Finder.findBlock(BetterEnd.MOD_ID, "end_lotus_slab"), Finder.findBlock(BetterEnd.MOD_ID, "end_lotus_fence"),
                Finder.findBlock(BetterEnd.MOD_ID, "end_lotus_trapdoor")));
        mats.add(new McwWoodMat<>(HELIX_TREE.getLog(), Finder.findBlock(BetterEnd.MOD_ID, "helix_tree_planks"), Finder.findBlock(BetterEnd.MOD_ID, "helix_tree_stripped_log"),
                Finder.findBlock(BetterEnd.MOD_ID, "helix_tree_slab"), Finder.findBlock(BetterEnd.MOD_ID, "helix_tree_fence"),
                Finder.findBlock(BetterEnd.MOD_ID, "helix_tree_trapdoor")));
        mats.add(new McwWoodMat<>(JELLYSHROOM.getLog(), Finder.findBlock(BetterEnd.MOD_ID, "jellyshroom_planks"), Finder.findBlock(BetterEnd.MOD_ID, "jellyshroom_stripped_log"),
                Finder.findBlock(BetterEnd.MOD_ID, "jellyshroom_slab"), Finder.findBlock(BetterEnd.MOD_ID, "jellyshroom_fence"),
                Finder.findBlock(BetterEnd.MOD_ID, "jellyshroom_trapdoor")));
        mats.add(new McwWoodMat<>(LACUGROVE.getLog(), Finder.findBlock(BetterEnd.MOD_ID, "lacugrove_planks"), Finder.findBlock(BetterEnd.MOD_ID, "lacugrove_stripped_log"),
                Finder.findBlock(BetterEnd.MOD_ID, "lacugrove_slab"), Finder.findBlock(BetterEnd.MOD_ID, "lacugrove_fence"),
                Finder.findBlock(BetterEnd.MOD_ID, "lacugrove_trapdoor")));
        mats.add(new McwWoodMat<>(LUCERNIA.getLog(), Finder.findBlock(BetterEnd.MOD_ID, "lucernia_planks"), Finder.findBlock(BetterEnd.MOD_ID, "lucernia_stripped_log"),
                Finder.findBlock(BetterEnd.MOD_ID, "lucernia_slab"), Finder.findBlock(BetterEnd.MOD_ID, "lucernia_fence"),
                Finder.findBlock(BetterEnd.MOD_ID, "lucernia_trapdoor")));
        mats.add(new McwWoodMat<>(MOSSY_GLOWSHROOM.getLog(), Finder.findBlock(BetterEnd.MOD_ID, "mossy_glowshroom_planks"), Finder.findBlock(BetterEnd.MOD_ID, "mossy_glowshroom_stripped_log"),
                Finder.findBlock(BetterEnd.MOD_ID, "mossy_glowshroom_slab"), Finder.findBlock(BetterEnd.MOD_ID, "mossy_glowshroom_fence"),
                Finder.findBlock(BetterEnd.MOD_ID, "mossy_glowshroom_trapdoor")));
        mats.add(new McwWoodMat<>(PYTHADENDRON.getLog(), Finder.findBlock(BetterEnd.MOD_ID, "pythadendron_planks"), Finder.findBlock(BetterEnd.MOD_ID, "pythadendron_stripped_log"),
                Finder.findBlock(BetterEnd.MOD_ID, "pythadendron_slab"), Finder.findBlock(BetterEnd.MOD_ID, "pythadendron_fence"),
                Finder.findBlock(BetterEnd.MOD_ID, "pythadendron_trapdoor")));
        mats.add(new McwWoodMat<>(TENANEA.getLog(), Finder.findBlock(BetterEnd.MOD_ID, "tenanea_planks"), Finder.findBlock(BetterEnd.MOD_ID, "tenanea_stripped_log"),
                Finder.findBlock(BetterEnd.MOD_ID, "tenanea_slab"), Finder.findBlock(BetterEnd.MOD_ID, "tenanea_fence"),
                Finder.findBlock(BetterEnd.MOD_ID, "tenanea_trapdoor")));
        mats.add(new McwWoodMat<>(UMBRELLA_TREE.getLog(), Finder.findBlock(BetterEnd.MOD_ID, "umbrella_tree_planks"), Finder.findBlock(BetterEnd.MOD_ID, "umbrella_tree_stripped_log"),
                Finder.findBlock(BetterEnd.MOD_ID, "umbrella_tree_slab"), Finder.findBlock(BetterEnd.MOD_ID, "umbrella_tree_fence"),
                Finder.findBlock(BetterEnd.MOD_ID, "umbrella_tree_trapdoor")));
        return mats;
    }

    private List<McwWoodMat<Block>> getBetterNetherWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(MAT_ANCHOR_TREE.getLog(), MAT_ANCHOR_TREE.getPlanks(), MAT_ANCHOR_TREE.getStrippedLog(), MAT_ANCHOR_TREE.getSlab(),
                Finder.findBlock(BetterNether.MOD_ID, "anchor_tree_fence"), Finder.findBlock(BetterNether.MOD_ID, "anchor_tree_trapdoor")));
        mats.add(new McwWoodMat<>(MAT_MUSHROOM_FIR.getLog(), Finder.findBlock(BetterNether.MOD_ID, "mushroom_fir_planks"), Finder.findBlock(BetterNether.MOD_ID, "mushroom_fir_stripped_log"),
                Finder.findBlock(BetterNether.MOD_ID, "mushroom_fir_slab"), Finder.findBlock(BetterNether.MOD_ID, "mushroom_fir_fence"),
                Finder.findBlock(BetterNether.MOD_ID, "mushroom_fir_trapdoor")));
        mats.add(new McwWoodMat<>(Finder.findBlock(BetterNether.MOD_ID, "nether_mushroom_stem"), Finder.findBlock(BetterNether.MOD_ID, "nether_mushroom_planks"), Blocks.MUSHROOM_STEM,
                Finder.findBlock(BetterNether.MOD_ID, "nether_mushroom_slab"), Finder.findBlock(BetterNether.MOD_ID, "nether_mushroom_fence"),
                Finder.findBlock(BetterNether.MOD_ID, "nether_mushroom_trapdoor")));
        mats.add(new McwWoodMat<>(MAT_NETHER_SAKURA.getLog(), Finder.findBlock(BetterNether.MOD_ID, "nether_sakura_planks"), Finder.findBlock(BetterNether.MOD_ID, "nether_sakura_stripped_log"),
                Finder.findBlock(BetterNether.MOD_ID, "nether_sakura_slab"), Finder.findBlock(BetterNether.MOD_ID, "nether_sakura_fence"),
                Finder.findBlock(BetterNether.MOD_ID, "nether_sakura_trapdoor")));
        mats.add(new McwWoodMat<>(MAT_RUBEUS.getLog(), Finder.findBlock(BetterNether.MOD_ID, "rubeus_planks"), Finder.findBlock(BetterNether.MOD_ID, "rubeus_stripped_log"),
                Finder.findBlock(BetterNether.MOD_ID, "rubeus_slab"), Finder.findBlock(BetterNether.MOD_ID, "rubeus_fence"),
                Finder.findBlock(BetterNether.MOD_ID, "rubeus_trapdoor")));
        mats.add(new McwWoodMat<>(MAT_STALAGNATE.getLog(), Finder.findBlock(BetterNether.MOD_ID, "stalagnate_planks"), Finder.findBlock(BetterNether.MOD_ID, "stalagnate_stripped_log"),
                Finder.findBlock(BetterNether.MOD_ID, "stalagnate_slab"), Finder.findBlock(BetterNether.MOD_ID, "stalagnate_fence"),
                Finder.findBlock(BetterNether.MOD_ID, "stalagnate_trapdoor")));
        mats.add(new McwWoodMat<>(MAT_WART.getLog(), Finder.findBlock(BetterNether.MOD_ID, "wart_planks"), Finder.findBlock(BetterNether.MOD_ID, "wart_stripped_log"),
                Finder.findBlock(BetterNether.MOD_ID, "wart_slab"), Finder.findBlock(BetterNether.MOD_ID, "wart_fence"),
                Finder.findBlock(BetterNether.MOD_ID, "wart_trapdoor")));
        mats.add(new McwWoodMat<>(MAT_WILLOW.getLog(), Finder.findBlock(BetterNether.MOD_ID, "willow_planks"), Finder.findBlock(BetterNether.MOD_ID, "willow_stripped_log"),
                Finder.findBlock(BetterNether.MOD_ID, "willow_slab"), Finder.findBlock(BetterNether.MOD_ID, "willow_fence"),
                Finder.findBlock(BetterNether.MOD_ID, "willow_trapdoor")));
        return mats;
    }
}