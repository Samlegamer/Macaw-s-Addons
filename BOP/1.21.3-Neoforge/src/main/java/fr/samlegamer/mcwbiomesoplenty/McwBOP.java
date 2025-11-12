package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.furnitures.AddFurnituresStorage;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.mapping.MappingMissing;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import org.jetbrains.annotations.NotNull;

@Mod(McwBOP.MODID)
public class McwBOP extends McwMod
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "maple", "pine");
	public static final List<String> LEAVES = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", 
	"empyreal",
	"pine",
	"orange_maple", "red_maple", "yellow_maple", "cypress", "snowblossom", "flowering_oak", "rainbow_birch", "origin");
    protected static final DeferredRegister.Blocks block = Registration.blocks(MODID);
	protected static final DeferredRegister.Items item = DeferredRegister.createItems(MODID); //CHANGE THIS IN THE NEXT ADDONSLIB UPDATE
	protected static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(McwBOP.MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWBOP_TAB = ct.register("tab", () -> CreativeModeTab.builder()
			.title(Component.translatable(McwBOP.MODID + "." + "tab")).icon(McwBOP::getIcon).build());

	public McwBOP(IEventBus bus)
    {
        super(bus);
        LOGGER.info("Macaw's Biomes O' Plenty Loading...");
		Registration.init(bus, block, item, ct);

		final MappingMissing.Bridges bridges = new MappingMissing.Bridges("macawsbridgesbop", McwBOP.MODID, McwBOP.WOOD);
		final MappingMissing.Furnitures furnitures = new MappingMissing.Furnitures("mcwfurnituresbop", McwBOP.MODID, McwBOP.WOOD);
		final MappingMissing.Fences fences = new MappingMissing.Fences("mcwfencesbop", McwBOP.MODID, McwBOP.WOOD);
		final MappingMissing.Roofs roofs = new MappingMissing.Roofs("macawsroofsbop", McwBOP.MODID, McwBOP.WOOD);

		McwBOP.LOGGER.info("Start convert blocks");
		fences.leavesAdding(McwBOP.LEAVES);
		bridges.missingnoWoodBlock(McwBOP.block);
		furnitures.missingnoWoodBlock(McwBOP.block);
		fences.missingnoWoodBlock(McwBOP.block);
		roofs.missingnoWoodBlock(McwBOP.block);
		McwBOP.LOGGER.info("Finish convert blocks");
		McwBOP.LOGGER.info("Start convert items");
		fences.leavesAdding(McwBOP.LEAVES);
		bridges.missingnoWoodItem(McwBOP.item);
		furnitures.missingnoWoodItem(McwBOP.item);
		fences.missingnoWoodItem(McwBOP.item);
		roofs.missingnoWoodItem(McwBOP.item);
		McwBOP.LOGGER.info("Finish convert items");

		BlockBehaviour.Properties prop_crimson = BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD);
		BlockBehaviour.Properties prop_cherry = BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava();

		List<String> woodClassic = List.of("dead", "fir", "mahogany", "palm", "redwood", "willow", "pine");
		List<String> woodCrimson = List.of("hellbark", "umbran", "empyreal");
		List<String> woodCherry = List.of("magic", "jacaranda", "maple");

		List<String> leaveClassic = List.of("dead", "fir", "hellbark", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "pine", "cypress", "flowering_oak", "rainbow_birch", "origin");
		List<String> leaveCherry = List.of("snowblossom", "orange_maple", "red_maple", "yellow_maple", "jacaranda", "magic");

		Bridges.setRegistrationWood(woodClassic, block, item);
		Fences.setRegistrationWood(woodClassic, block, item);
		Fences.setRegistrationHedges(leaveClassic, block, item);
		Furnitures.setRegistrationWood(woodClassic, block, item);
		Roofs.setRegistrationWood(woodClassic, block, item);
		Trapdoors.setRegistrationWood(woodClassic, block, item);
		Paths.setRegistrationWood(woodClassic, block, item);
		Doors.setRegistrationWood(woodClassic, block, item);
		Windows.setRegistrationWood(woodClassic, block, item);
		Stairs.setRegistrationWood(woodClassic, block, item);

		Bridges.setRegistrationWoodModLoaded(woodCrimson, block, item, prop_crimson);
		Fences.setRegistrationWoodModLoaded(woodCrimson, block, item, prop_crimson);
		Furnitures.setRegistrationWoodModLoaded(woodCrimson, block, item, prop_crimson);
		Roofs.setRegistrationWoodModLoaded(woodCrimson, block, item, prop_crimson);
		Trapdoors.setRegistrationWoodModLoaded(woodCrimson, block, item, prop_crimson);
		Paths.setRegistrationWoodModLoaded(woodCrimson, block, item, prop_crimson);
		Doors.setRegistrationWoodModLoaded(woodCrimson, block, item, prop_crimson, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().pushReaction(PushReaction.DESTROY));
		Windows.setRegistrationWoodModLoaded(woodCrimson, block, item, prop_crimson);
		Stairs.setRegistrationWoodModLoaded(woodCrimson, block, item, prop_crimson);

		Bridges.setRegistrationWoodModLoaded(woodCherry, block, item, prop_cherry);
		Fences.setRegistrationWoodModLoaded(woodCherry, block, item, prop_cherry);
		Fences.setRegistrationHedgesModLoaded(leaveCherry, block, item, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(0.2F).randomTicks().sound(SoundType.CHERRY_LEAVES).noOcclusion());
		Furnitures.setRegistrationWoodModLoaded(woodCherry, block, item, prop_cherry);
		Roofs.setRegistrationWoodModLoaded(woodCherry, block, item, prop_cherry);
		Trapdoors.setRegistrationWoodModLoaded(woodCherry, block, item, prop_cherry);
		Paths.setRegistrationWoodModLoaded(woodCherry, block, item, prop_cherry);
		Doors.setRegistrationWoodModLoaded(woodCherry, block, item, prop_cherry, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion());
		Windows.setRegistrationWoodModLoaded(woodCherry, block, item, prop_cherry);
		Stairs.setRegistrationWoodModLoaded(woodCherry, block, item, prop_cherry);

		bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::dataSetup);
        bus.addListener(this::tabSetup);
		bus.addListener(this::addFurnitures);
		LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event)
	{
		APIRenderTypes.initAllWood(event, MODID, WOOD, Registration.getAllModTypeWood());
		APIRenderTypes.initAllLeave(event, MODID, LEAVES);
	}

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        McwBlockTags mcwBlockTags = new McwBlockTags(output, registries, MODID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
                addAllMcwTags(MODID, WOOD, LEAVES);
            }
        };

        generator.addProvider(true, new Recipes.Runner(output, registries));
        generator.addProvider(true, mcwBlockTags);
        generator.addProvider(true, new McwItemTags(output, registries, mcwBlockTags.contentsGetter(), MODID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
                addAllMcwTags(MODID, WOOD, LEAVES);
            }
        });

    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, MODID, WOOD, MCWBOP_TAB.get(), Registration.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, LEAVES, MCWBOP_TAB.get());
    }

    private void addFurnitures(BlockEntityTypeAddBlocksEvent event)
	{
		AddFurnituresStorage.addCompatibleBlocksToFurnitureStorage(event, MODID, WOOD);
	}

	private static ItemStack getIcon()
    {
    	NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "redwood_roof"), Finder.findBlock(MODID, "redwood_picket_fence"), Finder.findBlock(MODID, "redwood_wardrobe"), 
    	        Finder.findBlock(MODID, "redwood_log_bridge_middle"), Finder.findBlock(MODID, "redwood_window"), Finder.findBlock(MODID, "redwood_japanese_door"), Finder.findBlock(MODID, "redwood_glass_trapdoor"), 
    	        Finder.findBlock(MODID, "redwood_planks_path"), Finder.findBlock(MODID, "redwood_loft_stairs"));
    	    	woodProperties
    	    	.addType(BlockType.ROOFS)
    	    	.addType(BlockType.FENCES)
    	    	.addType(BlockType.FURNITURES)
    	    	.addType(BlockType.BRIDGES)
    	    	.addType(BlockType.WINDOWS)
    	    	.addType(BlockType.DOORS)
    	    	.addType(BlockType.TRAPDOORS)
    	    	.addType(BlockType.PATHS)
    	    	.addType(BlockType.STAIRS);
    	return new ItemStack(woodProperties.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES, BlockType.BRIDGES, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.STAIRS));
    }
}