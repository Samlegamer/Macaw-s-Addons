package fr.samlegamer.mcwbiomesoplenty;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import java.util.Arrays;
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
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;

@Mod(McwBOP.MODID)
public class McwBOP
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = Arrays.asList("cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow");
	public static final List<String> LEAVES = Arrays.asList("pink_cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "maple", 
	"orange_autumn", "yellow_autumn", "white_cherry", "flowering_oak", "rainbow_birch", "origin");
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

	protected static final RegistryObject<Item> LOGO_BRIDGES = item.register("logob", ()->new Item(new Item.Properties()));
	protected static final RegistryObject<Item> LOGO_FURNITURES = item.register("logofurni", ()->new Item(new Item.Properties()));
	protected static final RegistryObject<Item> LOGO_FENCES = item.register("logof", ()->new Item(new Item.Properties()));
	protected static final RegistryObject<Item> LOGO_ROOFS = item.register("logor", ()->new Item(new Item.Properties()));
	
	public static final ItemGroup MCWBOP_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(Finder.findBlock(MODID, "cherry_log_bridge_middle"));
	    }
	};
	//new IconRandom.Properties(LOGO_ROOFS, LOGO_FENCES, LOGO_FURNITURES, LOGO_BRIDGES).bridges().fences().furnitures().roofs().buildWood()
    public McwBOP()
    {
    	LOGGER.info("Macaw's Biomes O' Plenty Loading...");
    	Registration.init(block, item);
    	Bridges.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Furnitures.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Roofs.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Fences.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Fences.setRegistrationHedges(LEAVES, block, item, MCWBOP_TAB);
    	Trapdoors.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Paths.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Doors.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Windows.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Fences::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Furnitures::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Roofs::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Bridges::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Trapdoors::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Paths::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Doors::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Windows::setupClient);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }
}
