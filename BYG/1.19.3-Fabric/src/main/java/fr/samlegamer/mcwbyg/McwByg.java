package fr.samlegamer.mcwbyg;

import java.util.List;

import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.data.ModType;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
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
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class McwByg implements ModInitializer 
{
	public static final String MODID = "mcwbyg";
	public static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup MCWBYG_TAB = FabricItemGroup.builder(new Identifier(MODID + ".tab")).icon(() -> new ItemStack(icon())).build();
    
	public static final List<String> WOOD = List.of("aspen","baobab", "blue_enchanted","cherry","cika","cypress","ebony","ether","fir","green_enchanted","holly","jacaranda",
    	    "lament","mahogany","white_mangrove","maple","nightshade","palm","pine","rainbow_eucalyptus","redwood","skyris", "willow", "witch_hazel", "zelkova", "bulbis", "imparius", "sythian");
	public static final List<String> fences_rockable = List.of("soapstone", "travertine", "dacite", "red_rock", "scoria_stone");
	public static final List<String> bridges_rockable = List.of("cryptic_stone", "dacite_bricks", "polished_travertine", "purpur_stone", "red_rock_bricks", "scoria_stone_bricks", "soapstone_bricks");
	public static final List<String>  LEAVES = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony", "ether", "fir","green_enchanted","holly", "jacaranda", "lament","mahogany","maple",
			"palm","pine","rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", 
			"orange_birch", "red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "white_cherry", "pink_cherry", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", 
			"flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "palo_verde");

	@Override
	public void onInitialize()
	{
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Loading...");
    	Mapping.configDataFixerFiles();

    	Bridges.setRegistrationWood(MODID, WOOD);
    	Bridges.setRegistrationRock(MODID, bridges_rockable);
    	Roofs.setRegistrationWood(MODID, WOOD);
    	Roofs.setRegistrationRock(MODID, fences_rockable);
    	Fences.setRegistrationWood(MODID, WOOD);
    	Fences.setRegistrationHedges(MODID, LEAVES);
    	Fences.setRegistrationRock(MODID, fences_rockable);
    	Furnitures.setRegistrationWood(MODID, WOOD);
    	Stairs.setRegistrationWood(MODID, WOOD);
		Paths.setRegistrationWood(MODID, WOOD);
		Doors.setRegistrationWood(MODID, WOOD);
		Trapdoors.setRegistrationWood(MODID, WOOD);
		Windows.setRegistrationWood(MODID, WOOD);

		APICreativeTab.initAllWood(McwByg.MODID, McwByg.WOOD, MCWBYG_TAB, Registration.getAllModTypeWood());
		APICreativeTab.initAllLeave(McwByg.MODID, McwByg.LEAVES, MCWBYG_TAB);
		APICreativeTab.initAllStone(McwByg.MODID, McwByg.bridges_rockable, MCWBYG_TAB, ModType.BRIDGES);
		APICreativeTab.initAllStone(McwByg.MODID, McwByg.fences_rockable, MCWBYG_TAB, ModType.ROOFS, ModType.FENCES);

		APIFuels.initAllWood(MODID, WOOD);
		APIFuels.initAllLeave(MODID, LEAVES);

    	LOGGER.info("Macaw's Oh the Biomes You'll Go Is Charged !");
	}
	
	private static Block icon()
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
		return prop.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES, BlockType.BRIDGES, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.STAIRS);
	}
}