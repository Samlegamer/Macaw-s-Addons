package fr.samlegamer.mcwbyg;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.mapping.MappingMissing;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import net.minecraft.world.level.block.SoundType;
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
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import org.jetbrains.annotations.NotNull;

@Mod(McwByg.MODID)
public class McwByg extends McwMod
{
	public static final String MODID = "mcwbyg";
    private static final Logger LOGGER = LogManager.getLogger();
    
	public static final List<String> WOOD = List.of("aspen", "baobab", "blue_enchanted", "cika", "cypress", "ebony", "fir", 
	"green_enchanted", "holly", "ironwood", "jacaranda", "mahogany","maple", "palm", "pine", "rainbow_eucalyptus", "redwood", "sakura", 
	"skyris", "white_mangrove", "willow", "witch_hazel", "zelkova", "florus");

	public static final List<String> STONE = List.of("dacite_bricks", "red_rock_bricks", "pink_sandstone", "white_sandstone", "blue_sandstone", "purple_sandstone", 
	"black_sandstone", "windswept_sandstone");
	
	public static final List<String>  LEAVES = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony","fir","green_enchanted","holly","ironwood","jacaranda","mahogany","maple","palm","pine",
			"rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", "orange_birch", 
			"red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "white_sakura", "yellow_sakura", "red_maple", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", 
			"flowering_ironwood", "flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "flowering_skyris", "flowering_yucca");

    private static final DeferredRegister.Blocks block = Registration.blocks(MODID);
    private static final DeferredRegister.Items item = Registration.items(MODID);
    public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWBYG_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(McwByg::getIcon).title(Component.translatable(MODID+".tab")).build());

	private static final MappingMissing.Bridges bridges = new MappingMissing.Bridges("macawsbridgesbyg", McwByg.MODID, McwByg.WOOD, McwByg.STONE);
	private static final MappingMissing.Furnitures furnitures = new MappingMissing.Furnitures("mcwfurnituresbyg", McwByg.MODID, McwByg.WOOD);
	private static final MappingMissing.Fences fences = new MappingMissing.Fences("mcwfencesbyg", McwByg.MODID, McwByg.WOOD, McwByg.STONE);
	private static final MappingMissing.Roofs roofs = new MappingMissing.Roofs("macawsroofsbyg", McwByg.MODID, McwByg.WOOD);

	public McwByg(IEventBus bus)
    {
        super(bus);
		List<String> leavesClassic = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony","fir","green_enchanted","holly","ironwood","jacaranda","mahogany","maple","palm","pine",
				"rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", "orange_birch",
				"red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "red_maple", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda",
				"flowering_ironwood", "flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "flowering_skyris", "flowering_yucca");
		Map<String, SoundType> mapLeaveSoundCherry = McwRegistry.makeDefaultFromList(List.of("white_sakura", "yellow_sakura"), SoundType.CHERRY_LEAVES);

		LOGGER.info("Macaw's Oh the Biomes You'll Go Loading...");
     	Registration.init(bus, block, item, ct);

		McwRegistry.setRegistriesWood(WOOD, block, item, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(leavesClassic, block, item);
		McwRegistry.setRegistriesLeave(mapLeaveSoundCherry, block, item);
		McwRegistry.setRegistriesStone(STONE, block, item, Registration.getAllModTypeStone());

		LOGGER.info("Converting Loading...");
		fences.leavesAdding(McwByg.LEAVES);
		bridges.missingnoWoodBlock(block);
		bridges.missingnoStoneBlock(block, true);
		furnitures.missingnoWoodBlock(block);
		fences.missingnoWoodBlock(block);
		fences.missingnoStoneBlock(block);
		roofs.missingnoWoodBlock(block);

		fences.leavesAdding(McwByg.LEAVES);
		bridges.missingnoWoodItem(item);
		bridges.missingnoStoneItem(item, true);
		furnitures.missingnoWoodItem(item);
		fences.missingnoWoodItem(item);
		fences.missingnoStoneItem(item);
		roofs.missingnoWoodItem(item);
		LOGGER.info("Converting Finish !");

		bus.addListener(this::addFurnitures);
		bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::dataSetup);
        bus.addListener(this::tabSetup);
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, MODID, WOOD, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, LEAVES);
        APIRenderTypes.initAllStone(event, MODID, STONE, Registration.getAllModTypeStone());
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
            McwLootTables.addBlockAllStone(MODID, STONE);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(output, registries, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider provider) {
					addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
					addAllMcwTagsStone(MODID, STONE, Registration.getAllModTypeStone());
					addAllMcwTagsLeave(MODID, LEAVES);
                }
            };

            generator.addProvider(true, new Recipes(output, registries));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(output, registries, mcwBlockTags.contentsGetter(), MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider provider) {
					addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
					addAllMcwTagsStone(MODID, STONE, Registration.getAllModTypeStone());
					addAllMcwTagsLeave(MODID, LEAVES);
                }
            });
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, MODID, WOOD, MCWBYG_TAB.get(), Registration.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, LEAVES, MCWBYG_TAB.get());
        APICreativeTab.initAllStone(event, MODID, STONE, MCWBYG_TAB.get(), Registration.getAllModTypeStone());
    }

    private void addFurnitures(BlockEntityTypeAddBlocksEvent event)
    {
		McwCommon.addCompatibleBlocksToFurnitureStorage(event, MODID, WOOD);
    }

	private static ItemStack getIcon()
	{
		NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
				Finder.findBlock(MODID, "aspen_roof"),
				Finder.findBlock(MODID, "aspen_picket_fence"),
				Finder.findBlock(MODID, "aspen_wardrobe"),
				Finder.findBlock(MODID, "aspen_log_bridge_middle"),
				Finder.findBlock(MODID, "aspen_plank_window2"),
				Finder.findBlock(MODID, "aspen_paper_door"),
				Finder.findBlock(MODID, "aspen_blossom_trapdoor"),
				Finder.findBlock(MODID, "aspen_planks_path"),
				Finder.findBlock(MODID, "aspen_bulk_stairs"));

		prop
				.addType(ModType.ROOFS)
				.addType(ModType.FENCES)
				.addType(ModType.BRIDGES)
				.addType(ModType.FURNITURES)
				.addType(ModType.STAIRS)
				.addType(ModType.DOORS)
				.addType(ModType.TRAPDOORS)
				.addType(ModType.PATHS)
				.addType(ModType.WINDOWS);
		return new ItemStack(prop.buildIcon(ModType.ROOFS, ModType.FENCES, ModType.BRIDGES, ModType.FURNITURES, ModType.STAIRS,
				ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS, ModType.WINDOWS));
	}
}