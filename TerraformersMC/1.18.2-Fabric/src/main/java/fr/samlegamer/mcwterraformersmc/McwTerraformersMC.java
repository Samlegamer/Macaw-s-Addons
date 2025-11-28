package fr.samlegamer.mcwterraformersmc;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.fuel.APIFuels;
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

    protected static final List<String> WOODS_TRAVERSE = List.of("fir");
    protected static final List<String> WOODS_CINDERSCAPES = List.of("scorched", "umbral");
    protected static final List<String> WOODS_TERRESTRIA = List.of("redwood", "hemlock", "rubber", "cypress", "willow",
            "japanese_maple", "rainbow_eucalyptus", "sakura", "yucca_palm");

    protected static final List<String> ROCKS_CINDERSCAPES = List.of("sulfur_quartz_bricks", "rose_quartz_bricks", "smoky_quartz_bricks");
    protected static final List<String> ROCKS_TERRESTRIA = List.of("basalt_bricks", "mossy_basalt_bricks");

    protected static final List<String> LEAVES_TRAVERSE = List.of("fir", "red_autumnal", "brown_autumnal", "orange_autumnal", "yellow_autumnal");
    protected static final List<String> LEAVES_TERRESTRIA = List.of("redwood", "hemlock", "rubber", "cypress", "willow", "japanese_maple",
            "rainbow_eucalyptus", "sakura", "yucca_palm", "japanese_maple_shrub", "dark_japanese_maple", "jungle_palm");

    public static final ItemGroup MCWTERRAFORMERSMC_TAB = FabricItemGroupBuilder.build(new Identifier(MODID + ".tab"), () -> new ItemStack(icon()));

    public void onInitialize()
    {
        LOGGER.info("Macaw's TerraformersMC Loading...");
        final AbstractBlock.Settings wood = AbstractBlock.Settings.copy(Blocks.OAK_PLANKS);
        final AbstractBlock.Settings stone = AbstractBlock.Settings.copy(Blocks.COBBLESTONE);
        final AbstractBlock.Settings leave = AbstractBlock.Settings.copy(Blocks.OAK_LEAVES);

        boolean isDev = FabricLoader.getInstance().isDevelopmentEnvironment();
        String suffix = isDev ? "-common" : "";

        Bridges.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse"+suffix, wood);
        Bridges.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes"+suffix, wood);
        Bridges.setRegistrationRockModLoaded(MODID, ROCKS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes"+suffix, stone);
        Bridges.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix, wood);
        Bridges.setRegistrationRockModLoaded(MODID, ROCKS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix, stone);

        Roofs.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse"+suffix, wood);
        Roofs.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes"+suffix, wood);
        Roofs.setRegistrationRockModLoaded(MODID, ROCKS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes"+suffix, stone);
        Roofs.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix, wood);
        Roofs.setRegistrationRockModLoaded(MODID, ROCKS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix, stone);

        Fences.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse"+suffix, wood);
        Fences.setRegistrationHedgesModLoaded(MODID, LEAVES_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse"+suffix, leave);
        Fences.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes"+suffix, wood);
        Fences.setRegistrationRockModLoaded(MODID, ROCKS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes"+suffix, stone);
        Fences.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix, wood);
        Fences.setRegistrationHedgesModLoaded(MODID, LEAVES_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix, leave);
        Fences.setRegistrationRockModLoaded(MODID, ROCKS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix, stone);

        Furnitures.setRegistrationWood(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse"+suffix);
        Furnitures.setRegistrationWood(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes"+suffix);
        Furnitures.setRegistrationWood(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix);

        Stairs.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse"+suffix, wood);
        Stairs.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes"+suffix, wood);
        Stairs.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix, wood);

        Paths.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse"+suffix);
        Paths.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes"+suffix);
        Paths.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix);

        Doors.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse"+suffix);
        Doors.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes"+suffix);
        Doors.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix);

        Trapdoors.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse"+suffix);
        Trapdoors.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes"+suffix);
        Trapdoors.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix);

        Windows.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, "traverse"+suffix);
        Windows.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, "cinderscapes"+suffix);
        Windows.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, "terrestria"+suffix);


        APIFuels.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, Registration.getAllModTypeWood());
        APIFuels.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, Registration.getAllModTypeWood());
        APIFuels.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, Registration.getAllModTypeWood());

        APIFuels.initAllLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);
        APIFuels.initAllLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);

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