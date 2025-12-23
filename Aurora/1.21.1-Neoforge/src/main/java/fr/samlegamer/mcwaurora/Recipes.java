package fr.samlegamer.mcwaurora;

import com.farcr.nomansland.NoMansLand;
import static com.farcr.nomansland.common.registry.blocks.NMLBlocks.*;

import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Recipes extends McwRecipes
{
    public Recipes(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        registerAllMcwWood(output, McwAurora.MODID, NoMansLand.MODID, McwAurora.WOOD_NOMANSLAND, getNMLWoodMat());
        registerMcwHedge(output, McwAurora.MODID, NoMansLand.MODID, McwAurora.LEAVE_NOMANSLAND, getNMLLeaveMat());
    }

    private List<Block> getNMLLeaveMat()
    {
        List<Block> leaves = new ArrayList<>();
        leaves.add(MAPLE_LEAVES.get());
        leaves.add(PINE_LEAVES.get());
        leaves.add(WALNUT_LEAVES.get());
        leaves.add(WILLOW_LEAVES.get());
        leaves.add(AUTUMNAL_OAK_LEAVES.get());
        leaves.add(FROSTED_LEAVES.get());
        leaves.add(PALE_CHERRY_LEAVES.get());
        leaves.add(YELLOW_BIRCH_LEAVES.get());
        leaves.add(RED_MAPLE_LEAVES.get());
        return leaves;
    }

    private List<McwWoodMat<Block>> getNMLWoodMat()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(MAPLE.log().block(), MAPLE.planks().block(), MAPLE.strippedLog().block(), MAPLE.slab().block(), MAPLE.fence().block(), MAPLE.trapdoor().block()));
        mats.add(new McwWoodMat<>(PINE.log().block(), PINE.planks().block(), PINE.strippedLog().block(), PINE.slab().block(), PINE.fence().block(), PINE.trapdoor().block()));
        mats.add(new McwWoodMat<>(WALNUT.log().block(), WALNUT.planks().block(), WALNUT.strippedLog().block(), WALNUT.slab().block(), WALNUT.fence().block(), WALNUT.trapdoor().block()));
        mats.add(new McwWoodMat<>(WILLOW.log().block(), WILLOW.planks().block(), WILLOW.strippedLog().block(), WILLOW.slab().block(), WILLOW.fence().block(), WILLOW.trapdoor().block()));
        return mats;
    }
}
