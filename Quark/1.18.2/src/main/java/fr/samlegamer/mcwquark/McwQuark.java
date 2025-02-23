package fr.samlegamer.mcwquark;

import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import java.util.List;
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
@Mod.EventBusSubscriber(modid = McwQuark.MODID, bus = Bus.MOD)
public class McwQuark
{
	public static final String MODID = "mcwquark";
    private static final Logger LOGGER = LogManager.getLogger();
    
    private static final List<String> stone = List.of("soul_sandstone_bricks", "limestone_bricks", "jasper_bricks", "shale_bricks", "permafrost_bricks", "red_sandstone_bricks", "sandstone_bricks", "cobblestone_bricks",
			"mossy_cobblestone_bricks", "blackstone_bricks", "diorite_bricks", "granite_bricks", "andesite_bricks", "calcite_bricks", "dripstone_bricks", "tuff_bricks");
    private static final List<String> leaves = List.of("blue_blossom", "lavender_blossom", "orange_blossom", "pink_blossom", "red_blossom", "yellow_blossom");
	private static final List<String> wood = List.of("blossom", "azalea");

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
					Finder.findBlock(MODID, "azalea_balcony"));
	    	
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
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
    	LOGGER.info("Macaw's Quark Is Charged !");
    }
    
    private void client(final FMLClientSetupEvent event)
    {
		Bridges.clientWood(event, MODID, wood);
    	Bridges.clientStone(event, MODID, stone);
		Roofs.clientWood(event, MODID, wood);
		Roofs.clientStone(event, MODID, stone);
		Fences.clientWood(event, MODID, wood);
    	Fences.clientStone(event, MODID, stone);
    	Fences.clientHedge(event, MODID, leaves);
		Furnitures.clientWood(event, MODID, wood);
		Stairs.clientWood(event, MODID, wood);
		Doors.clientWood(event, MODID, wood);
		Trapdoors.clientWood(event, MODID, wood);
		Paths.clientWood(event, MODID, wood);
		Windows.clientWood(event, MODID, wood);
    }
    
    @SubscribeEvent
    public static void registry(final RegistryEvent.Register<Block> e)
    {
		Bridges.registryWood(e, wood, MCWQUARK_TAB);
    	Bridges.registryStone(e, stone, MCWQUARK_TAB);
		Roofs.registryWood(e, wood, MCWQUARK_TAB);
		Roofs.registryStone(e, stone, MCWQUARK_TAB);
		Fences.registryWood(e, wood, MCWQUARK_TAB);
    	Fences.registryStone(e, stone, MCWQUARK_TAB);
    	Fences.registryHedges(e, leaves, MCWQUARK_TAB);
		Furnitures.registryWood(e, wood, MCWQUARK_TAB);
		Stairs.registryWood(e, wood, MCWQUARK_TAB);
		Doors.registryWood(e, wood, MCWQUARK_TAB);
		Trapdoors.registryWood(e, wood, MCWQUARK_TAB);
		Paths.registryWood(e, wood, MCWQUARK_TAB);
		Windows.registryWood(e, wood, MCWQUARK_TAB);
    }
}