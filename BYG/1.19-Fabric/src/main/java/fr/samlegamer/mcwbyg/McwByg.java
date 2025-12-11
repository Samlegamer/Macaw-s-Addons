package fr.samlegamer.mcwbyg;

import java.util.List;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class McwByg implements ModInitializer
{
	public static final String MODID = "mcwbyg";
    private static final Logger LOGGER = LogManager.getLogger();
    public static ItemGroup MCWBYG_TAB = FabricItemGroupBuilder.build(new Identifier(MODID + ".tab"), () -> new ItemStack(icon()));
    
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

		McwRegistry.setRegistriesWood(MODID, WOOD, MCWBYG_TAB, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(MODID, LEAVES, MCWBYG_TAB);
		McwRegistry.setRegistriesStone(MODID, bridges_rockable, MCWBYG_TAB, ModType.BRIDGES);
		McwRegistry.setRegistriesStone(MODID, fences_rockable, MCWBYG_TAB, ModType.ROOFS, ModType.FENCES);

		Mapping.missingnoWoodBlock();

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
				.addType(ModType.ROOFS)
				.addType(ModType.FENCES)
				.addType(ModType.BRIDGES)
				.addType(ModType.FURNITURES)
				.addType(ModType.STAIRS)
				.addType(ModType.DOORS)
				.addType(ModType.TRAPDOORS)
				.addType(ModType.PATHS)
				.addType(ModType.WINDOWS);
		return prop.buildIcon(ModType.ROOFS, ModType.FENCES, ModType.BRIDGES, ModType.FURNITURES, ModType.STAIRS,
				ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS, ModType.WINDOWS);
	}
}