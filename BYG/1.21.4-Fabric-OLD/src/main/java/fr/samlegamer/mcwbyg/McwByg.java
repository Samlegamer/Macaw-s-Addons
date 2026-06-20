package fr.samlegamer.mcwbyg;

import java.util.List;
import java.util.Map;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwCommon;
import net.minecraft.sound.BlockSoundGroup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class McwByg implements ModInitializer 
{
	public static final String MODID = "mcwbyg";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("aspen", "baobab", "blue_enchanted", "cika", "cypress", "ebony", "fir", 
	"green_enchanted", "holly", "ironwood", "jacaranda", "mahogany","maple", "palm", "pine", "rainbow_eucalyptus", "redwood", "sakura", 
	"skyris", "white_mangrove", "willow", "witch_hazel", "zelkova", "florus");
	public static final List<String> STONE = List.of("dacite_bricks", "red_rock_bricks", "pink_sandstone", "white_sandstone", "blue_sandstone", "purple_sandstone", 
	"black_sandstone", "windswept_sandstone");
	public static final List<String>  LEAVES = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony","fir","green_enchanted","holly","ironwood","jacaranda","mahogany","maple","palm","pine",
			"rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", "orange_birch", 
			"red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "white_sakura", "yellow_sakura", "red_maple", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", 
			"flowering_ironwood", "flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "flowering_skyris", "flowering_yucca");

	public static final ItemGroup MCWBYG_TAB = APICreativeTab.initGroup(MODID, McwByg::getIcon);

	@Override
	public void onInitialize()
	{
		LOGGER.info("Macaw's Oh The Biomes We've Gone Loading...");

		List<String> leavesClassic = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony","fir","green_enchanted","holly","ironwood","jacaranda","mahogany","maple","palm","pine",
				"rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", "orange_birch",
				"red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "red_maple", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda",
				"flowering_ironwood", "flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "flowering_skyris", "flowering_yucca");
		Map<String, BlockSoundGroup> mapLeaveSoundCherry = McwRegistry.makeDefaultFromList(List.of("white_sakura", "yellow_sakura"), BlockSoundGroup.CHERRY_LEAVES);

		McwRegistry.setRegistriesWood(MODID, WOOD, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(MODID, leavesClassic);
		McwRegistry.setRegistriesLeave(MODID, mapLeaveSoundCherry);
		McwRegistry.setRegistriesStone(MODID, STONE, Registration.getAllModTypeStone());

		APICreativeTab.registerGroup(MODID, MCWBYG_TAB);
		APICreativeTab.initAllWood(MODID, WOOD, MCWBYG_TAB, Registration.getAllModTypeWood());
		APICreativeTab.initAllStone(MODID, STONE, MCWBYG_TAB, Registration.getAllModTypeStone());
		APICreativeTab.initAllLeave(MODID, LEAVES, MCWBYG_TAB);

		APIFuels.initAllWood(MODID, WOOD, Registration.getAllModTypeWood());
		APIFuels.initAllLeave(MODID, LEAVES);

    	McwCommon.addCompatibleBlocksToFurnitureStorage(MODID, WOOD);
    	LOGGER.info("Macaw's Oh The Biomes We've Gone Is Charged !");
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