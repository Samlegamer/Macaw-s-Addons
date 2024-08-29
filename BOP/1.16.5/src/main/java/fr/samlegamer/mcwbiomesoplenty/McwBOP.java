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
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.tab.IconRandom;

@Mod(McwBOP.MODID)
@Mod.EventBusSubscriber(modid = McwBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
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
	        return new ItemStack(new IconRandom.Properties(LOGO_ROOFS, LOGO_FENCES, LOGO_FURNITURES, LOGO_BRIDGES).bridges().fences().furnitures().roofs().buildWood());
	    }
	};
	
    public McwBOP()
    {
    	LOGGER.info("Macaw's Biomes O' Plenty Loading...");
    	Registration.init(block, item);
    	Bridges.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Furnitures.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Roofs.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Fences.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Fences.setRegistrationHedges(LEAVES, block, item, MCWBOP_TAB);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Fences::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Furnitures::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Roofs::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Bridges::setupClient);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }
}
