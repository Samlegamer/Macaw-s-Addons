package fr.samlegamer.mcwquark;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.IconRandomForge;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import java.util.List;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import javax.annotation.Nonnull;

@Mod(McwQuark.MODID)
@Mod.EventBusSubscriber(modid = McwQuark.MODID, bus = Bus.MOD)
public class McwQuark extends McwMod
{
	public static final String MODID = "mcwquark";
    private static final Logger LOGGER = LogManager.getLogger();

    public static final List<String> stone = List.of("soul_sandstone_bricks", "limestone_bricks", "jasper_bricks", "shale_bricks", "permafrost_bricks", "red_sandstone_bricks", "sandstone_bricks", "cobblestone_bricks",
			"mossy_cobblestone_bricks", "blackstone_bricks", "diorite_bricks", "granite_bricks", "andesite_bricks", "calcite_bricks", "dripstone_bricks", "tuff_bricks");
    public static final List<String> leaves = List.of("blue_blossom", "lavender_blossom", "orange_blossom", "pink_blossom", "red_blossom", "yellow_blossom");
    public static final List<String> wood = List.of("blossom", "azalea");

	public static final CreativeModeTab MCWQUARK_TAB = new CreativeModeTab(MODID + ".tab") {
	    @Override
		@Nonnull
	    public ItemStack makeIcon() {
	        return IconRandomForge.buildIcon(
                    Finder.findBlock(MODID, "limestone_bricks_roof"),
                    Finder.findBlock(MODID, "orange_blossom_hedge"),
                    Finder.findBlock(MODID, "blossom_bookshelf"),
                    Finder.findBlock(MODID, "marble_bricks_bridge"),
                    Finder.findBlock(MODID, "azalea_shutter"),
                    Finder.findBlock(MODID, "blossom_beach_door"),
                    Finder.findBlock(MODID, "azalea_paper_trapdoor"),
                    Finder.findBlock(MODID, "blossom_planks_path"),
                    Finder.findBlock(MODID, "azalea_balcony"),
                    ModType.getAllModTypeWood());
	    }
	};
	
    public McwQuark()
    {
    	LOGGER.info("Macaw's Quark Loading...");
		bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
    	LOGGER.info("Macaw's Quark Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, MODID, wood, ModType.getAllModTypeWood());
        APIRenderTypes.initAllStone(event, MODID, stone, ModType.getAllModTypeStone());
        APIRenderTypes.initAllLeave(event, MODID, leaves);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(MODID, wood);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(MODID, leaves);
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllStone(MODID, stone);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(generator, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, wood, ModType.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, stone, ModType.getAllModTypeStone());
                    addAllMcwTagsLeave(MODID, leaves);
                }
            };

            generator.addProvider(new Recipes(generator));
            generator.addProvider(mcwBlockTags);
            generator.addProvider(new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, wood, ModType.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, stone, ModType.getAllModTypeStone());
                    addAllMcwTagsLeave(MODID, leaves);
                }
            });
        }
    }
    
    @SubscribeEvent
    public static void registry(final RegistryEvent.Register<Block> event)
    {
        McwRegistry.registryEventWood(event, MODID, wood, MCWQUARK_TAB, ModType.getAllModTypeWood());
        McwRegistry.registryEventLeave(event, MODID, leaves, MCWQUARK_TAB);
        McwRegistry.registryEventStone(event, MODID, stone, MCWQUARK_TAB, ModType.getAllModTypeStone());
    }
}