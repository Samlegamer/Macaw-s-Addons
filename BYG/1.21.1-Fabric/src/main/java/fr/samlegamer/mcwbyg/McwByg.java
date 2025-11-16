package fr.samlegamer.mcwbyg;

import java.util.List;

import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.furnitures.AddFurnituresStorage;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.block.AbstractBlock;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class McwByg implements ModInitializer 
{
	public static final String MODID = "mcwbyg";
	public static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup MCWBYG_TAB = FabricItemGroup.builder()
    .icon(() -> new ItemStack(getIcon())).displayName(Text.translatable("itemGroup.mcwbyg.tab")).build();
    
	public static final List<String> WOOD = List.of("aspen", "baobab", "blue_enchanted", "cika", "cypress", "ebony", "fir", 
	"green_enchanted", "holly", "ironwood", "jacaranda", "mahogany","maple", "palm", "pine", "rainbow_eucalyptus", "redwood", "sakura", 
	"skyris", "white_mangrove", "willow", "witch_hazel", "zelkova", "florus");

	public static final List<String> STONE = List.of("dacite_bricks", "red_rock_bricks", "pink_sandstone", "white_sandstone", "blue_sandstone", "purple_sandstone", 
	"black_sandstone", "windswept_sandstone");
	
	public static final List<String>  LEAVES = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony","fir","green_enchanted","holly","ironwood","jacaranda","mahogany","maple","palm","pine",
			"rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", "orange_birch", 
			"red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "white_sakura", "yellow_sakura", "red_maple", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", 
			"flowering_ironwood", "flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "flowering_skyris", "flowering_yucca");

	private static final Identifier TAB_ID = Identifier.of(MODID + ".tab");
	
	@Override
	public void onInitialize()
	{
		LOGGER.info("Macaw's Oh The Biomes We've Gone Loading...");
		Mapping.configDataFixerFiles();

		List<String> leavesClassic = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony","fir","green_enchanted","holly","ironwood","jacaranda","mahogany","maple","palm","pine",
				"rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", "orange_birch",
				"red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "red_maple", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda",
				"flowering_ironwood", "flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "flowering_skyris", "flowering_yucca");
		List<String> leavesCherry = List.of("white_sakura", "yellow_sakura");

		Bridges.setRegistrationWood(MODID, WOOD);
		Bridges.setRegistrationRock(MODID, STONE);
		Roofs.setRegistrationWood(MODID, WOOD);
		Roofs.setRegistrationRock(MODID, STONE);
		Fences.setRegistrationWood(MODID, WOOD);
		Fences.setRegistrationHedges(MODID, leavesClassic);
		Fences.setRegistrationHedgesModLoaded(MODID, leavesCherry, AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES));
		Fences.setRegistrationRock(MODID, STONE);
		Furnitures.setRegistrationWood(MODID, WOOD);
		Stairs.setRegistrationWood(MODID, WOOD);
		Paths.setRegistrationWood(MODID, WOOD);
		Doors.setRegistrationWood(MODID, WOOD);
		Trapdoors.setRegistrationWood(MODID, WOOD);
		Windows.setRegistrationWood(MODID, WOOD);

        Registry.register(Registries.ITEM_GROUP, TAB_ID, MCWBYG_TAB);
        RegistryKey<ItemGroup> group_key = RegistryKey.of(RegistryKeys.ITEM_GROUP, TAB_ID);

        APICreativeTab.initAllWood(MODID, WOOD, group_key, Registration.getAllModTypeWood());
        APICreativeTab.initAllStone(MODID, STONE, group_key, Registration.getAllModTypeStone());
        APICreativeTab.initAllLeave(MODID, LEAVES, group_key);

        APIFuels.initAllWood(MODID, WOOD, Registration.getAllModTypeWood());
        APIFuels.initAllLeave(MODID, LEAVES);

    	AddFurnituresStorage.addCompatibleBlocksToFurnitureStorage(MODID, WOOD);
    	LOGGER.info("Macaw's Oh The Biomes We've Gone Is Charged !");
	}

	private static Block getIcon()
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
		return prop.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.BRIDGES, BlockType.FURNITURES, BlockType.STAIRS,
				BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.WINDOWS);
	}
}