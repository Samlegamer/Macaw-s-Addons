package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.tab.NewIconRandom;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
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
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;

@Mod(McwBOP.MODID)
@EventBusSubscriber(modid = McwBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwBOP
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "maple", "pine");
	public static final List<String> LEAVES = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", 
	"empyreal",
	"pine",
	"orange_maple", "red_maple", "yellow_maple", "cypress", "snowblossom", "flowering_oak", "rainbow_birch", "origin");
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(McwBOP.MODID);

	public static final RegistryObject<CreativeModeTab> MCWBOP_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(McwBOP::getIcon).title(Component.translatable(McwBOP.MODID+".tab")).build());

    public McwBOP()
    {
    	LOGGER.info("Macaw's Biomes O' Plenty Loading...");
     	Registration.init(block, item, ct);
    	Bridges.setRegistrationWood(WOOD, block, item);
    	Fences.setRegistrationWood(WOOD, block, item);
    	Fences.setRegistrationHedges(LEAVES, block, item);
    	Furnitures.setRegistrationWood(WOOD, block, item);
    	Roofs.setRegistrationWood(WOOD, block, item);
    	Trapdoors.setRegistrationWood(WOOD, block, item);
    	Paths.setRegistrationWood(WOOD, block, item);
    	Doors.setRegistrationWood(WOOD, block, item);
    	Windows.setRegistrationWood(WOOD, block, item);
    	Stairs.setRegistrationWood(WOOD, block, item);

    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addToTab);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }

	private static ItemStack getIcon()
    {
		NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
				Finder.findBlock(MODID, "redwood_roof"),
				Finder.findBlock(MODID, "redwood_picket_fence"),
				Finder.findBlock(MODID, "redwood_wardrobe"),
				Finder.findBlock(MODID, "redwood_log_bridge_middle"),
				Finder.findBlock(MODID, "redwood_pane_window"),
				Finder.findBlock(MODID, "redwood_modern_door"),
				Finder.findBlock(MODID, "redwood_mystic_trapdoor"),
				Finder.findBlock(MODID, "redwood_planks_path"),
				Finder.findBlock(MODID, "redwood_skyline_stairs"));

		prop.addType(NewIconRandom.BlockType.BRIDGES)
				.addType(NewIconRandom.BlockType.ROOFS)
				.addType(NewIconRandom.BlockType.FENCES)
				.addType(NewIconRandom.BlockType.FURNITURES)
				.addType(NewIconRandom.BlockType.STAIRS)
				.addType(NewIconRandom.BlockType.PATHS)
				.addType(NewIconRandom.BlockType.WINDOWS)
				.addType(NewIconRandom.BlockType.DOORS)
				.addType(NewIconRandom.BlockType.TRAPDOORS);
		Block icon = prop.buildIcon(NewIconRandom.BlockType.BRIDGES, NewIconRandom.BlockType.ROOFS, NewIconRandom.BlockType.FENCES, NewIconRandom.BlockType.FURNITURES, NewIconRandom.BlockType.STAIRS,
				NewIconRandom.BlockType.PATHS, NewIconRandom.BlockType.WINDOWS, NewIconRandom.BlockType.DOORS, NewIconRandom.BlockType.TRAPDOORS);
		return new ItemStack(icon);
    }
    
    private void addToTab(BuildCreativeModeTabContentsEvent event)
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