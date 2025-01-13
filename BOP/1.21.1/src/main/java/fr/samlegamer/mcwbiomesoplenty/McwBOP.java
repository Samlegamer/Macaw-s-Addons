package fr.samlegamer.mcwbiomesoplenty;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.AddFurnituresStorage;
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
	        .icon(() -> { return new ItemStack(getIcon()); }).title(Component.translatable(McwBOP.MODID+".tab")).build());

    public McwBOP(FMLJavaModLoadingContext context)
    {
    	LOGGER.info("Macaw's Biomes O' Plenty Loading...");
     	Registration.init(block, item, ct);
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
    	context.getModEventBus().addListener(this::commonSetup);
    	context.getModEventBus().addListener(this::addTotab);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }
    
	private void commonSetup(FMLCommonSetupEvent e)
	{
		if(ModList.get().isLoaded("mcwfurnitures"))
		{
			AddFurnituresStorage.addCompatibleBlocksToFurnitureStorage(e, MODID, WOOD);
		}
	}
    
    private static Block getIcon()
    {
    	List<String> listMod = List.of("mcwroofs", "mcwfences", "mcwbridges", "mcwfurnitures", "mcwwindows", "mcwdoors", "mcwtrpdoors", "mcwpaths", "mcwstairs");
    	int nbDepedencies = 0;
    	List<Block> blockBase = List.of(Finder.findBlock(McwBOP.MODID, "dead_roof"), Finder.findBlock(McwBOP.MODID, "dead_picket_fence"), Finder.findBlock(McwBOP.MODID, "dead_wardrobe"), 
    	        Finder.findBlock(McwBOP.MODID, "dead_log_bridge_middle"), Finder.findBlock(McwBOP.MODID, "dead_window"), Finder.findBlock(McwBOP.MODID, "dead_japanese_door"), Finder.findBlock(McwBOP.MODID, "dead_glass_trapdoor"), 
    	        Finder.findBlock(McwBOP.MODID, "dead_planks_path"), Finder.findBlock(McwBOP.MODID, "dead_loft_stairs"));
    	List<Block> blockFinal = new ArrayList<Block>();

    	for(int i = 0; i < listMod.size(); i++)
    	{
    		if(ModList.get().isLoaded(listMod.get(i)))
    		{
    			nbDepedencies=nbDepedencies+1;
    			blockFinal.add(blockBase.get(i));
    		}
    	}
    	
		Random rnd = new Random();
		int i = rnd.nextInt(blockFinal.size()-1);
		return blockFinal.get(i);
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