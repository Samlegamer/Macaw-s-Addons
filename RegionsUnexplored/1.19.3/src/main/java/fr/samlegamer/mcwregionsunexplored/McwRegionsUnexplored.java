package fr.samlegamer.mcwregionsunexplored;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import org.jetbrains.annotations.NotNull;

@Mod(McwRegionsUnexplored.MODID)
public class McwRegionsUnexplored extends McwMod
{
    public static final String MODID = "mcwregionsunexplored";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> WOOD = List.of("baobab", "blackwood", "cherry", "cypress", "dead", "eucalyptus", "joshua",
    "larch", "maple", "mauve", "palm", "pine", "redwood", "sculkwood", "willow");
    public static final List<String> LEAVES = List.of("baobab", "blackwood", "cherry", "cypress", "dead", "eucalyptus",
    "larch", "maple", "mauve", "palm", "pine", "redwood", "sculkwood", "willow", "alpha_oak", "pink_cherry", "red_cherry", "white_cherry",
    "red_maple", "orange_maple", "golden_larch", "dead_pine", "silver_birch");

    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

    public static CreativeModeTab MCWREGIONUNEXPLORED_TAB;

    public McwRegionsUnexplored()
    {
        LOGGER.info("Macaw's Regions Unexplored Loading...");
        Registration.init(block, item);
        McwRegistry.setRegistriesWood(WOOD, block, item, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVES, block, item);
        bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
        bus().addListener(this::tabRegistry);
        bus().addListener(this::tabSetup);
        LOGGER.info("Macaw's Regions Unexplored Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent fmlClientSetupEvent) {
        APIRenderTypes.initAllWood(fmlClientSetupEvent, MODID, WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(fmlClientSetupEvent, MODID, LEAVES);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> holderLookupProvider = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if (gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(packOutput, holderLookupProvider, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
                    addAllMcwTagsWood(MODID, WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            };
            generator.addProvider(true, new Recipes(packOutput));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(packOutput, holderLookupProvider, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
                    addAllMcwTagsWood(MODID, WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            });
        }
    }

    @Override
    public void tabRegistry(CreativeModeTabEvent.Register register) {
        NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(
                Finder.findBlock(MODID, "palm_roof"),
                Finder.findBlock(MODID, "willow_picket_fence"),
                Finder.findBlock(MODID, "redwood_wardrobe"),
                Finder.findBlock(MODID, "cherry_log_bridge_middle"),
                Finder.findBlock(MODID, "eucalyptus_window"),
                Finder.findBlock(MODID, "larch_japanese_door"),
                Finder.findBlock(MODID, "maple_glass_trapdoor"),
                Finder.findBlock(MODID, "baobab_planks_path"),
                Finder.findBlock(MODID, "pine_loft_stairs")
        );
        woodProperties
                .addType(ModType.ROOFS)
                .addType(ModType.FENCES)
                .addType(ModType.FURNITURES)
                .addType(ModType.BRIDGES)
                .addType(ModType.WINDOWS)
                .addType(ModType.DOORS)
                .addType(ModType.TRAPDOORS)
                .addType(ModType.PATHS)
                .addType(ModType.STAIRS);
        final Block icon = woodProperties.buildIcon(ModType.ROOFS, ModType.FENCES, ModType.FURNITURES, ModType.BRIDGES, ModType.WINDOWS,
                ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS, ModType.STAIRS);

        MCWREGIONUNEXPLORED_TAB = Registration.tabs(register, MODID, "tab", icon);
    }

    @Override
    public void tabSetup(CreativeModeTabEvent.BuildContents event) {
        APICreativeTab.initAllWood(event, MODID, WOOD, MCWREGIONUNEXPLORED_TAB, ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, LEAVES, MCWREGIONUNEXPLORED_TAB);
    }
}