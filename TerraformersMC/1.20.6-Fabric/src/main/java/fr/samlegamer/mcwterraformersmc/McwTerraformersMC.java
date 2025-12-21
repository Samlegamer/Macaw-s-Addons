package fr.samlegamer.mcwterraformersmc;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
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

    public static final ItemGroup MCWTERRAFORMERSMC_TAB = APICreativeTab.initGroup(MODID, McwTerraformersMC::icon);

    public void onInitialize()
    {
        LOGGER.info("Macaw's TerraformersMC Loading...");
        McwRegistry.setRegistriesWood(MODID, WOODS_TRAVERSE, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesWood(MODID, McwRegistry.makeDefaultFromList(WOODS_CINDERSCAPES, BlockSoundGroup.NETHER_WOOD), Registration.getAllModTypeWood());
        McwRegistry.setRegistriesWood(MODID, WOODS_TERRESTRIA, Registration.getAllModTypeWood());

        McwRegistry.setRegistriesLeave(MODID, LEAVES_TRAVERSE);
        McwRegistry.setRegistriesLeave(MODID, LEAVES_TERRESTRIA);

        McwRegistry.setRegistriesStone(MODID, ROCKS_CINDERSCAPES, Registration.getAllModTypeStone());
        McwRegistry.setRegistriesStone(MODID, ROCKS_TERRESTRIA, Registration.getAllModTypeStone());

        APICreativeTab.registerGroup(MODID, MCWTERRAFORMERSMC_TAB);
        boolean isDev = FabricLoader.getInstance().isDevelopmentEnvironment();

        if(FabricLoader.getInstance().isModLoaded("traverse") || isDev)
        {
            APICreativeTab.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, MCWTERRAFORMERSMC_TAB, Registration.getAllModTypeWood());
            APICreativeTab.initAllLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE, MCWTERRAFORMERSMC_TAB);
        }

        if(FabricLoader.getInstance().isModLoaded("cinderscapes") || isDev)
        {
            APICreativeTab.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, Registration.getAllModTypeWood());
            APICreativeTab.initAllStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES, MCWTERRAFORMERSMC_TAB, Registration.getAllModTypeStone());
        }

        if(FabricLoader.getInstance().isModLoaded("terrestria") || isDev)
        {
            APICreativeTab.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, Registration.getAllModTypeWood());
            APICreativeTab.initAllStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA, MCWTERRAFORMERSMC_TAB, Registration.getAllModTypeStone());
            APICreativeTab.initAllLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA, MCWTERRAFORMERSMC_TAB);
        }

        APIFuels.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        APIFuels.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        APIFuels.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        APIFuels.initAllLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);
        APIFuels.initAllLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);

        LOGGER.info("Macaw's TerraformersMC Is Charged !");
    }

    private static ItemStack icon()
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

        propIcon.addType(ModType.BRIDGES)
                .addType(ModType.ROOFS)
                .addType(ModType.FENCES)
                .addType(ModType.FURNITURES)
                .addType(ModType.STAIRS)
                .addType(ModType.PATHS)
                .addType(ModType.DOORS)
                .addType(ModType.WINDOWS)
                .addType(ModType.TRAPDOORS);
        return new ItemStack(propIcon.buildIcon(ModType.BRIDGES, ModType.ROOFS, ModType.FENCES,
                ModType.FURNITURES, ModType.STAIRS, ModType.PATHS, ModType.DOORS,
                ModType.WINDOWS, ModType.TRAPDOORS));
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