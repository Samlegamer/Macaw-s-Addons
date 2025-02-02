package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;

@Mod(McwBOP.MODID)
public class McwBOP
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "maple", "pine");
	public static final List<String> LEAVES = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", 
	"empyreal",
	"pine",
	"orange_maple", "red_maple", "yellow_maple", "cypress", "snowblossom", "flowering_oak", "rainbow_birch", "origin");
    protected static final DeferredRegister.Blocks block = Registration.blocks(MODID);
	protected static final DeferredRegister.Items item = DeferredRegister.createItems(MODID); //CHANGE THIS IN THE NEXT ADDONSLIB UPDATE
	protected static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(McwBOP.MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWBOP_TAB = ct.register("tab", () -> CreativeModeTab.builder()
			.title(Component.translatable(McwBOP.MODID + "." + "tab")).icon(() -> { return new ItemStack(getIcon()); }).build());

	private static final MappingMissing.Bridges bridges = new MappingMissing.Bridges("macawsbridgesbop", McwBOP.MODID, McwBOP.WOOD);
	private static final MappingMissing.Furnitures furnitures = new MappingMissing.Furnitures("mcwfurnituresbop", McwBOP.MODID, McwBOP.WOOD);
	private static final MappingMissing.Fences fences = new MappingMissing.Fences("mcwfencesbop", McwBOP.MODID, McwBOP.WOOD);
	private static final MappingMissing.Roofs roofs = new MappingMissing.Roofs("macawsroofsbop", McwBOP.MODID, McwBOP.WOOD);

	public McwBOP(IEventBus bus)
    {
    	LOGGER.info("Macaw's Biomes O' Plenty Loading...");
     	Registration.init(bus, block, item, ct);
    	Bridges.setRegistrationWood(WOOD, block, item, null);
    	Fences.setRegistrationWood(WOOD, block, item, null);
    	Fences.setRegistrationHedges(LEAVES, block, item, null);
    	Furnitures.setRegistrationWood(WOOD, block, item, null);
    	Roofs.setRegistrationWood(WOOD, block, item, null);
    	Trapdoors.setRegistrationWood(WOOD, block, item, null);
    	Paths.setRegistrationWood(WOOD, block, item, null);
    	Doors.setRegistrationWood(WOOD, block, item, null);
    	Windows.setRegistrationWood(WOOD, block, item, null);
    	Stairs.setRegistrationWood(WOOD, block, item, null);
		McwBOP.LOGGER.info("Start convert blocks");
		fences.leavesAdding(McwBOP.LEAVES);
		bridges.missingnoWoodBlock(McwBOP.block);
		furnitures.missingnoWoodBlock(McwBOP.block);
		fences.missingnoWoodBlock(McwBOP.block);
		roofs.missingnoWoodBlock(McwBOP.block);
		McwBOP.LOGGER.info("Finish convert blocks");
		McwBOP.LOGGER.info("Start convert items");
		fences.leavesAdding(McwBOP.LEAVES);
		bridges.missingnoWoodItem(McwBOP.item);
		furnitures.missingnoWoodItem(McwBOP.item);
		fences.missingnoWoodItem(McwBOP.item);
		roofs.missingnoWoodItem(McwBOP.item);
		McwBOP.LOGGER.info("Finish convert items");

    	bus.addListener(this::addTotab);
		//NeoForge.EVENT_BUS.register(Mapping.class); /* Not work ??? */
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }
    
    private static Block getIcon()
    {
    	NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "redwood_roof"), Finder.findBlock(MODID, "redwood_picket_fence"), Finder.findBlock(MODID, "redwood_wardrobe"), 
    	        Finder.findBlock(MODID, "redwood_log_bridge_middle"), Finder.findBlock(MODID, "redwood_window"), Finder.findBlock(MODID, "redwood_japanese_door"), Finder.findBlock(MODID, "redwood_glass_trapdoor"), 
    	        Finder.findBlock(MODID, "redwood_planks_path"), Finder.findBlock(MODID, "redwood_loft_stairs"));
    	    	woodProperties
    	    	.addType(BlockType.ROOFS)
    	    	.addType(BlockType.FENCES)
    	    	.addType(BlockType.FURNITURES)
    	    	.addType(BlockType.BRIDGES)
    	    	.addType(BlockType.WINDOWS)
    	    	.addType(BlockType.DOORS)
    	    	.addType(BlockType.TRAPDOORS)
    	    	.addType(BlockType.PATHS)
    	    	.addType(BlockType.STAIRS);
    	return woodProperties.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES, BlockType.BRIDGES, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.STAIRS);
    }
    
    private void addTotab(BuildCreativeModeTabContentsEvent event)
    {
    	if(MCWBOP_TAB != null)
    	{
        	Bridges.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Roofs.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Fences.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Fences.addToTabHedge(event, MODID, LEAVES, MCWBOP_TAB.get());
        	Furnitures.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Trapdoors.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Paths.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Doors.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Windows.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Stairs.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
    	}
    }
}