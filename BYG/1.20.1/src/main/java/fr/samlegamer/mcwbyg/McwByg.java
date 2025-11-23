package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.util.McwMod;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;

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

    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(MODID);

	public static final RegistryObject<CreativeModeTab> MCWBYG_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(McwByg::getIcon).title(Component.translatable(MODID+".tab")).build());

    public McwByg(FMLJavaModLoadingContext context)
    {
        super(context);
        List<String> leavesClassic = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony","fir","green_enchanted","holly","ironwood","jacaranda","mahogany","maple","palm","pine",
				"rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", "orange_birch",
				"red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "red_maple", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda",
				"flowering_ironwood", "flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "flowering_skyris", "flowering_yucca");
		List<String> leavesCherry = List.of("white_sakura", "yellow_sakura");

    	LOGGER.info("Macaw's Oh The Biomes We've Gone Loading...");
     	Registration.init(context, block, item, ct);
    	Bridges.setRegistrationWood(WOOD, block, item);
    	Bridges.setRegistrationRock(STONE, block, item);
    	Roofs.setRegistrationWood(WOOD, block, item);
    	Roofs.setRegistrationRock(STONE, block, item);
    	Fences.setRegistrationWood(WOOD, block, item);
    	Fences.setRegistrationHedges(leavesClassic, block, item);
		Fences.setRegistrationHedgesModLoaded(leavesCherry, block, item, BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES));
    	Fences.setRegistrationRock(STONE, block, item);
    	Furnitures.setRegistrationWood(WOOD, block, item);
    	Stairs.setRegistrationWood(WOOD, block, item);
		Paths.setRegistrationWood(WOOD, block, item);
		Doors.setRegistrationWood(WOOD, block, item);
		Trapdoors.setRegistrationWood(WOOD, block, item);
		Windows.setRegistrationWood(WOOD, block, item);

        context.getModEventBus().addListener(this::clientSetup);
        context.getModEventBus().addListener(this::commonSetup);
        context.getModEventBus().addListener(this::dataSetup);
        context.getModEventBus().addListener(this::tabSetup);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Oh The Biomes We've Gone Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, MODID, WOOD, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, LEAVES);
        APIRenderTypes.initAllStone(event, MODID, STONE, Registration.getAllModTypeStone());
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
            McwLootTables.addBlockAllStone(MODID, STONE);
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
                    addAllMcwTags(MODID, WOOD, STONE, LEAVES);
                }
            };
            generator.addProvider(true, new Recipes(packOutput));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(packOutput, registries, mcwBlockTags.contentsGetter(), MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.Provider p_256380_) {
                    addAllMcwTags(MODID, WOOD, STONE, LEAVES);
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
				.addType(BlockType.ROOFS)
				.addType(BlockType.FENCES)
				.addType(BlockType.BRIDGES)
				.addType(BlockType.FURNITURES)
				.addType(BlockType.STAIRS)
				.addType(BlockType.DOORS)
				.addType(BlockType.TRAPDOORS)
				.addType(BlockType.PATHS)
				.addType(BlockType.WINDOWS);
		return new ItemStack(prop.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.BRIDGES, BlockType.FURNITURES, BlockType.STAIRS,
				BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.WINDOWS));
	}
}