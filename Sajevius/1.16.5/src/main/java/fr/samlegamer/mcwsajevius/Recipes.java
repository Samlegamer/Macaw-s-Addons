package fr.samlegamer.mcwsajevius;

import fr.addonslib.api.recipes.material.McwStoneMat;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    private final String betterlands = "betterlands";
    private final String shroomed = "shroomed";

    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer)
    {
        mkRecipesWood(consumer, betterlands, McwSajevius.wood_betterlands, woodBetterlands());
        registerMcwHedge(consumer, McwSajevius.MODID, betterlands, McwSajevius.wood_betterlands, Arrays.asList(Finder.findBlock(betterlands, "juniper_leaves")));
        registerAllMcwStone(consumer, McwSajevius.MODID, betterlands, McwSajevius.stone_betterlands, stoneBetterlands());
        mkRecipesWood(consumer, shroomed, McwSajevius.wood_shroomed, woodShroomed());
    }

    private void mkRecipesWood(Consumer<IFinishedRecipe> consumer, String original, List<String> mat, List<McwWoodMat<Block>> mcwWoodMats)
    {
        registerMcwWood(consumer, McwSajevius.MODID, original, mat, mcwWoodMats, McwSajevius.WOOD_MOD_TYPES);
    }

    private List<McwWoodMat<Block>> woodShroomed()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(Finder.findBlock(shroomed, "blue_hard_mushroom_stem"), Finder.findBlock(shroomed, "blue_shroomwood_planks"),
                Finder.findBlock(shroomed, "blue_hard_mushroom_hyphae"), Finder.findBlock(shroomed, "blue_shroomwood_slab"),
                Finder.findBlock(shroomed, "blue_shroomwood_fence"), Finder.findBlock(shroomed, "blue_shroomwood_trapdoor")));

        mats.add(new McwWoodMat<>(Finder.findBlock(shroomed, "hard_mushroom_stem"), Finder.findBlock(shroomed, "shroomwood_planks"),
                Finder.findBlock(shroomed, "hard_mushroom_hyphae"), Finder.findBlock(shroomed, "shroomwood_slab"),
                Finder.findBlock(shroomed, "shroomwood_fence"), Finder.findBlock(shroomed, "shroomwood_trapdoor")));

        mats.add(new McwWoodMat<>(Finder.findBlock(shroomed, "orange_hard_mushroom_stem"), Finder.findBlock(shroomed, "orange_shroomwood_planks"),
                Finder.findBlock(shroomed, "orange_hard_mushroom_hyphae"), Finder.findBlock(shroomed, "orange_shroomwood_slab"),
                Finder.findBlock(shroomed, "orange_shroomwood_fence"), Finder.findBlock(shroomed, "orange_shroomwood_trapdoor")));

        mats.add(new McwWoodMat<>(Finder.findBlock(shroomed, "purple_hard_mushroom_stem"), Finder.findBlock(shroomed, "purple_shroomwood_planks"),
                Finder.findBlock(shroomed, "purple_hard_mushroom_hyphae"), Finder.findBlock(shroomed, "purple_shroomwood_slab"),
                Finder.findBlock(shroomed, "purple_shroomwood_fence"), Finder.findBlock(shroomed, "purple_shroomwood_trapdoor")));
        return mats;
    }

    private List<McwStoneMat<Block>> stoneBetterlands()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        List<String> wood = Arrays.asList("black_terracotta",
            "blue_terracotta",
            "brown_terracotta",
            "claystone",
            "cyan_terracotta",
            "gray_terracotta",
            "green_terracotta",
            "light_blue_terracotta",
            "light_gray_terracotta",
            "lime_terracotta",
            "magenta_terracotta",
            "orange_terracotta",
            "red_terracotta",
            "terracotta",
            "white_terracotta",
            "yellow_terracotta");

        for (String s : wood)
        {
            mats.add(new McwStoneMat<>(Finder.findBlock(betterlands, s + "_bricks"), Finder.findBlock(betterlands, s + "_brick_wall"),
                    Finder.findBlock(betterlands, s + "_brick_slab"), Finder.findBlock(betterlands, s + "_tiles")));
        }
        return mats;
    }

    private List<McwWoodMat<Block>> woodBetterlands()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(Finder.findBlock(betterlands, "juniper_log"), Finder.findBlock(betterlands, "juniper_planks"),
                Finder.findBlock(betterlands, "stripped_juniper_log"), Finder.findBlock(betterlands, "juniper_slab"),
                Finder.findBlock(betterlands, "juniper_fence"), Finder.findBlock(betterlands, "juniper_trapdoor")));
        return mats;
    }
}