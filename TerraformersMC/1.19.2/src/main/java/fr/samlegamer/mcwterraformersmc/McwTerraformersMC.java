package fr.samlegamer.mcwterraformersmc;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.annotation.Nonnull;
import java.util.List;
import java.util.Random;

@Mod(McwTerraformersMC.MODID)
public class McwTerraformersMC extends McwMod
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

            propIcon.addType(ModType.BRIDGES)
                    .addType(ModType.ROOFS)
                    .addType(ModType.FENCES)
                    .addType(ModType.FURNITURES)
                    .addType(ModType.STAIRS)
                    .addType(ModType.PATHS)
                    .addType(ModType.DOORS)
                    .addType(ModType.WINDOWS)
                    .addType(ModType.TRAPDOORS);
            Block icon = propIcon.buildIcon(ModType.BRIDGES, ModType.ROOFS, ModType.FENCES,
                    ModType.FURNITURES, ModType.STAIRS, ModType.PATHS, ModType.DOORS,
                    ModType.WINDOWS, ModType.TRAPDOORS);
            return new ItemStack(icon);
        }
    };

    public McwTerraformersMC()
    {
        LOGGER.info("Macaw's TerraformersMC Loading...");
        Registration.init(BLOCKS, ITEMS);

        McwRegistry.setRegistriesWood(WOODS_TRAVERSE, BLOCKS, ITEMS, "traverse", MCWTERRAFORMERSMC_TAB, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVES_TRAVERSE, BLOCKS, ITEMS, "traverse", MCWTERRAFORMERSMC_TAB);
        McwRegistry.setRegistriesWood(WOODS_CINDERSCAPES, BLOCKS, ITEMS, "cinderscapes", MCWTERRAFORMERSMC_TAB, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesStone(ROCKS_CINDERSCAPES, BLOCKS, ITEMS, "cinderscapes", MCWTERRAFORMERSMC_TAB, Registration.getAllModTypeStone());
        McwRegistry.setRegistriesWood(WOODS_TERRESTRIA, BLOCKS, ITEMS, "terrestria", MCWTERRAFORMERSMC_TAB, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVES_TERRESTRIA, BLOCKS, ITEMS, "terrestria", MCWTERRAFORMERSMC_TAB);
        McwRegistry.setRegistriesStone(ROCKS_TERRESTRIA, BLOCKS, ITEMS, "terrestria", MCWTERRAFORMERSMC_TAB, Registration.getAllModTypeStone());

        bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
        LOGGER.info("Macaw's TerraformersMC Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, MODID, WOODS_TRAVERSE, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, LEAVES_TRAVERSE);

        APIRenderTypes.initAllWood(event, MODID, WOODS_CINDERSCAPES, Registration.getAllModTypeWood());
        APIRenderTypes.initAllStone(event, MODID, ROCKS_CINDERSCAPES, Registration.getAllModTypeStone());

        APIRenderTypes.initAllWood(event, MODID, WOODS_TERRESTRIA, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, LEAVES_TERRESTRIA);
        APIRenderTypes.initAllStone(event, MODID, ROCKS_TERRESTRIA, Registration.getAllModTypeStone());
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOODS_TRAVERSE);
            McwLootTables.addBlockHedges(MODID, LEAVES_TRAVERSE);

            McwLootTables.addBlockAllWood(MODID, WOODS_CINDERSCAPES);
            McwLootTables.addBlockAllStone(MODID, ROCKS_CINDERSCAPES);

            McwLootTables.addBlockAllWood(MODID, WOODS_TERRESTRIA);
            McwLootTables.addBlockHedges(MODID, LEAVES_TERRESTRIA);
            McwLootTables.addBlockAllStone(MODID, ROCKS_TERRESTRIA);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if (gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(generator, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOODS_TRAVERSE, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES_TRAVERSE);

                    addAllMcwTagsWood(MODID, WOODS_CINDERSCAPES, Registration.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, ROCKS_CINDERSCAPES, Registration.getAllModTypeStone());

                    addAllMcwTagsWood(MODID, WOODS_TERRESTRIA, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES_TERRESTRIA);
                    addAllMcwTagsStone(MODID, ROCKS_TERRESTRIA, Registration.getAllModTypeStone());
                }
            };

            generator.addProvider(true, new Recipes(generator));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOODS_TRAVERSE, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES_TRAVERSE);

                    addAllMcwTagsWood(MODID, WOODS_CINDERSCAPES, Registration.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, ROCKS_CINDERSCAPES, Registration.getAllModTypeStone());

                    addAllMcwTagsWood(MODID, WOODS_TERRESTRIA, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES_TERRESTRIA);
                    addAllMcwTagsStone(MODID, ROCKS_TERRESTRIA, Registration.getAllModTypeStone());
                }
            });
        }
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
}