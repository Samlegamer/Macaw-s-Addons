package fr.samlegamer.mcwregionsunexplored;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import java.util.List;
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

    public static final CreativeModeTab MCWREGIONUNEXPLORED_TAB = new CreativeModeTab(MODID + ".tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
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
            Block icon = woodProperties.buildIcon(ModType.ROOFS, ModType.FENCES, ModType.FURNITURES, ModType.BRIDGES, ModType.WINDOWS,
                    ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS, ModType.STAIRS);
            return new ItemStack(icon);
        }
    };

    public McwRegionsUnexplored()
    {
        LOGGER.info("Macaw's Regions Unexplored Loading...");
        Registration.init(block, item);
        McwRegistry.setRegistriesWood(WOOD, block, item, MCWREGIONUNEXPLORED_TAB, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVES, block, item, MCWREGIONUNEXPLORED_TAB);
        bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
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
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if (gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(generator, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            };
            generator.addProvider(true, new Recipes(generator));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            });
        }
    }
}