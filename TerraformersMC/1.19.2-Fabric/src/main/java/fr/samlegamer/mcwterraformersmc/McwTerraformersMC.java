package fr.samlegamer.mcwterraformersmc;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;
import java.util.Random;

public class McwTerraformersMC implements ModInitializer
{
    public static final String MODID = "mcwterraformersmc";
    private static final Logger LOGGER = LogManager.getLogger();

    public static final List<String> WOODS_TRAVERSE = List.of("fir");
    public static final List<String> WOODS_CINDERSCAPES = List.of("scorched", "umbral");
    public static final List<String> WOODS_TERRESTRIA = List.of("redwood", "hemlock", "rubber", "cypress", "willow",
            "japanese_maple", "rainbow_eucalyptus", "sakura", "yucca_palm");

    public static final List<String> ROCKS_CINDERSCAPES = List.of("sulfur_quartz_bricks", "rose_quartz_bricks", "smoky_quartz_bricks");
    public static final List<String> ROCKS_TERRESTRIA = List.of("basalt_bricks", "mossy_basalt_bricks");

    public static final List<String> LEAVES_TRAVERSE = List.of("fir", "red_autumnal", "brown_autumnal", "orange_autumnal", "yellow_autumnal");
    public static final List<String> LEAVES_TERRESTRIA = List.of("redwood", "hemlock", "rubber", "cypress", "willow", "japanese_maple",
            "rainbow_eucalyptus", "sakura", "yucca_palm", "japanese_maple_shrub", "dark_japanese_maple", "jungle_palm");

    public static final ItemGroup MCWTERRAFORMERSMC_TAB = FabricItemGroupBuilder.build(new Identifier(MODID + ".tab"), () -> new ItemStack(icon()));

    public void onInitialize()
    {
        LOGGER.info("Macaw's TerraformersMC Loading...");
        final AbstractBlock.Settings wood = AbstractBlock.Settings.copy(Blocks.OAK_PLANKS);
        final AbstractBlock.Settings stone = AbstractBlock.Settings.copy(Blocks.COBBLESTONE);
        final AbstractBlock.Settings leave = AbstractBlock.Settings.copy(Blocks.OAK_LEAVES);

        Bridges.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse", wood);
        Bridges.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes", wood);
        Bridges.setRegistrationRockModLoaded(MODID, ROCKS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes", stone);
        Bridges.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria", wood);
        Bridges.setRegistrationRockModLoaded(MODID, ROCKS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria", stone);

        Roofs.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse", wood);
        Roofs.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes", wood);
        Roofs.setRegistrationRockModLoaded(MODID, ROCKS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes", stone);
        Roofs.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria", wood);
        Roofs.setRegistrationRockModLoaded(MODID, ROCKS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria", stone);

        Fences.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse", wood);
        Fences.setRegistrationHedgesModLoaded(MODID, LEAVES_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse", leave);
        Fences.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes", wood);
        Fences.setRegistrationRockModLoaded(MODID, ROCKS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes", stone);
        Fences.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria", wood);
        Fences.setRegistrationHedgesModLoaded(MODID, LEAVES_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria", leave);
        Fences.setRegistrationRockModLoaded(MODID, ROCKS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria", stone);

        Furnitures.setRegistrationWood(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse");
        Furnitures.setRegistrationWood(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Furnitures.setRegistrationWood(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria");

        Stairs.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse", wood);
        Stairs.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes", wood);
        Stairs.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria", wood);

        Paths.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse");
        Paths.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Paths.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria");

        Doors.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse");
        Doors.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Doors.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria");

        Trapdoors.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse");
        Trapdoors.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Trapdoors.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria");

        Windows.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse");
        Windows.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Windows.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria");


        Bridges.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Bridges.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Bridges.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Roofs.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Roofs.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Roofs.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Fences.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Fences.fuelHedge(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);
        Fences.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Fences.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);
        Fences.fuelHedge(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);

        Furnitures.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Furnitures.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Furnitures.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Stairs.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Stairs.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Stairs.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Paths.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Paths.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Paths.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Doors.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Doors.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Doors.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Trapdoors.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Trapdoors.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Trapdoors.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Windows.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Windows.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Windows.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        LOGGER.info("Macaw's TerraformersMC Is Charged !");
    }

    private static Block icon()
    {
        NewIconRandom.NewProperties propIcon = new NewIconRandom.NewProperties(
                Finder.findBlock(MODID, randomNaming()+"_planks_roof"),
                Finder.findBlock(MODID, randomNaming()+"_pyramid_gate"),
                Finder.findBlock(MODID, randomNaming()+"_bookshelf_drawer"),
                Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"),
                Finder.findBlock(MODID, randomNaming()+"_four_window"),
                Finder.findBlock(MODID, randomNaming()+"_barn_glass_door"),
                Finder.findBlock(MODID, randomNaming()+"_blossom_trapdoor"),
                Finder.findBlock(MODID, randomNaming()+"_planks_path"),
                Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));

        propIcon.addType(NewIconRandom.BlockType.BRIDGES)
                .addType(NewIconRandom.BlockType.ROOFS)
                .addType(NewIconRandom.BlockType.FENCES)
                .addType(NewIconRandom.BlockType.FURNITURES)
                .addType(NewIconRandom.BlockType.STAIRS)
                .addType(NewIconRandom.BlockType.PATHS)
                .addType(NewIconRandom.BlockType.DOORS)
                .addType(NewIconRandom.BlockType.WINDOWS)
                .addType(NewIconRandom.BlockType.TRAPDOORS);
        return propIcon.buildIcon(NewIconRandom.BlockType.BRIDGES, NewIconRandom.BlockType.ROOFS, NewIconRandom.BlockType.FENCES,
                NewIconRandom.BlockType.FURNITURES, NewIconRandom.BlockType.STAIRS, NewIconRandom.BlockType.PATHS, NewIconRandom.BlockType.DOORS,
                NewIconRandom.BlockType.WINDOWS, NewIconRandom.BlockType.TRAPDOORS);
    }

    private static String randomNaming()
    {
        Random rand = new Random();

        if(FabricLoader.getInstance().isModLoaded("traverse") && FabricLoader.getInstance().isModLoaded("cinderscapes") && FabricLoader.getInstance().isModLoaded("terrestria"))
        {
            int i = rand.nextInt(3);

            return switch (i) {
                case 0 -> "umbral";
                case 1 -> "fir";
                case 2 -> "japanese_maple";
                default -> "redwood";
            };
        }
        else
        {
            if(FabricLoader.getInstance().isModLoaded("cinderscapes"))
            {
                return "umbral";
            }

            if(FabricLoader.getInstance().isModLoaded("traverse"))
            {
                return "fir";
            }

            if(FabricLoader.getInstance().isModLoaded("terrestria"))
            {
                return "japanese_maple";
            }
        }
        return "fir";
    }
}