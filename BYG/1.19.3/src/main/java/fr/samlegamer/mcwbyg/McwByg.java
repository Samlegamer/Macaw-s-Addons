package fr.samlegamer.mcwbyg;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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

	public static CreativeModeTab MCWBYG_TAB;
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
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerTab);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addTotab);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Is Charged !");
    }
    
    private void registerTab(CreativeModeTabEvent.Register event)
    {
    	NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "aspen_roof"), Finder.findBlock(MODID, "aspen_picket_fence"), Finder.findBlock(MODID, "aspen_wardrobe"), 
    	        Finder.findBlock(MODID, "aspen_log_bridge_middle"), Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Finder.findBlock(MODID, "aspen_bulk_stairs"));
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
       final Block icon = woodProperties.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES, BlockType.BRIDGES, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.STAIRS);
       MCWBYG_TAB = Registration.tabs(event, MODID, "tab", icon);
    }
    
    private void addTotab(CreativeModeTabEvent.BuildContents event)
    {
    	Bridges.addToTab(event, MODID, WOOD, MCWBYG_TAB);
    	Bridges.addToTabStone(event, MODID, bridges_rockable, MCWBYG_TAB);
    	Roofs.addToTab(event, MODID, WOOD, MCWBYG_TAB);
    	Roofs.addToTabStone(event, MODID, fences_rockable, MCWBYG_TAB);
    	Fences.addToTab(event, MODID, WOOD, MCWBYG_TAB);
    	Fences.addToTabHedge(event, MODID, LEAVES, MCWBYG_TAB);
    	Fences.addToTabStone(event, MODID, fences_rockable, MCWBYG_TAB);
    	Furnitures.addToTab(event, MODID, WOOD, MCWBYG_TAB);
    	Stairs.addToTab(event, MODID, WOOD, MCWBYG_TAB);
    }
}