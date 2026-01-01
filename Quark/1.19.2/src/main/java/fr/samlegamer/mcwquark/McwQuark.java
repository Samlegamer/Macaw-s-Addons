package fr.samlegamer.mcwquark;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Registration;
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
import java.util.List;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import javax.annotation.Nonnull;

@Mod(McwQuark.MODID)
public class McwQuark extends McwMod
{
	public static final String MODID = "mcwquark";
    private static final Logger LOGGER = LogManager.getLogger();

    public static final List<String> stone = List.of("soul_sandstone_bricks", "limestone_bricks", "jasper_bricks", "shale_bricks", "permafrost_bricks",
            "red_sandstone_bricks", "sandstone_bricks", "cobblestone_bricks",
			"mossy_cobblestone_bricks", "blackstone_bricks", "diorite_bricks",
            "granite_bricks", "andesite_bricks", "calcite_bricks", "dripstone_bricks",
            "tuff_bricks");
    public static final List<String> leaves = List.of("blue_blossom", "lavender_blossom", "orange_blossom", "pink_blossom", "red_blossom", "yellow_blossom", "ancient");
    public static final List<String> wood = List.of("blossom", "azalea", "ancient");

	private static final DeferredRegister<Block> BLOCKS = Registration.blocks(MODID);
	private static final DeferredRegister<Item> ITEMS = Registration.items(MODID);
	public static final CreativeModeTab MCWQUARK_TAB = new CreativeModeTab(MODID + ".tab") {
	    @Override
		@Nonnull
	    public ItemStack makeIcon() {
	    	NewIconRandom.NewProperties propIcon = new NewIconRandom.NewProperties(
					Finder.findBlock(MODID, "limestone_bricks_roof"),
					Finder.findBlock(MODID, "orange_blossom_hedge"),
					Finder.findBlock(MODID, "blossom_bookshelf"),
					Finder.findBlock(MODID, "marble_bricks_bridge"),
					Finder.findBlock(MODID, "azalea_shutter"),
					Finder.findBlock(MODID, "blossom_beach_door"),
					Finder.findBlock(MODID, "azalea_paper_trapdoor"),
					Finder.findBlock(MODID, "blossom_planks_path"),
					Finder.findBlock(MODID, "ancient_balcony"));
	    	
	    	propIcon
					.addType(ModType.BRIDGES)
					.addType(ModType.ROOFS)
					.addType(ModType.FENCES)
					.addType(ModType.FURNITURES)
					.addType(ModType.STAIRS)
					.addType(ModType.WINDOWS)
					.addType(ModType.DOORS)
					.addType(ModType.TRAPDOORS)
					.addType(ModType.PATHS);
	    	Block icon = propIcon.buildIcon(ModType.BRIDGES, ModType.ROOFS, ModType.FENCES, ModType.FURNITURES,
					ModType.STAIRS, ModType.WINDOWS, ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS);
	        return new ItemStack(icon);
	    }
	};

    public McwQuark()
    {
    	LOGGER.info("Macaw's Quark Loading...");
		Registration.init(BLOCKS, ITEMS);

		McwRegistry.setRegistriesWood(wood, BLOCKS, ITEMS, MCWQUARK_TAB, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(leaves, BLOCKS, ITEMS, MCWQUARK_TAB);
		McwRegistry.setRegistriesStone(stone, BLOCKS, ITEMS, MCWQUARK_TAB, ModType.getAllModTypeStone());

        bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
		LOGGER.info("Macaw's Quark Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, MODID, wood, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, leaves);
        APIRenderTypes.initAllWood(event, MODID, stone, ModType.getAllModTypeStone());
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, wood);
            McwLootTables.addBlockHedges(MODID, leaves);
            McwLootTables.addBlockAllStone(MODID, stone);
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

            generator.addProvider(true, new Recipes(generator));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
					addAllMcwTagsWood(MODID, wood, ModType.getAllModTypeWood());
					addAllMcwTagsStone(MODID, stone, ModType.getAllModTypeStone());
					addAllMcwTagsLeave(MODID, leaves);
                }
            });
        }
    }
}