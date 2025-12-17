package fr.samlegamer.mcwquark;

import fr.addonslib.api.recipes.material.McwStoneMat;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;
import org.violetmoon.quark.base.Quark;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        registerAllMcwWood(consumer, McwQuark.MODID, Quark.MOD_ID, McwQuark.wood, wood());
        registerMcwHedge(consumer, McwQuark.MODID, Quark.MOD_ID, McwQuark.leaves, leave());
        registerAllMcwStone(consumer, McwQuark.MODID, Quark.MOD_ID, McwQuark.stone, stone());
    }

    private List<Block> leave()
    {
        List<Block> mats = new ArrayList<>();
        for(String i : McwQuark.leaves)
        {
            mats.add(getBlock(i+"_leaves"));
        }
        return mats;
    }

    private List<McwStoneMat<Block>> stone()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        mats.add(new McwStoneMat<>(
                getBlock("soul_sandstone_bricks"),
                getBlock("soul_sandstone_bricks_wall"),
                getBlock("soul_sandstone_bricks_slab"),
                getBlock("soul_sandstone")
        ));
        mats.add(new McwStoneMat<>(
                getBlock("limestone_bricks"),
                getBlock("limestone_bricks_wall"),
                getBlock("limestone_bricks_slab"),
                getBlock("limestone")
        ));
        mats.add(new McwStoneMat<>(
                getBlock("jasper_bricks"),
                getBlock("jasper_bricks_wall"),
                getBlock("jasper_bricks_slab"),
                getBlock("jasper")
        ));
        mats.add(new McwStoneMat<>(
                getBlock("shale_bricks"),
                getBlock("shale_bricks_wall"),
                getBlock("shale_bricks_slab"),
                getBlock("shale")
        ));
        mats.add(new McwStoneMat<>(
                getBlock("permafrost_bricks"),
                getBlock("permafrost_bricks_wall"),
                getBlock("permafrost_bricks_slab"),
                getBlock("permafrost")
        ));
        mats.add(new McwStoneMat<>(
                getBlock("red_sandstone_bricks"),
                getBlock("red_sandstone_bricks_wall"),
                getBlock("red_sandstone_bricks_slab"),
                Blocks.SMOOTH_RED_SANDSTONE
        ));
        mats.add(new McwStoneMat<>(
                getBlock("sandstone_bricks"),
                getBlock("sandstone_bricks_wall"),
                getBlock("sandstone_bricks_slab"),
                Blocks.SMOOTH_SANDSTONE
        ));
        mats.add(new McwStoneMat<>(
                getBlock("cobblestone_bricks"),
                getBlock("cobblestone_bricks_wall"),
                getBlock("cobblestone_bricks_slab"),
                Blocks.COBBLESTONE
        ));
        mats.add(new McwStoneMat<>(
                getBlock("mossy_cobblestone_bricks"),
                getBlock("mossy_cobblestone_bricks_wall"),
                getBlock("mossy_cobblestone_bricks_slab"),
                Blocks.MOSSY_COBBLESTONE
        ));
        mats.add(new McwStoneMat<>(
                getBlock("blackstone_bricks"),
                getBlock("blackstone_bricks_wall"),
                getBlock("blackstone_bricks_slab"),
                Blocks.BLACKSTONE
        ));
        mats.add(new McwStoneMat<>(
                getBlock("diorite_bricks"),
                getBlock("diorite_bricks_wall"),
                getBlock("diorite_bricks_slab"),
                Blocks.DIORITE
        ));
        mats.add(new McwStoneMat<>(
                getBlock("granite_bricks"),
                getBlock("granite_bricks_wall"),
                getBlock("granite_bricks_slab"),
                Blocks.GRANITE
        ));
        mats.add(new McwStoneMat<>(
                getBlock("andesite_bricks"),
                getBlock("andesite_bricks_wall"),
                getBlock("andesite_bricks_slab"),
                Blocks.ANDESITE
        ));
        mats.add(new McwStoneMat<>(
                getBlock("calcite_bricks"),
                getBlock("calcite_bricks_wall"),
                getBlock("calcite_bricks_slab"),
                Blocks.CALCITE
        ));
        mats.add(new McwStoneMat<>(
                getBlock("dripstone_bricks"),
                getBlock("dripstone_bricks_wall"),
                getBlock("dripstone_bricks_slab"),
                Blocks.DRIPSTONE_BLOCK
        ));
        mats.add(new McwStoneMat<>(
                getBlock("tuff_bricks"),
                getBlock("tuff_bricks_wall"),
                getBlock("tuff_bricks_slab"),
                Blocks.TUFF
        ));
        mats.add(new McwStoneMat<>(
                getBlock("raw_iron_bricks"),
                getBlock("raw_iron_bricks_wall"),
                getBlock("raw_iron_bricks_slab"),
                Blocks.RAW_IRON_BLOCK
        ));
        mats.add(new McwStoneMat<>(
                getBlock("raw_gold_bricks"),
                getBlock("raw_gold_bricks_wall"),
                getBlock("raw_gold_bricks_slab"),
                Blocks.RAW_GOLD_BLOCK
        ));
        mats.add(new McwStoneMat<>(
                getBlock("raw_copper_bricks"),
                getBlock("raw_copper_bricks_wall"),
                getBlock("raw_copper_bricks_slab"),
                Blocks.RAW_COPPER_BLOCK
        ));
        return mats;
    }

    private List<McwWoodMat<Block>> wood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        for(String i : McwQuark.wood)
        {
            mats.add(new McwWoodMat<>(
                    getBlock(i + "_log"),
                    getBlock(i + "_planks"),
                    getBlock("stripped_" + i + "_log"),
                    getBlock(i + "_planks_slab"),
                    getBlock(i + "_fence"),
                    getBlock(i + "_trapdoor")
            ));
        }
        return mats;
    }

    private Block getBlock(String name)
    {
        return Finder.findBlock(Quark.MOD_ID, name);
    }
}