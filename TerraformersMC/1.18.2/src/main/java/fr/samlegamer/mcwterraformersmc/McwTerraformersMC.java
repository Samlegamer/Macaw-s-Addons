package fr.samlegamer.mcwterraformersmc;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.annotation.Nonnull;
import java.util.List;
import java.util.Random;

@Mod(McwTerraformersMC.MODID)
public class McwTerraformersMC
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

    private static final DeferredRegister<Block> BLOCKS = Registration.blocks(MODID);
    private static final DeferredRegister<Item> ITEMS = Registration.items(MODID);

    public static final CreativeModeTab MCWTERRAFORMERSMC_TAB = new CreativeModeTab(MODID + ".tab") {
        @Override
        @Nonnull
        public ItemStack makeIcon() {
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
            Block icon = propIcon.buildIcon(NewIconRandom.BlockType.BRIDGES, NewIconRandom.BlockType.ROOFS, NewIconRandom.BlockType.FENCES,
                    NewIconRandom.BlockType.FURNITURES, NewIconRandom.BlockType.STAIRS, NewIconRandom.BlockType.PATHS, NewIconRandom.BlockType.DOORS,
                    NewIconRandom.BlockType.WINDOWS, NewIconRandom.BlockType.TRAPDOORS);
            return new ItemStack(icon);
        }
    };

    public McwTerraformersMC()
    {
        LOGGER.info("Macaw's TerraformersMC Loading...");
        Registration.init(BLOCKS, ITEMS);
        final BlockBehaviour.Properties wood = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS);
        final BlockBehaviour.Properties stone = BlockBehaviour.Properties.copy(Blocks.COBBLESTONE);
        final BlockBehaviour.Properties leave = BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES);

        Bridges.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse", wood);
        Bridges.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", wood);
        Bridges.setRegistrationRockModLoaded(ROCKS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", stone);
        Bridges.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", wood);
        Bridges.setRegistrationRockModLoaded(ROCKS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", stone);

        Roofs.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse", wood);
        Roofs.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", wood);
        Roofs.setRegistrationRockModLoaded(ROCKS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", stone);
        Roofs.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", wood);
        Roofs.setRegistrationRockModLoaded(ROCKS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", stone);

        Fences.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse", wood);
        Fences.setRegistrationHedgesModLoaded(LEAVES_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse", leave);
        Fences.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", wood);
        Fences.setRegistrationRockModLoaded(ROCKS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", stone);
        Fences.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", wood);
        Fences.setRegistrationHedgesModLoaded(LEAVES_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", leave);
        Fences.setRegistrationRockModLoaded(ROCKS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", stone);

        Furnitures.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse");
        Furnitures.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Furnitures.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria");

        Stairs.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse", wood);
        Stairs.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", wood);
        Stairs.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", wood);

        Paths.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse");
        Paths.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Paths.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria");

        Doors.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse");
        Doors.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Doors.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria");

        Trapdoors.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse");
        Trapdoors.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Trapdoors.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria");

        Windows.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse");
        Windows.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Windows.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria");

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
        LOGGER.info("Macaw's TerraformersMC Is Charged !");
    }

    private static String randomNaming()
    {
        Random rand = new Random();

        if(ModList.get().isLoaded("traverse") && ModList.get().isLoaded("cinderscapes") && ModList.get().isLoaded("terrestria"))
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
            if(ModList.get().isLoaded("cinderscapes"))
            {
                return "umbral";
            }

            if(ModList.get().isLoaded("traverse"))
            {
                return "fir";
            }

            if(ModList.get().isLoaded("terrestria"))
            {
                return "japanese_maple";
            }
        }
        return "fir";
    }

    private void client(FMLClientSetupEvent event)
    {
        APIRenderTypes.initAllWood(event, MODID, WOODS_TRAVERSE, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, LEAVES_TRAVERSE);

        APIRenderTypes.initAllWood(event, MODID, WOODS_CINDERSCAPES, Registration.getAllModTypeWood());
        APIRenderTypes.initAllStone(event, MODID, ROCKS_CINDERSCAPES, Registration.getAllModTypeStone());

        APIRenderTypes.initAllWood(event, MODID, WOODS_TERRESTRIA, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, LEAVES_TERRESTRIA);
        APIRenderTypes.initAllStone(event, MODID, ROCKS_TERRESTRIA, Registration.getAllModTypeStone());
    }
}