package fr.samlegamer.mcwbyg;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.tab.NewIconRandom;

@Mod(McwByg.MODID)
@Mod.EventBusSubscriber(modid = McwByg.MODID, bus = Bus.MOD)
public class McwByg
{
	public static final String MODID = "mcwbyg";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> fences_rockable = Arrays.asList("soapstone", "travertine", "dacite", "red_rock", "scoria_stone");
    public static final List<String> bridges_rockable = Arrays.asList("cryptic_stone", "dacite_bricks", "polished_travertine", "purpur_stone", "red_rock_bricks", "scoria_stone_bricks", "soapstone_bricks");
    public static final List<String>  LEAVES = Arrays.asList("aspen","baobab","blue_enchanted","cika","cypress","ebony", "ether", "fir","green_enchanted","holly", "jacaranda", "lament","mahogany","maple",
    "palm","pine","rainbow_eucalyptus","redwood","skyris","mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", 
    "orange_birch", "red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "white_cherry", "pink_cherry", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", 
    "flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "palo_verde");
    public static final List<String> WOOD = Arrays.asList("aspen","baobab", "blue_enchanted","cherry","cika","cypress","ebony","ether","fir","green_enchanted","holly","jacaranda",
    "lament","mahogany","mangrove","maple","nightshade","palm","pine","rainbow_eucalyptus","redwood","skyris", "willow", "witch_hazel", "zelkova", "bulbis", "imparius", "sythian");
    //private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    //private static final DeferredRegister<Item> item = Registration.items(MODID);

	public static final ItemGroup MCWBYG_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(new NewIconRandom.Properties(Finder.findBlock(MODID, "aspen_roof"), Finder.findBlock(MODID, "aspen_picket_fence"), Finder.findBlock(MODID, "aspen_wardrobe"), 
	        	    Finder.findBlock(MODID, "aspen_log_bridge_middle"), Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE).bridges().fences().furnitures().roofs().buildWood());
	    }
	};
	
    public McwByg()
    {
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Loading...");
    	/*Registration.init(block, item);
    	Bridges.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);
    	Bridges.setRegistrationRock(bridges_rockable, block, item, MCWBYG_TAB);
    	Roofs.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);
    	Roofs.setRegistrationRock(fences_rockable, block, item, MCWBYG_TAB);
    	Fences.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);
    	Fences.setRegistrationRock(fences_rockable, block, item, MCWBYG_TAB);
    	Fences.setRegistrationHedges(LEAVES, block, item, MCWBYG_TAB);
    	Furnitures.setRegistrationWood(WOOD, block, item, MCWBYG_TAB);*/
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Fences::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Furnitures::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Roofs::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Is Charged !");
    }
    
    private void client(FMLClientSetupEvent event)
    {
    	Bridges.clientWood(event, MODID, WOOD);
    	Bridges.clientStone(event, MODID, bridges_rockable);
    }
    
    @SubscribeEvent
    public static void registry(final RegistryEvent.Register<Block> event)
    {
    	Bridges.registryWood(event, WOOD, MCWBYG_TAB);
    	Bridges.registryStone(event, bridges_rockable, MCWBYG_TAB);
    	Roofs.registryWood(event, WOOD, MCWBYG_TAB);
    	Roofs.registryStone(event, fences_rockable, MCWBYG_TAB);
    	Fences.registryWood(event, WOOD, MCWBYG_TAB);
    	Fences.registryHedges(event, LEAVES, MCWBYG_TAB);
    	Fences.registryStone(event, fences_rockable, MCWBYG_TAB);
    	Furnitures.registryWood(event, WOOD, MCWBYG_TAB);
    }
}