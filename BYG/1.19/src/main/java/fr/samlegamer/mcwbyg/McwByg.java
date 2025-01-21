package fr.samlegamer.mcwbyg;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.RegisterEvent;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;

@Mod(McwByg.MODID)
@Mod.EventBusSubscriber(modid = McwByg.MODID, bus = Bus.MOD)
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

	public static final CreativeModeTab MCWBYG_TAB = new CreativeModeTab(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	    	NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "aspen_roof"), Finder.findBlock(MODID, "aspen_picket_fence"), Finder.findBlock(MODID, "aspen_wardrobe"), 
	        Finder.findBlock(MODID, "aspen_log_bridge_middle"), Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Finder.findBlock(MODID, "aspen_bulk_stairs"));
	    	
	    	prop.addType(BlockType.ROOFS).addType(BlockType.FENCES).addType(BlockType.BRIDGES).addType(BlockType.FURNITURES).addType(BlockType.STAIRS);
	    	Block icon = prop.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.BRIDGES, BlockType.FURNITURES, BlockType.STAIRS);
	        return new ItemStack(icon);
	    }
	};
		
    public McwByg()
    {
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Loading...");
		//MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Is Charged !");
    }
        
    @SubscribeEvent
    public static void registry(RegisterEvent event)
    {
    	Bridges.registryWood(event, WOOD, MCWBYG_TAB);
    	Bridges.registryStone(event, bridges_rockable, MCWBYG_TAB);
    	Roofs.registryWood(event, WOOD, MCWBYG_TAB);
    	Roofs.registryStone(event, fences_rockable, MCWBYG_TAB);
    	Fences.registryWood(event, WOOD, MCWBYG_TAB);
    	Fences.registryHedges(event, LEAVES, MCWBYG_TAB);
    	Fences.registryStone(event, fences_rockable, MCWBYG_TAB);
    	Furnitures.registryWood(event, WOOD, MCWBYG_TAB);
    	Stairs.registryWood(event, WOOD, MCWBYG_TAB);
    }
}