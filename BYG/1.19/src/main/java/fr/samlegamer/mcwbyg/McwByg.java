package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;

@Mod(McwByg.MODID)
public class McwByg
{
	public static final String MODID = "mcwbyg";
    private static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("aspen","baobab", "blue_enchanted","cherry","cika","cypress","ebony","ether","fir","green_enchanted","holly","jacaranda",
    	    "lament","mahogany","white_mangrove","maple","nightshade","palm","pine","rainbow_eucalyptus","redwood","skyris", "willow", "witch_hazel", "zelkova", "bulbis", "imparius", "sythian");
	public static final List<String> fences_rockable = List.of("soapstone", "travertine", "dacite", "red_rock", "scoria_stone");
	public static final List<String> bridges_rockable = List.of("cryptic_stone", "dacite_bricks", "polished_travertine", "purpur_stone", "red_rock_bricks", "scoria_stone_bricks", "soapstone_bricks");
	public static final List<String>  LEAVES = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony", "ether", "fir","green_enchanted","holly", "jacaranda", "lament","mahogany","maple",
			"palm","pine","rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", 
			"orange_birch", "red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "white_cherry", "pink_cherry", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", 
			"flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "palo_verde");

	public static final CreativeModeTab MCWBYG_TAB = new CreativeModeTab(MODID + ".tab") {
	    @Override
	    public @NotNull ItemStack makeIcon()
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
				Block icon = prop.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.BRIDGES, BlockType.FURNITURES, BlockType.STAIRS,
						BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.WINDOWS);
				return new ItemStack(icon);
	    }
	};
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

    public McwByg()
    {
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Loading...");
    	Registration.init(block, item);
    	Bridges.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);
    	Bridges.setRegistrationRock(bridges_rockable, block, item, MCWBYG_TAB);
    	Roofs.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);
    	Roofs.setRegistrationRock(fences_rockable, block, item, MCWBYG_TAB);
    	Fences.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);
    	Fences.setRegistrationHedges(LEAVES, block, item, MCWBYG_TAB);
    	Fences.setRegistrationRock(fences_rockable, block, item, MCWBYG_TAB);
    	Furnitures.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);
    	Stairs.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);
		// 1.1 Update
		Paths.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);
		Doors.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);
		Trapdoors.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);
		Windows.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Is Charged !");
    }
}