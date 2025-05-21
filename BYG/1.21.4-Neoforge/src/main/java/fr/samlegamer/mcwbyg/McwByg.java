package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.mapping.MappingMissing;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import java.util.List;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.AddFurnituresStorage;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;

@Mod(McwByg.MODID)
public class McwByg
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
		List<String> leavesClassic = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony","fir","green_enchanted","holly","ironwood","jacaranda","mahogany","maple","palm","pine",
				"rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", "orange_birch",
				"red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "red_maple", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda",
				"flowering_ironwood", "flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "flowering_skyris", "flowering_yucca");
		List<String> leavesCherry = List.of("white_sakura", "yellow_sakura");

		LOGGER.info("Macaw's Oh the Biomes You'll Go Loading...");
     	Registration.init(bus, block, item, ct);
		Bridges.setRegistrationWood(WOOD, block, item);
		Bridges.setRegistrationRock(STONE, block, item);
		Roofs.setRegistrationWood(WOOD, block, item);
		Roofs.setRegistrationRock(STONE, block, item);
		Fences.setRegistrationWood(WOOD, block, item);
		Fences.setRegistrationHedges(leavesClassic, block, item);
		Fences.setRegistrationHedgesModLoaded(leavesCherry, block, item, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES));
		Fences.setRegistrationRock(STONE, block, item);
		Furnitures.setRegistrationWood(WOOD, block, item);
		Stairs.setRegistrationWood(WOOD, block, item);
		// 1.1 Update
		Paths.setRegistrationWood(WOOD, block, item);
		Doors.setRegistrationWood(WOOD, block, item);
		Trapdoors.setRegistrationWood(WOOD, block, item);
		Windows.setRegistrationWood(WOOD, block, item);

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

		bus.addListener(this::addToTab);
		bus.addListener(this::commonSetup);
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Is Charged !");
    }

	private void clientSetup(FMLClientSetupEvent event)
	{
		APIRenderTypes.initAllWood(event, MODID, WOOD, Registration.getAllModTypeWood());
		APIRenderTypes.initAllLeave(event, MODID, LEAVES);
		APIRenderTypes.initAllStone(event, MODID, STONE, Registration.getAllModTypeStone());
	}
    
    private void commonSetup(BlockEntityTypeAddBlocksEvent event)
    {
    	AddFurnituresStorage.addCompatibleBlocksToFurnitureStorage(event, MODID, WOOD);
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

	private void addToTab(BuildCreativeModeTabContentsEvent event)
    {
		APICreativeTab.initAllWood(event, MODID, WOOD, MCWBYG_TAB.get(), Registration.getAllModTypeWood());
		APICreativeTab.initAllLeave(event, MODID, LEAVES, MCWBYG_TAB.get());
		APICreativeTab.initAllStone(event, MODID, STONE, MCWBYG_TAB.get(), Registration.getAllModTypeStone());
    }
}