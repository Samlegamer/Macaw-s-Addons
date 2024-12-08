package fr.samlegamer.mcwbiomesoplenty;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.ItemStack;
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
	public static final List<String> WOOD = List.of("cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "maple", "pine");
	public static final List<String> LEAVES = List.of("pink_cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", 
	"empyreal",
	"pine",
	"orange_maple", "red_maple", "yellow_maple", "cypress", "snowblossom", "flowering_oak", "rainbow_birch", "origin");
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    private static final DeferredRegister<CreativeModeTab> ct = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    
	static NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "cherry_roof"), Finder.findBlock(MODID, "cherry_picket_fence"), Finder.findBlock(MODID, "cherry_wardrobe"), 
	        Finder.findBlock(MODID, "cherry_log_bridge_middle"), Finder.findBlock(MODID, "cherry_window"), Finder.findBlock(MODID, "cherry_japanese_door"), Finder.findBlock(MODID, "cherry_glass_trapdoor"), 
	        Finder.findBlock(MODID, "cherry_planks_path"), Finder.findBlock(MODID, "cherry_loft_stairs")).addType(BlockType.ROOFS)
	.addType(BlockType.FENCES)
	.addType(BlockType.FURNITURES)
	.addType(BlockType.BRIDGES)
	.addType(BlockType.WINDOWS)
	.addType(BlockType.DOORS)
	.addType(BlockType.TRAPDOORS)
	.addType(BlockType.PATHS)
	.addType(BlockType.STAIRS);
	static Block icon = woodProperties.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES, BlockType.BRIDGES, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.STAIRS);
	
	public static RegistryObject<CreativeModeTab> MCWBOP_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(() -> new ItemStack(Blocks.GOLD_BLOCK))
	        .title(Component.translatable(MODID+"."+"tab")).build());
			/*Registration.tabs(ct, MODID, "tab", icon);*/
	
    public McwBOP()
    {
    	LOGGER.info("Macaw's Biomes O' Plenty Loading...");
    	Registration.init(block, item, ct);
    	Bridges.setRegistrationWood(WOOD, block, item, MCWBOP_TAB.get());
    	Fences.setRegistrationWood(WOOD, block, item, MCWBOP_TAB.get());
    	Fences.setRegistrationHedges(LEAVES, block, item, MCWBOP_TAB.get());
    	Furnitures.setRegistrationWood(WOOD, block, item, MCWBOP_TAB.get());
    	Roofs.setRegistrationWood(WOOD, block, item, MCWBOP_TAB.get());
    	Trapdoors.setRegistrationWood(WOOD, block, item, MCWBOP_TAB.get());
    	Paths.setRegistrationWood(WOOD, block, item, MCWBOP_TAB.get());
    	Doors.setRegistrationWood(WOOD, block, item, MCWBOP_TAB.get());
    	Windows.setRegistrationWood(WOOD, block, item, MCWBOP_TAB.get());
    	Stairs.setRegistrationWood(WOOD, block, item, MCWBOP_TAB.get());
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addTotab);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }
    
    private void addTotab(BuildCreativeModeTabContentsEvent event)
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