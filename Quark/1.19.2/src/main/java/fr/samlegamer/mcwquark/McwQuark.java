package fr.samlegamer.mcwquark;

import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import java.util.List;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import javax.annotation.Nonnull;

@Mod(McwQuark.MODID)
public class McwQuark
{
	public static final String MODID = "mcwquark";
    private static final Logger LOGGER = LogManager.getLogger();
    
    private static final List<String> stone = List.of("soul_sandstone_bricks", "limestone_bricks", "jasper_bricks", "shale_bricks", "permafrost_bricks", "red_sandstone_bricks", "sandstone_bricks", "cobblestone_bricks",
			"mossy_cobblestone_bricks", "blackstone_bricks", "diorite_bricks", "granite_bricks", "andesite_bricks", "calcite_bricks", "dripstone_bricks", "tuff_bricks");
    private static final List<String> leaves = List.of("blue_blossom", "lavender_blossom", "orange_blossom", "pink_blossom", "red_blossom", "yellow_blossom", "ancient");
	private static final List<String> wood = List.of("blossom", "azalea", "ancient");

	private static final DeferredRegister<Block> BLOCKS = Registration.blocks(MODID);
	private static final DeferredRegister<Item> ITEMS = Registration.items(MODID);
	public static final CreativeModeTab MCWQUARK_TAB = new CreativeModeTab(MODID + ".tab") {
	    @Override
		@Nonnull
	    public ItemStack makeIcon() {
	    	NewIconRandom.NewProperties propIcon = new NewIconRandom.NewProperties(
					Finder.findBlock(MODID, "limestone_bricks_roof"),
					Finder.findBlock(MODID, "orange_blossom_hedge"),
					Finder.findBlock(MODID, "blossom_bookshelf"),
					Finder.findBlock(MODID, "marble_bricks_bridge"),
					Finder.findBlock(MODID, "azalea_shutter"),
					Finder.findBlock(MODID, "blossom_beach_door"),
					Finder.findBlock(MODID, "azalea_paper_trapdoor"),
					Finder.findBlock(MODID, "blossom_planks_path"),
					Finder.findBlock(MODID, "ancient_balcony"));
	    	
	    	propIcon
					.addType(BlockType.BRIDGES)
					.addType(BlockType.ROOFS)
					.addType(BlockType.FENCES)
					.addType(BlockType.FURNITURES)
					.addType(BlockType.STAIRS)
					.addType(BlockType.WINDOWS)
					.addType(BlockType.DOORS)
					.addType(BlockType.TRAPDOORS)
					.addType(BlockType.PATHS);
	    	Block icon = propIcon.buildIcon(BlockType.BRIDGES, BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES,
					BlockType.STAIRS, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS);
	        return new ItemStack(icon);
	    }
	};

    public McwQuark()
    {
    	LOGGER.info("Macaw's Quark Loading...");
		Registration.init(BLOCKS, ITEMS);
		Bridges.setRegistrationWood(wood, BLOCKS, ITEMS, MCWQUARK_TAB);
		Bridges.setRegistrationRock(stone, BLOCKS, ITEMS, MCWQUARK_TAB);
		Roofs.setRegistrationWood(wood, BLOCKS, ITEMS, MCWQUARK_TAB);
		Roofs.setRegistrationRock(stone, BLOCKS, ITEMS, MCWQUARK_TAB);
		Fences.setRegistrationWood(wood, BLOCKS, ITEMS, MCWQUARK_TAB);
		Fences.setRegistrationRock(stone, BLOCKS, ITEMS, MCWQUARK_TAB);
		Fences.setRegistrationHedges(leaves, BLOCKS, ITEMS, MCWQUARK_TAB);
		Furnitures.setRegistrationWood(wood, BLOCKS, ITEMS, MCWQUARK_TAB);
		Stairs.setRegistrationWood(wood, BLOCKS, ITEMS, MCWQUARK_TAB);
		Doors.setRegistrationWood(wood, BLOCKS, ITEMS, MCWQUARK_TAB);
		Trapdoors.setRegistrationWood(wood, BLOCKS, ITEMS, MCWQUARK_TAB);
		Paths.setRegistrationWood(wood, BLOCKS, ITEMS, MCWQUARK_TAB);
		Windows.setRegistrationWood(wood, BLOCKS, ITEMS, MCWQUARK_TAB);
		LOGGER.info("Macaw's Quark Is Charged !");
    }
}