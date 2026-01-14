package fr.samlegamer.mcwregionsunexplored;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwCommon;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.minecraftforge.registries.RegistryObject;
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
    public static final List<String> WOOD = List.of("baobab", "blackwood", "cypress", "dead", "eucalyptus", "joshua",
    "larch", "maple", "mauve", "palm", "pine", "redwood", "willow", "brimwood", "cobalt", "kapok", "magnolia", "socotra",
    "blue_bioshroom", "green_bioshroom", "pink_bioshroom", "yellow_bioshroom");
    public static final List<String> LEAVES = List.of("baobab", "blackwood", "cypress", "dead", "eucalyptus",
    "larch", "maple", "mauve", "palm", "pine", "redwood", "willow", "alpha_oak", "red_maple", "orange_maple", "golden_larch",
    "dead_pine", "silver_birch", "bamboo", "socotra", "kapok", "enchanted_birch", "blue_magnolia", "magnolia", "pink_magnolia",
    "white_magnolia", "brimwood");

    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    private static final DeferredRegister<CreativeModeTab> tabs = Registration.creativeModeTab(MODID);

    public static final RegistryObject<CreativeModeTab> MCWREGIONUNEXPLORED_TAB = tabs.register("tab", () -> CreativeModeTab.builder()
            .icon(McwRegionsUnexplored::makeIcon).title(Component.translatable(MODID+".tab")).build());

    public McwRegionsUnexplored(FMLJavaModLoadingContext context)
    {
        super(context);
        LOGGER.info("Macaw's Regions Unexplored Loading...");
        Registration.init(context, block, item, tabs);
        McwRegistry.setRegistriesWood(WOOD, block, item, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVES, block, item);
        context.getModEventBus().addListener(this::clientSetup);
        context.getModEventBus().addListener(this::commonSetup);
        context.getModEventBus().addListener(this::dataSetup);
        context.getModEventBus().addListener(this::tabSetup);
        LOGGER.info("Macaw's Regions Unexplored Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent fmlClientSetupEvent) {
        APIRenderTypes.initAllWood(fmlClientSetupEvent, MODID, WOOD, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(fmlClientSetupEvent, MODID, LEAVES);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
            McwCommon.addCompatibleBlocksToFurnitureStorage(fmlCommonSetupEvent, MODID, WOOD);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = gatherDataEvent.getLookupProvider();

        if (gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(output, lookupProvider, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
                    addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            };
            generator.addProvider(true, new Recipes(output, lookupProvider));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(output, lookupProvider, mcwBlockTags.contentsGetter(), MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
                    addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            });
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, MODID, WOOD, MCWREGIONUNEXPLORED_TAB.get(), Registration.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, LEAVES, MCWREGIONUNEXPLORED_TAB.get());
    }

    public static ItemStack makeIcon() {
        NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(
                Finder.findBlock(MODID, "palm_roof"),
                Finder.findBlock(MODID, "willow_picket_fence"),
                Finder.findBlock(MODID, "redwood_wardrobe"),
                Finder.findBlock(MODID, "magnolia_log_bridge_middle"),
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
        Block icon = woodProperties.buildIcon(ModType.ROOFS, ModType.FENCES, ModType.FURNITURES, ModType.BRIDGES, ModType.WINDOWS,
                ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS, ModType.STAIRS);
        return new ItemStack(icon);
    }
}