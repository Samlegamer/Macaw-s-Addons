package fr.samlegamer.mcwquark;

import fr.addonslib.api.recipes.material.McwStoneMat;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import vazkii.quark.base.Quark;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        registerAllMcwStone(consumer, McwQuark.MODID, Quark.MOD_ID, McwQuark.stone, getStone());
        registerMcwHedge(consumer, McwQuark.MODID, Quark.MOD_ID, McwQuark.leaves, getLeaves());
    }

    private List<Block> getLeaves()
    {
        List<Block> leaves = new ArrayList<>();
        leaves.add(Finder.findBlock(Quark.MOD_ID, "blue_blossom_leaves"));
        leaves.add(Finder.findBlock(Quark.MOD_ID, "lavender_blossom_leaves"));
        leaves.add(Finder.findBlock(Quark.MOD_ID, "orange_blossom_leaves"));
        leaves.add(Finder.findBlock(Quark.MOD_ID, "pink_blossom_leaves"));
        leaves.add(Finder.findBlock(Quark.MOD_ID, "red_blossom_leaves"));
        leaves.add(Finder.findBlock(Quark.MOD_ID, "yellow_blossom_leaves"));
        return leaves;
    }

    private List<McwStoneMat<Block>> getStone()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        mats.add(mkStoneMat("andesite", Blocks.ANDESITE));
        mats.add(mkStoneMat("basalt", Finder.findBlock(Quark.MOD_ID, "basalt")));
        mats.add(new McwStoneMat<>(
                Finder.findBlock(Quark.MOD_ID, "biotite_bricks"),
                Finder.findBlock(Quark.MOD_ID, "biotite_block_vertical_slab"),
                Finder.findBlock(Quark.MOD_ID, "biotite_block_slab"),
                Finder.findBlock(Quark.MOD_ID, "biotite_block")));
        mats.add(mkStoneMat("diorite", Blocks.DIORITE));
        mats.add(new McwStoneMat<>(
                Finder.findBlock(Quark.MOD_ID, "elder_prismarine_bricks"),
                Finder.findBlock(Quark.MOD_ID, "elder_prismarine_wall"),
                Finder.findBlock(Quark.MOD_ID, "elder_prismarine_bricks_slab"),
                Finder.findBlock(Quark.MOD_ID, "elder_prismarine")));
        mats.add(mkStoneMat("granite", Blocks.GRANITE));
        mats.add(mkStoneMat("jasper", Finder.findBlock(Quark.MOD_ID, "jasper")));
        mats.add(mkStoneMat("limestone", Finder.findBlock(Quark.MOD_ID, "limestone")));
        mats.add(mkStoneMat("magma", Blocks.MAGMA_BLOCK));
        mats.add(mkStoneMat("marble", Finder.findBlock(Quark.MOD_ID, "marble")));
        mats.add(mkStoneMat("permafrost", Finder.findBlock(Quark.MOD_ID, "permafrost")));
        mats.add(mkStoneMat("red_sandstone", Blocks.SMOOTH_RED_SANDSTONE));
        mats.add(mkStoneMat("sandstone", Blocks.SMOOTH_SANDSTONE));
        mats.add(mkStoneMat("slate", Finder.findBlock(Quark.MOD_ID, "slate")));
        mats.add(mkStoneMat("soul_sandstone", Finder.findBlock(Quark.MOD_ID, "smooth_soul_sandstone")));
        return mats;
    }

    private McwStoneMat<Block> mkStoneMat(String name, Block smooth)
    {
        Block base = Finder.findBlock(Quark.MOD_ID, name+"_bricks");
        Block wall = Finder.findBlock(Quark.MOD_ID, name+"_bricks_wall");
        Block slab = Finder.findBlock(Quark.MOD_ID, name+"_bricks_slab");
        return new McwStoneMat<>(base, wall, slab, smooth);
    }
}