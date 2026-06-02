package fr.samlegamer.mcwquark;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.RegistrationNeoForge;
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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.SoundType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.IconRandomNeoForge;
import org.jetbrains.annotations.NotNull;
import javax.annotation.Nonnull;

@Mod(McwQuark.MODID)
public class McwQuark extends McwMod
{
	public static final String MODID = "mcwquark";
	private static final Logger LOGGER = LogManager.getLogger();

    public static final List<String> stone = List.of("soul_sandstone_bricks", "limestone_bricks", "jasper_bricks", "shale_bricks", "permafrost_bricks",
			"red_sandstone_bricks", "sandstone_bricks", "cobblestone_bricks", "mossy_cobblestone_bricks", "blackstone_bricks", "diorite_bricks", "granite_bricks",
			"andesite_bricks", "calcite_bricks", "dripstone_bricks", "raw_iron_bricks", "raw_gold_bricks", "raw_copper_bricks");
    public static final List<String> leaves = List.of("blue_blossom", "lavender_blossom", "orange_blossom", "red_blossom", "yellow_blossom", "ancient");
    public static final List<String> wood = List.of("blossom", "azalea", "ancient");

	private static final DeferredRegister.Blocks BLOCKS = RegistrationNeoForge.blocks(MODID);
	private static final DeferredRegister.Items ITEMS = RegistrationNeoForge.items(MODID);
	private static final DeferredRegister<CreativeModeTab> CT = RegistrationNeoForge.creativeModeTab(MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWQUARK_TAB = CT.register("tab", () -> CreativeModeTab.builder()
	.icon(McwQuark::getIcon).title(Component.translatable(MODID + ".tab")).build());

	public McwQuark(IEventBus bus)
    {
        super(bus);
        List<String> rockClassic = List.of("soul_sandstone_bricks", "limestone_bricks", "jasper_bricks", "shale_bricks", "permafrost_bricks",
				"red_sandstone_bricks", "sandstone_bricks", "cobblestone_bricks", "mossy_cobblestone_bricks", "blackstone_bricks", "diorite_bricks", "granite_bricks",
				"andesite_bricks", "raw_iron_bricks", "raw_gold_bricks", "raw_copper_bricks");

		Map<String, SoundType> rockSounds = new LinkedHashMap<>();
		rockSounds.put("calcite_bricks", SoundType.CALCITE);
		rockSounds.put("dripstone_bricks", SoundType.DRIPSTONE_BLOCK);

		LOGGER.info("Macaw's Quark Loading...");
		RegistrationNeoForge.init(bus, BLOCKS, ITEMS, CT);

		McwRegistry.setRegistriesWood(wood, BLOCKS, ITEMS, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(leaves, BLOCKS, ITEMS);
		McwRegistry.setRegistriesStone(rockClassic, BLOCKS, ITEMS, ModType.getAllModTypeStone());
		McwRegistry.setRegistriesStone(rockSounds, BLOCKS, ITEMS, ModType.getAllModTypeStone());

		bus.addListener(this::clientSetup);
		bus.addListener(this::commonSetup);
		bus.addListener(this::dataSetup);
		bus.addListener(this::tabSetup);
		bus.addListener(this::addToFurnitureStorage);
		LOGGER.info("Macaw's Quark Is Charged !");
	}

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			APIRenderTypes.initAllWood(event, MODID, wood, ModType.getAllModTypeWood());
			APIRenderTypes.initAllLeave(event, MODID, leaves);
			APIRenderTypes.initAllWood(event, MODID, stone, ModType.getAllModTypeStone());
		});
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

        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(output, lookupProvider, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider provider) {
					addAllMcwTagsWood(MODID, wood, ModType.getAllModTypeWood());
					addAllMcwTagsLeave(MODID, leaves);
					addAllMcwTagsStone(MODID, stone, ModType.getAllModTypeStone());
                }
            };

            generator.addProvider(true, new Recipes(output, lookupProvider));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(output, lookupProvider, mcwBlockTags.contentsGetter(), MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider provider) {
					addAllMcwTagsWood(MODID, wood, ModType.getAllModTypeWood());
					addAllMcwTagsLeave(MODID, leaves);
					addAllMcwTagsStone(MODID, stone, ModType.getAllModTypeStone());
                }
            });
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, MODID, wood, MCWQUARK_TAB.get(), ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, leaves, MCWQUARK_TAB.get());
        APICreativeTab.initAllStone(event, MODID, stone, MCWQUARK_TAB.get(), ModType.getAllModTypeStone());
    }

	private void addToFurnitureStorage(BlockEntityTypeAddBlocksEvent event) {
		McwCommon.addCompatibleBlocksToFurnitureStorage(event, MODID, wood);
	}

	@Nonnull
	private static ItemStack getIcon()
	{
		return IconRandomNeoForge.buildIcon(
				Finder.findBlock(MODID, "limestone_bricks_roof"),
				Finder.findBlock(MODID, "orange_blossom_hedge"),
				Finder.findBlock(MODID, "blossom_bookshelf"),
				Finder.findBlock(MODID, "marble_bricks_bridge"),
				Finder.findBlock(MODID, "azalea_shutter"),
				Finder.findBlock(MODID, "blossom_beach_door"),
				Finder.findBlock(MODID, "azalea_paper_trapdoor"),
				Finder.findBlock(MODID, "blossom_planks_path"),
				Finder.findBlock(MODID, "ancient_balcony"),
				ModType.getAllModTypeWood());
	}
}