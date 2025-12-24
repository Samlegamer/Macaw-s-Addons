package fr.samlegamer.mcwmoddinglegacy;

import com.legacy.premium_wood.PremiumWoodMod;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import static com.legacy.premium_wood.registry.PWBlocks.*;

public class Recipes extends McwRecipes
{
    public Recipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
//        registerAllMcwWood(output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_blue_skies, getWoodBS());
        registerAllMcwWood(output, McwModdingLegacy.MODID, PremiumWoodMod.MODID, McwModdingLegacy.wood_premium_wood, getWoodPW());

//        onRegisterMcwWood(ModType.BRIDGES, output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_crystallized, getWoodBSCrystallized());
//        onRegisterMcwWood(ModType.ROOFS, output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_crystallized, getWoodBSCrystallized());
//        registerMcwHedge(output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_crystallized, getLeavesBSCrystallized());

//        registerMcwHedge(output, McwModdingLegacy.MODID, BlueSkies.MODID, McwModdingLegacy.wood_blue_skies, getLeavesBS());
        registerMcwHedge(output, McwModdingLegacy.MODID, PremiumWoodMod.MODID, McwModdingLegacy.wood_premium_wood, getLeavesPW());
    }

    private List<McwWoodMat<Block>> getWoodPW()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(magic_log, magic_planks, stripped_magic_log, magic_slab, magic_fence, magic_trapdoor));
        mats.add(new McwWoodMat<>(maple_log, maple_planks, stripped_maple_log, maple_slab, maple_fence, maple_trapdoor));
        mats.add(new McwWoodMat<>(purple_heart_log, purple_heart_planks, stripped_purple_heart_log, purple_heart_slab, purple_heart_fence, purple_heart_trapdoor));
        mats.add(new McwWoodMat<>(silverbell_log, silverbell_planks, stripped_silverbell_log, silverbell_slab, silverbell_fence, silverbell_trapdoor));
        mats.add(new McwWoodMat<>(tiger_log, tiger_planks, stripped_tiger_log, tiger_slab, tiger_fence, tiger_trapdoor));
        mats.add(new McwWoodMat<>(willow_log, willow_planks, stripped_willow_log, willow_slab, willow_fence, willow_trapdoor));
        return mats;
    }

    private List<Block> getLeavesPW()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(magic_leaves);
        mats.add(maple_leaves);
        mats.add(purple_heart_leaves);
        mats.add(silverbell_leaves);
        mats.add(tiger_leaves);
        mats.add(willow_leaves);
        return mats;
    }

    public static class Runner extends RecipeProvider.Runner
    {
        protected Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new Recipes(provider, recipeOutput);
        }

        @Override
        public @NotNull String getName() {
            return "McwBOP Recipes";
        }
    }
}