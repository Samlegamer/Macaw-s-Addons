package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.AddFurnituresStorage;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;

@Mod(McwBOP.MODID)
public class McwBOP extends McwMod
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "maple", "pine");
	public static final List<String> LEAVES = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", 
	"empyreal", "pine", "orange_maple", "red_maple", "yellow_maple", "cypress", "snowblossom", "flowering_oak", "rainbow_birch", "origin");
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(McwBOP.MODID);

	public static final RegistryObject<CreativeModeTab> MCWBOP_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(McwBOP::getIcon).title(Component.translatable(McwBOP.MODID+".tab")).build());

    public McwBOP(FMLJavaModLoadingContext context)
    {
        super(context);
        LOGGER.info("Macaw's Biomes O' Plenty Loading...");
     	Registration.init(context, block, item, ct);

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

    	context.getModEventBus().addListener(this::clientSetup);
		context.getModEventBus().addListener(this::commonSetup);
        context.getModEventBus().addListener(this::dataSetup);
		context.getModEventBus().addListener(this::tabSetup);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event)
	{
		APIRenderTypes.initAllWood(event, MODID, WOOD, Registration.getAllModTypeWood());
		APIRenderTypes.initAllLeave(event, MODID, LEAVES);
	}

    @Override
    public void commonSetup(FMLCommonSetupEvent event)
	{
		AddFurnituresStorage.addCompatibleBlocksToFurnitureStorage(event, MODID, WOOD);
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
        });
	}

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(packOutput, registries, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.Provider p_256380_) {
                    addAllMcwTags(MODID, WOOD, LEAVES);
                }
            };
            generator.addProvider(true, new Recipes.Runner(packOutput, registries));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(packOutput, registries, mcwBlockTags.contentsGetter(), MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.Provider p_256380_) {
                    addAllMcwTags(MODID, WOOD, LEAVES);
                }
            });
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, MODID, WOOD, MCWBOP_TAB.get(), Registration.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, LEAVES, MCWBOP_TAB.get());
    }

    private static ItemStack getIcon()
	{
		NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
				Finder.findBlock(MODID, "redwood_roof"),
				Finder.findBlock(MODID, "redwood_picket_fence"),
				Finder.findBlock(MODID, "redwood_wardrobe"),
				Finder.findBlock(MODID, "redwood_log_bridge_middle"),
				Finder.findBlock(MODID, "redwood_pane_window"),
				Finder.findBlock(MODID, "redwood_modern_door"),
				Finder.findBlock(MODID, "redwood_mystic_trapdoor"),
				Finder.findBlock(MODID, "redwood_planks_path"),
				Finder.findBlock(MODID, "redwood_skyline_stairs"));

		prop.addType(NewIconRandom.BlockType.BRIDGES)
				.addType(NewIconRandom.BlockType.ROOFS)
				.addType(NewIconRandom.BlockType.FENCES)
				.addType(NewIconRandom.BlockType.FURNITURES)
				.addType(NewIconRandom.BlockType.STAIRS)
				.addType(NewIconRandom.BlockType.PATHS)
				.addType(NewIconRandom.BlockType.WINDOWS)
				.addType(NewIconRandom.BlockType.DOORS)
				.addType(NewIconRandom.BlockType.TRAPDOORS);
		Block icon = prop.buildIcon(NewIconRandom.BlockType.BRIDGES, NewIconRandom.BlockType.ROOFS, NewIconRandom.BlockType.FENCES, NewIconRandom.BlockType.FURNITURES, NewIconRandom.BlockType.STAIRS,
				NewIconRandom.BlockType.PATHS, NewIconRandom.BlockType.WINDOWS, NewIconRandom.BlockType.DOORS, NewIconRandom.BlockType.TRAPDOORS);
		return new ItemStack(icon);
	}
}