package fr.samlegamer.mcwabnormals;

import com.teamabnormals.atmospheric.core.Atmospheric;
import com.teamabnormals.atmospheric.core.registry.AtmosphericBlocks;
import com.teamabnormals.autumnity.core.Autumnity;
import com.teamabnormals.autumnity.core.registry.AutumnityBlocks;
import com.teamabnormals.buzzier_bees.core.BuzzierBees;
import com.teamabnormals.buzzier_bees.core.registry.BBBlocks;
import com.teamabnormals.caverns_and_chasms.core.CavernsAndChasms;
import com.teamabnormals.caverns_and_chasms.core.registry.CCBlocks;
import com.teamabnormals.endergetic.core.EndergeticExpansion;
import com.teamabnormals.endergetic.core.registry.EEBlocks;
import com.teamabnormals.environmental.core.Environmental;
import com.teamabnormals.environmental.core.registry.EnvironmentalBlocks;
import com.teamabnormals.upgrade_aquatic.core.UpgradeAquatic;
import com.teamabnormals.upgrade_aquatic.core.registry.UABlocks;
import fr.addonslib.api.recipes.material.McwStoneMat;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends McwRecipes
{
    public Recipes(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> output) {
        registerAllMcwStone(output, McwAbnormals.MODID, BuzzierBees.MOD_ID, McwAbnormals.ROCK_BB, getBB());
        registerAllMcwStone(output, McwAbnormals.MODID, Atmospheric.MOD_ID, McwAbnormals.ROCK_ATMO, getAtmoRock());
        registerAllMcwStone(output, McwAbnormals.MODID, Autumnity.MOD_ID, McwAbnormals.ROCK_AUTU, getAutuRock());
        registerAllMcwStone(output, McwAbnormals.MODID, CavernsAndChasms.MOD_ID, McwAbnormals.ROCK_CAVERNSCHASMS, getCavernAndChasmStone());

        registerAllMcwWood(output, McwAbnormals.MODID, Autumnity.MOD_ID, McwAbnormals.WOOD_AUTU, getAutuWood());
        registerAllMcwWood(output, McwAbnormals.MODID, Environmental.MOD_ID, McwAbnormals.WOOD_ENVI, getEnviWood());
        registerAllMcwWood(output, McwAbnormals.MODID, UpgradeAquatic.MOD_ID, McwAbnormals.WOOD_UAQUA, getUAquaWood());
        registerAllMcwWood(output, McwAbnormals.MODID, Atmospheric.MOD_ID, McwAbnormals.WOOD_ATMO, getAtmoWood());
        registerAllMcwWood(output, McwAbnormals.MODID, EndergeticExpansion.MOD_ID, McwAbnormals.WOOD_ENDER, getEnderWood());
        registerAllMcwWood(output, McwAbnormals.MODID, CavernsAndChasms.MOD_ID, McwAbnormals.WOOD_CAVERNSCHASMS, getCavernAndChasmWood());

        registerMcwHedge(output, McwAbnormals.MODID, Atmospheric.MOD_ID, McwAbnormals.LEAVES_ATMO, getAtmoLeaves());
        registerMcwHedge(output, McwAbnormals.MODID, Autumnity.MOD_ID, McwAbnormals.LEAVES_AUTU, getAutuLeaves());
        registerMcwHedge(output, McwAbnormals.MODID, Environmental.MOD_ID, McwAbnormals.LEAVES_ENVI, getEnviLeaves());
        registerMcwHedge(output, McwAbnormals.MODID, UpgradeAquatic.MOD_ID, McwAbnormals.LEAVES_UAQUA, getUAquaLeaves());
    }

    private List<McwWoodMat<Block>> getCavernAndChasmWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(CCBlocks.AZALEA_LOG.get(), CCBlocks.AZALEA_PLANKS.get(), CCBlocks.STRIPPED_AZALEA_LOG.get(),
                CCBlocks.AZALEA_SLAB.get(), CCBlocks.AZALEA_FENCE.get(), CCBlocks.AZALEA_TRAPDOOR.get()));
        return mats;
    }

    private List<McwStoneMat<Block>> getCavernAndChasmStone()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        mats.add(new McwStoneMat<>(CCBlocks.CUT_AMETHYST_BRICKS.get(), CCBlocks.CUT_AMETHYST_BRICK_WALL.get(), CCBlocks.CUT_AMETHYST_BRICK_SLAB.get(), CCBlocks.CUT_AMETHYST.get()));
        mats.add(new McwStoneMat<>(CCBlocks.SPINEL_BRICKS.get(), CCBlocks.SPINEL_BRICK_WALL.get(), CCBlocks.SPINEL_BRICK_SLAB.get(), CCBlocks.SPINEL_BLOCK.get()));
        mats.add(new McwStoneMat<>(CCBlocks.SANGUINE_TILES.get(), CCBlocks.SANGUINE_TILE_WALL.get(), CCBlocks.SANGUINE_TILE_SLAB.get(), CCBlocks.SANGUINE_BLOCK.get()));
        mats.add(new McwStoneMat<>(CCBlocks.LAPIS_LAZULI_BRICKS.get(), CCBlocks.LAPIS_LAZULI_BRICK_WALL.get(), CCBlocks.LAPIS_LAZULI_BRICK_SLAB.get(), Blocks.LAPIS_BLOCK));
        mats.add(new McwStoneMat<>(CCBlocks.COBBLESTONE_BRICKS.get(), CCBlocks.COBBLESTONE_BRICK_WALL.get(), CCBlocks.COBBLESTONE_BRICK_SLAB.get(), CCBlocks.COBBLESTONE_TILES.get()));
        mats.add(new McwStoneMat<>(CCBlocks.POLISHED_CALCITE.get(), CCBlocks.CALCITE_WALL.get(), CCBlocks.CALCITE_SLAB.get(), Blocks.CALCITE));
        mats.add(new McwStoneMat<>(CCBlocks.COBBLED_DEEPSLATE_BRICKS.get(), CCBlocks.COBBLED_DEEPSLATE_BRICK_WALL.get(), CCBlocks.COBBLED_DEEPSLATE_BRICK_SLAB.get(), Blocks.COBBLED_DEEPSLATE));
        mats.add(new McwStoneMat<>(CCBlocks.MOSSY_COBBLESTONE_BRICKS.get(), CCBlocks.MOSSY_COBBLESTONE_BRICK_WALL.get(), CCBlocks.MOSSY_COBBLESTONE_BRICK_SLAB.get(), CCBlocks.MOSSY_COBBLESTONE_TILES.get()));
        mats.add(new McwStoneMat<>(CCBlocks.FLOODED_DRIPSTONE_SHINGLES.get(), CCBlocks.DRIPSTONE_SHINGLE_WALL.get(), CCBlocks.DRIPSTONE_SHINGLE_SLAB.get(), Blocks.DRIPSTONE_BLOCK));
        return mats;
    }

    private List<Block> getUAquaLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(UABlocks.RIVER_LEAVES.get());
        return mats;
    }


    private List<Block> getEnviLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(EnvironmentalBlocks.PLUM_LEAVES.get());
        mats.add(EnvironmentalBlocks.BLUE_WISTERIA_LEAVES.get());
        mats.add(EnvironmentalBlocks.PINK_WISTERIA_LEAVES.get());
        mats.add(EnvironmentalBlocks.WHITE_WISTERIA_LEAVES.get());
        mats.add(EnvironmentalBlocks.PURPLE_WISTERIA_LEAVES.get());
        mats.add(EnvironmentalBlocks.WILLOW_LEAVES.get());
        return mats;
    }


    private List<Block> getAutuLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(AutumnityBlocks.MAPLE_LEAVES.get());
        mats.add(AutumnityBlocks.RED_MAPLE_LEAVES.get());
        mats.add(AutumnityBlocks.YELLOW_MAPLE_LEAVES.get());
        mats.add(AutumnityBlocks.ORANGE_MAPLE_LEAVES.get());
        return mats;
    }

    private List<Block> getAtmoLeaves()
    {
        List<Block> mats = new ArrayList<>();
        mats.add(AtmosphericBlocks.ASPEN_LEAVES.get());
        mats.add(AtmosphericBlocks.GRIMWOOD_LEAVES.get());
        mats.add(AtmosphericBlocks.KOUSA_LEAVES.get());
        mats.add(AtmosphericBlocks.MORADO_LEAVES.get());
        mats.add(AtmosphericBlocks.ROSEWOOD_LEAVES.get());
        mats.add(AtmosphericBlocks.YUCCA_LEAVES.get());
        return mats;
    }

    private List<McwWoodMat<Block>> getEnderWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(EEBlocks.POISE_STEM.get(), EEBlocks.POISE_PLANKS.get(), EEBlocks.STRIPPED_POISE_STEM.get(),
                EEBlocks.POISE_SLAB.get(), EEBlocks.POISE_FENCE.get(), EEBlocks.POISE_TRAPDOOR.get()));
        return mats;
    }

    private List<McwWoodMat<Block>> getAtmoWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(AtmosphericBlocks.ASPEN_LOG.get(), AtmosphericBlocks.ASPEN_PLANKS.get(), AtmosphericBlocks.STRIPPED_ASPEN_LOG.get(),
                AtmosphericBlocks.ASPEN_SLAB.get(), AtmosphericBlocks.ASPEN_FENCE.get(), AtmosphericBlocks.ASPEN_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(AtmosphericBlocks.GRIMWOOD_LOG.get(), AtmosphericBlocks.GRIMWOOD_PLANKS.get(), AtmosphericBlocks.STRIPPED_GRIMWOOD_LOG.get(),
                AtmosphericBlocks.GRIMWOOD_SLAB.get(), AtmosphericBlocks.GRIMWOOD_FENCE.get(), AtmosphericBlocks.GRIMWOOD_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(AtmosphericBlocks.KOUSA_LOG.get(), AtmosphericBlocks.KOUSA_PLANKS.get(), AtmosphericBlocks.STRIPPED_KOUSA_LOG.get(),
                AtmosphericBlocks.KOUSA_SLAB.get(), AtmosphericBlocks.KOUSA_FENCE.get(), AtmosphericBlocks.KOUSA_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(AtmosphericBlocks.MORADO_LOG.get(), AtmosphericBlocks.MORADO_PLANKS.get(), AtmosphericBlocks.STRIPPED_MORADO_LOG.get(),
                AtmosphericBlocks.MORADO_SLAB.get(), AtmosphericBlocks.MORADO_FENCE.get(), AtmosphericBlocks.MORADO_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(AtmosphericBlocks.ROSEWOOD_LOG.get(), AtmosphericBlocks.ROSEWOOD_PLANKS.get(), AtmosphericBlocks.STRIPPED_ROSEWOOD_LOG.get(),
                AtmosphericBlocks.ROSEWOOD_SLAB.get(), AtmosphericBlocks.ROSEWOOD_FENCE.get(), AtmosphericBlocks.ROSEWOOD_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(AtmosphericBlocks.YUCCA_LOG.get(), AtmosphericBlocks.YUCCA_PLANKS.get(), AtmosphericBlocks.STRIPPED_YUCCA_LOG.get(),
                AtmosphericBlocks.YUCCA_SLAB.get(), AtmosphericBlocks.YUCCA_FENCE.get(), AtmosphericBlocks.YUCCA_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(AtmosphericBlocks.LAUREL_LOG.get(), AtmosphericBlocks.LAUREL_PLANKS.get(), AtmosphericBlocks.STRIPPED_LAUREL_LOG.get(),
                AtmosphericBlocks.LAUREL_SLAB.get(), AtmosphericBlocks.LAUREL_FENCE.get(), AtmosphericBlocks.LAUREL_TRAPDOOR.get()));
        return mats;
    }

    private List<McwWoodMat<Block>> getUAquaWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(UABlocks.DRIFTWOOD_LOG.get(), UABlocks.DRIFTWOOD_PLANKS.get(), UABlocks.STRIPPED_DRIFTWOOD_LOG.get(),
                UABlocks.DRIFTWOOD_SLAB.get(), UABlocks.DRIFTWOOD_FENCE.get(), UABlocks.DRIFTWOOD_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(UABlocks.RIVER_LOG.get(), UABlocks.RIVER_PLANKS.get(), UABlocks.STRIPPED_RIVER_LOG.get(),
                UABlocks.RIVER_SLAB.get(), UABlocks.RIVER_FENCE.get(), UABlocks.RIVER_TRAPDOOR.get()));
        return mats;
    }

    private List<McwWoodMat<Block>> getEnviWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(EnvironmentalBlocks.PLUM_LOG.get(), EnvironmentalBlocks.PLUM_PLANKS.get(), EnvironmentalBlocks.STRIPPED_PLUM_LOG.get(),
                EnvironmentalBlocks.PLUM_SLAB.get(), EnvironmentalBlocks.PLUM_FENCE.get(), EnvironmentalBlocks.PLUM_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(EnvironmentalBlocks.WISTERIA_LOG.get(), EnvironmentalBlocks.WISTERIA_PLANKS.get(), EnvironmentalBlocks.STRIPPED_WISTERIA_LOG.get(),
                EnvironmentalBlocks.WISTERIA_SLAB.get(), EnvironmentalBlocks.WISTERIA_FENCE.get(), EnvironmentalBlocks.WISTERIA_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(EnvironmentalBlocks.WILLOW_LOG.get(), EnvironmentalBlocks.WILLOW_PLANKS.get(), EnvironmentalBlocks.STRIPPED_WILLOW_LOG.get(),
                EnvironmentalBlocks.WILLOW_SLAB.get(), EnvironmentalBlocks.WILLOW_FENCE.get(), EnvironmentalBlocks.WILLOW_TRAPDOOR.get()));
        mats.add(new McwWoodMat<>(EnvironmentalBlocks.PINE_LOG.get(), EnvironmentalBlocks.PINE_PLANKS.get(), EnvironmentalBlocks.STRIPPED_PINE_LOG.get(),
                EnvironmentalBlocks.PINE_SLAB.get(), EnvironmentalBlocks.PINE_FENCE.get(), EnvironmentalBlocks.PINE_TRAPDOOR.get()));
        return mats;
    }

    private List<McwWoodMat<Block>> getAutuWood()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        mats.add(new McwWoodMat<>(AutumnityBlocks.MAPLE_LOG.get(), AutumnityBlocks.MAPLE_PLANKS.get(), AutumnityBlocks.STRIPPED_MAPLE_LOG.get(),
                AutumnityBlocks.MAPLE_SLAB.get(), AutumnityBlocks.MAPLE_FENCE.get(), AutumnityBlocks.MAPLE_TRAPDOOR.get()));
        return mats;
    }

    private List<McwStoneMat<Block>> getAutuRock()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        mats.add(new McwStoneMat<>(AutumnityBlocks.SNAIL_SHELL_BRICKS.get(), AutumnityBlocks.SNAIL_SHELL_BRICK_WALL.get(), AutumnityBlocks.SNAIL_SHELL_BRICK_SLAB.get(), AutumnityBlocks.SNAIL_SHELL_BLOCK.get()));
        mats.add(new McwStoneMat<>(AutumnityBlocks.SNAIL_SHELL_TILES.get(), AutumnityBlocks.SNAIL_SHELL_TILE_WALL.get(), AutumnityBlocks.SNAIL_SHELL_TILE_SLAB.get(), AutumnityBlocks.SNAIL_SHELL_BRICKS.get()));
        return mats;
    }


    private List<McwStoneMat<Block>> getAtmoRock()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        mats.add(new McwStoneMat<>(AtmosphericBlocks.ARID_SANDSTONE.get(), AtmosphericBlocks.ARID_SANDSTONE_WALL.get(), AtmosphericBlocks.ARID_SANDSTONE_SLAB.get(), AtmosphericBlocks.SMOOTH_ARID_SANDSTONE.get()));
        mats.add(new McwStoneMat<>(AtmosphericBlocks.RED_ARID_SANDSTONE.get(), AtmosphericBlocks.RED_ARID_SANDSTONE_WALL.get(), AtmosphericBlocks.RED_ARID_SANDSTONE_SLAB.get(), AtmosphericBlocks.SMOOTH_RED_ARID_SANDSTONE.get()));
        return mats;
    }

    private List<McwStoneMat<Block>> getBB()
    {
        List<McwStoneMat<Block>> mats = new ArrayList<>();
        mats.add(new McwStoneMat<>(BBBlocks.HONEYCOMB_BRICKS.get(), BBBlocks.HONEYCOMB_BRICK_WALL.get(), BBBlocks.HONEYCOMB_BRICK_SLAB.get(), Blocks.HONEYCOMB_BLOCK));
        mats.add(new McwStoneMat<>(BBBlocks.HONEYCOMB_TILES.get(), BBBlocks.HONEYCOMB_TILE_WALL.get(), BBBlocks.HONEYCOMB_TILE_SLAB.get(), BBBlocks.HONEYCOMB_BRICKS.get()));
        return mats;
    }
}