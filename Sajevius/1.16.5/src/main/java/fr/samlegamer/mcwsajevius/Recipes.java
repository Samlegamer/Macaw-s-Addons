package fr.samlegamer.mcwsajevius;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.data.ModType;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import fr.samlegamer.addonslib.generation.recipes.mat.McwStoneMat;
import fr.samlegamer.addonslib.generation.recipes.mat.McwWoodMat;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends RecipeProvider
{
    private final String betterlands = "betterlands";
    private final String shroomed = "shroomed";

    public Recipes(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer)
    {
        mkRecipesWood(consumer, betterlands, McwSajevius.wood_betterlands, woodBetterlands());
        McwRecipes.registerMcwHedge(consumer, McwSajevius.MODID, betterlands, McwSajevius.wood_betterlands, Arrays.asList(Finder.findBlock(betterlands, "juniper_leaves")));
        McwRecipes.registerAllMcwStone(consumer, McwSajevius.MODID, betterlands, McwSajevius.stone_betterlands, stoneBetterlands());
        mkRecipesWood(consumer, shroomed, McwSajevius.wood_shroomed, woodShroomed());
    }

    private void mkRecipesWood(Consumer<IFinishedRecipe> consumer, String original, List<String> mat, List<McwWoodMat> mcwWoodMats)
    {
        McwRecipes.onRegisterMcwWood(ModType.BRIDGES, consumer, McwSajevius.MODID, original, mat, mcwWoodMats);
        McwRecipes.onRegisterMcwWood(ModType.ROOFS, consumer, McwSajevius.MODID, original, mat, mcwWoodMats);
        McwRecipes.onRegisterMcwWood(ModType.FENCES, consumer, McwSajevius.MODID, original, mat, mcwWoodMats);
        McwRecipes.onRegisterMcwWood(ModType.FURNITURES, consumer, McwSajevius.MODID, original, mat, mcwWoodMats);
        McwRecipes.onRegisterMcwWood(ModType.STAIRS, consumer, McwSajevius.MODID, original, mat, mcwWoodMats);
    }

    private List<McwWoodMat> woodShroomed()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(Finder.findBlock(shroomed, "blue_hard_mushroom_stem"), Finder.findBlock(shroomed, "blue_shroomwood_planks"),
                Finder.findBlock(shroomed, "blue_hard_mushroom_hyphae"), Finder.findBlock(shroomed, "blue_shroomwood_slab"),
                Finder.findBlock(shroomed, "blue_shroomwood_fence"), Finder.findBlock(shroomed, "blue_shroomwood_trapdoor")));

        mats.add(new McwWoodMat(Finder.findBlock(shroomed, "hard_mushroom_stem"), Finder.findBlock(shroomed, "shroomwood_planks"),
                Finder.findBlock(shroomed, "hard_mushroom_hyphae"), Finder.findBlock(shroomed, "shroomwood_slab"),
                Finder.findBlock(shroomed, "shroomwood_fence"), Finder.findBlock(shroomed, "shroomwood_trapdoor")));

        mats.add(new McwWoodMat(Finder.findBlock(shroomed, "orange_hard_mushroom_stem"), Finder.findBlock(shroomed, "orange_shroomwood_planks"),
                Finder.findBlock(shroomed, "orange_hard_mushroom_hyphae"), Finder.findBlock(shroomed, "orange_shroomwood_slab"),
                Finder.findBlock(shroomed, "orange_shroomwood_fence"), Finder.findBlock(shroomed, "orange_shroomwood_trapdoor")));

        mats.add(new McwWoodMat(Finder.findBlock(shroomed, "purple_hard_mushroom_stem"), Finder.findBlock(shroomed, "purple_shroomwood_planks"),
                Finder.findBlock(shroomed, "purple_hard_mushroom_hyphae"), Finder.findBlock(shroomed, "purple_shroomwood_slab"),
                Finder.findBlock(shroomed, "purple_shroomwood_fence"), Finder.findBlock(shroomed, "purple_shroomwood_trapdoor")));
        return mats;
    }

    private List<McwStoneMat> stoneBetterlands()
    {
        List<McwStoneMat> mats = new ArrayList<>();
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
            mats.add(new McwStoneMat(Finder.findBlock(betterlands, s + "_bricks"), Finder.findBlock(betterlands, s + "_brick_wall"),
                    Finder.findBlock(betterlands, s + "_brick_slab"), Finder.findBlock(betterlands, s + "_tiles")));
        }
        return mats;
    }

    private List<McwWoodMat> woodBetterlands()
    {
        List<McwWoodMat> mats = new ArrayList<>();
        mats.add(new McwWoodMat(Finder.findBlock(betterlands, "juniper_log"), Finder.findBlock(betterlands, "juniper_planks"),
                Finder.findBlock(betterlands, "stripped_juniper_log"), Finder.findBlock(betterlands, "juniper_slab"),
                Finder.findBlock(betterlands, "juniper_fence"), Finder.findBlock(betterlands, "juniper_trapdoor")));
        return mats;
    }
}